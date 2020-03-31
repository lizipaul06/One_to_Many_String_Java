package com.example.codeclan.onetomany;

import com.example.codeclan.onetomany.models.File;
import com.example.codeclan.onetomany.models.Folder;
import com.example.codeclan.onetomany.models.User;
import com.example.codeclan.onetomany.repositories.FileRepository;
import com.example.codeclan.onetomany.repositories.FolderRepository;
import com.example.codeclan.onetomany.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneToManyApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateFileAndFolder(){
		User iain = new User("Iain");
		userRepository.save(iain);
		Folder folder = new Folder("IT", iain);
		folderRepository.save(folder);
		File file = new File("CodeClan", "JPEG", 25, folder);
		fileRepository.save(file);
	}

}
