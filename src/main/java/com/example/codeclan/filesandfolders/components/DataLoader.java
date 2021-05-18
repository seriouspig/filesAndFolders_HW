package com.example.codeclan.filesandfolders.components;

import com.example.codeclan.filesandfolders.models.File;
import com.example.codeclan.filesandfolders.models.Folder;
import com.example.codeclan.filesandfolders.models.User;
import com.example.codeclan.filesandfolders.repositories.FileRepository;
import com.example.codeclan.filesandfolders.repositories.FolderRepository;
import com.example.codeclan.filesandfolders.repositories.UserRepository;
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

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User user1 = new User("Pedro");
        userRepository.save(user1);

        Folder folder1 = new Folder("Movies", user1);
        folderRepository.save(folder1);

        File file1 = new File("myMovie", "mov", 12456.50, folder1);
        fileRepository.save(file1);


//        folder1.addFile(file1);
//        folderRepository.save(folder1);
//
//        user1.addFolder(folder1);
//        userRepository.save(user1);




    }


}
