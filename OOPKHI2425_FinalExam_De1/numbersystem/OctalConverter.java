package hus.oop.numbersystem;

import java.math.BigInteger;

public class OctalConverter extends AbstractNumberConverter {
    public OctalConverter(MyNumber originalNumber) {
        super(originalNumber);
    }

    /*
     * Chuyển đổi một số được biểu diễn trong hệ cơ số 10
     * sang số được biểu diễn trong hệ cơ số 8.
     * @param decimal
     * @return xâu ký tự biểu diễn số trong hệ cơ số 8.
     *
     * Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    @Override
    public String decimalTo(String decimal) {
        BigInteger decimalNumber = new BigInteger(decimal);
        StringBuilder octalNumber = new StringBuilder();
        while (decimalNumber.compareTo(BigInteger.ZERO) > 0) {
            octalNumber.insert(0, decimalNumber.mod(BigInteger.valueOf(8)));
            decimalNumber = decimalNumber.divide(BigInteger.valueOf(8));
        }
        return octalNumber.toString();
    }

    /*
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi. Sau đó in ra terminal 
     * số được chuyển đổi theo định dạng a1a2...an(8).
     */
    @Override
    public void update() {
        convertedNumber = decimalTo(originalNumber.getNumberPresentation());
        System.out.println(convertedNumber + "(8)");
    }

    /*
     * Hiển thị số ra terminal theo định dạng a1a2...an(8).
     */
    @Override
    public void display() {
        System.out.println(convertedNumber + "(8)");
    }
}
