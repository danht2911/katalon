//public class HelloWorld {
//    public static void main(String[] args) {
//        
//        // Khởi tạo chuỗi ban đầu
//        String name = "Ne Ha";
//        
//        // Chuyển chuỗi thành mảng ký tự
//        char[] charname = name.toCharArray();
//        
//        // Khởi tạo chuỗi đầu ra
//        String nameout = "";
//        
//        // Duyệt qua mảng ký tự và loại bỏ các ký tự 'e' và 'a'
//        for (int i = 0; i < charname.length; i++) {
//            if (charname[i] != 'e' && charname[i] != 'a') {
//                nameout.append(charname[i]);
//            }
//        }
//        
//        // In kết quả
//        System.out.println(nameout);
//    }
//}
//

public class SortString {
    public static void main(String[] args) {
        String input = "DdAaCcbB";

        // Convert the string to a character array
        char[] charInput = input.toCharArray();

        for (int i = 0; i < charInput.length - 1; i++) {
            for (int j = i + 1; j < charInput.length; j++) {
                // Compare characters in a case-insensitive manner, but maintain the original case
                if (Character.toLowerCase(charInput[j]) < Character.toLowerCase(charInput[i]) ||
                        (Character.toLowerCase(charInput[j]) == Character.toLowerCase(charInput[i]) && charInput[j] < charInput[i])) {
                    char temp = charInput[i];
                    charInput[i] = charInput[j];
                    charInput[j] = temp;
                }
            }
        }

        String output = new String(charInput);
        System.out.println(output); // Output should be: AaBbCcDd
    }
}