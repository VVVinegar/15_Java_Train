package cn.edu.nuc.train;
//extends �̳�
//��д  �������࣬��ȫһ��
//��дʱ��Ȩ�����η� ֻ����������С
	//public protected  û��  private
	//��д��ʱ����
//�����Ǹ���  ���಻һ��������
//super() ���ø���Ĺ��췽��;��дĬ�ϵ��ø����ޅ��Ĺ��췽��
public abstract class Chinese extends Person{
	
		public Chinese() {
			System.out.println("��������Ĺ��췽��");
		}
		public void usekuaizi(){
			System.out.println("ʹ�ÿ���");
		}
		public  void head(){
			System.out.println("��ͷ��׬Ǯ");
		}
		public abstract void hand();
}
