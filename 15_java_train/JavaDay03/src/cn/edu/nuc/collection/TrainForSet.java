package cn.edu.nuc.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TrainForSet {

	public static void main(String[] args) {
		// 5ֻ    15        vs    6 ֻ        7
		//HashSet �е�2������ equals() hashCode�е�
		//Set����������ģ�����ģ������
		//���������֮�䣬���Բ����ǣ�ֻ�з�������
		//����  Ŀ�ľ���Ϊ�˷�ֹ   �ǽ�����Ⱥ
		//����  ��ʽ��<����> û����������ʱ����������Ĭ�Ϸ��ö���Object����
		//Object ���� java��һ����������̵�����  Object��������ĸ���
		Set<Wolf> wolfset=new HashSet<Wolf>();
		wolfset.add(new Wolf("��̫��"));
		wolfset.add(new Wolf("��̫��"));
		wolfset.add(new Wolf("С�һ�"));
		Set<Sheep> sheepset=new HashSet<Sheep>();
		sheepset.add(new Sheep("ϲ����"));
		sheepset.add(new Sheep("������"));
		sheepset.add(new Sheep("������"));
		sheepset.add(new Sheep("������"));
		sheepset.add(new Sheep("������"));
		printfForName(wolfset);
//		for(Object s:sheepset){
//			System.out.println(((Dongwu)s).name);
//		}
//		Set sheepset=new HashSet();
//		sheepset.add("ϲ����");
//		sheepset.add("������");
//		sheepset.add("������");
//		sheepset.add("������");
//		sheepset.add("������");
//		sheepset.add("������");
//		for(Object s:sheepset){
//			System.out.println((String)s);
//		} 
		
	}
	
	//������Set���� ��Set�����е�����Ԫ�ص����ֽ��д�ӡ
	//����ֵ��Ϊ��ֵ
	static	void printfForName(Set<? extends Dongwu> sheepset){
			//������  ÿ�ּ��϶��Դ�������
			Iterator<? extends Dongwu> itr=sheepset.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next().name);
			}
		}
	

}
