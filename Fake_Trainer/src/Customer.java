
/**
 * Customer Ŭ������ ȸ������ ��� �� ��ȸ�� � ������ �����ϱ� ���� Ŭ�����̴�.
 * 
 * 'ȸ������ ��ȸ'����� existCustomer() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * 'ȸ������ ���'����� addCustomer() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * '�α���'����� login() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * '��ϱ�'����� exercise() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  �ʱ��ۼ�
 * 		ANJIYOUNG, 1.0.1, 2020.12.26
 * 		ANJIYOUNG, 1.0.2, 2020.12.27 ��Ӱ��� ����
 * 
 * @author AN JI-YOUNG
 * @version 1.0.2 2020.12.27
 */
public class Customer {
	
	private String ID; // ����� ���̵�

	public Customer() {
		
	}
	
	public Customer(String ID) {
		this.ID = ID;
	}
	
	public String getID() {
		return ID;
	}

	/**
	 * 'ID'������ �̸����� �ϴ� ���丮�� �����ϴ��� Ȯ���Ѵ�: ȸ������ Ȯ��
	 * 
	 * @param  ID ����� ���̵�
	 * @return �ش� ���丮�� �����ϸ� true ���� 
	 * 					   �������� ������ false ����
	 */
	public static boolean existCustomer(String ID) {
		Directory d = new Directory(ID);
		return d.existDirectory();
	}
	
	/**
	 * 'ID'������ �̸����� �ϴ� ���丮�� �����Ѵ�: ȸ������ ���
	 */
	public static void addCustomer(Customer c) {
		Directory d = new Directory(c.getID());
		d.makeDirectory();
	}
	
	/**
	 * �Ϸ� ������ �����ϱ� ���� Day ��ü�� �����Ѵ�: �α���
	 * 
	 * @return ������ Day ��ü�� ���۷���
	 */
	public Day login() {
		Day exer_records = new Day();
		return exer_records;
	}
	
	/**
	 * ����� ���忡�� � �ϸ�,
	 * ���������� Day ��ü�� �Ϸ絿�� ������ � ��Ͽ� TodayExer ��ü��  �߰��Ѵ�.
	 * 
	 * @param exer_records �Ϸ� ����
	 * @param exer ������ �����(�����+��̸�+Į�θ�����)
	 */
	public void exercise(Day exer_records, TodayExer exer) {
		exer_records.addTodayExer(exer);
	}
	
	public void writeCalendar(Day exer_records) {
		
	}

	public void checkCalendar() {
		
	}
	
}