

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        double[] coeffs = coefficients();
        for (int i = 0; i < coeffs.length; i++) {
            if (coeffs[i] != 0) {
                if (i > 0 && coeffs[i] > 0) {
                    sb.append(" + ");
                }
                sb.append(coeffs[i]);
                if (i > 0) {
                    sb.append("x^").append(i);
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] coeffs = coefficients();
        double[] derivativeCoeffs = new double[coeffs.length > 0 ? coeffs.length -1 : 0];
        for (int i = 1; i < coeffs.length; i++) {
            derivativeCoeffs[i - 1] = coeffs[i] * i;
        }
        return derivativeCoeffs;
    }
}
