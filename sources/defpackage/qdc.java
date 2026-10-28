package defpackage;

import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qdc {
    public final Executor a;
    public final Set b;
    public final mbc c;
    public final awmd d;
    public final qcz e;
    public aihf f;
    private final Executor g;

    public qdc(Executor executor, Set set, qcz qczVar, mbc mbcVar, awmd awmdVar) {
        this.a = executor;
        this.e = qczVar;
        this.g = new ahfg(executor);
        this.b = set;
        this.c = mbcVar;
        this.d = awmdVar;
    }

    public final ListenableFuture a(final qda qdaVar) {
        return ahng.q(new Runnable() { // from class: qdb
            /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:39:0x0110 A[Catch: IOException -> 0x0163, TryCatch #0 {IOException -> 0x0163, blocks: (B:37:0x0108, B:39:0x0110, B:41:0x0116, B:43:0x0133, B:44:0x0135, B:45:0x013f, B:47:0x0145, B:48:0x014b, B:50:0x0153, B:59:0x0162, B:58:0x015f, B:49:0x0150, B:54:0x0159), top: B:65:0x0108, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:43:0x0133 A[Catch: IOException -> 0x0163, TryCatch #0 {IOException -> 0x0163, blocks: (B:37:0x0108, B:39:0x0110, B:41:0x0116, B:43:0x0133, B:44:0x0135, B:45:0x013f, B:47:0x0145, B:48:0x014b, B:50:0x0153, B:59:0x0162, B:58:0x015f, B:49:0x0150, B:54:0x0159), top: B:65:0x0108, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:47:0x0145 A[Catch: IOException -> 0x0163, TryCatch #0 {IOException -> 0x0163, blocks: (B:37:0x0108, B:39:0x0110, B:41:0x0116, B:43:0x0133, B:44:0x0135, B:45:0x013f, B:47:0x0145, B:48:0x014b, B:50:0x0153, B:59:0x0162, B:58:0x015f, B:49:0x0150, B:54:0x0159), top: B:65:0x0108, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:62:0x0178  */
            /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object, java.util.Set] */
            @Override // java.lang.Runnable
            public final void run() {
                File file;
                aijp aijpVar;
                ?? r14;
                FileOutputStream fileOutputStream;
                aijp aijpVar2;
                qdc qdcVar = this.a;
                if (qdcVar.f == null) {
                    boolean zBooleanValue = ((Boolean) qdcVar.d.io()).booleanValue();
                    aihf aihfVarCreateBuilder = qcx.a.createBuilder();
                    if (zBooleanValue) {
                        long jMyPid = Process.myPid();
                        aihfVarCreateBuilder.copyOnWrite();
                        qcx qcxVar = (qcx) aihfVarCreateBuilder.instance;
                        qcxVar.b |= 1;
                        qcxVar.c = jMyPid;
                        aijp aijpVarB = aikz.b(qdcVar.c.f().toEpochMilli());
                        aihfVarCreateBuilder.copyOnWrite();
                        qcx qcxVar2 = (qcx) aihfVarCreateBuilder.instance;
                        aijpVarB.getClass();
                        qcxVar2.d = aijpVarB;
                        qcxVar2.b |= 2;
                    }
                    qdcVar.f = aihfVarCreateBuilder;
                }
                if (qdaVar.a(qdcVar.f)) {
                    qcz qczVar = qdcVar.e;
                    qcx qcxVar3 = (qcx) qdcVar.f.build();
                    int i = qcxVar3.b;
                    if ((i & 1) == 0 || (i & 2) == 0 || qcxVar3.c < 0) {
                        ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 53, "FlightRecordWriterImpl.java")).t("Invalid FlightRecord");
                    } else {
                        aijp aijpVar3 = qcxVar3.d;
                        if (aijpVar3 == null) {
                            aijpVar3 = aijp.a;
                        }
                        if (aijpVar3.b >= 0) {
                            File file2 = new File(qczVar.a.getFilesDir(), "flight_records");
                            long epochSecond = qczVar.b.f().getEpochSecond();
                            if (!((Boolean) qczVar.c.io()).booleanValue()) {
                                if (file2.exists()) {
                                    Locale locale = Locale.US;
                                    Long lValueOf = Long.valueOf(qcxVar3.c);
                                    aijpVar = qcxVar3.d;
                                    if (aijpVar == null) {
                                        aijpVar = aijp.a;
                                    }
                                    file = new File(file2, String.format(locale, "%d_%s", lValueOf, Long.valueOf(aijpVar.b)));
                                    r14 = qczVar.d;
                                    if (!r14.contains(file)) {
                                        agrc agrcVar = (agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 77, "FlightRecordWriterImpl.java");
                                        qdq qdqVar = new qdq(qcxVar3.c);
                                        aijpVar2 = qcxVar3.d;
                                        if (aijpVar2 == null) {
                                            aijpVar2 = aijp.a;
                                        }
                                        agrcVar.B("File with pid %s and start time %s already exists, overwriting the previous record", qdqVar, new qdq(aijpVar2.b));
                                    }
                                    if (!file.exists()) {
                                        file.createNewFile();
                                        r14.add(file);
                                    }
                                    fileOutputStream = new FileOutputStream(file);
                                    qcxVar3.writeTo(fileOutputStream);
                                    fileOutputStream.close();
                                    return;
                                }
                                Locale locale2 = Locale.US;
                                Long lValueOf2 = Long.valueOf(qcxVar3.c);
                                aijpVar = qcxVar3.d;
                                if (aijpVar == null) {
                                    aijpVar = aijp.a;
                                }
                                file = new File(file2, String.format(locale2, "%d_%s", lValueOf2, Long.valueOf(aijpVar.b)));
                                r14 = qczVar.d;
                                if (!r14.contains(file)) {
                                    agrc agrcVar2 = (agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 77, "FlightRecordWriterImpl.java");
                                    qdq qdqVar2 = new qdq(qcxVar3.c);
                                    aijpVar2 = qcxVar3.d;
                                    if (aijpVar2 == null) {
                                        aijpVar2 = aijp.a;
                                    }
                                    agrcVar2.B("File with pid %s and start time %s already exists, overwriting the previous record", qdqVar2, new qdq(aijpVar2.b));
                                }
                                if (!file.exists()) {
                                    file.createNewFile();
                                    r14.add(file);
                                }
                                fileOutputStream = new FileOutputStream(file);
                                qcxVar3.writeTo(fileOutputStream);
                                fileOutputStream.close();
                                return;
                            }
                            qcz.a(file2, epochSecond);
                            aijp aijpVar4 = qcxVar3.d;
                            if (aijpVar4 == null) {
                                aijpVar4 = aijp.a;
                            }
                            if (aijpVar4.b >= epochSecond - 172800) {
                                if (file2.exists() || file2.mkdirs()) {
                                    Locale locale3 = Locale.US;
                                    Long lValueOf3 = Long.valueOf(qcxVar3.c);
                                    aijpVar = qcxVar3.d;
                                    if (aijpVar == null) {
                                        aijpVar = aijp.a;
                                    }
                                    file = new File(file2, String.format(locale3, "%d_%s", lValueOf3, Long.valueOf(aijpVar.b)));
                                    try {
                                        r14 = qczVar.d;
                                        if (!r14.contains(file) && file.exists()) {
                                            agrc agrcVar3 = (agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 77, "FlightRecordWriterImpl.java");
                                            qdq qdqVar3 = new qdq(qcxVar3.c);
                                            aijpVar2 = qcxVar3.d;
                                            if (aijpVar2 == null) {
                                                aijpVar2 = aijp.a;
                                            }
                                            agrcVar3.B("File with pid %s and start time %s already exists, overwriting the previous record", qdqVar3, new qdq(aijpVar2.b));
                                        }
                                        if (!file.exists()) {
                                            file.createNewFile();
                                            r14.add(file);
                                        }
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            qcxVar3.writeTo(fileOutputStream);
                                            fileOutputStream.close();
                                            return;
                                        } catch (Throwable th) {
                                            try {
                                                fileOutputStream.close();
                                                throw th;
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                                throw th;
                                            }
                                        }
                                    } catch (IOException e) {
                                        ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", '`', "FlightRecordWriterImpl.java")).t("Failed to write FlightRecord to file");
                                    }
                                } else {
                                    ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 68, "FlightRecordWriterImpl.java")).t("Failed to create flight records directory");
                                }
                            }
                        } else {
                            ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 53, "FlightRecordWriterImpl.java")).t("Invalid FlightRecord");
                        }
                    }
                    ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecorderImpl", "submitMutation", 95, "FlightRecorderImpl.java")).t("Failed to write flight record to disk");
                }
            }
        }, this.g);
    }
}
