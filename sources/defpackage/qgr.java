package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.ArrayMap;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qgr extends qgy implements qdy, qfh {
    private final Context a;
    private final qhe b;
    private final qgo c;
    private final qgq d;
    private final ArrayMap e;
    private final qfg f;
    private final awmd g;
    private final qgz h;
    private final agev i;
    private final kjc j;

    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    public qgr(axfd axfdVar, Context context, kjc kjcVar, aunn aunnVar, qgo qgoVar, awmd awmdVar, awmd awmdVar2, Executor executor, omm ommVar, awmd awmdVar3, qgz qgzVar, agev agevVar) {
        ArrayMap arrayMap = new ArrayMap();
        this.e = arrayMap;
        this.f = axfdVar.V(executor, aunnVar, awmdVar2);
        this.a = context;
        this.j = kjcVar;
        this.g = awmdVar;
        this.c = qgoVar;
        qgq qgqVar = new qgq(context, arrayMap, awmdVar3);
        this.d = qgqVar;
        ?? Io = ommVar.a.io();
        Io.getClass();
        ((ahey) ommVar.b.io()).getClass();
        this.b = new qhe(Io, qgqVar);
        this.h = qgzVar;
        this.i = Build.VERSION.SDK_INT < 31 ? agdf.a : agevVar;
    }

    public final ListenableFuture a(qgt qgtVar) {
        qgs qgsVar;
        qgt qgtVar2;
        axhw axhwVar;
        int i;
        qji qjiVar = this.f.c;
        boolean z = qjiVar.b;
        qjl qjlVar = qjiVar.a;
        if (!z || !qjlVar.a) {
            return aher.a;
        }
        ArrayMap arrayMap = this.e;
        synchronized (arrayMap) {
            qgsVar = (qgs) arrayMap.remove(qgtVar.a);
            if (arrayMap.isEmpty()) {
                this.b.j();
            }
        }
        if (qgsVar == null) {
            new qdv(qgtVar.a.a);
            return aher.a;
        }
        qgz qgzVar = this.h;
        qhb qhbVar = qgtVar.a;
        String strB = qhbVar.b();
        if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
            qgz.b(strB, "FT#end", 0L);
            String.format(Locale.US, "J<%s>", strB);
            for (qhc qhcVar : ((qhd) qgzVar.b.io()).c) {
                int iBg = a.bg(qhcVar.b);
                if (iBg == 0) {
                    iBg = 1;
                }
                switch (iBg - 1) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = qgsVar.g;
                        break;
                    case 3:
                        i = qgsVar.i;
                        break;
                    case 4:
                        i = qgsVar.j;
                        break;
                    case 5:
                        i = qgsVar.k;
                        break;
                    case 6:
                        i = qgsVar.l;
                        break;
                    case 7:
                        i = qgsVar.n;
                        break;
                    default:
                        String str = qhcVar.c;
                        continue;
                }
                Trace.setCounter(qhcVar.c.replace("%EVENT_NAME%", strB), i);
            }
        }
        if (qgsVar.i == 0) {
            return aher.a;
        }
        if (qgtVar.g) {
            qgtVar2 = qgtVar;
            ahng.q(new lez(qgzVar, qgtVar2, qgsVar, 16, (boolean[]) null), qgzVar.a);
        } else {
            qgtVar2 = qgtVar;
            qgzVar.a(qgtVar2, qgsVar);
        }
        long jB = qgsVar.c.b() - qgsVar.d;
        aihh aihhVar = (aihh) axht.a.createBuilder();
        aihhVar.copyOnWrite();
        axht axhtVar = (axht) aihhVar.instance;
        axhtVar.b |= 16;
        axhtVar.g = ((int) jB) + 1;
        int i2 = qgsVar.g;
        aihhVar.copyOnWrite();
        axht axhtVar2 = (axht) aihhVar.instance;
        axhtVar2.b |= 1;
        axhtVar2.c = i2;
        int i3 = qgsVar.i;
        aihhVar.copyOnWrite();
        axht axhtVar3 = (axht) aihhVar.instance;
        axhtVar3.b |= 2;
        axhtVar3.d = i3;
        int i4 = qgsVar.j;
        aihhVar.copyOnWrite();
        axht axhtVar4 = (axht) aihhVar.instance;
        axhtVar4.b |= 4;
        axhtVar4.e = i4;
        int i5 = qgsVar.l;
        aihhVar.copyOnWrite();
        axht axhtVar5 = (axht) aihhVar.instance;
        axhtVar5.b |= 32;
        axhtVar5.h = i5;
        int i6 = qgsVar.n;
        aihhVar.copyOnWrite();
        axht axhtVar6 = (axht) aihhVar.instance;
        axhtVar6.b |= 64;
        axhtVar6.i = i6;
        int i7 = qgsVar.k;
        aihhVar.copyOnWrite();
        axht axhtVar7 = (axht) aihhVar.instance;
        axhtVar7.b |= 8;
        axhtVar7.f = i7;
        if (qgsVar.p && !qgsVar.q) {
            long j = qgsVar.r / 1000000;
            aihhVar.copyOnWrite();
            axht axhtVar8 = (axht) aihhVar.instance;
            axhtVar8.b |= SemanticState.Obscured;
            axhtVar8.q = (int) j;
        }
        int i8 = qgsVar.o;
        if (i8 != Integer.MIN_VALUE) {
            int[] iArr = qgsVar.f;
            int[] iArr2 = qgs.b;
            jrr jrrVar = (jrr) axhw.a.createBuilder();
            int i9 = 0;
            while (true) {
                if (i9 >= 52) {
                    if (iArr[51] > 0) {
                        jrrVar.d(i8 + 1);
                        jrrVar.e(0);
                    }
                    axhwVar = (axhw) jrrVar.build();
                } else if (iArr2[i9] > i8) {
                    jrrVar.e(0);
                    jrrVar.d(i8 + 1);
                    axhwVar = (axhw) jrrVar.build();
                } else {
                    int i10 = iArr[i9];
                    if (i10 > 0 || (i9 > 0 && iArr[i9 - 1] > 0)) {
                        jrrVar.e(i10);
                        jrrVar.d(iArr2[i9]);
                    }
                    i9++;
                }
            }
            aihhVar.copyOnWrite();
            axht axhtVar9 = (axht) aihhVar.instance;
            axhwVar.getClass();
            axhtVar9.p = axhwVar;
            axhtVar9.b |= SemanticState.Modal;
            int i11 = qgsVar.h;
            aihhVar.copyOnWrite();
            axht axhtVar10 = (axht) aihhVar.instance;
            axhtVar10.b |= SemanticState.LiveRegion;
            axhtVar10.n = i11;
            int i12 = qgsVar.m;
            aihhVar.copyOnWrite();
            axht axhtVar11 = (axht) aihhVar.instance;
            axhtVar11.b |= SemanticState.ReadOnly;
            axhtVar11.o = i12;
        }
        int i13 = 0;
        while (i13 < 29) {
            int i14 = i13 + 1;
            int[] iArr3 = qgsVar.e;
            if (iArr3[i13] > 0) {
                aihf aihfVarCreateBuilder = axhs.a.createBuilder();
                int i15 = iArr3[i13];
                aihfVarCreateBuilder.copyOnWrite();
                axhs axhsVar = (axhs) aihfVarCreateBuilder.instance;
                axhsVar.b |= 1;
                axhsVar.c = i15;
                int[] iArr4 = qgs.a;
                int i16 = iArr4[i13];
                aihfVarCreateBuilder.copyOnWrite();
                axhs axhsVar2 = (axhs) aihfVarCreateBuilder.instance;
                axhsVar2.b |= 2;
                axhsVar2.d = i16;
                if (i14 < 29) {
                    int i17 = iArr4[i14] - 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    axhs axhsVar3 = (axhs) aihfVarCreateBuilder.instance;
                    axhsVar3.b |= 4;
                    axhsVar3.e = i17;
                }
                aihhVar.copyOnWrite();
                axht axhtVar12 = (axht) aihhVar.instance;
                axhs axhsVar4 = (axhs) aihfVarCreateBuilder.build();
                axhsVar4.getClass();
                aiie aiieVar = axhtVar12.l;
                if (!aiieVar.c()) {
                    axhtVar12.l = aihn.mutableCopy(aiieVar);
                }
                axhtVar12.l.add(axhsVar4);
            }
            i13 = i14;
        }
        aihh aihhVar2 = (aihh) ((axht) aihhVar.build()).toBuilder();
        agev agevVarA = qgp.a(this.a);
        if (agevVarA.g()) {
            int iIntValue = ((Float) agevVarA.c()).intValue();
            aihhVar2.copyOnWrite();
            axht axhtVar13 = (axht) aihhVar2.instance;
            axhtVar13.b |= SemanticState.Hidden;
            axhtVar13.m = iIntValue;
        }
        qfg qfgVar = this.f;
        axht axhtVar14 = (axht) aihhVar2.build();
        qfc qfcVarA = qfd.a();
        aihf aihfVarCreateBuilder2 = axhz.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        axhz axhzVar = (axhz) aihfVarCreateBuilder2.instance;
        axhtVar14.getClass();
        axhzVar.k = axhtVar14;
        axhzVar.b |= SemanticState.LiveRegion;
        qfcVarA.g((axhz) aihfVarCreateBuilder2.build());
        qfcVarA.b = qgtVar2.b;
        qfcVarA.c = true != qhbVar.b ? null : "Activity";
        qfcVarA.a = qhbVar.b();
        qfcVarA.d(qhbVar.a != null);
        return qfgVar.a(qfcVarA.a());
    }

    @Override // defpackage.qgy
    public final ListenableFuture b(qgx qgxVar) {
        qhb qhbVar;
        qci qciVar = qgxVar.b;
        if (qciVar != null) {
            aguu.ak(qciVar);
            qhbVar = new qhb(null, qciVar, false);
        } else {
            qhbVar = new qhb(qgxVar.a, null, false);
        }
        return a(new qgt(qhbVar, qgxVar.c, qgxVar.d, qgxVar.e, qgxVar.f, qgxVar.g, qgxVar.h));
    }

    @Override // defpackage.qgy
    public final void c(qci qciVar) {
        d(new qhb(null, qciVar, false));
    }

    public final void d(qhb qhbVar) {
        if (this.f.b(qhbVar.b())) {
            ArrayMap arrayMap = this.e;
            synchronized (arrayMap) {
                if (arrayMap.size() >= 25) {
                    ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 158, "FrameMetricServiceImpl.java")).w("Too many concurrent measurements, ignoring %s", qhbVar);
                    return;
                }
                qgs qgsVar = (qgs) this.g.io();
                qgs qgsVar2 = (qgs) arrayMap.put(qhbVar, qgsVar);
                if (qgsVar2 != null) {
                    arrayMap.put(qhbVar, qgsVar2);
                    ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 172, "FrameMetricServiceImpl.java")).w("measurement already started: %s", qhbVar);
                    return;
                }
                agev agevVar = this.i;
                if (agevVar.g()) {
                    if (((aeri) agevVar.c()).a.contains(qhbVar.b())) {
                        qgsVar.p = true;
                    }
                }
                if (arrayMap.size() == 1) {
                    this.b.g();
                }
                String strB = qhbVar.b();
                if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                    String.format(Locale.US, "J<%s>", strB);
                    Looper.getMainLooper().getThread();
                    Thread.currentThread();
                }
            }
        }
    }

    @Override // defpackage.qdy
    public final void g(qci qciVar) {
        ArrayMap arrayMap = this.e;
        synchronized (arrayMap) {
            Map.EL.forEach(arrayMap, new qzo(1));
            arrayMap.clear();
        }
    }

    @Override // defpackage.qfh
    public final void k() {
        kjc kjcVar = this.j;
        kjcVar.E(this.b);
        kjcVar.E(this.c);
    }

    @Override // defpackage.qdy
    public final /* synthetic */ void j(qci qciVar) {
    }
}
