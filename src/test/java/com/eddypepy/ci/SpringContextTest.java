package com.eddypepy.ci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.eddypepy.ci.SpringBootJenkinsPipelineApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJenkinsPipelineApplication.class)
@DirtiesContext
public class SpringContextTest {

	@Test
	public void whenSpringContextIsBootstrapped_thenNoExceptions() {
	}
}