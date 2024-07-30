//Input [0,1,0,1,0,1,0]
//Output [0,0,0,0,1,1,1]

int[] input = [0,1,0,1,0,1,0]

for (int i=0; i<input.size(); i++) {
	for (int j = i +1; j<input.size();j++) {
		if (input[j]<input[i]) {
			int tmp = input[j]
			input[j] = input[i]
			input[i] = tmp
		} 
	}
}
println(input)
	
	