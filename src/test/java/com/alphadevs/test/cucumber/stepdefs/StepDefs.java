package com.alphadevs.test.cucumber.stepdefs;

import com.alphadevs.test.BackEndApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = BackEndApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
