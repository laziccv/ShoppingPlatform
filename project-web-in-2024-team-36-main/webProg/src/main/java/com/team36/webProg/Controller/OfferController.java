package com.team36.webProg.Controller;


import com.team36.webProg.iService.OfferService;
import com.team36.webProg.iService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/offer")
public class OfferController {
    private final OfferService _offerService;

    @Autowired
    public OfferController(OfferService _offerService) { this._offerService = _offerService; }
}
