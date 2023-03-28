package com.ligeng.flowable.examples;

import com.google.gson.Gson;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.repository.Deployment;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class RepositoryServiceTest {
    @Resource
    RepositoryService repositoryService;

    @Test
    public void createDeployment() {
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("holiday-request.bpmn20.xml")
                .key("holidayRequest")
                .deploy();

        System.out.println(new Gson().toJson(deployment));
    }

    @Test
    public void queryDeployment() {
        List<Deployment> deploymentList = repositoryService.createDeploymentQuery().deploymentKey("holidayRequest").list();
        System.out.println(new Gson().toJson(deploymentList));
    }
}
