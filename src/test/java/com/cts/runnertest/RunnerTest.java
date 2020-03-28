package com.cts.runnertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(features = {"src/main/resources/feature/AutomationPractice.feature"},
glue = {"com\\cts\\stepdef"},monochrome = true,plugin= {"html:reports/"})
		
@RunWith(Cucumber.class)
public class RunnerTest {

	}
		


