import java.util.Arrays;
import java.util.List;

/**
 * @author daisong
 * @Date 2015��11��29��
 * @Time ����8:36:19
 * @description  
 */
public class Test {
	int size = 10;
	Object[] elements;
	
	public <T> T[] toArray(T[] a){
		if(a.length < size){
			//��С���ȣ�����һ���ֲ�������ʹ��@SuppressWarnings("unchecked")��
			@SuppressWarnings("unchecked")T[] result = (T[])Arrays.copyOf(elements, size,a.getClass());
			return result;
		}
		System.arraycopy(elements, 0, a, 0, size);
		if(a.length > size){
			a[size] = null;
		}
		return a;
	}
	
	public void genericArrayIllegal(){
//		List<String>[] stringLists = new List<String>[1];
//		List<Integer> intList = Arrays.asList(42);
//		Object[] objects = stringLists;
//		objects[0] = intList;
//		String s = stringLists[0].get(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
