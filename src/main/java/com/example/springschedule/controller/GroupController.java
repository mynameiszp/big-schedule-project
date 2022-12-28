package com.example.springschedule.controller;

import com.example.springschedule.entity.GroupEntity;
import com.example.springschedule.service.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/api")

public class GroupController {
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/groups")
    public List<GroupEntity> findAllGroups(){
        return groupService.findAllGroups();
    }

    @GetMapping("/groups/{id}")
    public Optional<GroupEntity> findGroupById(@PathVariable("id") Long id){
        return groupService.findGroupById(id);
    }

    @PostMapping("/groupsSave")
    public GroupEntity saveGroup(@RequestBody GroupEntity groupEntity){
        return groupService.saveGroup(groupEntity);
    }

    @PutMapping("/groupsUpdate")
    public GroupEntity updateGroup(@RequestBody GroupEntity groupEntity){
        return groupService.updateGroup(groupEntity);
    }

    @DeleteMapping("/groupsDelete/{id}")
    public void deleteGroup(@PathVariable("id") Long id){
        groupService.deleteGroup(id);
    }
}
