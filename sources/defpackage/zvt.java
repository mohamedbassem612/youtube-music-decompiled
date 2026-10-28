package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zvt {
    private static final StackTraceElement[] a = new StackTraceElement[0];

    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Error] */
    public static Throwable a(Throwable th) throws Throwable {
        ?? th2;
        Throwable e;
        Throwable th3;
        StackTraceElement[] stackTrace = th.getStackTrace();
        String message = th.getMessage();
        int iMax = message != null ? Math.max(409600 - message.length(), 0) : 409600;
        int length = 0;
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            length += stackTraceElement.toString().length();
            if (length > iMax) {
                break;
            }
            i++;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) Arrays.copyOf(stackTrace, i);
        th.setStackTrace(a);
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        ?? r4 = 0;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                try {
                    objectOutputStream.writeObject(th);
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            th3 = (Throwable) objectInputStream.readObject();
                            try {
                                objectInputStream.close();
                                byteArrayOutputStream = th3;
                            } catch (IOException e2) {
                                e = e2;
                                Log.e("ThrowableTrimmer", "Couldn't deserialize throwable.", e);
                                byteArrayOutputStream = th3;
                            } catch (ClassNotFoundException e3) {
                                e = e3;
                                Log.e("ThrowableTrimmer", "Couldn't deserialize throwable.", e);
                                byteArrayOutputStream = th3;
                            }
                        } catch (Throwable th4) {
                            try {
                                objectInputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (IOException | ClassNotFoundException e4) {
                        e = e4;
                        th3 = null;
                    }
                    r4 = byteArrayOutputStream;
                    objectOutputStream.close();
                    th2 = r4;
                    if (th2 == 0) {
                        if (th instanceof Error) {
                            th2 = new Error(th.getMessage());
                        } else if (th instanceof Exception) {
                            th2 = new Exception(th.getMessage());
                        } else {
                            th2 = new Throwable(th.getMessage());
                        }
                    }
                    th.setStackTrace(stackTrace);
                    th2.setStackTrace(stackTraceElementArr);
                    return th2;
                } catch (Throwable th6) {
                    th = th6;
                    byteArrayOutputStream = 0;
                    try {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable th7) {
                            th.addSuppressed(th7);
                        }
                        throw th;
                    } catch (IOException e5) {
                        r4 = byteArrayOutputStream;
                        e = e5;
                        Log.e("ThrowableTrimmer", "Couldn't serialize throwable.", e);
                        th2 = r4;
                        if (th2 == 0) {
                            if (th instanceof Error) {
                                th2 = new Error(th.getMessage());
                            } else if (th instanceof Exception) {
                                th2 = new Exception(th.getMessage());
                            } else {
                                th2 = new Throwable(th.getMessage());
                            }
                        }
                        th.setStackTrace(stackTrace);
                        th2.setStackTrace(stackTraceElementArr);
                        return th2;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                objectOutputStream.close();
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
        }
    }

    public static boolean b(Throwable th) {
        int length;
        String message = th.getMessage();
        if (message != null) {
            length = message.length();
            if (length > 409600) {
                return true;
            }
        } else {
            length = 0;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            length += stackTraceElement.toString().length();
            if (length > 409600) {
                return true;
            }
        }
        return false;
    }
}
