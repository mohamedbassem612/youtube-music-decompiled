package defpackage;

import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mde {
    private static final agrf a = agrf.h("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils");

    public static mdf a(File file) {
        File file2;
        mdf mdfVar;
        if (file.isDirectory()) {
            return mdf.a;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        byte[] bArr = new byte[62];
        try {
            try {
                file2 = file;
                try {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        int iD = agyi.d(fileInputStream, bArr, 62);
                        long j = -1;
                        boolean z = false;
                        int i = 0;
                        long j2 = 0;
                        long j3 = -1;
                        int i2 = 0;
                        while (i2 < iD) {
                            i2++;
                            byte b = bArr[i2];
                            if (b == 32) {
                                if (!z) {
                                    break;
                                }
                                if (i != 0) {
                                    if (i != 1) {
                                        break;
                                    }
                                    j = j2;
                                } else {
                                    j3 = j2;
                                }
                                i++;
                                z = false;
                                j2 = 0;
                            } else {
                                if (b < 48 || b > 57 || j2 > 922337203685477580L) {
                                    break;
                                }
                                j2 = (j2 * 10) + ((long) (b - 48));
                                z = true;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            return mdfVar;
                        }
                        if (i != 2) {
                            throw new ParseException("Failed to parse SchedStat", i);
                        }
                        mdf mdfVar2 = new mdf(j3, j, j2);
                        fileInputStream.close();
                        mdfVar = mdfVar2;
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        return mdfVar;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java")).w("Failed to read SchedStat for thread %s", file2.getName());
                    mdfVar = mdf.a;
                } catch (ParseException e2) {
                    e = e2;
                    ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java")).w("Failed to read SchedStat for thread %s", file2.getName());
                    mdfVar = mdf.a;
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th3;
            }
        } catch (IOException | ParseException e3) {
            e = e3;
            file2 = file;
        }
    }
}
