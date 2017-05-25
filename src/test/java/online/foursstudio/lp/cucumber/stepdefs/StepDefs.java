package online.foursstudio.lp.cucumber.stepdefs;

import online.foursstudio.lp.LpApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = LpApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
