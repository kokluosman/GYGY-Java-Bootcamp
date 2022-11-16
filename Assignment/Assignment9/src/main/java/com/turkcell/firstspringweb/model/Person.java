package com.turkcell.firstspringweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Burada model sınıfımı tanımladım
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person
{
	private int id;
	private String name;
}