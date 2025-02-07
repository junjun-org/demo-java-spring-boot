package com.sonarsource.springdemo.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.sonarsource.springdemo.model.FileEntity;
import com.sonarsource.springdemo.repository.FileRepository;

@Service
@Transactional
public class FileService {

	public FileService() {
		System.out.println("constructor");
	}

	@Autowired
	private FileRepository fileRepository;

	public void saveFile(MultipartFile file) throws IOException {
		FileEntity fileEntity = new FileEntity();
		fileEntity.setFileName(file.getOriginalFilename());
		fileEntity.setData(file.getBytes());
		fileRepository.save(fileEntity);
	}
}