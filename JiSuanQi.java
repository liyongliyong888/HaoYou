package Test;

import java.util.Scanner;

public class tt {

	public static void main(String[] args) {
		double a;//第一个数字
		double b;//第二个数字
		double c;//第三个数字
		double z = 0;//结果
		String aa;//第一个字符
		String bb;//第二个字符
		Scanner sc = new Scanner(System.in);


		System.out.print("输入第1个数字：");
		a = sc.nextDouble();
		System.out.print("输入要进行的运算符号(+，-，*，/,=)：");
		aa = sc.next();
		System.out.print("输入第2个数字：");
		b = sc.nextDouble();
		for (int ds = 2;; ds++) {
			System.out.print("输入要进行的运算符号(+，-，*，/,=)：");
			bb = sc.next();
			if (aa.equals("*") && bb.equals("=")) {
				z = cheng(a, b);
				break;
			} else if (aa.equals("/") && bb.equals("=")) {
				z = chu(a, b);
				break;
			} else if (aa.equals("+") && bb.equals("=")) {
				z = jia(a, b);
				break;
			} else if (aa.equals("-") && bb.equals("=")) {
				z = jian(a, b);
				break;
			}
			if (!(bb.equals("="))) {
					System.out.print("输入第" + (ds + 1) + "个数字：");
					c = sc.nextDouble();
				if (aa.equals("/")) {
					a = chu(a, b);
					b = c;
					aa = bb;
				} else if ((aa.equals("*"))) {
					a = cheng(a, b);
					b = c;
					aa = bb;
				} else if (bb.equals("/")) {
					b = chu(b, c);
				} else if (bb.equals("*")) {
					b = cheng(b, c);
				} else if (aa.equals("+")) {
					a = jia(a, b);
				} else if (aa.equals("-")) {
					a = jian(a, b);
				}
			}
		}
		System.out.println("最后运算结果为：" + z);
		}


	static double jia(double a, double b) {
		b = a + b;
		return b;

	}

	static double jian(double a, double b) {
		b = a - b;
		return b;

	}

	static double cheng(double a, double b) {
		b = a * b;
		return b;

	}

	static double chu(double a, double b) {
		b = (double) Math.round(a / b * 100) / 100;
		return b;
	}


}
