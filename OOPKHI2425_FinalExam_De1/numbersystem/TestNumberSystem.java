package hus.oop.numbersystem;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class TestNumberSystem {
    public static void main(String[] args) {
        /* Yêu cầu:

        - Sinh ngẫu nhiên 3 số bằng cách:
            - Cơ số radix là một số tự nhiên nằm trong đoạn [2, 16] được sinh ngẫu nhiên.
            - Xâu ký tự biểu diễn số được sinh ra bằng cách:
                + Độ dài số là một số tự nhiên nằm trong đoạn [10, 30] được sinh ra ngẫu nhiên.
                + Mỗi chữ số được sinh ra bằng cách: sinh ra một chỉ số ngẫu nhiên nằm trong đoạn [0, radix - 1],
                  sau đó lấy tương ứng với chỉ số đó một chữ số nằm trong xâu "0123456789ABCDEF".

        - Mỗi lần sinh ra một số và một cơ số mới, thực hiện việc cập nhật và in ra các số được chuyển đổi
          tự động sang các số được biểu diễn trong hệ cơ số 2, 8, 16.

        - Thực hiện chạy chương trình để in ra terminal thông tin về các số ban đầu và các số chuyển đổi, ví dụ:
          Original number: 123456
          radix 12
          Binary: 1111111
          Octal: 7777777
          Hexadecimal: FFFFFF

          Original number: 456789
          radix 7
          Binary: 1111111
          Octal: 7777777
          Hexadecimal: FFFFFF

          Lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_NumberSystemConverter>.txt (Ví dụ, NguyenVanA_123456_NumberSystemConverter.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_NumberSystemConverter>.zip (Ví dụ, NguyenVanA_123456_NumberSystemConverter.zip),
          nộp lên classroom.
         */
        Random random = new Random();
        int radix = random.nextInt(15) + 2;
        int length = random.nextInt(21) + 10;
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(radix);
            number.append("0123456789ABCDEF".charAt(digit));
        }
        MyNumber aNumber = new MyNumber(number.toString(), radix);
        BinaryConverter binaryConverter = new BinaryConverter(aNumber);
        OctalConverter octalConverter = new OctalConverter(aNumber);
        HexadecimalConverter hexadecimalConverter = new HexadecimalConverter(aNumber);

        try {
            String fileName = "numbersystem/LeVanNam_21002158_NumberSystemConverter.txt";
            PrintStream fileOut = new PrintStream(fileName);
            System.setOut(fileOut);

            System.out.println("Original number: " + number);
            System.out.println("Radix: " + radix);
            System.out.println("Binary: " + binaryConverter.decimalTo(number.toString()));
            System.out.println("Octal: " + octalConverter.decimalTo(number.toString()));
            System.out.println("Hexadecimal: " + hexadecimalConverter.decimalTo(number.toString()));

        } catch (FileNotFoundException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
