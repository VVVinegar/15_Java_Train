package cn.edu.nuc.collection;

public class YiChang {

	public static void main(String[] args) {
		//try-catch-finall �����棬try-catch try-finall
		//catch�鷶ΧҪ��С����
		//��һ����try-catch ���ؽ��  �ڶ�����throws �����׳�	
		//�׳��쳣 throw
		//��Ҫ�����ܼ��쳣�ͷ��ܼ��쳣
	}
	public  void jisuan(){
			System.out.println(division(3, 0));
	}
	public  int  division(int a,int b)  
	{
			if(b==0){
				throw new  MyException("��������Ϊ0");
			}
			return a/b;
	}
}
