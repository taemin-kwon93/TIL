package codeUpExample;
/*
�Ҹ��� ��ǻ�Ϳ� ����� ������ ������ ������ȭ �Ǿ� ����ȴ�.

����ũ�� ���� 1�ʿ� ���Դ� ���� ��, ���Դ� ���� �� �Ҹ��� ������ üũ��
�� ���� ���������� �ٲٰ�, �� ���� ������ �Ҹ��� ���Ϸ� ������ �� �ִ�.

���� ������ ������ ��Ʈ�� ����ϴ� ������ ���� ������ ���� ������ ������ �� �ְ�,
�¿�(���׷���) ä�η� �����ϸ� 2�衦 5.1ä���̸� 6���� ��������� �ʿ��ϰ�,
���� �ð��� ��� �� ��ŭ �� ���� ��������� �ʿ��ϴ�.

1�� ���� ����ũ�� �Ҹ������� üũ�ϴ� ���� h
(�츣��, Hz �� 1�ʿ� �� ��? üũ�ϴ°��� �ǹ��Ѵ�.)

�� �� üũ�� ����� �����ϴ� ��Ʈ b
(2��Ʈ�� ����ϸ� 0 �Ǵ� 1 �� ����, 16��Ʈ�� ����ϸ� 65536����..)

�¿� �� �Ҹ��� ������ Ʈ�� ������ ä�� c
(���� 1��, ���׷����� 2���� Ʈ������ �������� �ǹ��Ѵ�.)

������ �ð� s�� �־��� ��,

�ʿ��� ���� �뷮�� ����ϴ� ���α׷��� �ۼ��غ���.

������ �Ϲ����� CD ����(44.1KHz, 16bit, ���׷���)�� 1�� ���� �����Ϸ���
44100 * 16 * 2 * 1 bit�� ��������� �ʿ��ϴ�.

�̷��� �����ϴ� ����� PCM(Pulse Code Modulation) ����̶�� �ϴµ�,
�������� ���� ������(raw) �Ҹ� ������ ������ ��ǥ������ *.wav �� �ִ�.

8 bit(��Ʈ)           = 1byte(����Ʈ)     //       8bit=1Byte
1024 Byte(210 byte) = 1KB(ų�� ����Ʈ) // 1024bit=1KB
1024 KB(210 KB)      = 1MB(�ް� ����Ʈ)
1024 MB(210 MB)     = 1GB(�Ⱑ ����Ʈ)
1024 GB(210 GB)      = 1TB(�׶� ����Ʈ)
 
h, b, c, s �� ������ �ΰ� �Էµȴ�.
h�� 48,000����, b�� 32����(��, 8�ǹ��), c�� 5����, s�� 6,000������ �ڿ����̴�.
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main85 {
	
	private static final DecimalFormat df = new DecimalFormat("0.0");
	
	private static final double bit = 8;
	private static final double toKb  = 1024 ;
	private static final double toMb = 1024;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h, b, c, s;
		
		//Input Example : 44100hz 16bit 2channel 10seconds, 44100 16 2 10
		h = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		s = sc.nextDouble();
		sc.close();
		
		double result = method1(h, b, c, s);
		df.setRoundingMode(RoundingMode.UP);
		System.out.println(df.format(result) + " MB");
	}
	
	private static double method1(double a, double b, double c, double d) {

		double result;
		
		result = (a * b * c * d) / bit;
		result /= toKb;
		result /= toMb;
		
		//System.out.println(result);
		return result;
	}
}

