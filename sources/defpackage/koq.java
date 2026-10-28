package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class koq implements Handler.Callback {
    public static koq d;
    public final Context g;
    public final klt h;
    public final Set o;
    public final Set p;
    public final Handler q;
    public volatile boolean r;
    public final hee s;
    private krv v;
    private krw w;
    private SparseArray x;
    private kqe y;
    private volatile elq z;
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status b = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object c = new Object();
    private static final Object t = new Object();
    private static volatile boolean u = false;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger i = new AtomicInteger(1);
    public final AtomicInteger j = new AtomicInteger(0);
    public final Map k = new ConcurrentHashMap(5, 0.75f, 1);
    public koi l = null;
    public final Set m = new afx(0);
    public final Set n = new afx(0);

    private koq(Context context, Looper looper, klt kltVar) {
        new WeakHashMap();
        this.o = Collections.newSetFromMap(new WeakHashMap());
        this.p = Collections.newSetFromMap(new WeakHashMap());
        this.r = true;
        this.g = context;
        afkg afkgVar = new afkg(looper, this);
        this.q = afkgVar;
        this.h = kltVar;
        this.s = new hee((klu) kltVar);
        if (kss.a(context)) {
            this.r = false;
        }
        afkgVar.sendMessage(afkgVar.obtainMessage(6));
    }

    public static Status a(knu knuVar, klo kloVar) {
        return new Status(kloVar, "API: " + knuVar.a() + " is not available on this device. Connection failed with: " + String.valueOf(kloVar), 17);
    }

    public static koq c(Context context) {
        koq koqVar;
        synchronized (c) {
            koqVar = d;
            if (koqVar == null) {
                Looper looper = kqy.a().getLooper();
                boolean zA = kqw.a(context.getPackageName());
                u = zA;
                koq koqVar2 = new koq(context.getApplicationContext(), looper, klt.a);
                if (zA) {
                    kqs.G = kqu.a(koqVar2.g);
                }
                d = koqVar2;
                koqVar = koqVar2;
            }
        }
        return koqVar;
    }

    private final kol k(kmz kmzVar) {
        Map map = this.k;
        knu knuVar = kmzVar.z;
        kol kolVar = (kol) map.get(knuVar);
        if (kolVar == null) {
            kolVar = new kol(this, kmzVar);
            map.put(knuVar, kolVar);
            this.o.remove(knuVar);
            this.p.remove(knuVar);
        }
        if (kolVar.q()) {
            this.n.add(knuVar);
        }
        kolVar.d();
        return kolVar;
    }

    private final krw l() {
        if (this.w == null) {
            this.w = new ksl(this.g, krx.a);
        }
        return this.w;
    }

    private final void m() {
        krv krvVar = this.v;
        if (krvVar != null) {
            if (krvVar.a > 0 || g()) {
                l().a(krvVar);
            }
            this.v = null;
        }
    }

    private final void n() {
        SparseArray sparseArray = this.x;
        if (sparseArray != null) {
            if (sparseArray.size() > 0) {
                ArrayList arrayList = new ArrayList(sparseArray.size());
                Context context = this.g;
                String packageName = context.getPackageName();
                for (int i = 0; i < sparseArray.size(); i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    kop kopVar = (kop) sparseArray.valueAt(i);
                    arrayList.add(new kqf(iKeyAt, packageName, kopVar.a, kopVar.b));
                }
                if (this.y == null) {
                    this.y = new ksj(context);
                }
                this.y.a(new kqg(arrayList));
            }
            this.x = null;
        }
    }

    final kol b(knu knuVar) {
        return (kol) this.k.get(knuVar);
    }

    public final void d(klo kloVar, int i) {
        if (h(kloVar, i)) {
            return;
        }
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(5, i, 0, kloVar));
    }

    public final void e() {
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void f(koi koiVar) {
        synchronized (c) {
            if (this.l != koiVar) {
                this.l = koiVar;
                this.m.clear();
            }
            this.m.addAll(koiVar.d);
        }
    }

    final boolean g() {
        if (this.f) {
            return false;
        }
        krt krtVar = krs.a().a;
        if (krtVar != null && !krtVar.b) {
            return false;
        }
        int iC = this.s.c(203400000);
        return iC == -1 || iC == 0;
    }

    final boolean h(klo kloVar, int i) {
        PendingIntent pendingIntentB;
        Bundle bundle;
        klt kltVar = this.h;
        int i2 = kloVar.c;
        if (!kltVar.g(i2)) {
            Log.w("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(String.valueOf(kloVar))));
            return false;
        }
        Context context = this.g;
        if (ksy.c(context) || (pendingIntentB = kltVar.b(context, kloVar)) == null) {
            return false;
        }
        PendingIntent pendingIntentA = kyg.a(context, GoogleApiActivity.a(context, pendingIntentB, i, true), kyg.a | 134217728);
        Bundle bundle2 = kloVar.f;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
            if (bundle2.containsKey("pendingIntent")) {
                bundle.putParcelable("pendingIntent", pendingIntentA);
            }
        } else {
            bundle = null;
        }
        kltVar.k(context, new klo(kloVar.b, i2, pendingIntentA, kloVar.d, kloVar.e, bundle));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0346  */
    /* JADX WARN: Code duplicated, block: B:154:0x036e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0374  */
    /* JADX WARN: Code duplicated, block: B:157:0x039c  */
    /* JADX WARN: Code duplicated, block: B:158:0x03a7  */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.Map] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v16 kol, still in use, count: 2, list:
          (r3v16 kol) from 0x0366: IGET (r3v16 kol) A[WRAPPED] (LINE:871) kol.g int
          (r3v16 kol) from 0x036c: PHI (r3 I:??) = (r3v13 kol), (r3v16 kol) binds: [B:152:0x036b, B:222:0x036c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r18) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koq.handleMessage(android.os.Message):boolean");
    }

    public final elq i() {
        elq elqVar = this.z;
        if (elqVar == null) {
            synchronized (t) {
                elqVar = this.z;
                if (elqVar == null) {
                    elqVar = new elq((char[]) null, (byte[]) null);
                    this.z = elqVar;
                }
            }
        }
        return elqVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final void j(kjc kjcVar, int i, kmz kmzVar) {
        koq koqVar;
        long j;
        long jElapsedRealtime;
        if (i != 0) {
            knu knuVar = kmzVar.z;
            koz kozVar = null;
            if (g()) {
                krt krtVar = krs.a().a;
                boolean z = true;
                if (krtVar != null) {
                    if (krtVar.b) {
                        boolean z2 = krtVar.c;
                        kol kolVarB = b(knuVar);
                        if (kolVarB != null) {
                            Object obj = kolVarB.b;
                            if (obj instanceof kpz) {
                                kpz kpzVar = (kpz) obj;
                                if (!kpzVar.L() || kpzVar.x()) {
                                    z = z2;
                                } else {
                                    kqj kqjVarB = koz.b(kolVarB, kpzVar, i);
                                    if (kqjVarB != null) {
                                        kolVarB.k++;
                                        z = kqjVarB.c;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    koqVar = this;
                }
                if (z) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    j = jCurrentTimeMillis;
                } else {
                    j = 0;
                    jElapsedRealtime = 0;
                }
                koqVar = this;
                kozVar = new koz(koqVar, i, knuVar, j, jElapsedRealtime);
            } else {
                koqVar = this;
            }
            if (kozVar != null) {
                Object obj2 = kjcVar.a;
                Handler handler = koqVar.q;
                handler.getClass();
                ((lpa) obj2).l(new cck(handler, 7), kozVar);
            }
        }
    }
}
