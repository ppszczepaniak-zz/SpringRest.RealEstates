package com.example.RealEstates.controllers;

import com.example.RealEstates.models.Offer;
import com.example.RealEstates.services.OfferService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offer")
public class OfferController {


    private OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("") //localhost:9999/offer
    public List<Offer> getOffers() {
        return offerService.getAll();
    }

    @GetMapping("/{id}") //localhost:9999/offer/XX <- you fill in XX
    public Offer getOffer(@PathVariable("id") int id) {
        return offerService.get(id);
    }

    @PostMapping("/create") //localhost:9999/offer/create
    @ResponseStatus(HttpStatus.CREATED) //gives this status
    public Offer createOffer(@RequestBody Offer offer) {
        return offerService.create(offer);
    }

    @PutMapping("/{id}") //localhost:9999/offer/XX <- you fill in XX
    public Offer updateOffer(@PathVariable("id") int id, @RequestBody Offer offer) {
        return offerService.update(id, offer);
    }

    @DeleteMapping("/{id}") //localhost:9999/offer/XX <- you fill in XX
    public String deleteOffer(@PathVariable("id") int id) {
        offerService.delete(id);
        return "OK - offer deleted.";

    }
}
