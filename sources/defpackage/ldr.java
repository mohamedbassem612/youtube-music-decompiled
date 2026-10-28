package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldr implements leb {
    private static volatile ldr z;
    private final lhj A;
    private final lhh B;
    private final lba C;
    private final lev D;
    private Boolean E;
    private long F;
    private volatile Boolean G;
    public final Context a;
    public final boolean b;
    public final lbt c;
    public final ldl d;
    public final lcz e;
    public final lha f;
    public final lga g;
    public final lcu h;
    public final ler i;
    public final String j;
    public lgr k;
    public lff l;
    public lby m;
    public lct n;
    public lhm o;
    public lbv p;
    public volatile boolean r;
    public int s;
    public int t;
    final long v;
    final long w;
    public final ksr x;
    public final aedj y;
    public boolean q = false;
    public final AtomicInteger u = new AtomicInteger(0);

    public ldr(lef lefVar) {
        Context context = lefVar.a;
        aedj aedjVar = new aedj(null, null);
        this.y = aedjVar;
        ksy.a = aedjVar;
        this.a = context;
        this.b = lefVar.e;
        this.G = lefVar.b;
        this.j = lefVar.h;
        this.r = true;
        qkm.f(context);
        this.x = ksr.a;
        khn khnVar = lll.a;
        new llq(context).f("com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName())), 0, new String[0]);
        qkh.c(context);
        Long l = lefVar.f;
        this.v = l != null ? l.longValue() : System.currentTimeMillis();
        Long l2 = lefVar.g;
        this.w = l2 != null ? l2.longValue() : SystemClock.elapsedRealtime();
        this.c = new lbt(this);
        ldl ldlVar = new ldl(this);
        ldlVar.p();
        this.d = ldlVar;
        lcz lczVar = new lcz(this);
        lczVar.p();
        this.e = lczVar;
        lga lgaVar = new lga(this);
        lgaVar.p();
        this.g = lgaVar;
        this.h = new lcu(new hhc(this));
        this.C = new lba(this);
        lhh lhhVar = new lhh(this);
        lhhVar.b();
        this.B = lhhVar;
        ler lerVar = new ler(this);
        lerVar.b();
        this.i = lerVar;
        lhj lhjVar = new lhj(this);
        lhjVar.b();
        this.A = lhjVar;
        lev levVar = new lev(this);
        levVar.p();
        this.D = levVar;
        lha lhaVar = new lha(this);
        lhaVar.p();
        this.f = lhaVar;
        kzu kzuVar = lefVar.d;
        boolean z2 = kzuVar == null || kzuVar.b == 0;
        if (context.getApplicationContext() instanceof Application) {
            ler lerVarI = i();
            if (lerVarI.aS().getApplicationContext() instanceof Application) {
                Application application = (Application) lerVarI.aS().getApplicationContext();
                if (lerVarI.a == null) {
                    lerVarI.a = new leq(lerVarI);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(lerVarI.a);
                    application.registerActivityLifecycleCallbacks(lerVarI.a);
                    lerVarI.aT().k.a("Registered activity lifecycle callback");
                }
            }
        } else {
            aT().f.a("Application context is not an Application");
        }
        lhaVar.j(new ldq(this, lefVar));
    }

    public static final void A(lea leaVar) {
        if (leaVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!leaVar.r()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(leaVar.getClass()))));
        }
    }

    public static final void B() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void D(lbc lbcVar) {
        if (lbcVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!lbcVar.e()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(lbcVar.getClass()))));
        }
    }

    public static ldr h(Context context, kzu kzuVar, Long l, Long l2) {
        Bundle bundle;
        if (kzuVar != null) {
            Bundle bundle2 = kzuVar.d;
            kzuVar = new kzu(kzuVar.a, kzuVar.b, kzuVar.c, bundle2, null);
        }
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        if (context.getApplicationContext() == null) {
            throw new NullPointerException("null reference");
        }
        if (z == null) {
            synchronized (ldr.class) {
                if (z == null) {
                    z = new ldr(new lef(context, kzuVar, l, l2));
                }
            }
        } else if (kzuVar != null && (bundle = kzuVar.d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            if (z == null) {
                throw new NullPointerException("null reference");
            }
            z.u(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        if (z != null) {
            return z;
        }
        throw new NullPointerException("null reference");
    }

    public final int a() {
        r();
        lbt lbtVar = this.c;
        if (lbtVar.q()) {
            return 1;
        }
        if (!x()) {
            return 8;
        }
        Boolean boolG = g().g();
        if (boolG == null) {
            Boolean boolL = lbtVar.l("firebase_analytics_collection_enabled");
            if (boolL != null) {
                if (!boolL.booleanValue()) {
                    return 4;
                }
            } else if (this.G != null && !this.G.booleanValue()) {
                return 7;
            }
        } else if (!boolG.booleanValue()) {
            return 3;
        }
        return 0;
    }

    @Override // defpackage.leb
    public final Context aS() {
        return this.a;
    }

    @Override // defpackage.leb
    public final lcz aT() {
        lcz lczVar = this.e;
        A(lczVar);
        return lczVar;
    }

    @Override // defpackage.leb
    public final lha aU() {
        lha lhaVar = this.f;
        A(lhaVar);
        return lhaVar;
    }

    @Override // defpackage.leb
    public final ksr aV() {
        return this.x;
    }

    public final lba c() {
        lba lbaVar = this.C;
        if (lbaVar != null) {
            return lbaVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final lby d() {
        A(this.m);
        return this.m;
    }

    public final lct e() {
        D(this.n);
        return this.n;
    }

    public final ldl g() {
        ldl ldlVar = this.d;
        if (ldlVar != null) {
            return ldlVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final ler i() {
        ler lerVar = this.i;
        D(lerVar);
        return lerVar;
    }

    public final lev j() {
        lev levVar = this.D;
        A(levVar);
        return levVar;
    }

    public final lff k() {
        D(this.l);
        return this.l;
    }

    public final lga l() {
        lga lgaVar = this.g;
        if (lgaVar != null) {
            return lgaVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final lgr m() {
        D(this.k);
        return this.k;
    }

    public final lhh o() {
        lhh lhhVar = this.B;
        D(lhhVar);
        return lhhVar;
    }

    public final lhj p() {
        lhj lhjVar = this.A;
        D(lhjVar);
        return lhjVar;
    }

    public final lhm q() {
        lhm lhmVar = this.o;
        if (lhmVar != null) {
            return lhmVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final void r() {
        aU().o();
    }

    final void s() {
        this.u.incrementAndGet();
    }

    final void t() {
        this.s++;
    }

    public final void u(boolean z2) {
        this.G = Boolean.valueOf(z2);
    }

    public final boolean v() {
        return this.G != null && this.G.booleanValue();
    }

    public final boolean w() {
        return a() == 0;
    }

    public final boolean x() {
        r();
        return this.r;
    }

    protected final boolean y() {
        if (!this.q) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        r();
        Boolean bool = this.E;
        if (bool == null || this.F == 0 || (!bool.booleanValue() && Math.abs(SystemClock.elapsedRealtime() - this.F) > 1000)) {
            this.F = SystemClock.elapsedRealtime();
            boolean z2 = false;
            if (l().ai("android.permission.INTERNET") && l().ai("android.permission.ACCESS_NETWORK_STATE")) {
                Context context = this.a;
                if (kte.a.a(context).h() || this.c.s() || (lga.ao(context) && lga.au(context))) {
                    z2 = true;
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            this.E = boolValueOf;
            if (boolValueOf.booleanValue()) {
                this.E = Boolean.valueOf(l().ac(e().w()));
            }
        }
        return this.E.booleanValue();
    }

    @Override // defpackage.leb
    public final void aW() {
    }
}
