package com.jaisoft.vo;

import com.jaisoft.vo.factory.DocumentMetadataVOFactory;
import com.jaisoft.vo.repository.DocumentRepository;
import com.jaisoft.vo.vo.DocumentMetadataVO;
import com.jaisoft.vo.entity.DocumentAggregate;
import com.jaisoft.vo.factory.DocumentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
    DocumentRepository documentRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		DocumentMetadataVO documentMetadataVO1 = DocumentMetadataVOFactory.getInstance(
				"document_name_1",
				"document_value_1");
		DocumentMetadataVO documentMetadataVO2 = DocumentMetadataVOFactory.getInstance(
				"document_name_2",
				"document_value_2");

		DocumentMetadataVO documentMetadataVO3 = DocumentMetadataVOFactory.getInstance(
				"document_name_3",
				"document_value_3");

		List<DocumentMetadataVO> setDocumentMetadata = new ArrayList<>();

		setDocumentMetadata.add(documentMetadataVO1);
		setDocumentMetadata.add(documentMetadataVO2);
		setDocumentMetadata.add(documentMetadataVO3);

		DocumentAggregate documentAggregate = DocumentFactory.getInstance(
				"document_name",
				"salesforce_document_id",
				"sharepoint_document_id" ,
				setDocumentMetadata);


		documentAggregate.setDocumentMetadata(setDocumentMetadata);

		documentRepository.save(documentAggregate);
	}
}
