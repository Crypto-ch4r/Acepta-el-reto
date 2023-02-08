package reto146;
import java.util.ArrayList;
import java.util.Scanner;
public class Reto146 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = 0;
       	String numTemp0 = sc.nextLine();
	if (numTemp0 != null){
		num = Integer.parseInt(numTemp0);
	}
       while (num != 0){
		ArrayList<Integer> stack = new ArrayList<Integer>();
		ArrayList<Integer> rack = new ArrayList<Integer>();
		for (int i = num; i >= 1; i--){
			if (i % 2 == 0){
				stack.add(i);
			}
		}
	int num0 = 3;
		while (num0 <= stack.size() || num0 <= rack.size()){
			int limit = stack.size();

			for (int i = 0; i < limit; i++){
				// Numero sin suerte :(
				if (i % num0 == 0){
					stack.remove(stack.size() - 1);
				}
				// Numeros con suerte :D
				else{
					rack.add(stack.get(stack.size() - 1));
					stack.remove(stack.size() - 1);
				}
                        }
			while (!rack.isEmpty()){
				stack.add(rack.get(rack.size() - 1));
				rack.remove(rack.size() - 1);
			}
			num0++;
		}
		while (!stack.isEmpty()){
			rack.add(stack.get(stack.size() - 1));
			stack.remove(stack.size() - 1);
		}
		System.out.printf("%d:", num);
		while (!stack.isEmpty()){
			System.out.printf(" %d", stack.get(stack.size() - 1));
			stack.remove(stack.size() - 1);
		}
		while (!rack.isEmpty()){
			System.out.printf(" %d", rack.get(rack.size() - 1));
			rack.remove(rack.size() - 1);
		}
		System.out.printf("%s\n", "");
		String numTemp1 = sc.nextLine();
		if (numTemp1 != null){
			num = Integer.parseInt(numTemp1);
		}
	}
}
    }
