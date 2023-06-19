package com.estrobacknew.servernew.controller;
import com.estrobacknew.servernew.model.ApprovedModel;
import com.estrobacknew.servernew.model.MaintedModel;
import com.estrobacknew.servernew.model.ReportModel;
import com.estrobacknew.servernew.model.mongorepo.ApprovedRepo;
import com.estrobacknew.servernew.model.mongorepo.MaintainedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance-list")
@CrossOrigin("*")
public class MaintainedControler {

    @Autowired
    private MaintainedRepo maintainedRepo;

    @PostMapping("/move")
    public ResponseEntity<MaintedModel> moveToMaintained(@RequestBody MaintedModel maintedModel) {
        MaintedModel save = this.maintainedRepo.save(maintedModel);
        return ResponseEntity.ok(save);
    }


    @GetMapping("/get-devices")
    public List<MaintedModel> getAllMaintainedDevices()
    {
        return maintainedRepo.findAll();
    }



    @DeleteMapping("/delete-device/{imei}")
    public ResponseEntity<String> deleteDeviceByImei(@PathVariable String imei) {
        maintainedRepo.deleteByImei(imei);
        return ResponseEntity.ok("Device deleted successfully");
    }


}
