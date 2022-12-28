package com.example.springschedule.service;

import com.example.springschedule.entity.GroupEntity;

import java.util.List;
import java.util.Optional;

public interface GroupService {
    List<GroupEntity> findAllGroups();
    Optional<GroupEntity> findGroupById(Long id);
    GroupEntity saveGroup(GroupEntity groupEntity);
    GroupEntity updateGroup(GroupEntity groupEntity);
    void deleteGroup(Long id);
}
