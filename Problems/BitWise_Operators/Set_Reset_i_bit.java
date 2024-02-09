package Problems.BitWise_Operators;

public class Set_Reset_i_bit {
    public static int setBit(int num, int i) {
        // Left shift 1 by i positions to create a mask with the i-th bit set
        int mask = 1 << i;
        // Perform bitwise OR operation to set the i-th bit
        return num | mask;
    }

    // Function to reset the i-th bit of num
    public static int resetBit(int num, int i) {
        // Left shift 1 by i positions to create a mask with only the i-th bit set
        int mask = 1 << i;
        // Perform bitwise AND operation with the complement of the mask to reset the i-th bit
        return num & ~mask;
    }

    public static void main(String[] args) {
        int num = 10; // Example number
        int i = 2; // Example bit position

        // Set the i-th bit
        int numWithBitSet = setBit(num, i);
        System.out.println("Number with bit set: " + numWithBitSet);

        // Reset the i-th bit
        int numWithBitReset = resetBit(num, i);
        System.out.println("Number with bit reset: " + numWithBitReset);
    }
}
