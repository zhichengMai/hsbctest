package com.hsbc.test;

import org.junit.Test;

public class MiniCodingTest {
	//定义常量
	private static final String FIZZBUZZ="FizzBuzz";
	private static final String FIZZ="Fizz";
	private static final String BUZZ="Buzz";
	
	@Test
	public void codingTestPartOne() {
		for (int i = 1; i <= 100; i++) {
			//第一种使用if...else判断
			/*if(i%3==0&&i%5==0) {
				System.out.println(FIZZBUZZ);
			}else if(i%3==0) {
				System.out.println(FIZZ);
			}else if(i%5==0){
				System.out.println(BUZZ);
			}else {
				System.out.println(i);
			}
			*/
			//第二种使用三元表达式
			System.out.println(i%3==0&&i%5==0?FIZZBUZZ:(i%3==0?FIZZ:(i%5==0?BUZZ:i)));
			
		}
	}

	@Test
	public void codingTestPartTwo() {
		for (int i = 1; i <= 100; i++) {
			boolean isContainNumThree = (i+"").contains("3");
			boolean isContainNumFive = (i+"").contains("5");
			boolean isContainBothNum=((isContainNumThree==true?1:0)+(isContainNumFive==true?1:0))-2==0?true:false;
			/**
			 * 新需求规则：
			 *   1.该数字被3整除或者包含3为Fizz
			 *   2.该数字被5整除或者包含5为Buzz
			 *   3.以下4种情况为FizzBuzz
			 *     3.1 包含3，被5整除
			 *     3.2 包含5，被3整除
			 *     3.3 包含3和5
			 *     3.4 被3和5整除
			 */
			System.out.println((i%3==0&&i%5==0)||isContainBothNum||(isContainNumThree&&i%5==0)
								||(isContainNumFive&&i%3==0)?FIZZBUZZ:
								(isContainNumThree||i%3==0?FIZZ:
								(isContainNumFive||i%5==0?BUZZ:i)));
		}
	}
}
