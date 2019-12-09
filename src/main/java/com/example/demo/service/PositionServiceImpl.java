package com.example.demo.service;

import com.example.demo.entity.Position;
import com.example.demo.repository.PositionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {

    private final PositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public Optional<Position> findById(Integer id) {
        return positionRepository.findById(id);
    }


}
