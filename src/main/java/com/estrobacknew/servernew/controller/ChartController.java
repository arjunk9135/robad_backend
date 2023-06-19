package com.estrobacknew.servernew.controller;

import com.estrobacknew.servernew.model.ChartModel;
import com.estrobacknew.servernew.model.mongorepo.ChartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/charts")
@CrossOrigin("*")
public class ChartController {



    @Autowired
    private ChartRepo chartRepo;


    @PostMapping("/add")
    public ResponseEntity<ChartModel> addChartData(@RequestBody ChartModel chartModel)
    {
        ChartModel save=this.chartRepo.save(chartModel);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/data")
    public ResponseEntity<?> getChartData()
    {
        return ResponseEntity.ok(this.chartRepo.findAll()); //get mapping
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ChartModel> updateChartData(@PathVariable("id") String id, @RequestBody ChartModel chartModel) {
        Optional<ChartModel> existingChart = this.chartRepo.findById(Integer.valueOf(id));
        if (existingChart.isPresent()) {
            ChartModel updatedChart = existingChart.get();
            updatedChart.setSun(chartModel.getSun());
            updatedChart.setMon(chartModel.getMon());
            updatedChart.setTue(chartModel.getTue());
            updatedChart.setWed(chartModel.getWed());
            updatedChart.setThu(chartModel.getThu());
            updatedChart.setFri(chartModel.getFri());
            updatedChart.setSat(chartModel.getSat());
            this.chartRepo.save(updatedChart);
            return ResponseEntity.ok(updatedChart);
        } else {
            return ResponseEntity.notFound().build();
        }

    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteChartData(@PathVariable("id") String id) {
        Optional<ChartModel> existingChart = this.chartRepo.findById(Integer.valueOf(id));
        if (existingChart.isPresent()) {
            this.chartRepo.delete(existingChart.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
