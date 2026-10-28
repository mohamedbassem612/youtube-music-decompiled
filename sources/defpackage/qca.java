package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ExecutionException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qca implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ qca(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r6v52, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.$cid) {
            case 0:
                qcf qcfVar = (qcf) this.a;
                cf activity = qcfVar.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(qcfVar.b);
                    return;
                }
                return;
            case 1:
                ParentToolsActivity parentToolsActivity = (ParentToolsActivity) ((qcf) this.a).getActivity();
                if (parentToolsActivity != null) {
                    parentToolsActivity.c(3, "");
                    return;
                }
                return;
            case 2:
                ((qcf) this.a).d();
                return;
            case 3:
                ((qcf) this.a).g();
                return;
            case 4:
                ((qcf) ((qcb) this.a).a).d();
                return;
            case 5:
                Object obj = ((rrq) this.a).f;
                ((qdc) ((oml) obj).b).a(new qde(obj, 3));
                return;
            case 6:
                ((qfn) this.a).a();
                return;
            case 7:
                final qgg qggVar = (qgg) this.a;
                ahng.s(new ahcx() { // from class: qgf
                    /* JADX WARN: Code duplicated, block: B:112:0x02f8  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05f1 A[Catch: all -> 0x07cc, TRY_ENTER, TryCatch #20 {all -> 0x07cc, blocks: (B:197:0x0547, B:198:0x0556, B:206:0x0584, B:209:0x059d, B:212:0x05be, B:225:0x05f1, B:229:0x0607, B:239:0x063c), top: B:432:0x0547 }] */
                    /* JADX WARN: Code duplicated, block: B:227:0x0604  */
                    /* JADX WARN: Code duplicated, block: B:229:0x0607 A[Catch: all -> 0x07cc, TRY_LEAVE, TryCatch #20 {all -> 0x07cc, blocks: (B:197:0x0547, B:198:0x0556, B:206:0x0584, B:209:0x059d, B:212:0x05be, B:225:0x05f1, B:229:0x0607, B:239:0x063c), top: B:432:0x0547 }] */
                    /* JADX WARN: Code duplicated, block: B:231:0x060f  */
                    /* JADX WARN: Code duplicated, block: B:233:0x0612 A[Catch: all -> 0x062f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x062f, blocks: (B:183:0x04dc, B:185:0x04ee, B:186:0x0504, B:200:0x055c, B:202:0x0576, B:203:0x057c, B:208:0x0597, B:211:0x05aa, B:214:0x05cc, B:220:0x05df, B:222:0x05e3, B:233:0x0612, B:217:0x05d7), top: B:398:0x04dc }] */
                    /* JADX WARN: Code duplicated, block: B:238:0x063a  */
                    /* JADX WARN: Code duplicated, block: B:246:0x0667  */
                    /* JADX WARN: Code duplicated, block: B:249:0x068c A[Catch: all -> 0x06b7, LOOP:7: B:245:0x0665->B:249:0x068c, LOOP_END, TryCatch #7 {all -> 0x06b7, blocks: (B:247:0x0669, B:249:0x068c, B:250:0x0692, B:251:0x06b6), top: B:406:0x0669 }] */
                    /* JADX WARN: Code duplicated, block: B:259:0x06d2 A[Catch: all -> 0x07ca, TryCatch #19 {all -> 0x07ca, blocks: (B:278:0x07b6, B:261:0x06f1, B:262:0x06f9, B:264:0x06ff, B:266:0x0711, B:268:0x0734, B:269:0x074a, B:271:0x077d, B:272:0x0783, B:274:0x07a0, B:275:0x07a6, B:276:0x07ad, B:256:0x06cb, B:241:0x0645, B:259:0x06d2, B:260:0x06ea), top: B:430:0x07b6 }] */
                    /* JADX WARN: Code duplicated, block: B:260:0x06ea A[Catch: all -> 0x07ca, TryCatch #19 {all -> 0x07ca, blocks: (B:278:0x07b6, B:261:0x06f1, B:262:0x06f9, B:264:0x06ff, B:266:0x0711, B:268:0x0734, B:269:0x074a, B:271:0x077d, B:272:0x0783, B:274:0x07a0, B:275:0x07a6, B:276:0x07ad, B:256:0x06cb, B:241:0x0645, B:259:0x06d2, B:260:0x06ea), top: B:430:0x07b6 }] */
                    /* JADX WARN: Code duplicated, block: B:416:0x07f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:434:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:481:0x0692 A[SYNTHETIC] */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v5 */
                    /* JADX WARN: Type inference failed for: r5v12, types: [awmd, java.lang.Object] */
                    @Override // defpackage.ahcx
                    public final ListenableFuture a() throws Throwable {
                        int i2;
                        int i3;
                        long j;
                        ApplicationExitInfo applicationExitInfo;
                        Iterator it;
                        Long l;
                        int i4;
                        ListenableFuture listenableFutureN;
                        Long l2;
                        String str;
                        InputStream inputStream;
                        Throwable th;
                        int i5;
                        boolean zEquals;
                        Map.Entry[] entryArr;
                        int length;
                        aglh aglhVarA;
                        Object[] objArr;
                        boolean z;
                        Object[] objArr2;
                        Object[] objArr3;
                        Object[] objArr4;
                        Object key;
                        int i6;
                        Map.Entry entry;
                        Map.Entry entry2;
                        Map.Entry[] entryArr2;
                        Object key2;
                        int i7;
                        int i8;
                        aior aiorVar;
                        IOException iOException;
                        InputStream inputStream2;
                        aihf aihfVarCreateBuilder;
                        aigi aigiVar;
                        GZIPOutputStream gZIPOutputStream;
                        ApplicationExitInfo.AnrInfo anrInfo;
                        qgg qggVar2 = qggVar;
                        aunn aunnVar = qggVar2.e;
                        if (!((qgc) aunnVar.io()).b()) {
                            return aher.a;
                        }
                        if (!Application.getProcessName().equals(String.valueOf(qggVar2.b.getPackageName()).concat(String.valueOf(((qgc) aunnVar.io()).a)))) {
                            return aher.a;
                        }
                        if (!((Boolean) qggVar2.f.io()).booleanValue()) {
                            return aher.a;
                        }
                        final qge qgeVar = qggVar2.i;
                        awmd awmdVar = qggVar2.d;
                        String string = ((SharedPreferences) awmdVar.io()).getString("lastExitProcessName", null);
                        long j2 = ((SharedPreferences) awmdVar.io()).getLong("lastExitTimestamp", -1L);
                        Context context = qgeVar.a;
                        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                        activityManager.getClass();
                        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 0);
                        int i9 = 4;
                        agjz agjzVar = new agjz(4);
                        Iterator it2 = historicalProcessExitReasons.iterator();
                        while (it2.hasNext()) {
                            ApplicationExitInfo applicationExitInfoM = aaj$$ExternalSyntheticApiModelOutline0.m(it2.next());
                            if (applicationExitInfoM.getProcessName().equals(string) && applicationExitInfoM.getTimestamp() == j2) {
                                return ahcs.f(ahcs.e(ahng.k(agjzVar.g()), new one(6), MoreExecutors.directExecutor()), new oll(qggVar2, 20), MoreExecutors.directExecutor());
                            }
                            final aihf aihfVarCreateBuilder2 = axfs.a.createBuilder();
                            String processName = applicationExitInfoM.getProcessName();
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfs axfsVar = (axfs) aihfVarCreateBuilder2.instance;
                            processName.getClass();
                            axfsVar.b |= 1;
                            axfsVar.c = processName;
                            int status = applicationExitInfoM.getStatus();
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfs axfsVar2 = (axfs) aihfVarCreateBuilder2.instance;
                            axfsVar2.b |= i9;
                            axfsVar2.e = status;
                            long timestamp = applicationExitInfoM.getTimestamp();
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfs axfsVar3 = (axfs) aihfVarCreateBuilder2.instance;
                            axfsVar3.b |= 16;
                            axfsVar3.g = timestamp;
                            long pss = applicationExitInfoM.getPss();
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfs axfsVar4 = (axfs) aihfVarCreateBuilder2.instance;
                            axfsVar4.b |= 64;
                            axfsVar4.i = pss;
                            long rss = applicationExitInfoM.getRss();
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfs axfsVar5 = (axfs) aihfVarCreateBuilder2.instance;
                            axfsVar5.b |= SemanticState.Focused;
                            axfsVar5.j = rss;
                            boolean zIsLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfs axfsVar6 = (axfs) aihfVarCreateBuilder2.instance;
                            axfsVar6.b |= SemanticState.Hidden;
                            axfsVar6.k = zIsLowMemoryKillReportSupported;
                            int reason = applicationExitInfoM.getReason();
                            String description = applicationExitInfoM.getDescription();
                            switch (reason) {
                                case 0:
                                    i2 = 15;
                                    i3 = 2;
                                    break;
                                case 1:
                                    i2 = 2;
                                    i3 = 2;
                                    break;
                                case 2:
                                    i2 = 3;
                                    i3 = 2;
                                    break;
                                case 3:
                                    i2 = 4;
                                    i3 = 2;
                                    break;
                                case 4:
                                    i2 = 5;
                                    i3 = 2;
                                    break;
                                case 5:
                                    i2 = 6;
                                    i3 = 2;
                                    break;
                                case 6:
                                    i2 = 7;
                                    i3 = 2;
                                    break;
                                case 7:
                                    i2 = 8;
                                    i3 = 2;
                                    break;
                                case 8:
                                    i2 = 9;
                                    i3 = 2;
                                    break;
                                case 9:
                                    i2 = 10;
                                    i3 = 2;
                                    break;
                                case 10:
                                    i2 = 11;
                                    i3 = 2;
                                    break;
                                case 11:
                                    i2 = 12;
                                    i3 = 2;
                                    break;
                                case 12:
                                    i2 = 13;
                                    i3 = 2;
                                    break;
                                case 13:
                                    i2 = (description == null || !description.contains("MemoryLimiter:AnonSwap")) ? 14 : 18;
                                    i3 = 2;
                                    break;
                                case 14:
                                    i2 = 100;
                                    i3 = 2;
                                    break;
                                case 15:
                                    i2 = 16;
                                    i3 = 2;
                                    break;
                                case 16:
                                    i2 = 17;
                                    i3 = 2;
                                    break;
                                default:
                                    i3 = 2;
                                    ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "toReasonEnum", 443, "ApplicationExitInfoCaptureImpl.java")).w("Unknown ApplicationExitInfo Reason: %s", new qdq(reason));
                                    i2 = 0;
                                    break;
                            }
                            if (i2 != 0) {
                                aihfVarCreateBuilder2.copyOnWrite();
                                axfs axfsVar7 = (axfs) aihfVarCreateBuilder2.instance;
                                int i10 = i2 - 1;
                                axfsVar7.d = i10;
                                axfsVar7.b |= 2;
                                if (i10 != 5) {
                                    if (i10 == 6) {
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            try {
                                                InputStream traceInputStream = applicationExitInfoM.getTraceInputStream();
                                                try {
                                                    String description2 = applicationExitInfoM.getDescription();
                                                    if (traceInputStream != null) {
                                                        if (ahno.aa(description2)) {
                                                            try {
                                                                traceInputStream.close();
                                                            } catch (IOException e) {
                                                                iOException = e;
                                                                j = j2;
                                                                ((agrc) ((agrc) ((agrc) qcq.a.c()).j(iOException)).k("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetAnrDiagnostic", (char) 370, "ApplicationExitInfoCaptureImpl.java")).t("Failed to read ANR trace");
                                                            }
                                                        } else {
                                                            aigj aigjVarI = aigj.I(traceInputStream);
                                                            awmd awmdVar2 = qgeVar.f;
                                                            try {
                                                                try {
                                                                    if (((Long) awmdVar2.io()).longValue() >= 0) {
                                                                        j = j2;
                                                                        inputStream2 = traceInputStream;
                                                                        try {
                                                                            if (aigjVarI.d() > ((Long) awmdVar2.io()).longValue()) {
                                                                            }
                                                                            inputStream2.close();
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            Throwable th3 = th;
                                                                            if (inputStream2 != null) {
                                                                                try {
                                                                                    inputStream2.close();
                                                                                } catch (Throwable th4) {
                                                                                    th3.addSuppressed(th4);
                                                                                }
                                                                            }
                                                                            throw th3;
                                                                        }
                                                                    } else {
                                                                        j = j2;
                                                                        inputStream2 = traceInputStream;
                                                                    }
                                                                    inputStream2.close();
                                                                } catch (IOException e2) {
                                                                    e = e2;
                                                                    iOException = e;
                                                                    ((agrc) ((agrc) ((agrc) qcq.a.c()).j(iOException)).k("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetAnrDiagnostic", (char) 370, "ApplicationExitInfoCaptureImpl.java")).t("Failed to read ANR trace");
                                                                }
                                                                aigjVarI.m(gZIPOutputStream);
                                                                gZIPOutputStream.close();
                                                                aigj aigjVarB = aigiVar.b();
                                                                awmd awmdVar3 = qgeVar.g;
                                                                if (((Long) awmdVar3.io()).longValue() < 0 || aigjVarB.d() <= ((Long) awmdVar3.io()).longValue()) {
                                                                    aihfVarCreateBuilder.copyOnWrite();
                                                                    axfr axfrVar = (axfr) aihfVarCreateBuilder.instance;
                                                                    aigjVarB.getClass();
                                                                    axfrVar.c = 5;
                                                                    axfrVar.d = aigjVarB;
                                                                    axfr axfrVar2 = (axfr) aihfVarCreateBuilder.build();
                                                                    aihfVarCreateBuilder2.copyOnWrite();
                                                                    axfs axfsVar8 = (axfs) aihfVarCreateBuilder2.instance;
                                                                    axfrVar2.getClass();
                                                                    axfsVar8.l = axfrVar2;
                                                                    axfsVar8.b |= SemanticState.LiveRegion;
                                                                }
                                                            } catch (Throwable th5) {
                                                                try {
                                                                    gZIPOutputStream.close();
                                                                } catch (Throwable th6) {
                                                                    th5.addSuppressed(th6);
                                                                }
                                                                throw th5;
                                                            }
                                                            aihfVarCreateBuilder = axfr.a.createBuilder();
                                                            aihfVarCreateBuilder.copyOnWrite();
                                                            axfr axfrVar3 = (axfr) aihfVarCreateBuilder.instance;
                                                            description2.getClass();
                                                            axfrVar3.b |= 1;
                                                            axfrVar3.e = description2;
                                                            if (Build.VERSION.SDK_INT >= 37 && ((Boolean) qgeVar.e.io()).booleanValue() && (anrInfo = applicationExitInfoM.getAnrInfo()) != null) {
                                                                boolean zIsUserPerceptible = anrInfo.isUserPerceptible();
                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                axfr axfrVar4 = (axfr) aihfVarCreateBuilder.instance;
                                                                axfrVar4.b |= 8;
                                                                axfrVar4.f = zIsUserPerceptible;
                                                            }
                                                            aigiVar = new aigi(SemanticState.Focused);
                                                            gZIPOutputStream = new GZIPOutputStream(aigiVar);
                                                        }
                                                        Throwable th7 = th;
                                                        if (inputStream2 != null) {
                                                            inputStream2.close();
                                                        }
                                                        throw th7;
                                                    } else {
                                                        j = j2;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    j = j2;
                                                    inputStream2 = traceInputStream;
                                                }
                                            } catch (IOException e3) {
                                                e = e3;
                                                j = j2;
                                            }
                                        } else {
                                            j = j2;
                                        }
                                    }
                                    j = j2;
                                    it = it2;
                                    applicationExitInfo = applicationExitInfoM;
                                    l = null;
                                } else {
                                    j = j2;
                                    if (Build.VERSION.SDK_INT >= 31 && ((Boolean) qgeVar.m.io()).booleanValue()) {
                                        try {
                                            InputStream traceInputStream2 = applicationExitInfoM.getTraceInputStream();
                                            if (traceInputStream2 == null) {
                                                try {
                                                    ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetNativeCrashInfo", 308, "ApplicationExitInfoCaptureImpl.java")).t("Native crash tombstone input stream is null");
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    string = string;
                                                    str = "ApplicationExitInfoCaptureImpl.java";
                                                    inputStream = traceInputStream2;
                                                    it = it2;
                                                    applicationExitInfo = applicationExitInfoM;
                                                    l = null;
                                                    th = th;
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (Throwable th10) {
                                                            th.addSuppressed(th10);
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                atys atysVar = (atys) aihn.parseFrom(atys.a, traceInputStream2, ExtensionRegistryLite.getGeneratedRegistry());
                                                long jLongValue = ((Long) qgeVar.n.io()).longValue();
                                                int i11 = atysVar.c;
                                                string = string;
                                                try {
                                                    atyr atyrVar = (atyr) DesugarCollections.unmodifiableMap(atysVar.f).get(Integer.valueOf(i11));
                                                    if (atyrVar == null) {
                                                        ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "toNativeCrashInfo", 517, "ApplicationExitInfoCaptureImpl.java")).u("Tombstone missing crashed thread %d", i11);
                                                        qggVar2 = qggVar2;
                                                        agjzVar = agjzVar;
                                                        str = "ApplicationExitInfoCaptureImpl.java";
                                                        inputStream = traceInputStream2;
                                                        it = it2;
                                                        applicationExitInfo = applicationExitInfoM;
                                                        l = null;
                                                        aiorVar = null;
                                                    } else {
                                                        aihf aihfVarCreateBuilder3 = aior.a.createBuilder();
                                                        str = "ApplicationExitInfoCaptureImpl.java";
                                                        try {
                                                            atyq atyqVar = atysVar.d;
                                                            if (atyqVar == null) {
                                                                atyqVar = atyq.a;
                                                            }
                                                            int i12 = atyqVar.b;
                                                            aihfVarCreateBuilder3.copyOnWrite();
                                                            inputStream = traceInputStream2;
                                                            try {
                                                                aior aiorVar2 = (aior) aihfVarCreateBuilder3.instance;
                                                                it = it2;
                                                                try {
                                                                    aiorVar2.b |= 1;
                                                                    aiorVar2.c = i12;
                                                                    atyq atyqVar2 = atysVar.d;
                                                                    if (atyqVar2 == null) {
                                                                        atyqVar2 = atyq.a;
                                                                    }
                                                                    int i13 = atyqVar2.c;
                                                                    aihfVarCreateBuilder3.copyOnWrite();
                                                                    aior aiorVar3 = (aior) aihfVarCreateBuilder3.instance;
                                                                    aiorVar3.b |= 2;
                                                                    aiorVar3.d = i13;
                                                                    int iBa = a.ba(atysVar.b);
                                                                    if (iBa == 0) {
                                                                        iBa = 1;
                                                                    }
                                                                    int i14 = iBa - 2;
                                                                    if (i14 == 0) {
                                                                        i5 = 2;
                                                                    } else if (i14 == 1) {
                                                                        i5 = 3;
                                                                    } else if (i14 == i3) {
                                                                        i5 = 4;
                                                                    } else if (i14 != 3) {
                                                                        i5 = i14 != 4 ? 1 : 6;
                                                                    } else {
                                                                        i5 = 5;
                                                                    }
                                                                    aihfVarCreateBuilder3.copyOnWrite();
                                                                    aior aiorVar4 = (aior) aihfVarCreateBuilder3.instance;
                                                                    aiorVar4.f = i5 - 1;
                                                                    aiorVar4.b |= 8;
                                                                    atyq atyqVar3 = atysVar.d;
                                                                    if ((atyqVar3 == null ? atyq.a : atyqVar3).d) {
                                                                        if (atyqVar3 == null) {
                                                                            atyqVar3 = atyq.a;
                                                                        }
                                                                        long j3 = atyqVar3.e;
                                                                        aihfVarCreateBuilder3.copyOnWrite();
                                                                        aior aiorVar5 = (aior) aihfVarCreateBuilder3.instance;
                                                                        aiorVar5.b |= 4;
                                                                        aiorVar5.e = j3;
                                                                    }
                                                                    aioo aiooVar = aioo.a;
                                                                    aihf aihfVarCreateBuilder4 = aiooVar.createBuilder();
                                                                    aihfVarCreateBuilder4.copyOnWrite();
                                                                    aioo aiooVar2 = (aioo) aihfVarCreateBuilder4.instance;
                                                                    aiooVar2.b |= 2;
                                                                    aiooVar2.d = i11;
                                                                    if (!atyrVar.b.isEmpty()) {
                                                                        String str2 = atyrVar.b;
                                                                        aihfVarCreateBuilder4.copyOnWrite();
                                                                        aioo aiooVar3 = (aioo) aihfVarCreateBuilder4.instance;
                                                                        str2.getClass();
                                                                        aiooVar3.b |= 1;
                                                                        aiooVar3.c = str2;
                                                                    }
                                                                    aioo aiooVar4 = (aioo) aihfVarCreateBuilder4.build();
                                                                    aihfVarCreateBuilder3.copyOnWrite();
                                                                    aior aiorVar6 = (aior) aihfVarCreateBuilder3.instance;
                                                                    aiooVar4.getClass();
                                                                    aiorVar6.j = aiooVar4;
                                                                    aiorVar6.b |= SemanticState.Focused;
                                                                    Collection collectionValues = DesugarCollections.unmodifiableMap(atysVar.f).values();
                                                                    agkh agkhVar = new agkh(4);
                                                                    HashSet hashSet = new HashSet();
                                                                    Iterator it3 = collectionValues.iterator();
                                                                    while (it3.hasNext()) {
                                                                        try {
                                                                            Iterator it4 = ((atyr) it3.next()).c.iterator();
                                                                            while (it4.hasNext()) {
                                                                                aiooVar = aiooVar;
                                                                                atyp atypVar = (atyp) it4.next();
                                                                                it3 = it3;
                                                                                if (!atypVar.e.isEmpty()) {
                                                                                    int size = hashSet.size();
                                                                                    Iterator it5 = it4;
                                                                                    if (hashSet.add(atypVar.e)) {
                                                                                        aihf aihfVarCreateBuilder5 = aiop.a.createBuilder();
                                                                                        HashSet hashSet2 = hashSet;
                                                                                        String str3 = atypVar.e;
                                                                                        aihfVarCreateBuilder5.copyOnWrite();
                                                                                        applicationExitInfo = applicationExitInfoM;
                                                                                        try {
                                                                                            aiop aiopVar = (aiop) aihfVarCreateBuilder5.instance;
                                                                                            str3.getClass();
                                                                                            qggVar2 = qggVar2;
                                                                                            try {
                                                                                                aiopVar.b |= 2;
                                                                                                aiopVar.d = str3;
                                                                                                if (!atypVar.d.isEmpty()) {
                                                                                                    String str4 = atypVar.d;
                                                                                                    aihfVarCreateBuilder5.copyOnWrite();
                                                                                                    aiop aiopVar2 = (aiop) aihfVarCreateBuilder5.instance;
                                                                                                    str4.getClass();
                                                                                                    aiopVar2.b |= 1;
                                                                                                    aiopVar2.c = str4;
                                                                                                }
                                                                                                agkhVar.e(atypVar.e, new aami((aiop) aihfVarCreateBuilder5.build(), size, null));
                                                                                                it4 = it5;
                                                                                                hashSet = hashSet2;
                                                                                                applicationExitInfoM = applicationExitInfo;
                                                                                                qggVar2 = qggVar2;
                                                                                            } catch (Throwable th11) {
                                                                                                th = th11;
                                                                                                th = th;
                                                                                                agjzVar = agjzVar;
                                                                                                l = null;
                                                                                                if (inputStream != null) {
                                                                                                    inputStream.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (Throwable th12) {
                                                                                            th = th12;
                                                                                            qggVar2 = qggVar2;
                                                                                        }
                                                                                    } else {
                                                                                        it4 = it5;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable th13) {
                                                                            th = th13;
                                                                            qggVar2 = qggVar2;
                                                                            applicationExitInfo = applicationExitInfoM;
                                                                        }
                                                                    }
                                                                    qggVar2 = qggVar2;
                                                                    aioo aiooVar5 = aiooVar;
                                                                    applicationExitInfo = applicationExitInfoM;
                                                                    try {
                                                                        agkj agkjVarD = agkhVar.d(true);
                                                                        agqs agqsVarListIterator = ((agke) agkjVarD.values()).listIterator(0);
                                                                        while (agqsVarListIterator.hasNext()) {
                                                                            Object obj2 = ((aami) agqsVarListIterator.next()).b;
                                                                            aihfVarCreateBuilder3.copyOnWrite();
                                                                            aior aiorVar7 = (aior) aihfVarCreateBuilder3.instance;
                                                                            obj2.getClass();
                                                                            aiie aiieVar = aiorVar7.h;
                                                                            if (!aiieVar.c()) {
                                                                                aiorVar7.h = aihn.mutableCopy(aiieVar);
                                                                            }
                                                                            aiorVar7.h.add(obj2);
                                                                        }
                                                                        agke agkeVarA = qge.a(atyrVar, agkjVarD, jLongValue);
                                                                        aihfVarCreateBuilder3.copyOnWrite();
                                                                        aior aiorVar8 = (aior) aihfVarCreateBuilder3.instance;
                                                                        aiie aiieVar2 = aiorVar8.g;
                                                                        if (!aiieVar2.c()) {
                                                                            aiorVar8.g = aihn.mutableCopy(aiieVar2);
                                                                        }
                                                                        aifs.addAll(agkeVarA, aiorVar8.g);
                                                                        if (!atysVar.e.isEmpty()) {
                                                                            String str5 = atysVar.e;
                                                                            aihfVarCreateBuilder3.copyOnWrite();
                                                                            aior aiorVar9 = (aior) aihfVarCreateBuilder3.instance;
                                                                            str5.getClass();
                                                                            aiorVar9.b |= 64;
                                                                            aiorVar9.i = str5;
                                                                        }
                                                                        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(atysVar.f);
                                                                        Comparator comparator = aglh.b;
                                                                        if (mapUnmodifiableMap instanceof SortedMap) {
                                                                            Comparator comparator2 = ((SortedMap) mapUnmodifiableMap).comparator();
                                                                            zEquals = comparator2 == null ? true : comparator.equals(comparator2);
                                                                        } else {
                                                                            zEquals = false;
                                                                        }
                                                                        if (zEquals && (mapUnmodifiableMap instanceof aglh)) {
                                                                            aglhVarA = (aglh) mapUnmodifiableMap;
                                                                            if (aglhVarA.u()) {
                                                                                entryArr = (Map.Entry[]) aguu.O(mapUnmodifiableMap.entrySet()).toArray(aglh.a);
                                                                                length = entryArr.length;
                                                                                if (length != 0) {
                                                                                    agjzVar = agjzVar;
                                                                                    l = null;
                                                                                    aglhVarA = aglh.a(comparator);
                                                                                } else if (length != 1) {
                                                                                    objArr = new Object[length];
                                                                                    z = zEquals;
                                                                                    objArr2 = new Object[length];
                                                                                    if (z) {
                                                                                        i8 = 0;
                                                                                        while (i8 < length) {
                                                                                            Map.Entry entry3 = entryArr[i8];
                                                                                            entry3.getClass();
                                                                                            int i15 = i8;
                                                                                            Object key3 = entry3.getKey();
                                                                                            Object[] objArr5 = objArr2;
                                                                                            Object value = entry3.getValue();
                                                                                            aguu.af(key3, value);
                                                                                            objArr[i15] = key3;
                                                                                            objArr5[i15] = value;
                                                                                            i8 = i15 + 1;
                                                                                            objArr2 = objArr5;
                                                                                        }
                                                                                        objArr3 = objArr2;
                                                                                        agjzVar = agjzVar;
                                                                                        objArr4 = objArr;
                                                                                    } else {
                                                                                        objArr3 = objArr2;
                                                                                        agjzVar = agjzVar;
                                                                                        objArr4 = objArr;
                                                                                        Arrays.sort(entryArr, 0, length, new fui(comparator, 12, null));
                                                                                        Map.Entry entry4 = entryArr[0];
                                                                                        entry4.getClass();
                                                                                        key = entry4.getKey();
                                                                                        objArr4[0] = key;
                                                                                        Object value2 = entry4.getValue();
                                                                                        objArr3[0] = value2;
                                                                                        aguu.af(objArr4[0], value2);
                                                                                        i6 = 1;
                                                                                        while (i6 < length) {
                                                                                            entry = entryArr[i6 - 1];
                                                                                            entry.getClass();
                                                                                            entry2 = entryArr[i6];
                                                                                            entry2.getClass();
                                                                                            entryArr2 = entryArr;
                                                                                            key2 = entry2.getKey();
                                                                                            i7 = i6;
                                                                                            Object value3 = entry2.getValue();
                                                                                            aguu.af(key2, value3);
                                                                                            objArr4[i7] = key2;
                                                                                            objArr3[i7] = value3;
                                                                                            if (comparator.compare(key, key2) != 0) {
                                                                                                throw new IllegalArgumentException("Multiple entries with same key: " + entry.toString() + " and " + entry2.toString());
                                                                                            }
                                                                                            i6 = i7 + 1;
                                                                                            key = key2;
                                                                                            entryArr = entryArr2;
                                                                                        }
                                                                                    }
                                                                                    l = null;
                                                                                    aglhVarA = new aglh(new agps(agke.h(objArr4), comparator), agke.h(objArr3), null);
                                                                                } else {
                                                                                    agjzVar = agjzVar;
                                                                                    l = null;
                                                                                    Map.Entry entry5 = entryArr[0];
                                                                                    entry5.getClass();
                                                                                    aglhVarA = aglh.c(comparator, entry5.getKey(), entry5.getValue());
                                                                                }
                                                                            } else {
                                                                                agjzVar = agjzVar;
                                                                                l = null;
                                                                            }
                                                                        } else {
                                                                            entryArr = (Map.Entry[]) aguu.O(mapUnmodifiableMap.entrySet()).toArray(aglh.a);
                                                                            length = entryArr.length;
                                                                            if (length != 0) {
                                                                                agjzVar = agjzVar;
                                                                                l = null;
                                                                                aglhVarA = aglh.a(comparator);
                                                                            } else if (length != 1) {
                                                                                objArr = new Object[length];
                                                                                z = zEquals;
                                                                                objArr2 = new Object[length];
                                                                                if (z) {
                                                                                    i8 = 0;
                                                                                    while (i8 < length) {
                                                                                        Map.Entry entry6 = entryArr[i8];
                                                                                        entry6.getClass();
                                                                                        int i16 = i8;
                                                                                        Object key4 = entry6.getKey();
                                                                                        Object[] objArr6 = objArr2;
                                                                                        Object value4 = entry6.getValue();
                                                                                        aguu.af(key4, value4);
                                                                                        objArr[i16] = key4;
                                                                                        objArr6[i16] = value4;
                                                                                        i8 = i16 + 1;
                                                                                        objArr2 = objArr6;
                                                                                    }
                                                                                    objArr3 = objArr2;
                                                                                    agjzVar = agjzVar;
                                                                                    objArr4 = objArr;
                                                                                } else {
                                                                                    objArr3 = objArr2;
                                                                                    agjzVar = agjzVar;
                                                                                    objArr4 = objArr;
                                                                                    Arrays.sort(entryArr, 0, length, new fui(comparator, 12, null));
                                                                                    Map.Entry entry7 = entryArr[0];
                                                                                    entry7.getClass();
                                                                                    key = entry7.getKey();
                                                                                    objArr4[0] = key;
                                                                                    Object value5 = entry7.getValue();
                                                                                    objArr3[0] = value5;
                                                                                    aguu.af(objArr4[0], value5);
                                                                                    i6 = 1;
                                                                                    while (i6 < length) {
                                                                                        try {
                                                                                            entry = entryArr[i6 - 1];
                                                                                            entry.getClass();
                                                                                            entry2 = entryArr[i6];
                                                                                            entry2.getClass();
                                                                                            entryArr2 = entryArr;
                                                                                            key2 = entry2.getKey();
                                                                                            i7 = i6;
                                                                                            Object value6 = entry2.getValue();
                                                                                            aguu.af(key2, value6);
                                                                                            objArr4[i7] = key2;
                                                                                            objArr3[i7] = value6;
                                                                                            if (comparator.compare(key, key2) != 0) {
                                                                                                throw new IllegalArgumentException("Multiple entries with same key: " + entry.toString() + " and " + entry2.toString());
                                                                                            }
                                                                                            i6 = i7 + 1;
                                                                                            key = key2;
                                                                                            entryArr = entryArr2;
                                                                                        } catch (Throwable th14) {
                                                                                            th = th14;
                                                                                            l = null;
                                                                                            if (inputStream != null) {
                                                                                                inputStream.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    l = null;
                                                                                    aglhVarA = new aglh(new agps(agke.h(objArr4), comparator), agke.h(objArr3), null);
                                                                                } catch (Throwable th15) {
                                                                                    th = th15;
                                                                                    l = null;
                                                                                }
                                                                            } else {
                                                                                agjzVar = agjzVar;
                                                                                l = null;
                                                                                Map.Entry entry8 = entryArr[0];
                                                                                entry8.getClass();
                                                                                aglhVarA = aglh.c(comparator, entry8.getKey(), entry8.getValue());
                                                                            }
                                                                        }
                                                                        agqr it6 = aglhVarA.entrySet().iterator();
                                                                        while (it6.hasNext()) {
                                                                            Map.Entry entry9 = (Map.Entry) it6.next();
                                                                            int iIntValue = ((Integer) entry9.getKey()).intValue();
                                                                            if (iIntValue != i11) {
                                                                                aihf aihfVarCreateBuilder6 = aiooVar5.createBuilder();
                                                                                aihfVarCreateBuilder6.copyOnWrite();
                                                                                aioo aiooVar6 = (aioo) aihfVarCreateBuilder6.instance;
                                                                                aiooVar6.b |= 2;
                                                                                aiooVar6.d = iIntValue;
                                                                                atyr atyrVar2 = (atyr) entry9.getValue();
                                                                                if (!atyrVar2.b.isEmpty()) {
                                                                                    String str6 = atyrVar2.b;
                                                                                    aihfVarCreateBuilder6.copyOnWrite();
                                                                                    aioo aiooVar7 = (aioo) aihfVarCreateBuilder6.instance;
                                                                                    str6.getClass();
                                                                                    aiooVar7.b |= 1;
                                                                                    aiooVar7.c = str6;
                                                                                }
                                                                                aihf aihfVarCreateBuilder7 = aion.a.createBuilder();
                                                                                aioo aiooVar8 = (aioo) aihfVarCreateBuilder6.build();
                                                                                aihfVarCreateBuilder7.copyOnWrite();
                                                                                aion aionVar = (aion) aihfVarCreateBuilder7.instance;
                                                                                aiooVar8.getClass();
                                                                                aionVar.c = aiooVar8;
                                                                                aionVar.b |= 1;
                                                                                agke agkeVarA2 = qge.a(atyrVar2, agkjVarD, jLongValue);
                                                                                aihfVarCreateBuilder7.copyOnWrite();
                                                                                aion aionVar2 = (aion) aihfVarCreateBuilder7.instance;
                                                                                aiie aiieVar3 = aionVar2.d;
                                                                                if (!aiieVar3.c()) {
                                                                                    aionVar2.d = aihn.mutableCopy(aiieVar3);
                                                                                }
                                                                                aifs.addAll(agkeVarA2, aionVar2.d);
                                                                                aion aionVar3 = (aion) aihfVarCreateBuilder7.build();
                                                                                aihfVarCreateBuilder3.copyOnWrite();
                                                                                aior aiorVar10 = (aior) aihfVarCreateBuilder3.instance;
                                                                                aionVar3.getClass();
                                                                                aiie aiieVar4 = aiorVar10.k;
                                                                                if (!aiieVar4.c()) {
                                                                                    aiorVar10.k = aihn.mutableCopy(aiieVar4);
                                                                                }
                                                                                aiorVar10.k.add(aionVar3);
                                                                            }
                                                                        }
                                                                        aiorVar = (aior) aihfVarCreateBuilder3.build();
                                                                    } catch (Throwable th16) {
                                                                        th = th16;
                                                                        agjzVar = agjzVar;
                                                                    }
                                                                } catch (Throwable th17) {
                                                                    th = th17;
                                                                    qggVar2 = qggVar2;
                                                                    agjzVar = agjzVar;
                                                                    applicationExitInfo = applicationExitInfoM;
                                                                }
                                                            } catch (Throwable th18) {
                                                                th = th18;
                                                                qggVar2 = qggVar2;
                                                                agjzVar = agjzVar;
                                                                it = it2;
                                                            }
                                                        } catch (Throwable th19) {
                                                            th = th19;
                                                            qggVar2 = qggVar2;
                                                            inputStream = traceInputStream2;
                                                        }
                                                    }
                                                    if (aiorVar != null) {
                                                        try {
                                                            aihfVarCreateBuilder2.copyOnWrite();
                                                            axfs axfsVar9 = (axfs) aihfVarCreateBuilder2.instance;
                                                            axfsVar9.p = aiorVar;
                                                            axfsVar9.b |= SemanticState.Multiline;
                                                        } catch (Throwable th20) {
                                                            th = th20;
                                                            th = th;
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    try {
                                                        inputStream.close();
                                                    } catch (IOException e4) {
                                                        e = e4;
                                                        ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetNativeCrashInfo", (char) 319, str)).t("Failed to read native crash tombstone");
                                                    }
                                                } catch (Throwable th21) {
                                                    th = th21;
                                                    str = "ApplicationExitInfoCaptureImpl.java";
                                                }
                                            }
                                            str = "ApplicationExitInfoCaptureImpl.java";
                                            inputStream = traceInputStream2;
                                            it = it2;
                                            applicationExitInfo = applicationExitInfoM;
                                            l = null;
                                            th = th;
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            throw th;
                                        } catch (IOException e5) {
                                            e = e5;
                                            qggVar2 = qggVar2;
                                            string = string;
                                            agjzVar = agjzVar;
                                            str = "ApplicationExitInfoCaptureImpl.java";
                                            it = it2;
                                            applicationExitInfo = applicationExitInfoM;
                                            l = null;
                                        }
                                    }
                                }
                                it = it2;
                                applicationExitInfo = applicationExitInfoM;
                                l = null;
                            } else {
                                j = j2;
                                it = it2;
                                applicationExitInfo = applicationExitInfoM;
                                l = null;
                            }
                            int importance = applicationExitInfo.getImportance();
                            if (importance == 100) {
                                i4 = 2;
                            } else if (importance == 125) {
                                i4 = 3;
                            } else if (importance == 200) {
                                i4 = 5;
                            } else if (importance == 230) {
                                i4 = 6;
                            } else if (importance == 300) {
                                i4 = 8;
                            } else if (importance == 325) {
                                i4 = 4;
                            } else if (importance == 350) {
                                i4 = 7;
                            } else if (importance == 400) {
                                i4 = 9;
                            } else if (importance != 1000) {
                                ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "toImportanceEnum", 473, "ApplicationExitInfoCaptureImpl.java")).w("Unknown ApplicationExitInfo Importance: %s", new qdq(importance));
                                i4 = 0;
                            } else {
                                i4 = 10;
                            }
                            if (i4 != 0) {
                                aihfVarCreateBuilder2.copyOnWrite();
                                axfs axfsVar10 = (axfs) aihfVarCreateBuilder2.instance;
                                axfsVar10.f = i4 - 1;
                                axfsVar10.b |= 8;
                            }
                            qcz qczVar = qgeVar.o;
                            final int pid = applicationExitInfo.getPid();
                            aijp aijpVarB = aikz.b(applicationExitInfo.getTimestamp());
                            if (((Boolean) qczVar.d.io()).booleanValue()) {
                                File file = new File(qczVar.a.getFilesDir(), "flight_records");
                                if (((Boolean) qczVar.c.io()).booleanValue()) {
                                    qcz.a(file, qczVar.b.f().getEpochSecond());
                                }
                                if (file.exists()) {
                                    File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: qcy
                                        @Override // java.io.FilenameFilter
                                        public final boolean accept(File file2, String str7) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(pid);
                                            sb.append('_');
                                            return str7.startsWith(sb.toString());
                                        }
                                    });
                                    if (fileArrListFiles == null) {
                                        listenableFutureN = ahng.n(agdf.a);
                                    } else {
                                        Long lValueOf = l;
                                        File file2 = lValueOf;
                                        int i17 = 0;
                                        while (i17 < fileArrListFiles.length) {
                                            File file3 = fileArrListFiles[i17];
                                            List listH = agfm.b('_').h(file3.getName());
                                            if (listH.size() != 2) {
                                                ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 76, "FlightRecordReaderImpl.java")).w("Invalid flight record file name: %s", file3.getName());
                                                l2 = lValueOf;
                                            } else {
                                                try {
                                                    long j4 = Long.parseLong((String) listH.get(1));
                                                    l2 = lValueOf;
                                                    long j5 = aijpVarB.b;
                                                    if (j4 <= j5 && (l2 == null || j5 - j4 < l2.longValue())) {
                                                        lValueOf = Long.valueOf(aijpVarB.b - j4);
                                                        file2 = file3;
                                                    }
                                                } catch (NumberFormatException e6) {
                                                    l2 = lValueOf;
                                                    ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e6)).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 'S', "FlightRecordReaderImpl.java")).w("Invalid timestamp in flight record file name: %s", file3.getName());
                                                }
                                                i17++;
                                                file2 = file2;
                                            }
                                            lValueOf = l2;
                                            i17++;
                                            file2 = file2;
                                        }
                                        if (file2 == 0) {
                                            listenableFutureN = ahng.n(agdf.a);
                                        } else {
                                            try {
                                                FileInputStream fileInputStream = new FileInputStream(file2);
                                                try {
                                                    listenableFutureN = ahng.n(agev.i((qcx) aihn.parseFrom(qcx.a, fileInputStream, ExtensionRegistryLite.getGeneratedRegistry())));
                                                    fileInputStream.close();
                                                } catch (Throwable th22) {
                                                    try {
                                                        fileInputStream.close();
                                                    } catch (Throwable th23) {
                                                        th22.addSuppressed(th23);
                                                    }
                                                    throw th22;
                                                }
                                            } catch (IOException e7) {
                                                ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e7)).k("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 'm', "FlightRecordReaderImpl.java")).t("Failed to read FlightRecord from file");
                                                listenableFutureN = ahng.n(agdf.a);
                                            }
                                        }
                                    }
                                } else {
                                    listenableFutureN = ahng.n(agdf.a);
                                }
                            } else {
                                listenableFutureN = ahng.n(agdf.a);
                            }
                            agjz agjzVar2 = agjzVar;
                            agjzVar2.h(ahcs.e(listenableFutureN, new agek() { // from class: qgd
                                @Override // defpackage.agek
                                public final Object apply(Object obj3) {
                                    int i18;
                                    boolean z2;
                                    agke agkeVarA3;
                                    agev agevVar = (agev) obj3;
                                    boolean zG = agevVar.g();
                                    aihf aihfVar = aihfVarCreateBuilder2;
                                    if (!zG) {
                                        return (axfs) aihfVar.build();
                                    }
                                    for (qct qctVar : ((qcx) agevVar.c()).e) {
                                        int i19 = qctVar.b;
                                        boolean z3 = true;
                                        if (i19 == 0) {
                                            i18 = 5;
                                        } else if (i19 == 1) {
                                            i18 = 1;
                                        } else if (i19 == 2) {
                                            i18 = 2;
                                        } else if (i19 != 3) {
                                            i18 = i19 != 4 ? 0 : 4;
                                        } else {
                                            i18 = 3;
                                        }
                                        if (i18 == 0) {
                                            throw null;
                                        }
                                        int i20 = i18 - 1;
                                        qge qgeVar2 = qgeVar;
                                        if (i20 != 0) {
                                            if (i20 == 1) {
                                                aijp aijpVar = (i19 == 2 ? (qcu) qctVar.c : qcu.a).c;
                                                if (aijpVar == null) {
                                                    aijpVar = aijp.a;
                                                }
                                                long jA = aikz.a(aijpVar);
                                                aihfVar.copyOnWrite();
                                                axfs axfsVar11 = (axfs) aihfVar.instance;
                                                axfs axfsVar12 = axfs.a;
                                                axfsVar11.b |= 32;
                                                axfsVar11.h = jA;
                                            } else if (i20 == 2) {
                                                qcv qcvVar = i19 == 3 ? (qcv) qctVar.c : qcv.a;
                                                if ((((axfs) aihfVar.instance).b & SemanticState.LiveRegion) != 0 && ((Boolean) qgeVar2.h.io()).booleanValue()) {
                                                    List list = qcvVar.c;
                                                    awmd awmdVar4 = qgeVar2.j;
                                                    if (((Long) awmdVar4.io()).longValue() >= 0) {
                                                        Instant instantMinusSeconds = Instant.ofEpochMilli(((axfs) aihfVar.instance).g).minusSeconds(((Long) awmdVar4.io()).longValue());
                                                        aijp aijpVar2 = qcvVar.d;
                                                        if (aijpVar2 == null) {
                                                            aijpVar2 = aijp.a;
                                                        }
                                                        if (!ahng.ax(aijpVar2).isBefore(instantMinusSeconds)) {
                                                        }
                                                    }
                                                    awmd awmdVar5 = qgeVar2.i;
                                                    if (((Long) awmdVar5.io()).longValue() >= 0) {
                                                        list = (List) j$.util.Collection.EL.stream(list).filter(new jmy(Instant.ofEpochMilli(((axfs) aihfVar.instance).g).minusSeconds(((Long) awmdVar5.io()).longValue()), 6)).collect(aghu.a);
                                                    }
                                                    long jLongValue2 = ((Long) qgeVar2.k.io()).longValue();
                                                    long jLongValue3 = ((Long) qgeVar2.l.io()).longValue();
                                                    Iterator it7 = list.iterator();
                                                    boolean z4 = false;
                                                    boolean z5 = false;
                                                    while (it7.hasNext()) {
                                                        int i21 = ((axia) it7.next()).b;
                                                        z4 |= i21 == 1;
                                                        z5 |= i21 == 3;
                                                    }
                                                    if (z4) {
                                                        if (z5) {
                                                            ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 61, "TraceFilter.java")).t("TraceContext list contains both Trace and TraceRecord");
                                                            agkeVarA3 = agpi.a;
                                                        } else {
                                                            agkeVarA3 = qdm.a((List) j$.util.Collection.EL.stream(list).map(new qdi(2)).collect(aghu.a), jLongValue2, jLongValue3);
                                                        }
                                                    } else if (z5) {
                                                        agkeVarA3 = qdm.a((List) j$.util.Collection.EL.stream(list).map(new qdi(0)).collect(aghu.a), jLongValue2, jLongValue3);
                                                    } else {
                                                        ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 72, "TraceFilter.java")).t("TraceContext list contains neither Trace nor TraceRecord");
                                                        agkeVarA3 = agpi.a;
                                                    }
                                                    if (!agkeVarA3.isEmpty()) {
                                                        aihf aihfVarCreateBuilder8 = axib.a.createBuilder();
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        axib axibVar = (axib) aihfVarCreateBuilder8.instance;
                                                        aiie aiieVar5 = axibVar.c;
                                                        if (!aiieVar5.c()) {
                                                            axibVar.c = aihn.mutableCopy(aiieVar5);
                                                        }
                                                        aifs.addAll(agkeVarA3, axibVar.c);
                                                        aijp aijpVar3 = qcvVar.d;
                                                        if (aijpVar3 == null) {
                                                            aijpVar3 = aijp.a;
                                                        }
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        axib axibVar2 = (axib) aihfVarCreateBuilder8.instance;
                                                        aijpVar3.getClass();
                                                        axibVar2.d = aijpVar3;
                                                        axibVar2.b |= 1;
                                                        int iAS = a.aS(qcvVar.e);
                                                        if (iAS == 0) {
                                                            iAS = 1;
                                                        }
                                                        int i22 = iAS - 1;
                                                        int i23 = i22 != 0 ? i22 != 1 ? 3 : 2 : 1;
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        axib axibVar3 = (axib) aihfVarCreateBuilder8.instance;
                                                        axibVar3.e = i23 - 1;
                                                        axibVar3.b |= 2;
                                                        axib axibVar4 = (axib) aihfVarCreateBuilder8.build();
                                                        aihfVar.copyOnWrite();
                                                        axfs axfsVar13 = (axfs) aihfVar.instance;
                                                        axibVar4.getClass();
                                                        axfsVar13.n = axibVar4;
                                                        axfsVar13.b |= SemanticState.Modal;
                                                    }
                                                }
                                            } else if (i20 == 3) {
                                                qcw qcwVar = i19 == 4 ? (qcw) qctVar.c : qcw.a;
                                                aihf aihfVarCreateBuilder9 = axic.a.createBuilder();
                                                if (qcwVar.c.equals(qgeVar2.b.io())) {
                                                    z2 = false;
                                                } else {
                                                    String str7 = qcwVar.c;
                                                    aihfVarCreateBuilder9.copyOnWrite();
                                                    axic axicVar = (axic) aihfVarCreateBuilder9.instance;
                                                    str7.getClass();
                                                    axicVar.b |= 1;
                                                    axicVar.c = str7;
                                                    z2 = true;
                                                }
                                                if (qcwVar.d != ((Integer) qgeVar2.c.io()).intValue()) {
                                                    int i24 = qcwVar.d;
                                                    aihfVarCreateBuilder9.copyOnWrite();
                                                    axic axicVar2 = (axic) aihfVarCreateBuilder9.instance;
                                                    axicVar2.b |= 2;
                                                    axicVar2.d = i24;
                                                    z2 = true;
                                                }
                                                if (qcwVar.e != ((Integer) qgeVar2.d.io()).intValue()) {
                                                    int i25 = qcwVar.e;
                                                    aihfVarCreateBuilder9.copyOnWrite();
                                                    axic axicVar3 = (axic) aihfVarCreateBuilder9.instance;
                                                    axicVar3.b |= 4;
                                                    axicVar3.e = i25;
                                                } else {
                                                    z3 = z2;
                                                }
                                                if (qcwVar.f != Build.VERSION.SDK_INT) {
                                                    int i26 = qcwVar.f;
                                                    aihfVarCreateBuilder9.copyOnWrite();
                                                    axic axicVar4 = (axic) aihfVarCreateBuilder9.instance;
                                                    axicVar4.b |= 8;
                                                    axicVar4.f = i26;
                                                } else if (z3) {
                                                }
                                                axic axicVar5 = (axic) aihfVarCreateBuilder9.build();
                                                aihfVar.copyOnWrite();
                                                axfs axfsVar14 = (axfs) aihfVar.instance;
                                                axfs axfsVar15 = axfs.a;
                                                axicVar5.getClass();
                                                axfsVar14.o = axicVar5;
                                                axfsVar14.b |= SemanticState.Obscured;
                                            }
                                        } else if ((((axfs) aihfVar.instance).b & SemanticState.ReadOnly) != 0) {
                                            ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 220, "ApplicationExitInfoCaptureImpl.java")).t("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                        } else {
                                            axgh axghVar = i19 == 1 ? (axgh) qctVar.c : axgh.a;
                                            aihfVar.copyOnWrite();
                                            axfs axfsVar16 = (axfs) aihfVar.instance;
                                            axghVar.getClass();
                                            axfsVar16.m = axghVar;
                                            axfsVar16.b |= SemanticState.ReadOnly;
                                        }
                                    }
                                    return (axfs) aihfVar.build();
                                }
                            }, MoreExecutors.directExecutor()));
                            agjzVar = agjzVar2;
                            string = string;
                            it2 = it;
                            j2 = j;
                            qggVar2 = qggVar2;
                            i9 = 4;
                        }
                        return ahcs.f(ahcs.e(ahng.k(agjzVar.g()), new one(6), MoreExecutors.directExecutor()), new oll(qggVar2, 20), MoreExecutors.directExecutor());
                    }
                }, qggVar.c);
                return;
            case 8:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 9:
                ((qmi) this.a).a();
                return;
            case 10:
                Object obj2 = this.a;
                qmi qmiVar = (qmi) obj2;
                qkh qkhVar = qmiVar.b;
                ListenableFuture listenableFutureA = qmp.b(qkhVar).a(new kjh(qmiVar.c, 12), qkhVar.b());
                listenableFutureA.addListener(new plj(obj2, listenableFutureA, 9), qkhVar.b());
                return;
            case 11:
                qmg qmgVar = new qmg(i);
                Object obj3 = this.a;
                Iterator it = ((ruk) obj3).a.values().iterator();
                while (it.hasNext()) {
                    ((omj) it.next()).Y(qmgVar);
                }
                synchronized (obj3) {
                    ((ruk) obj3).b = null;
                    break;
                }
                return;
            case 12:
                throw new RuntimeException(((ExecutionException) this.a).getCause());
            case 13:
                if (((Boolean) ((qmt) this.a).a.io()).booleanValue()) {
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 14:
                try {
                    ahng.v(this.a);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 15:
                ?? r6 = this.a;
                qso qsoVar = (qso) r6;
                synchronized (qsoVar.h) {
                    ListenableFuture listenableFuture = ((qso) r6).j;
                    if (((qso) r6).k != 0 || listenableFuture == null) {
                        return;
                    }
                    ((qso) r6).j = null;
                    if (!listenableFuture.cancel(true)) {
                        try {
                            ((SQLiteDatabase) ahng.v(listenableFuture)).close();
                            break;
                        } catch (ExecutionException unused2) {
                        }
                    }
                    qsoVar.b.unregisterComponentCallbacks(r6);
                    Iterator it2 = qsoVar.g.iterator();
                    while (it2.hasNext()) {
                        if (((WeakReference) it2.next()).get() == null) {
                            it2.remove();
                        }
                    }
                    return;
                }
            case 16:
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy) this.a);
                return;
            case 17:
                ((qyh) this.a).j.H = true;
                return;
            case 18:
                qyh qyhVar = (qyh) this.a;
                qyhVar.a.D((float) qyhVar.f.d);
                return;
            case 19:
                ((qxy) this.a).I();
                return;
            default:
                ((qxy) this.a).l = true;
                return;
        }
    }
}
