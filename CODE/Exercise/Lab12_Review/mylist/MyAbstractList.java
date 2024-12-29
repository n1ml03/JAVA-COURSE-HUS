

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.size(); i++) {
            sb.append(this.get(i));
            if (i < this.size() - 1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
