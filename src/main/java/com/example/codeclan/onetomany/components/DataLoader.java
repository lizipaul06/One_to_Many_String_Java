package com.example.codeclan.onetomany.components;

import com.example.codeclan.onetomany.models.File;
import com.example.codeclan.onetomany.models.Folder;
import com.example.codeclan.onetomany.models.User;
import com.example.codeclan.onetomany.repositories.FileRepository;
import com.example.codeclan.onetomany.repositories.FolderRepository;
import com.example.codeclan.onetomany.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }


    public void run(ApplicationArguments args)  {

        User Iain = new User("Iain");
        userRepository.save(Iain);

        User Lilith = new User("Lilith");
        userRepository.save(Lilith);

        User Craig = new User("Craig");
        userRepository.save(Craig);

        User Steve = new User("Steve");
        userRepository.save(Steve);

        Folder folder1 = new Folder("Cats", Iain);
        folderRepository.save(folder1);

        File file1 = new File("Cat_pics", "JPEG", 20, folder1);
        fileRepository.save(file1);

        File file2 = new File("Food_pics", "PDF", 15, folder1);
        fileRepository.save(file1);

        folder1.addFile(file1);
        folderRepository.save(folder1);
        folder1.addFile(file2);
        folderRepository.save(folder1);
    }
}
