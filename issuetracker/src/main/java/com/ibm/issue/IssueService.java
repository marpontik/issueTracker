package com.ibm.issue;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class IssueService {
	private static List<Issue> issues = new ArrayList<Issue>();
	private static int issueCount = 3;

	static {
		issues.add(new Issue(1, "maria","Java Error", "This is a Java Error", new Date(),
				false));
		issues.add(new Issue(2, "maria","Python Error", "This is a Python Error", new Date(), false));
		issues.add(new Issue(3, "maria","Golang Error", "This is a Golang Error", new Date(),
				false));
	}

	

	public void addIssue(String name, String title, String desc, Date targetDate, boolean isDone) {
		issues.add(new Issue(++issueCount, name, title, desc, targetDate, isDone));
	}

	public void deleteIssue(int id) {
		Iterator<Issue> iterator = issues.iterator();
		while (iterator.hasNext()) {
			Issue issue = iterator.next();
			if (issue.getId() == id) {
				iterator.remove();
			}
		}
	}
	
	public List<Issue> retrieveIssues(String user) {
		List<Issue> filteredIssues = new ArrayList<Issue>();
		for (Issue issue : issues) {
			if (issue.getUser().equals(user))
				filteredIssues.add(issue);
		}
		return filteredIssues;
	}


	public Issue retrieveIssue(int id) {
		for (Issue issue : issues) {
			if (issue.getId() == id)
				return issue;
		}
		return null;
}

	public void updateIssue(Issue issue) {
		issues.remove(issue);
		issues.add(issue); 
		}

	
		
	}

	