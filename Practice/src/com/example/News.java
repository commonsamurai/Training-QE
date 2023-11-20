package com.example;
import java.util.*;
import java.util.stream.Collectors;
public class News {

		public static void main(String[] args) {
			
			
			ArrayList<String> n = new ArrayList<>();
			
			n.add("hello");
			
			List<String> w = n.stream().filter(i -> i != i+1).collect(Collectors.toList());
			
			System.out.println(w);
			
			}
		}

