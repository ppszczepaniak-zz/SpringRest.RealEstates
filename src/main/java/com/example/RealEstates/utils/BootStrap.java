package com.example.RealEstates.utils;

import com.example.RealEstates.models.City;
import com.example.RealEstates.models.Client;
import com.example.RealEstates.models.HomeType;
import com.example.RealEstates.models.Offer;
import com.example.RealEstates.repositories.ClientRepository;
import com.example.RealEstates.repositories.OfferRepository;
import org.springframework.stereotype.Component;

@Component
public class BootStrap {

    private OfferRepository offerRepository;
    private ClientRepository clientRepository;

    public BootStrap(OfferRepository offerRepository, ClientRepository clientRepository) {
        this.offerRepository = offerRepository;
        this.clientRepository = clientRepository;
    }

    public void initializeRepository() {
        Client client1 = Client.of("John", "Smith");
        Client client2 = Client.of("Rick", "Sanchez");

        clientRepository.add(client1);
        clientRepository.add(client2);

        Offer offer1 = Offer.of(client1, HomeType.HOUSE, City.WARSZAWA, "Testowa 1", 120, 6);
        Offer offer2 = Offer.of(client1, HomeType.FLAT, City.WARSZAWA, "Testowa 2", 30, 3);
        Offer offer3 = Offer.of(client2, HomeType.HOUSE, City.WROCLAW, "Testowa 10", 30, 2);
        Offer offer4 = Offer.of(client2, HomeType.APARTMENT, City.KRAKOW, "Testowa 20", 80, 4);

        offerRepository.add(offer1);
        offerRepository.add(offer2);
        offerRepository.add(offer3);
        offerRepository.add(offer4);

    }
}
