package wk2_java_basics;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		package wk1_java_basics;

		public class String_Equals {

			public static void main(String[] args) {

				String s1 = "abc";
				String s2 = "abc";
				String s3 = s2;
				String s4 = "xyz";
				
				s4 = "abc";
				
				String s5 = new String(s4);
				
				String s6 = "a" + "b" + "c";
				
				String l1 = "a";
				String l2 = "b";
				String l3 = "c";
				String s7 = l1 + l2 + l3;
				
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
				System.out.println(s4);
				System.out.println(s5);
				
				if (s1 == s2) // Test references
					System.out.println("s1 and s2 have same references");
				else System.out.println("s1 and s2 have different references");
				
				if (s1.equals(s2)) // Test values
					System.out.println("s1 and s2 have same values");
				else System.out.println("s1 and s2 have different values");
				
				if (s1 == s4) // Test references
					System.out.println("s1 and s4 have same references");
				else System.out.println("s1 and s4 have different references");
				
				if (s1.equals(s4)) // Test values
					System.out.println("s1 and s4 have same values");
				else System.out.println("s1 and s4 have different values");
				
				if (s1.equals(s5)) // Test values
					System.out.println("s1 and s5 have same values");
				else System.out.println("s1 and s5 have different values");
				
				if (s1 == s5) // Test references
					System.out.println("s1 and s5 have same references");
				else System.out.println("s1 and s5 have different references");
				
				if (s1.equals(s6)) // Test values
					System.out.println("s1 and s6 have same values");
				else System.out.println("s1 and s6 have different values");
				
				if (s1 == s6) // Test references
					System.out.println("s1 and s6 have same references");
				else System.out.println("s1 and s6 have different references");
				
				if (s1.equals(s7)) // Test values
					System.out.println("s1 and s7 have same values");
				else System.out.println("s1 and s7 have different values");
				
				if (s1 == s7) // Test references
					System.out.println("s1 and s7 have same references");
				else System.out.println("s1 and s7 have different references");
			}

		}
		
	}

}
