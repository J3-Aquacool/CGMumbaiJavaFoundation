class ArrayDemo  
{
	String[] studNames = { "Dennis " , "Grace " , "Bjarne " , "James "};
	int[] studMarks = new int[studNames.length];
	
	void printResult()
	{
		for(int i = 0 ; i < studNames.length ; ++i)
			System.out.println(studNames[i]+ " has scored " + studMarks[i] + " in Mathematics");
	}
	public static void main(String[] args) 
	{
		ArrayDemo demo = new ArrayDemo();
		demo.studMarks[0] = 83;
		demo.studMarks[1] = 65;
		demo.studMarks[2] = 43;
		demo.studMarks[3] = 89;
		demo.printResult();
	}
}
