package com.estrobacknew.servernew.controller;

import com.estrobacknew.servernew.model.ApprovedModel;

import com.estrobacknew.servernew.model.ReportModel;
import com.estrobacknew.servernew.model.mongorepo.ApprovedRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/approved-devices")
@CrossOrigin("*")
public class ApprovedController {


    @Autowired
    private ApprovedRepo approvedRepo;

    @PostMapping("/add")
    public ResponseEntity<ApprovedModel> approvedSubmit(@RequestBody ApprovedModel approvedModel) {
        ApprovedModel save = this.approvedRepo.save(approvedModel);
        return ResponseEntity.ok(save);
    }


    @GetMapping("/all-approved-devices")
    public List<ApprovedModel> getAllApproved()
    {
        return approvedRepo.findAll();
    }

    @DeleteMapping("/delete-device/{imei}")
    public ResponseEntity<String> deleteDeviceByIMEI(@PathVariable String imei) {
        approvedRepo.deleteByImei(imei);
        return ResponseEntity.ok("Device deleted successfully");
    }

}
