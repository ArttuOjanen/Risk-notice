package com.example.risknotice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.risknotice.domain.Notice;
import com.example.risknotice.domain.NoticeRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class NoticeRepositoryTest {
	
	@Autowired
	private NoticeRepository repository;
	
	//Testing creation of new notice
	@Test
    public void createNewNotice() {
    	Notice notice = new Notice("Test", "Low", "Testing");
    	repository.save(notice);
    	assertThat(notice.getId()).isNotNull();
    } 

}
