
public class Movies {
	public void optimal() {
		int[] moviestart = { 22, 20, 10, 12, 18, 16, 14 };
		int[] movieend = { 23, 21, 11, 22, 20, 17, 15 };

		int tempstart, tempend;

		for (int outer = 0; outer < movieend.length - 1; outer++) {
			for (int inner = 0; inner < movieend.length - outer - 1; inner++) {
				if (movieend[inner] > movieend[inner + 1]) {
					tempend = movieend[inner];
					movieend[inner] = movieend[inner + 1];
					movieend[inner + 1] = tempend;
					tempstart = moviestart[inner];
					moviestart[inner] = moviestart[inner + 1];
					moviestart[inner + 1] = tempstart;

				}

			}
		}
		System.out.print("Start");
		for (int loop = 0; loop < moviestart.length; loop++) {
			System.out.print(" " + moviestart[loop]);
		}
		System.out.println();
		System.out.print("END  ");
		for (int loop = 0; loop < moviestart.length; loop++) {
			System.out.print(" " + movieend[loop]);
		}
		bestcase(moviestart, movieend, moviestart.length);
	}

	public void bestcase(int start[], int end[], int length) {
		int check = 0;
		System.out.println();
		System.out.println("Optimal");
		System.out.print(start[0] + " ");
		for (int loop = 1; loop < length; loop++) {
			if (start[loop] >= end[check]) {
				System.out.print(start[loop] + " ");
				check = loop;
			}
		}

	}

	public static void main(String args[]) {
		Movies movie = new Movies();
		movie.optimal();
	}

}
