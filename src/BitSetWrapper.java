import java.util.BitSet;

public class BitSetWrapper extends BitSet {
    @Override
    public String toString() {
        byte[] bytes= toByteArray();
        StringBuilder sb= new StringBuilder("[");
        for(int i= bytes.length - 1; i >= 0; --i){
            byte b = bytes[i];
            String s = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
            sb.append(s);
        }
        sb.append("]");
        return sb.toString();
    }
}
