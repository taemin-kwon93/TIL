package codeUpExample;
/*
�̹����� ��ǻ�Ϳ� ����� ������ ������ ������ȭ �Ǿ� ����ȴ�.

���� �⺻���� ������δ� �׸��� �����ϴ� �� ��(pixel, �ȼ�)�� ������
����(r), �ʷ�(g), �Ķ�(b)�� 3������ ���� ���� ������ ���� ��ȯ�Ͽ� �����ϴ� ���ε�,

���� ��� r, g, b �� ���� ���ؼ� 8��Ʈ(0~255, 256���� ����)���� ����Ѵٰ� �ϸ�,

�� ���� ������ 3���� r, g, b�� 8��Ʈ+8��Ʈ+8��Ʈ�� �� 24��Ʈ�� ǥ���ؼ�
�� 2^24 ������ ���� �ٸ� ���� ������ ����� �� �ִ� ���̴�.

�׷��� �����ϴ� ���� ��� �ϳ��� ū �̹����� ������ �� �ְ� �Ǵµ�,
1024 * 768 ����� �� ���� ���� 24��Ʈ�� �����ϸ� �� �̹����� �����ϱ� ����
���� �뷮�� ����� �� �ִ�.

�̷��� �̹����� ����(raw) �����͸� �������� �ʰ� �״�� �����ϴ� ��ǥ���� �̹��� ������
*.bmp �����̸�, ��Ʈ�� �׸��� �����Ѵٰ� �Ͽ� ��Ʈ�� ��� �Ǵ� ������ ����̶�� �Ѵ�.

�̹����� ���� �ػ� w, ���� �ػ� h, �� �ȼ��� �����ϱ� ���� ��Ʈ b �� �־��� ��,
�������� �ʰ� �����ϱ� ���� �ʿ��� ���� �뷮�� ����ϴ� ���α׷��� �ۼ��� ����.


���� ���
�Ϲ����� 1024 * 768 ������(�ػ�)�� ������ ����
24��Ʈ(rgb ���� 8��Ʈ�� 3��)�� �����Ϸ��� 1024 * 768 * 24 bit�� ���� �뷮�� �ʿ��ϴ�.

���� �׷��� Ȯ���ϰ� �ʹٸ�, ������ �׸� ����/���� ���α׷��� ���� Ȯ���� �� �ִ�.


**
      8 bit(��Ʈ)           = 1byte(����Ʈ)     //       8bit=1Byte
1024 Byte(210 byte) = 1KB(ų�� ����Ʈ) // 1024bit=1KB
1024 KB(210 KB)      = 1MB(�ް� ����Ʈ)
1024 MB(210 MB)     = 1GB(�Ⱑ ����Ʈ)
1024 GB(210 GB)      = 1TB(�׶� ����Ʈ).

w, h, b �� ������ �ΰ� �Էµȴ�.
��, w, h�� ��� �����̰� 1~1024 �̴�. b�� 40������ 4�� ����̴�.

�ʿ��� ���� ������ MB ������ �ٲپ� ����Ѵ�.
�Ҽ��� ���� ��° �ڸ����� �ݿø��� ��° �ڸ����� ����� �� MB�� ����Ѵ�.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main86 {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	private static final double bit = 8;
	private static final double toKb  = 1024 ;
	private static final double toMb = 1024;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w, h, b;
		
		//Ex 1024 768 24
		w = sc.nextDouble();
		h = sc.nextDouble();
		b = sc.nextDouble();
		sc.close();
		
		double result = method1(w, h, b);

		//df.format(result)
		System.out.println(df.format(result)+ " MB");
	}
	
	private static double method1(double w, double h, double b) {

		double result;
		
		result = (w * h * b) / bit;
		result /= toKb;
		result /= toMb;
		
		//System.out.println(result);
		return result;
	}
}

