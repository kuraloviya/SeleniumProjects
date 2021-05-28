package org.testNG;


import org.junit.Assert;
import org.testng.annotations.Test;

public class Sample2{
	@Test
	private void tc11() {
		System.out.println("Sample2 Tc5=="+Thread.currentThread().getId());
	}
	@Test(retryAnalyzer = Fail.class)
	private void tc22() {
		Assert.assertTrue(false);
		System.out.println("Sample2 Tc6=="+Thread.currentThread().getId());
	}
	@Test
	private void tc33() {
		Assert.assertTrue(false);
		System.out.println("Sample2 Tc7=="+Thread.currentThread().getId());
	}
	@Test
	private void tc44() {
		System.out.println("Sample2 Tc8=="+Thread.currentThread().getId());
	}
	

	
	
			

	}


