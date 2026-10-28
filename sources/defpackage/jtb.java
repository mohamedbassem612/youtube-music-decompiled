package defpackage;

import android.os.ConditionVariable;
import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jtb extends Thread {
    final /* synthetic */ ConditionVariable a;
    final /* synthetic */ jso b;
    final /* synthetic */ jtc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtb(jtc jtcVar, ConditionVariable conditionVariable, jso jsoVar) {
        super("SimpleCache.initialize()");
        this.a = conditionVariable;
        this.b = jsoVar;
        this.c = jtcVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e9 A[Catch: all -> 0x019b, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0015, B:8:0x001b, B:53:0x015d, B:55:0x0172, B:56:0x0180, B:61:0x018d, B:64:0x0190, B:67:0x0193, B:68:0x0198, B:9:0x0033, B:11:0x0039, B:12:0x0051, B:15:0x0058, B:18:0x0068, B:25:0x0095, B:30:0x00b6, B:31:0x00ca, B:33:0x00e9, B:35:0x00f1, B:36:0x00f4, B:37:0x00f7, B:39:0x0102, B:41:0x011b, B:44:0x0120, B:46:0x012c, B:47:0x0131, B:49:0x0135, B:50:0x013c, B:52:0x0145, B:28:0x009c, B:20:0x0077, B:57:0x0181, B:59:0x0187, B:60:0x018c), top: B:81:0x0003, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f1 A[Catch: all -> 0x019b, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0015, B:8:0x001b, B:53:0x015d, B:55:0x0172, B:56:0x0180, B:61:0x018d, B:64:0x0190, B:67:0x0193, B:68:0x0198, B:9:0x0033, B:11:0x0039, B:12:0x0051, B:15:0x0058, B:18:0x0068, B:25:0x0095, B:30:0x00b6, B:31:0x00ca, B:33:0x00e9, B:35:0x00f1, B:36:0x00f4, B:37:0x00f7, B:39:0x0102, B:41:0x011b, B:44:0x0120, B:46:0x012c, B:47:0x0131, B:49:0x0135, B:50:0x013c, B:52:0x0145, B:28:0x009c, B:20:0x0077, B:57:0x0181, B:59:0x0187, B:60:0x018c), top: B:81:0x0003, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0102 A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0015, B:8:0x001b, B:53:0x015d, B:55:0x0172, B:56:0x0180, B:61:0x018d, B:64:0x0190, B:67:0x0193, B:68:0x0198, B:9:0x0033, B:11:0x0039, B:12:0x0051, B:15:0x0058, B:18:0x0068, B:25:0x0095, B:30:0x00b6, B:31:0x00ca, B:33:0x00e9, B:35:0x00f1, B:36:0x00f4, B:37:0x00f7, B:39:0x0102, B:41:0x011b, B:44:0x0120, B:46:0x012c, B:47:0x0131, B:49:0x0135, B:50:0x013c, B:52:0x0145, B:28:0x009c, B:20:0x0077, B:57:0x0181, B:59:0x0187, B:60:0x018c), top: B:81:0x0003, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, jss] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        axfd axfdVar;
        agjz agjzVar;
        int size;
        String[] strArr;
        int i;
        agke agkeVarG;
        int i2;
        String str;
        jtc jtcVar = this.c;
        synchronized (jtcVar) {
            this.a.open();
            long jNanoTime = System.nanoTime();
            File file = jtcVar.a;
            if (file.exists() || file.mkdirs()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            j = -1;
                            break;
                        }
                        File file2 = fileArrListFiles[i3];
                        String name = file2.getName();
                        if (name.endsWith(".uid")) {
                            try {
                                j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                                break;
                            } catch (NumberFormatException unused) {
                                bvx.c("SimpleCache", "Malformed UID file: ".concat(String.valueOf(String.valueOf(file2))));
                                file2.delete();
                                i3++;
                            }
                        }
                        i3++;
                    }
                    if (j == -1) {
                        try {
                            rpi.J(jtcVar.a);
                            try {
                                axfd axfdVar2 = jtcVar.l;
                                axfdVar2.c.a((HashMap) axfdVar2.d, (SparseArray) axfdVar2.e);
                                jtcVar.u(jtcVar.a, true, fileArrListFiles);
                                axfdVar = jtcVar.l;
                                agjzVar = new agjz(4);
                                Object obj = axfdVar.d;
                                size = ((HashMap) obj).size();
                                strArr = new String[size];
                                ((HashMap) obj).keySet().toArray(strArr);
                                for (i = 0; i < size; i++) {
                                    str = strArr[i];
                                    if (axfdVar.ad(str)) {
                                        agjzVar.h(str);
                                    }
                                }
                                agkeVarG = agjzVar.g();
                                i2 = ((agpi) agkeVarG).d;
                                for (int i4 = 0; i4 < i2; i4++) {
                                    hna.ad(jtcVar.e, "SimpleCache initialize removed empty key ".concat(String.valueOf((String) agkeVarG.get(i4))), null);
                                }
                                try {
                                    axfdVar.ab();
                                } catch (IOException e) {
                                    String strC = jsq.c(e, "exception thrown when storing contentIndex when calling initialize, with message: ", ", with stack trace: ");
                                    if (jtcVar.f) {
                                        hna.ad(jtcVar.e, strC, e);
                                    }
                                    if (jtcVar.g) {
                                        jtcVar.i = new jsi(strC, e);
                                    }
                                    bvx.d("SimpleCache", "Storing index file failed", e);
                                }
                            } catch (IOException e2) {
                                String strConcat = "Failed to initialize cache indices: ".concat(jtcVar.a.toString());
                                bvx.d("SimpleCache", strConcat, e2);
                                jtcVar.i = new jsi(strConcat, e2);
                            }
                        } catch (IOException e3) {
                            String strConcat2 = "Failed to create cache UID: ".concat(jtcVar.a.toString());
                            bvx.d("SimpleCache", strConcat2, e3);
                            jtcVar.i = new jsi(strConcat2, e3);
                        }
                    } else {
                        axfd axfdVar3 = jtcVar.l;
                        axfdVar3.c.a((HashMap) axfdVar3.d, (SparseArray) axfdVar3.e);
                        jtcVar.u(jtcVar.a, true, fileArrListFiles);
                        axfdVar = jtcVar.l;
                        agjzVar = new agjz(4);
                        Object obj2 = axfdVar.d;
                        size = ((HashMap) obj2).size();
                        strArr = new String[size];
                        ((HashMap) obj2).keySet().toArray(strArr);
                        while (i < size) {
                            str = strArr[i];
                            if (axfdVar.ad(str)) {
                                agjzVar.h(str);
                            }
                        }
                        agkeVarG = agjzVar.g();
                        i2 = ((agpi) agkeVarG).d;
                        while (i4 < i2) {
                            hna.ad(jtcVar.e, "SimpleCache initialize removed empty key ".concat(String.valueOf((String) agkeVarG.get(i4))), null);
                        }
                        axfdVar.ab();
                    }
                    throw th;
                }
                String strConcat3 = "Failed to list cache directory files: ".concat(file.toString());
                bvx.c("SimpleCache", strConcat3);
                jtcVar.i = new jsi(strConcat3);
            } else {
                String strConcat4 = "Failed to create cache directory: ".concat(file.toString());
                bvx.c("SimpleCache", strConcat4);
                jtcVar.i = new jsi(strConcat4);
            }
            long jNanoTime2 = System.nanoTime();
            jtc jtcVar2 = this.c;
            jtcVar2.b.f();
            long j2 = (jNanoTime2 - jNanoTime) / 1000;
            zhq zhqVar = zhq.ABR;
            if (jtcVar2.j != null) {
                throw new IllegalStateException();
            }
            this.b.d();
            jtcVar2.j = new xhn(j2);
            synchronized (jtcVar2.d) {
                try {
                    jtcVar2.c = true;
                    xxy xxyVar = jtcVar2.k;
                    if (xxyVar != null) {
                        xxyVar.a(jtcVar2.j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
