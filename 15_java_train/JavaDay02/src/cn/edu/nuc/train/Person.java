package cn.edu.nuc.train;

//Shift+Alt+s �������ɴ����ݼ�
//thisָ��ǰ����

//���췽�������������������һ�� û�з���ֵ
//�����Ŵ�������ʵ��
//abstract ��������õ�����ǰ�����˷���û��ʵ��
//�õ���ǰ���������ǳ����࣬�г��󷽷�������ǳ�����
//�����಻��ʵ�������з���δʵ�֣�

//��Ķ������ܵ��ö���Ķ�����
public  class Person {
		private String id;
		private String eye;
		private String ear;
		private String hand;
		private String head;
		public static int eyenum=2;
		static class Inner{
			public  void say() {
				System.out.println("�ⲿ���id��");
			}
		}
		public Person(String id){
			System.out.println("���ø����Ѕ��Ĺ��췽��");
		}
		public Person(){
			System.out.println("���ø����ޅ��Ĺ��췽��");
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getHead() {
			return head;
		}
		public void setHead(String head) {
			this.head = head;
		}
		//����:������һ�� �����࣬������һ��,��ͬһ������
		public void see(String s){
			System.out.println("ʹ���۾���"+s);
		}
		public void see(){
			System.out.println("ʹ���۾���");
		}
		public void hear(){
			System.out.println("ʹ�ö�����");
		}
		
		public  void hand(){}
		protected void head(){
			System.out.println("��ͷ����δ�LOL");
		}
		
}
