package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import com.google.protobuf.MessageLite;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auiy {
    public static final String a = "auiy";

    /* JADX WARN: Code duplicated, block: B:42:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static MessageLite a(aiir aiirVar, String str, int i, boolean z, Context context) throws Throwable {
        byte[] bArr;
        BufferedInputStream bufferedInputStream;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(b(str, context)));
                try {
                    try {
                        try {
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                            if (bufferedInputStream.read(byteBufferAllocate.array(), 0, byteBufferAllocate.array().length) == -1) {
                                Log.e(a, "Error parsing param record: end of stream.");
                            } else {
                                int i2 = byteBufferAllocate.getInt();
                                int i3 = byteBufferAllocate.getInt();
                                if (i2 == i) {
                                    bArr = new byte[i3];
                                    if (bufferedInputStream.read(bArr, 0, i3) == -1) {
                                        Log.e(a, "Error parsing param record: end of stream.");
                                    } else {
                                        bufferedInputStream.close();
                                    }
                                    if (bArr == null) {
                                        return null;
                                    }
                                    try {
                                        return aiirVar.mergeFrom(bArr).build();
                                    } catch (aiik e) {
                                        Log.e(a, "Error reading params from ContentProvider", e);
                                        return null;
                                    }
                                }
                                Log.e(a, "Error parsing param record: incorrect sentinel.");
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        Log.w(a, "Error reading parameters: ".concat(String.valueOf(e2.toString())));
                    }
                    bufferedInputStream.close();
                } catch (IOException unused2) {
                }
                bArr = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        } catch (FileNotFoundException e3) {
            if (z) {
                e3.toString();
            }
            bArr = null;
        } catch (IllegalStateException e4) {
            Log.w(a, "Error reading parameters: ".concat(e4.toString()));
            bArr = null;
        }
        if (bArr == null) {
            return aiirVar.mergeFrom(bArr).build();
        }
        return null;
    }

    public static File b(String str, Context context) {
        File file = new File(Build.VERSION.SDK_INT >= 29 ? context.getFilesDir() : Environment.getExternalStorageDirectory(), "Cardboard");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            throw new IllegalStateException(file.toString().concat(" already exists as a file, but is expected to be a directory."));
        }
        return new File(file, str);
    }
}
