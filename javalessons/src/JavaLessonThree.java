public class JavaLessonThree {
	
	public static void main(String[] args)
	{
		int int1 = 133;
		int int2 = 2;
		
		@SuppressWarnings("unused")
		int biggestInt = (int1 > int2) ? int1: int2;
		System.out.println(biggestInt);
	}
}
