package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gaj implements gal {
    private static gaj m;
    public final Context a;
    public final kwq b;
    public final kwt c;
    public final kwv d;
    public final kwc e;
    public final gcw f;
    public volatile boolean j;
    public volatile boolean k;
    public final qcb l;
    private final gbe n;
    private final Executor o;
    private final gbn p;
    private final gbh q;
    volatile long h = 0;
    public final Object i = new Object();
    public final CountDownLatch g = new CountDownLatch(1);

    public gaj(Context context, kwc kwcVar, kwq kwqVar, kwt kwtVar, kwv kwvVar, gbe gbeVar, Executor executor, kto ktoVar, gcw gcwVar, gbn gbnVar, gbh gbhVar) {
        this.k = false;
        this.a = context;
        this.e = kwcVar;
        this.b = kwqVar;
        this.c = kwtVar;
        this.d = kwvVar;
        this.n = gbeVar;
        this.o = executor;
        this.f = gcwVar;
        this.p = gbnVar;
        this.q = gbhVar;
        this.k = false;
        this.l = new qcb(ktoVar);
    }

    @Deprecated
    public static synchronized gaj a(String str, Context context, boolean z, boolean z2) {
        return b(str, context, Executors.newCachedThreadPool(), z, z2);
    }

    @Deprecated
    public static synchronized gaj b(String str, Context context, Executor executor, boolean z, boolean z2) {
        kwd kwdVar;
        String str2;
        kwdVar = new kwd();
        kwdVar.a(false);
        kwdVar.c = true;
        byte b = kwdVar.f;
        kwdVar.d = 100L;
        kwdVar.e = 300L;
        kwdVar.f = (byte) (b | 62);
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        kwdVar.a = str;
        kwdVar.a(z);
        if (kwdVar.f != 63 || (str2 = kwdVar.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (kwdVar.a == null) {
                sb.append(" clientVersion");
            }
            if ((kwdVar.f & 1) == 0) {
                sb.append(" shouldGetAdvertisingId");
            }
            if ((kwdVar.f & 2) == 0) {
                sb.append(" isGooglePlayServicesAvailable");
            }
            if ((kwdVar.f & 4) == 0) {
                sb.append(" enableQuerySignalsTimeout");
            }
            if ((kwdVar.f & 8) == 0) {
                sb.append(" querySignalsTimeoutMs");
            }
            if ((kwdVar.f & 16) == 0) {
                sb.append(" enableQuerySignalsCache");
            }
            if ((kwdVar.f & 32) == 0) {
                sb.append(" querySignalsCacheTtlSeconds");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return o(context, executor, new kwe(str2, kwdVar.b, kwdVar.c, kwdVar.d, kwdVar.e), z2);
    }

    private static synchronized gaj o(Context context, Executor executor, kwe kweVar, boolean z) {
        if (m == null) {
            kwc kwcVarA = kwc.a(context, executor, z);
            gat gatVarA = gat.a(context);
            gbn gbnVar = new gbn(context, executor, gbn.a);
            gbh gbhVar = new gbh();
            heg hegVar = new heg((char[]) null, (char[]) null);
            fxl fxlVar = kwh.a;
            kwi kwiVar = new kwi(context, executor, kwcVarA);
            iug iugVar = new iug(kwiVar, 12);
            Executor executor2 = kwiVar.b;
            lpa lpaVarK = mda.k(executor2, iugVar);
            lpaVarK.m(executor2, new kea(kwiVar, 4));
            kwiVar.d = lpaVarK;
            gbd gbdVar = new gbd(context);
            gbe gbeVar = new gbe(kweVar, kwiVar, new gbm(context, gbdVar), gbdVar, gatVarA, gbnVar, gbhVar, hegVar);
            int i = kwj.a;
            gcw gcwVarB = kwj.b(context, kwcVarA);
            kto ktoVar = new kto();
            gaj gajVar = new gaj(context, kwcVarA, new kwq(context, gcwVarB), new kwt(context, gcwVarB, new gan(kwcVarA, 1), ((Boolean) jwp.b.d()).booleanValue()), new kwv(context, gbeVar, kwcVarA, ktoVar, false), gbeVar, executor, ktoVar, gcwVarB, gbnVar, gbhVar);
            m = gajVar;
            gajVar.h();
            m.j();
        }
        return m;
    }

    private final void p() {
        this.p.c();
    }

    @Override // defpackage.gal
    public final String c(Context context, String str, View view, Activity activity) {
        p();
        this.q.a();
        j();
        aamo aamoVarA = this.d.a();
        if (aamoVarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strL = aamoVarA.l(context, str, view, activity);
        this.e.e(5000, System.currentTimeMillis() - jCurrentTimeMillis, null, strL, null);
        return strL;
    }

    @Override // defpackage.gal
    public final String d(Context context) {
        p();
        this.q.b();
        j();
        aamo aamoVarA = this.d.a();
        if (aamoVarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strN = aamoVarA.n(context);
        this.e.e(5001, System.currentTimeMillis() - jCurrentTimeMillis, null, strN, null);
        return strN;
    }

    @Override // defpackage.gal
    public final String e(Context context, View view, Activity activity) {
        p();
        this.q.c(context, view);
        j();
        aamo aamoVarA = this.d.a();
        if (aamoVarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM = aamoVarA.m(context, view, activity);
        this.e.e(5002, System.currentTimeMillis() - jCurrentTimeMillis, null, strM, null);
        return strM;
    }

    @Override // defpackage.gal
    public final void f(MotionEvent motionEvent) {
        aamo aamoVarA = this.d.a();
        if (aamoVarA != null) {
            try {
                aamoVarA.o(motionEvent);
            } catch (kwu e) {
                this.e.e(e.a, -1L, e, null, null);
            }
        }
    }

    @Override // defpackage.gal
    public final void g(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) jwp.y.d()).booleanValue() || (displayMetrics = this.a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    final synchronized void h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        aepb aepbVarN = n();
        if (aepbVarN == null) {
            this.e.e(4013, System.currentTimeMillis() - jCurrentTimeMillis, null, null, null);
            return;
        }
        if (this.d.b(aepbVarN)) {
            this.k = true;
            this.g.countDown();
        }
    }

    @Override // defpackage.gal
    public final void i(View view) {
        this.n.a.d(view);
    }

    public final void j() {
        Object obj;
        if (this.j) {
            return;
        }
        synchronized (this.i) {
            if (!this.j) {
                if ((System.currentTimeMillis() / 1000) - this.h < 3600) {
                    return;
                }
                kwv kwvVar = this.d;
                synchronized (kwvVar.a) {
                    try {
                        aamo aamoVar = kwvVar.b;
                        obj = aamoVar != null ? aamoVar.e : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((obj == null || ((gcz) ((aepb) obj).c).e - (System.currentTimeMillis() / 1000) < 3600) && kwj.a(this.f)) {
                    this.o.execute(new gai(this));
                }
            }
        }
    }

    @Override // defpackage.gal
    public final boolean k() {
        return l();
    }

    public final synchronized boolean l() {
        return this.k;
    }

    @Override // defpackage.gal
    public final boolean m() {
        try {
            this.g.await();
        } catch (InterruptedException unused) {
        }
        return l();
    }

    public final aepb n() {
        if (!kwj.a(this.f)) {
            return null;
        }
        if (!((Boolean) jwp.a.d()).booleanValue()) {
            kwq kwqVar = this.b;
            gcz gczVarE = kwqVar.e(1);
            if (gczVarE == null) {
                return null;
            }
            String str = gczVarE.c;
            File fileV = ixt.V(str, "pcam.jar", kwqVar.a());
            if (!fileV.exists()) {
                fileV = ixt.V(str, "pcam", kwqVar.a());
            }
            return new aepb(gczVarE, fileV, ixt.V(str, "pcbc", kwqVar.a()), ixt.V(str, "pcopt", kwqVar.a()));
        }
        kwt kwtVar = this.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (kwt.a) {
            gcz gczVarG = kwtVar.g(1);
            if (gczVarG == null) {
                kwtVar.e(4022, jCurrentTimeMillis);
                return null;
            }
            File fileA = kwtVar.a(gczVarG.c);
            File file = new File(fileA, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileA, "pcam");
            }
            File file2 = new File(fileA, "pcbc");
            File file3 = new File(fileA, "pcopt");
            kwtVar.e(5016, jCurrentTimeMillis);
            return new aepb(gczVarG, file, file2, file3);
        }
    }
}
