package Lab3;

/**
 * Program for testing valid operations for different data types version 1.0
 * Puzanov Kirill Vladimirovich Group: POIS 1709v1
 */
public class Lab03 {

    public static void main(String[] args) {

        Song song1 = new Song("High Hopes", 8.53f);
        Song song2 = new Song("White Mountain", 6.75f);
        
        DataTypesTester.testByte((byte) 92, (byte) 12);
        DataTypesTester.testChar('a', 'b');
        DataTypesTester.testShort((short) 15325, (short) 1546);
        DataTypesTester.testInt(235, 553);
        DataTypesTester.testBoolean(true, false);
        DataTypesTester.testLong(2133564, 46699565);
        DataTypesTester.testFloat(12.45e+5f, 15698.224e-15f);
        DataTypesTester.testDouble(16796.66e+154, 886.485e-145);
        DataTypesTester.testString("It's time to ", "go to sleep!");
        DataTypesTester.testSong(song1, song2);
    }

}
