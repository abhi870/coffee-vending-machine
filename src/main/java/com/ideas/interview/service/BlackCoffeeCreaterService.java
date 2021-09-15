package com.ideas.interview.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlackCoffeeCreaterService implements CreaterService{
    @Override
    public void create() {
        log.info("created Black Coffee....");
    }
}
