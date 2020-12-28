
import java.util.*;
/**
 * Trainer Ŭ������'��¥ Ʈ���̳�'���α׷� ������ ���� Ŭ�����̴�.
 * �� Ŭ������ main method�� ������ ������, ����ڿ� ���� ���α׷��� ����� ���õ� �� �ֵ��� �������� �帧�� �����Ѵ�.
 * 
 * @author LEE JAE-HYUB, HUH CHANG-HYUN
 */
public class Trainer {
	
	public static void main(String[] arg) {
						
		Lists Base  = new Lists();
		Scanner sc = new Scanner(System.in);
		int temp;
		int option = 0;
		int option2 = 0;
		int option3 = 0;
		int option4 = 0;
		int option5 = 0;
		int option6 = 0;
		boolean exist = false;
		boolean d = true;
		
		String ID = "";

		while(option !=3) {
			System.out.println("��¥ Ʈ���̳ʿ� ���� ���� ȯ���մϴ�.");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ����");
			try {
			option = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("�߸��� �Է��Դϴ�. ó�� ȭ������ ���ư��ϴ�.");
				System.out.println("-----------------------");
				sc.nextLine();
				continue;
			}
			if(option !=1 && option !=2 && option !=3) {
				System.out.println("�߸��� �Է��Դϴ�. ó�� ȭ������ ���ư��ϴ�.");
				System.out.println("-----------------------");
				sc.nextLine();
				continue;
			}
			
			sc.nextLine();
			
			switch(option) {
				case 1:
					System.out.println("������ ID�� �Է��� �ּ���.");
					ID = sc.nextLine();
					
					exist = Customer.existCustomer(ID);
					if(exist ==false) {
						Customer c = new Customer(ID);
						Customer.addCustomer(c);
						System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�!");
					}
					
					while(exist){
						System.out.println("�ش� ID�� �̹� ��� ���̰ų� �Է��� ��ĭ�Դϴ�.");
						System.out.println("1.���ο� ID �Է�");
						System.out.println("2.���� ȭ������ ���ư���");
						
						temp = sc.nextInt();
						sc.nextLine();
						
						switch(temp){
							case 1:
								System.out.println("������ ID�� �Է��� �ּ���.");
								ID = sc.nextLine();
								exist = Customer.existCustomer(ID);
								if(exist) 	break;
								
								Customer.addCustomer(new Customer(ID));
								System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
								break;
								
							case 2:
								exist = false;
								break;
						} // switch()
					} // while()
					break;
					
				case 2:
					while(option == 2) {
						System.out.println("ID�� �Է��� �ּ���.");
						
						ID = sc.nextLine();
						exist = Customer.existCustomer(ID);
						if(exist) break;
						while(!exist) {
							System.out.println("�������� �ʴ� ID �Դϴ�.");
							System.out.println("1.ID �ٽ� �Է��ϱ�");
							System.out.println("2.���α׷� ����");
							try{
								temp = sc.nextInt();
							}
							catch(InputMismatchException e) {
								System.out.println("�߸��� �Է��Դϴ�. ���� ȭ������ ���ư��ϴ�.");
								System.out.println("-----------------------");
								sc.nextLine();
								continue;
							}
								
							if(temp == 1) {
								exist = true;			
							}
							else if(temp==2) {
								System.out.println("���α׷��� �����մϴ�.");
								System.exit(0);
							}
							if(temp!=1 && temp!=2) {
								System.out.println("�߸��� �Է��Դϴ�. ���� ȭ������ ���ư��ϴ�.");
								System.out.println("-----------------------");
								sc.nextLine();
								continue;
							}
							sc.nextLine();
						}
					}
					
					System.out.println(ID + "�� ȯ���մϴ�.");
					Customer cus = new MyCalendar(ID); // polymorphism!
					Day exer_records = cus.login();
					
					while(option2 != 3) {	
						if(option2 == 0) {
						System.out.println("-----------------------");
						System.out.println("1. ��ϱ�");
						System.out.println("2. Ķ���� Ȯ�� �� �����ϱ�");
						System.out.println("3. �����ϱ�");
						try{
							option2 = sc.nextInt();
						}
						catch(InputMismatchException e) {
							System.out.println("�߸��� �Է��Դϴ�. ���� ȭ������ ���ư��ϴ�.");
							sc.nextLine();
							continue;
						}
						sc.nextLine();
						}
						
						outer:
						switch(option2) {
							case 1:
								System.out.println("--------------------");
								System.out.println("� ������ ������ �ּ���.");
								System.out.println("1. ����");
								System.out.println("2. ��");
								System.out.println("3. �ھ�");
								System.out.println("4. ����");
								System.out.println("5. ��ü");
								System.out.println("6. �����");
								try{
									option3 = sc.nextInt();
								}
								catch(InputMismatchException e) {
									System.out.println("�߸��� �Է��Դϴ�. ���� ȭ������ ���ư��ϴ�.");
									sc.nextLine();
									continue;
								}
								
								sc.nextLine();
								if(option3<1 || 6<option3) {
									System.out.println("�߸��� �Է��Դϴ�. ���� ȭ������ ���ư��ϴ�.");
									continue;
								}
								else if(option3 == 6) {
									option2 = 0;
									break;
								}
								
								d=true;
								while(d) {
									System.out.println("--------------------");
									System.out.println("� ����� �����ϼ���");
									for(int i=0; i<Base.Part_List.get(option3-1).ExInfoList.size();i++) {
										System.out.println((i+1) +". " +Base.Part_List.get(option3-1).ExInfoList.get(i).ExName);
									}	
									try{
										option4 = sc.nextInt();
									}
									catch(InputMismatchException e) {
										System.out.println("�߸��� �Է��Դϴ�.���� ȭ������ ���ư��ϴ�.");
										sc.nextLine();
										continue;
									}
								
									sc.nextLine();
									if(option4<1 || Base.Part_List.get(option3-1).ExInfoList.size()<option4) {
										System.out.println("�߸��� �Է��Դϴ�. ���� ȭ������ ���ư��ϴ�.");
										continue;
									}
									d = false;
								}
								
								d = true;
								while(d) {
									System.out.println("--------------------");
									System.out.println("���̵��� ������ �ּ���. (1:��, 2:��, 3:��)");
									
									try{
										option5 = sc.nextInt();
									}
									catch(InputMismatchException e) {
										System.out.println("�߸��� �Է��Դϴ�.���� ȭ������ ���ư��ϴ�.");
										sc.nextLine();
										continue;
									}
									if(option5<1 || 3<option5) {
										System.out.println("�߸��� �Է��Դϴ�. ���� ȭ������ ���ư��ϴ�.");
										continue;
									}
									
									sc.nextLine();
									d = false;
								}
								
								System.out.println("--------------------");
								System.out.println("�����Ͻ� � ������ "+ Base.Part_List.get(option3-1).BodyName);
								System.out.println("�����Ͻ� � ����� " + Base.Part_List.get(option3-1).ExInfoList.get(option4-1).ExName);
								System.out.println("���̵��� " + option5 + " �ܰ��Դϴ�.");
								System.out.println("�ݺ� Ƚ���� " +  Base.Part_List.get(option3-1).ExInfoList.get(option4-1).BaseCount * (option5+1)+"ȸ");
								System.out.println("���� �ð��� " +  Base.Part_List.get(option3-1).ExInfoList.get(option4-1).BaseTime * (option5+1) + " ��");
								System.out.println("���� Kcal �Ҹ��� " + Base.Part_List.get(option3-1).ExInfoList.get(option4-1).KcalPer * (option5+1) + " Kcal �Դϴ�.");
								
								// Show the Video about ExName
								d = true;
								while(d) {
									System.out.println(Base.Part_List.get(option3-1).ExInfoList.get(option4-1).ExName + "�ȳ� ������ ���ðڽ��ϱ�? (1. YES, 2.NO )");
									try{option6 = sc.nextInt();}
									catch(InputMismatchException e) {
										System.out.println("�߸��� �Է��Դϴ�.���� ȭ������ ���ư��ϴ�.");
										sc.nextLine();
										continue;
									}
									if(option6<1 || 2<option6) {
										System.out.println("�߸��� �Է��Դϴ�. ���� ȭ������ ���ư��ϴ�.");
										continue;
									}
									sc.nextLine();
									d=false;
								}
								if(option6 ==1)	Module_Methods.ShowVideo(Base.Part_List.get(option3-1).ExInfoList.get(option4-1).url);
								
								d = true;
								while(d) {
									System.out.println("��� �����Ͻðڽ��ϱ�? 1. YES, 2. NO");
									try{option6 = sc.nextInt();}
									catch(InputMismatchException e) {
										System.out.println("�߸��� �Է��Դϴ�.���� ȭ������ ���ư��ϴ�.");
										sc.nextLine();
										continue;
									}
									if(option6<1 || 2<option6) {
										System.out.println("�߸��� �Է��Դϴ�. ���� ȭ������ ���ư��ϴ�.");
										continue;
									}
									sc.nextLine();
									d=false;
								}
								
								if(option6 == 2) {
									System.out.println("� ���� ���� ȭ������ ���ư��ϴ�.");
									break outer;
								}

								// Start the time watch for given limit time
								Module_Methods.TimeWatch(Base.Part_List.get(option3-1).ExInfoList.get(option4-1).BaseTime * (option5+1));
								
								cus.exercise(exer_records, new TodayExer(Base.Part_List.get(option3-1).BodyName, Base.Part_List.get(option3-1).ExInfoList.get(option4-1).ExName,Base.Part_List.get(option3-1).ExInfoList.get(option4-1).KcalPer * (option5+1)));
								cus.writeCalendar(exer_records);
								
								option2 = sc.nextInt();
								break;
								
							case 2:
								cus.checkCalendar();
								option2=3;
								option =3;
								break;
								
							case 3:
								option = 3;
								System.out.println("���α׷��� �����մϴ�.");
								break;				
								
							default:
								option2 =0;
								System.out.println("�߸��� �Է��Դϴ�.");
								break;
						}
					}
					break;
					
					
				case 3:
					System.out.println("���α׷��� �����մϴ�.");
					sc.close();
					return;			
			}
		} // while()
		sc.close();
	} // main()

}