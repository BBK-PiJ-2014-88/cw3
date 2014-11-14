public class Matrix{
	private int[][] array2d;
	private int rowLength = 0;
	private int columnLength = 0;

	public String toString(){
		String output ="";
		for (int x=0; x < this.array2d.length; x++){
			for (int y = 0; y < this.array2d[0].length; y++){
				output = output + "(" + array2d[x][y] + "),";
			}
		}
		return output;
	}

	public Matrix(int row, int column){
		this.array2d = new int[row][column];
		this.rowLength = row;
		this.columnLength = column;
		for (int a = 0; a < row; a++){
			for (int b = 0; b < column; b++){
				this.array2d[a][b] = 1;
			}
		}
	}

	public void setElement(int s, int t, int u){
		if (s < rowLength  && t < columnLength){
			this.array2d[s][t] = u;
		}
	}

	public void setRow(int rowToChange, String text){
		boolean continue1 = true;
		if (rowToChange > this.array2d.length){
			continue1 = false;   // ask do you need to private this?
		}
		String[] temp = text.split(",");
		//checking number of commas in text to see if number of values is OK
		//count starts at 1 as the number of values in text 67,89,34 will
		//be the number of commas plus one
		//decided to use split instead
		if (temp.length > this.array2d[0].length){
			continue1 = false;
		}
		if(continue1 = true){
			for(int x = 0; x < this.array2d[0].length; x++){
				this.array2d[rowToChange][x] = Integer.parseInt(temp[x]);
			}

		}
	}

	public void setColumn(int columnToChange, String text){
		boolean continue1 = true;
		String[] temp2 = text.split(",");
		if(columnToChange > this.array2d[0].length ||
		temp2.length > this.array2d.length){
			continue1 = false;
		}
		if(continue1 = true){
			for (int x = 0; x < this.array2d.length; x++){
				this.array2d[x][columnToChange] = Integer.parseInt(temp2[x]);
			}
		}
	}

	public void prettyPrint(){
		for (int x = 0; x < this.array2d.length; x++){
			System.out.println();
			for (int y = 0; y < this.array2d[0].length; y++){
				System.out.print("\t" + this.array2d[x][y]);
			}
		}
	}

}