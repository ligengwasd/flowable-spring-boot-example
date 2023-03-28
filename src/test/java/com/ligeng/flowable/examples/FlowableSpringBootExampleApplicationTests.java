package com.ligeng.flowable.examples;

import org.flowable.engine.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class FlowableSpringBootExampleApplicationTests {
	@Resource
	private ProcessEngine processEngine;
	@Resource
	RuntimeService runtimeService;
	@Resource
	RepositoryService repositoryService;
	@Resource
	TaskService taskService;
	@Resource
	ManagementService managementService;
	@Resource
	IdentityService identityService;
	@Resource
	HistoryService historyService;
	@Resource
	DynamicBpmnService dynamicBpmnService;

	@Test
	void contextLoads() {
		FormService formService = processEngine.getFormService();
		System.out.println(formService);
	}

}
