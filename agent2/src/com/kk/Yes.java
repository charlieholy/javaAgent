package com.kk;

import java.lang.instrument.Instrumentation;

public class Yes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void premain(String agentOps, Instrumentation inst) {
		System.out.println("=========premain方法执行========");
		System.out.println(agentOps);
	}

	/**
	 * 如果不存在 premain(String agentOps, Instrumentation inst) 则会执行 premain(String
	 * agentOps)
	 *
	 * @param agentOps
	 * @author SHANHY
	 * @create 2016年3月30日
	 */
	public static void premain(String agentOps) {
		System.out.println("=========premain方法执行2========");
		System.out.println(agentOps);
	}

}
