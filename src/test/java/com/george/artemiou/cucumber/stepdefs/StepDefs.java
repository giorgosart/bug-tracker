package com.george.artemiou.cucumber.stepdefs;

import com.george.artemiou.BugTrackerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = BugTrackerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
