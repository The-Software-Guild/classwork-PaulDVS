package com.sujata.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ProjectJPA")
public class Project {

	@Id
	private String projectId;
	private String projectName;
	
	public Project(String projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	@JoinTable(
	        name = "TaskAllocation",
	        joinColumns = {@JoinColumn(
	                name = "PID",
	                referencedColumnName = "projectId"
	        )},
	        inverseJoinColumns = {@JoinColumn(
	                name = "EID",
	                referencedColumnName = "employeeId"
	        )}
	)
	@OneToMany
	List<Employee> empList=new ArrayList<Employee>();
	
}
