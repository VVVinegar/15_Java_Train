package cn.edu.nuc.train;


//һ���ļ��¿��Խ������,��ֻ����һ��public�� ,�����������������ļ�����ͬ
//�淶��һ���ļ���Ӧһ���࣬����������⣻
//�����ڲ���  û�����ֵ��ڲ���1.ʵ�ֽӿڣ���д����2.û�����ֵ���
//�������ڲ�����д�˵���Ϊ�ӿڣ�see ���������۾���  hand ���ִ����Ҹ���������see��hand����
public class Test {
	public static void main(String[] args) {

//		Person xijinping=new Person("5655566");
//		xijinping.see();
//		xijinping.setHead("��");
//		System.out.println(xijinping.getHead());
//		System.out.println(xijinping.getId());
//		System.out.println(Person.eyenum);
		//Chinese likeqiang=new Chinese();
//		likeqiang.setId("66666666666666");
//		System.out.println(likeqiang.getId());
//		likeqiang.usekuaizi();
		//likeqiang.head();
//		Person p=new Person();
//		p.head();
//		Chinese c=new Chinese();
//		c.head();
		//������ʲô����ʲô
		//����ȥ�����˸���ķ���
		//��������ͬ�Ķ����õ������������д
		//instanceof �ж�һ�����浽�����ĸ����ʵ��
//		Person p=new Americ();
//		if(p instanceof Chinese){
//			System.out.println("p��Chinese");
//		}
//		Chinese wangqishan=new Chinese("555555555");
//		Person p=new Chinese();
//		PersonBehavior pb=new AmericanBehavior();
//		pb.see();
		Person p=new Person();
		p.setId("88888888888888");
		Person.Inner in=new Person.Inner();
		in.say();
		PersonBehavior pb=new PersonBehavior() {
			
			@Override
			public void see() {
				// TODO Auto-generated method stub
				System.out.println("���������۾���");
			}
			
			@Override
			public void hand() {
				// TODO Auto-generated method stub
				System.out.println("���ִ����Ҹ�");
			}
		};
		pb.see();
		pb.hand();
	}

}