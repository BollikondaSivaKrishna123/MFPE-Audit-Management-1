package com.mfpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfpe.model.AuditType;
import com.mfpe.model.Question;
import com.mfpe.repository.QuestionRepo;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepo questionRepo;
	
	// Service for the Endpoint /AuditCheckListQuestions
	public List<Question> getQuestionsByAuditType(AuditType auditType){
		//System.out.println("AuditType:"+auditType);
		List<Question> qlist = questionRepo.getQuestionsByAuditType(auditType.getAuditType());
		//System.out.println(qlist);
		return qlist;
	}

}
