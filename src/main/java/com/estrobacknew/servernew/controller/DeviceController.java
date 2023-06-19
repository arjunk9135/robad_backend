package com.estrobacknew.servernew.controller;

import ch.qos.logback.core.model.Model;
import com.estrobacknew.servernew.model.DeviceModel;
import com.estrobacknew.servernew.model.UserModel;
import com.estrobacknew.servernew.model.mongorepo.DeviceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/devices")
@CrossOrigin("*")
public class DeviceController {
    @Autowired
    private DeviceRepo deviceRepo;


    @PostMapping("/add-device")
    public ResponseEntity<DeviceModel> addDevice(@RequestBody DeviceModel deviceModel)
    {
        DeviceModel save=this.deviceRepo.save(deviceModel);
        return ResponseEntity.ok(save);
    }
    @GetMapping("/get-devices")
    public List<DeviceModel> getAllDevices() {
        return deviceRepo.findAll();
    }

    @PutMapping("update-device/{imei}")
    public ResponseEntity<DeviceModel> updateDevice(@PathVariable("imei") String imei, @RequestBody DeviceModel deviceModel) {
        try {
            Optional<DeviceModel> optionalExistingDevice = deviceRepo.findByIMEI(imei);
            if (optionalExistingDevice.isPresent()) {
                DeviceModel existingDevice = optionalExistingDevice.get();
                existingDevice.setDevice(deviceModel.getDevice());
                existingDevice.setNumber(deviceModel.getNumber());
                existingDevice.setIMEI(deviceModel.getIMEI());
                deviceRepo.delete(existingDevice);
                DeviceModel updatedDevice = deviceRepo.save(existingDevice);
                return ResponseEntity.ok(updatedDevice);
            } else {
                System.out.println("Device not found with IMEI: " + imei);
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            System.err.println("Error occurred while updating device: " + e.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }




    @DeleteMapping("/delete-device/{imei}")
    public ResponseEntity<String> deleteDevice(@PathVariable("imei") String imei) {
        try {
            Optional<DeviceModel> optionalDevice = deviceRepo.findByIMEI(imei);
            if (optionalDevice.isPresent()) {
                DeviceModel device = optionalDevice.get();
                deviceRepo.delete(device);
                System.out.println("DELETED SUCCESFULLY "+imei);
                return ResponseEntity.ok("Device deleted successfully");
            } else {
                System.out.println("NOT FOUND "+imei);
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            System.err.println("Error occurred while deleting device: " + e.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }













}
