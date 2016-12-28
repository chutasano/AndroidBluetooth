package com.example.android.bluetooth;

import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by chuta on 12/21/2016.
 */

public class ByteEncoder {
    //File must have directory
    public static void writeBytesToFile(File destination, byte[] data) {
        try (FileOutputStream sw = new FileOutputStream(destination)) {
            sw.write(data);
        } catch (Exception e) {
            Log.d("ByteEncoder", e.toString());
        }
    }

    public static byte[] readBytesFromFile(File source)
    {
        try (FileInputStream sr = new FileInputStream(source)) {
            byte[] data = new byte[(int)source.length()]; //TODO unsafe. consider chunking data
            sr.read(data);
            return data;
        }
        catch (Exception e)
        {
            Log.d("ByteEncoder", e.toString());
            return null;
        }
    }

}
