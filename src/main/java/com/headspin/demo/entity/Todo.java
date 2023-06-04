package com.headspin.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Nationalized;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "todos")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Todo {
	
	@Id
	@Column(
			name = "Id",
			nullable = false
	)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(
			name = "Value",
			nullable = false
	)
	@Nationalized
	private String value;
	
	@Column(
			name = "Status",
			nullable = false
	)
	private int status;
}
