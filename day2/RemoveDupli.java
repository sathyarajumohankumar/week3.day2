package week3.day2;
	import java.util.LinkedHashSet;
		import java.util.Set;

		public class RemoveDupli {

			public static void main(String[] args) {
				String name = "We learn java basics as part of java sessions";
				char[] allChars = name.toCharArray();
				System.out.println(allChars);
				Set<Character> Unique = new LinkedHashSet<Character>();
				for (int i = 0; i < allChars.length; i++) {
					if (Unique.add(allChars[i])) {
						System.out.print(allChars[i]);
					}
				}

			}

		}


