package com.kk;

import java.lang.instrument.Instrumentation;

public class Yes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void premain(String agentOps, Instrumentation inst) {
		System.out.println("=========premain����ִ��========");
		System.out.println(agentOps);
	}

	/**
	 * ��������� premain(String agentOps, Instrumentation inst) ���ִ�� premain(String
	 * agentOps)
	 *
	 * @param agentOps
	 * @author SHANHY
	 * @create 2016��3��30��
	 */
	public static void premain(String agentOps) {
		System.out.println("=========premain����ִ��2========");
		System.out.println(agentOps);
	}

}
