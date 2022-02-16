package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jex00.RootConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class SampleTests {

	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	@Test
	public void test1() {
		
		assertNotNull(restaurant);
		
		log.info("test2----");
		log.info(restaurant);
		log.info(restaurant.getChef());
	}
}
/* @ContextConfiguration
 * 스프링이 실행될 때, 위 어노테이션을 통해 어떤 설정 정보를 읽어 들여야 하는지 알수있다.
 * */
