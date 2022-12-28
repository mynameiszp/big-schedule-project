package com.example.springschedule.service.impl;

import com.example.springschedule.entity.GroupEntity;
import com.example.springschedule.repository.GroupRepository;
import com.example.springschedule.service.GroupService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public List<GroupEntity> findAllGroups() {
        return groupRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Optional<GroupEntity> findGroupById(Long id) {
        return groupRepository.findById(id);
    }

    @Override
    public GroupEntity saveGroup(GroupEntity groupEntity) {
        return groupRepository.save(groupEntity);
    }

    @Override
    public GroupEntity updateGroup(GroupEntity groupEntity) {
        return groupRepository.save(groupEntity);
    }

    @Override
    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }
}
