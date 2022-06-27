package com.example.anywhere.service;

import com.example.anywhere.model.Happening;
import com.example.anywhere.repository.HappeningRepository;
import org.springframework.stereotype.Service;

@Service
public class HappeningService {

    private HappeningRepository happeningRepository;

    public HappeningService(HappeningRepository happeningRepository) {
        this.happeningRepository = happeningRepository;
    }

    public Happening saveHappening(Happening happening) {
        return happeningRepository.save(happening);
    }

}
