package com.test.data.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.data.config.Neo4jConfig;
import com.test.data.domain.East;
import com.test.data.domain.Playoff;
import com.test.data.domain.West;
import com.test.data.repository.EastTeamRepository;
import com.test.data.repository.WestTeamRepository;
//import org.springframework.context.ContextConfiguration;


@RestController
//@ContextConfiguration(classes = {Neo4jConfig.class})
public class helloCon {
	
//	@Autowired
//	private EastTeamRepository eastTeamRepository;
//	@Autowired
//    private WestTeamRepository westTeamRepository;
//	
	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

	
	

//	@RequestMapping("/createE")
//	public void addE() {
//		Playoff playoff = new Playoff();
//		playoff.setYear("2016");
//		playoff.setRound("第一回合");
//		East east = new East();
//		east.setName("东部一队");
//		east.setCode("东一");
//		east.win(2, playoff);
//		eastTeamRepository.save(east);
//	}
//	
//	@RequestMapping("/createW")
//	public void addW() {
//		Playoff playoff = new Playoff();
//		playoff.setYear("2016");
//		playoff.setRound("第一回合");
//		West west = new West();
//		
//        west.setName("西部一队");
//        west.setCode("西一");
//        west.win(4, playoff);
//        westTeamRepository.save(west);
//        Assert.notNull(west.getId());
//	}
//	
	
	

}
