package cn.edu.nuc.collection;

import java.util.ArrayList;

public class TrainForCollection {
			//����
		public static void main(String[] args) {
//			int[] a=new int[]{1,2,3,4,5};
//			//��������
//			Sheep[] sheep=new Sheep[]{
//			new Sheep("ϲ����"),new Sheep("������"),new Sheep("������"),
//			new Sheep("������"),new Sheep("������")};
//			System.out.println(sheep[2].name);
			//add ���  size��ȡ��������  get(i)�õ���i������
			ArrayList<Sheep> sheepList=new ArrayList();
			sheepList.add(new Sheep("ϲ����"));
			sheepList.add(new Sheep("������"));
			sheepList.add(new Sheep("������"));
			sheepList.add(new Sheep("������"));
			sheepList.add(new Sheep("������"));
			//sheepList.add(new Sheep("������"));
			int num=sheepList.size();
			for(int i=2;i<sheepList.size();){
				sheepList.remove(i);
				
				
			}
				
			for(int i=0;i<sheepList.size();i++){
			System.out.println(((Sheep)(sheepList.get(i))).name);
			}
//			//for-eachѭ����ʽ
//			//for(Ԫ������ Ԫ������List){}
//			for(Object s:sheepList){
//				System.out.println(((Sheep)s).name);
//			}
//			//Linkedlist�Ա�ArrayList��ѧ
		}

}
