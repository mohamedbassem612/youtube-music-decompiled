package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnc {
    private static int a = -2;
    private static final FileFilter b = new fnb();

    public static int a() {
        int length = a;
        if (length == -2) {
            length = -1;
            try {
                int iB = b("/sys/devices/system/cpu/possible");
                if (iB == -1) {
                    iB = b("/sys/devices/system/cpu/present");
                }
                if (iB == -1) {
                    File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(b);
                    fileArrListFiles.getClass();
                    length = fileArrListFiles.length;
                } else {
                    length = iB;
                }
            } catch (NullPointerException | SecurityException unused) {
            }
            a = length;
        }
        return length;
    }

    private static int b(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        int i = -1;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    if (line != null && line.matches("0-[\\d]+$")) {
                        i = Integer.parseInt(line.substring(2)) + 1;
                    }
                    fileInputStream2.close();
                } catch (IOException unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return i;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        return i;
    }
}
