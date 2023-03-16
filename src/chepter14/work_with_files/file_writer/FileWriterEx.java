package chepter14.work_with_files.file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = " В романе \"Офицеры и джентльмены\" под беспощадным пером Ивлина Во оказалась краса" +
                " и гордость Британии - ее армия. \n Кумиры викторианской Англии, \"строители Империи\" " +
                "предстают в произведении плохими актерами, играющими в бессмысленной, фарсовой пьесе." +
                " \n Они глупы и напыщенны. Они очень стараются соответствовать традиционным представлениям о себе. " +
                " \n И чем больше стараются - тем забавнее выглядят...";

        FileWriter writer = null;
        try {
            writer = new FileWriter("E:\\InputOutputStream\\javaInputOutput.txt");
            writer = new FileWriter("text2.txt");
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
