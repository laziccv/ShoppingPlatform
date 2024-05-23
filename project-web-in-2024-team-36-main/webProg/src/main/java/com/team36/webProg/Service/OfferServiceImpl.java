package com.team36.webProg.Service;

import com.team36.webProg.Repository.OfferRepository;
import com.team36.webProg.iService.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService {

     public final OfferRepository _offerRepo;

    @Autowired
    public OfferServiceImpl(OfferRepository _offerRepo) { this._offerRepo = _offerRepo; }
}
