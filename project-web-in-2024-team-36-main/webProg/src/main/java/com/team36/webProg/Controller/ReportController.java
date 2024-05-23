package com.team36.webProg.Controller;

import com.team36.webProg.iService.ReportService;
import com.team36.webProg.iService.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/report")
public class ReportController {
    private final ReportService _reportService;

    @Autowired
    public ReportController(ReportService _reportService) { this._reportService = _reportService; }
}
