package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qcz {
    public final Context a;
    public final mbc b;
    public final awmd c;
    public final Object d;

    public qcz(Context context, mbc mbcVar, awmd awmdVar) {
        this.d = new HashSet();
        this.a = context;
        this.b = mbcVar;
        this.c = awmdVar;
    }

    public static void a(File file, long j) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            long j2 = j - 172800;
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                int iIndexOf = name.indexOf(95);
                if (iIndexOf == -1) {
                    b(file2);
                } else {
                    try {
                        if (Long.parseLong(name.substring(iIndexOf + 1)) < j2) {
                            if (file2.delete()) {
                                file2.getName();
                            } else {
                                ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "cleanupOldFlightRecords", 121, "FlightRecordWriterImpl.java")).w("Failed to delete old flight record: %s", file2.getName());
                            }
                        }
                    } catch (NumberFormatException unused) {
                        b(file2);
                    }
                }
            }
        }
    }

    private static void b(File file) {
        if (file.delete()) {
            file.getName();
        } else {
            ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "deleteMalformedFile", 135, "FlightRecordWriterImpl.java")).w("Failed to delete malformed flight record: %s", file.getName());
        }
    }

    public qcz(Context context, mbc mbcVar, awmd awmdVar, awmd awmdVar2) {
        this.a = context;
        this.b = mbcVar;
        this.d = awmdVar;
        this.c = awmdVar2;
    }
}
