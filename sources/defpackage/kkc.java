package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kkc {
    private static final ScheduledExecutorService b;
    private static final Status c;
    public final kjx a = new kjx();

    static {
        ksy ksyVar = kyq.a;
        b = ksy.am();
        c = new Status(8, "Batch event failed.", null, null);
    }

    public static boolean d(List list) {
        return ((kjz) list.get(0)).d;
    }

    public final void a(AtomicBoolean atomicBoolean, AtomicReference atomicReference, String str, kjo kjoVar) {
        if (atomicBoolean.getAndSet(true)) {
            kjx.a(str, 1031);
            return;
        }
        Future future = (Future) atomicReference.get();
        if (future != null) {
            future.cancel(false);
        }
        b(kjoVar, str);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Queue] */
    public final void b(kjo kjoVar, String str) {
        while (true) {
            kjx kjxVar = this.a;
            Context context = kjoVar.p;
            ArrayList arrayList = new ArrayList();
            long jD = auqh.a.io().d(context);
            synchronized (kjxVar.a) {
                ?? r5 = kjxVar.d;
                if (r5.isEmpty()) {
                    long length = 0;
                    while (true) {
                        ?? r9 = kjxVar.c;
                        if (!r9.isEmpty()) {
                            byte[] bArr = ((kjz) r9.element()).a.b;
                            if (bArr != null) {
                                length += (long) bArr.length;
                                if (!arrayList.isEmpty() && length > jD) {
                                    break;
                                } else {
                                    arrayList.add((kjz) r9.remove());
                                }
                            } else {
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                                arrayList.add((kjz) r9.remove());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        kjxVar.b = false;
                    }
                } else {
                    kjz kjzVarA = (kjz) r5.remove();
                    if (r5.isEmpty()) {
                        kjy kjyVar = new kjy(kjzVarA);
                        kjyVar.b(true);
                        kjzVarA = kjyVar.a();
                    }
                    arrayList.add(kjzVarA);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (d(arrayList)) {
                kjx.a(((kjz) arrayList.get(0)).a.a.f, 1034);
            } else {
                kjx.a(str, 1026);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    kjx.a(((kjz) it.next()).a.a.f, 1027);
                }
            }
            kka kkaVar = new kka(this, arrayList, str, kjoVar);
            agke agkeVar = (agke) Collection.EL.stream(arrayList).map(new ixa(12)).collect(aghu.a);
            kjg kjgVarA = kjs.b().a();
            kie kieVar = new kie(agkeVar, kjgVarA);
            try {
                kjr kjrVar = (kjr) kjoVar.C();
                Parcel parcelC = kjrVar.c();
                gdc.e(parcelC, kkaVar);
                gdc.c(parcelC, kieVar);
                kjrVar.f(9, parcelC);
                kkaVar.e.c(kkaVar.a, kkaVar.b, kkaVar.c, kkaVar.d);
                return;
            } catch (Throwable th) {
                if (d(arrayList)) {
                    String str2 = ((kjz) arrayList.get(0)).a.a.f;
                    kjx.a(str2, 1036);
                    if (th instanceof TransactionTooLargeException) {
                        Log.e("BatchingLogger", "Failed retry call to logBatchedEvents with TransactionTooLargeException", th);
                        kjx.a(str2, 1037);
                    } else if (th instanceof DeadObjectException) {
                        Log.e("BatchingLogger", "Failed retry call to logBatchedEvents with DeadObjectException", th);
                        kjx.a(str2, 1042);
                    } else {
                        Log.e("BatchingLogger", "Failed retry call to logBatchedEvents", th);
                    }
                } else {
                    kjx.a(str, 1032);
                    StringBuilder sb = new StringBuilder("Failed call to logBatchedEvents");
                    if (arrayList.size() == 1) {
                        sb.append(", single event");
                        kjx.a(str, 1043);
                    }
                    if (th instanceof TransactionTooLargeException) {
                        sb.append(", TransactionTooLargeException");
                        kjx.a(str, 1033);
                    } else if (th instanceof DeadObjectException) {
                        sb.append(", DeadObjectException");
                        kjx.a(str, 1041);
                    }
                    Log.e("BatchingLogger", sb.toString(), th);
                }
                List list = kjgVarA.a;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        kjs.b().c((kjt) it2.next());
                    }
                }
                if (arrayList.size() > 1) {
                    kjx kjxVar2 = this.a;
                    agke agkeVar2 = (agke) Collection.EL.stream(arrayList).map(new ixa(11)).collect(aghu.a);
                    synchronized (kjxVar2.a) {
                        kjxVar2.d.addAll(agkeVar2);
                        kjxVar2.b = true;
                    }
                } else {
                    kjz kjzVar = (kjz) arrayList.get(0);
                    kjzVar.c.r(c);
                    if (!kjzVar.d || kjzVar.e) {
                        try {
                            kkb kkbVar = new kkb(this, str, kjoVar);
                            ((kjr) kjoVar.C()).a(kkbVar, kjs.b().a());
                            kkbVar.e.c(kkbVar.a, kkbVar.b, kkbVar.c, kkbVar.d);
                            return;
                        } catch (Throwable th2) {
                            Log.e("BatchingLogger", "Failed to deliver funnel logs in separate logError IPC.", th2);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final void c(AtomicBoolean atomicBoolean, AtomicReference atomicReference, String str, kjo kjoVar) {
        if (atomicBoolean.get()) {
            return;
        }
        ScheduledFuture<?> scheduledFutureSchedule = b.schedule(new aew(this, atomicBoolean, str, kjoVar, 11), auqh.a.io().a(kjoVar.p), TimeUnit.MILLISECONDS);
        if (atomicReference.getAndSet(scheduledFutureSchedule) != null) {
            throw new IllegalStateException("Timeout should only be started once.");
        }
        if (atomicBoolean.get()) {
            scheduledFutureSchedule.cancel(false);
        }
    }
}
