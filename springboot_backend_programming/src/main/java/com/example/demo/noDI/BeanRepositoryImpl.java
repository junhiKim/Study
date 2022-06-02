package com.example.demo.noDI;

import java.util.Arrays;
import java.util.List;

public class BeanRepositoryImpl implements BeanRepository{
	
	public BeanRepositoryImpl() {
	}

	@Override
	public List<BeanDTO> search(String q) {
		return Arrays.asList(
				BeanDTO.builder().beanCode("01").beanName("��1").build()
				, BeanDTO.builder().beanCode("02").beanName("��2").build()
				);
				
	}
}
