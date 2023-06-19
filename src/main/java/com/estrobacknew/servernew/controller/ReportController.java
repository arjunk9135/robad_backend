package com.estrobacknew.servernew.controller;

import com.estrobacknew.servernew.model.ReportModel;
import com.estrobacknew.servernew.model.mongorepo.ReportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.lang.*;
import java.util.List;

@RestController
@RequestMapping("/report")
@CrossOrigin("*")
public class ReportController {

    @Autowired
    private ReportRepo reportRepo;

    @PostMapping("/submit")
    public ResponseEntity<ReportModel> reportSubmit(@RequestBody ReportModel reportModel) {
        ReportModel save = this.reportRepo.save(reportModel);
        return ResponseEntity.ok(save);
    }

    @CrossOrigin("*")
    @GetMapping("/getreport/{imei}")
    public ResponseEntity<List<ReportModel>> getReportByImei(@PathVariable("imei") String imei) {
        List<ReportModel> reports = reportRepo.findAllByImei(imei);
        if (!reports.isEmpty()) {
            return ResponseEntity.ok(reports);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/get-all-reports")
    public List<ReportModel> getAllReports()
    {
        return reportRepo.findAll();
    }


}
