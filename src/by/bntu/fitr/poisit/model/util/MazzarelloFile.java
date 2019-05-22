package by.bntu.fitr.poisit.model.util;

import by.bntu.fitr.poisit.model.entity.Mazzarello;

import java.io.*;

public class MazzarelloFile {
    public static void write(String mazzarelloFile, Mazzarello mazzarello) {

        try (DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(mazzarelloFile)))) {
            dataOutputStream.writeInt(mazzarello.getCalories());
            dataOutputStream.writeInt(mazzarello.getPrice());
            //dataOutputStream.writeUTF(String.valueOf(mazzarello.getKind()));
        } catch (IOException ex) {
            //log
        }
    }

    public static Mazzarello read(String mazzarelloFile) {
        Mazzarello mazzarello = null;

        try (DataInputStream dataInputStream = new DataInputStream(
                new BufferedInputStream(new FileInputStream(mazzarelloFile)))) {
            mazzarello = new Mazzarello();
            mazzarello.setCalories(dataInputStream.readInt());
            mazzarello.setPrice(dataInputStream.readInt());
            //mazzarello.setKind(dataInputStream.readUTF());
        } catch (IOException ex) {
            //log
        }
        return mazzarello;
    }

}
