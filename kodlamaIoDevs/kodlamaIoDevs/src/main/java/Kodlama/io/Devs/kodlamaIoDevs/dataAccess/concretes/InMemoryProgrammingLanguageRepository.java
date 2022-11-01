package Kodlama.io.Devs.kodlamaIoDevs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.kodlamaIoDevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.kodlamaIoDevs.entities.concretes.ProgrammingLanguage;
@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages = new ArrayList<>();
	
	public InMemoryProgrammingLanguageRepository() {
		
		languages.add(new ProgrammingLanguage(1, "C#"));
		languages.add(new ProgrammingLanguage(1, "Java"));
		languages.add(new ProgrammingLanguage(1, "Python"));
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		languages.add(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		languages.remove(getById(id));
		
	}

	@Override
	public void update(int id, ProgrammingLanguage programmingLanguage) {
		ProgrammingLanguage programmingLanguageUpdate=getById(id);
		programmingLanguageUpdate.setName(programmingLanguage.getName());
		
		
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for(ProgrammingLanguage programmingLanguage:getAll()) {
			if(id==programmingLanguage.getId()) {
				return programmingLanguage;
			}
		}
		
		return null;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languages;
	}

}
