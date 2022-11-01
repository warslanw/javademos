package Kodlama.io.Devs.kodlamaIoDevs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlamaIoDevs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void delete(int id) throws Exception;
	void update(int id,ProgrammingLanguage programmingLanguage)throws Exception;
	ProgrammingLanguage getById(int id)throws Exception;
    List<ProgrammingLanguage> getAll();
    
}
