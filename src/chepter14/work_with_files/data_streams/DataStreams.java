package chepter14.work_with_files.data_streams;

import java.io.*;

public class DataStreams {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"))) {

            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(50);
            outputStream.writeLong(1_000_000);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(12.546);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
