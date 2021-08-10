package com.spring.basics.tutorial.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
