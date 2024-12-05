public class BInarySearch {
    public static int bSearch(int[] a, int key, int iLeft, int iRight) {
        if (iLeft > iRight) {
            return -1;
        }
        int iMid = (iLeft + iRight) / 2;
        if (key == a[iMid]) {
            return iMid;
        } else if (key > a[iMid]) {
            return bSearch(a, key, iMid + 1, iRight);
        } else {
            return bSearch(a, key, iLeft, iMid - 1);
        }
    }

    public static int bSearch(int[] a, int key) {
        int n = a.length;
        return bSearch(a, key, 0, n - 1);
    }

    public static void main(String[] args) {
        int n = 20;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        int key = (int) (Math.random() * 100);
        System.out.println(bSearch(a, key));
    }
}
