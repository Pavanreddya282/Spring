package com.SpringDemoHello;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	int qid;
	String qname;
	List<String>answers;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void display() {
		System.out.println("Question "+qid+"."+qname);
		System.out.println("Answer : ");
		Iterator<String> itr=answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public String toString(){
		return qid+", "+qname+", "+answers;
		}
}
