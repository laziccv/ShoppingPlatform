package com.team36.webProg.Service;

import com.team36.webProg.Repository.ReportRepository;
import com.team36.webProg.Repository.UsersRepository;
import com.team36.webProg.iService.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService {
    public final ReportRepository _reportRepo;

    @Autowired
    public ReportServiceImpl(ReportRepository _reportRepo) { this._reportRepo = _reportRepo; }
}
