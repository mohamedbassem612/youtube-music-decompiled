package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lff extends lbc {
    public final lfe a;
    public lco b;
    public volatile Boolean c;
    public ScheduledExecutorService d;
    private final lbw e;
    private final lfj f;
    private final List g;
    private final lbw h;

    protected lff(ldr ldrVar) {
        super(ldrVar);
        this.g = new ArrayList();
        this.f = new lfj();
        this.a = new lfe(this);
        this.e = new lfb(this, ldrVar);
        this.h = new lfd(this, ldrVar);
    }

    public final void A() {
        o();
        this.f.a();
        this.e.c(((Long) lcl.aj.b(null)).longValue());
    }

    public final void B(Runnable runnable) {
        o();
        if (P()) {
            runnable.run();
            return;
        }
        List list = this.g;
        if (list.size() >= 1000) {
            aT().c.a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.h.c(60000L);
        t();
    }

    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.CharSequence, java.lang.Object] */
    public final void D(lco lcoVar, kry kryVar, lbg lbgVar) {
        int size;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        o();
        a();
        lbg lbgVar2 = lbgVar;
        int i = 100;
        int i2 = 0;
        for (int i3 = 100; i2 < 1001 && i == i3; i3 = 100) {
            ArrayList arrayList = new ArrayList();
            List listW = k().w();
            if (listW != null) {
                arrayList.addAll(listW);
                size = listW.size();
            } else {
                size = 0;
            }
            if (kryVar != 0 && size < i3) {
                arrayList.add(new axnp(kryVar, lbgVar2.c, lbgVar2.j));
            }
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                axnp axnpVar = (axnp) arrayList.get(i4);
                Object obj = axnpVar.b;
                if (G().F(null, lcl.aO)) {
                    ?? r13 = axnpVar.c;
                    if (!TextUtils.isEmpty(r13)) {
                        lbgVar2 = new lbg(lbgVar2.a, lbgVar2.b, (String) r13, axnpVar.a, lbgVar2.d, lbgVar2.e, lbgVar2.f, lbgVar2.g, lbgVar2.h, lbgVar2.i, lbgVar2.k, lbgVar2.l, lbgVar2.m, lbgVar2.n, lbgVar2.o, lbgVar2.p, lbgVar2.q, lbgVar2.r, lbgVar2.s, lbgVar2.t, lbgVar2.u, lbgVar2.v, lbgVar2.w, lbgVar2.x, lbgVar2.y, lbgVar2.z, lbgVar2.A, lbgVar2.B, lbgVar2.C, lbgVar2.D, lbgVar2.E, lbgVar2.F, lbgVar2.G, lbgVar2.H, lbgVar2.I);
                    }
                }
                lbg lbgVar3 = G().F(null, lcl.bg) ? new lbg(lbgVar2.a, lbgVar2.b, lbgVar2.c, lbgVar2.j, lbgVar2.d, lbgVar2.e, lbgVar2.f, lbgVar2.g, lbgVar2.h, lbgVar2.i, lbgVar2.k, lbgVar2.l, lbgVar2.m, lbgVar2.n, lbgVar2.o, lbgVar2.p, lbgVar2.q, lbgVar2.r, lbgVar2.s, lbgVar2.t, lbgVar2.u, lbgVar2.v, lbgVar2.w, lbgVar2.x, lbgVar2.y, lbgVar2.z, lbgVar2.A, lbgVar2.B, lbgVar2.C, lbgVar2.D, lbgVar2.E, lbgVar2.F, J().k.a(), m().v(), J().g.a()) : lbgVar2;
                if (obj instanceof lcd) {
                    try {
                        ldr ldrVar = this.t;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                            try {
                                lcoVar.o((lcd) obj, lbgVar3);
                                aT().k.a("Logging telemetry for logEvent from database");
                                oml.c(ldrVar).b(0, jCurrentTimeMillis, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                            } catch (RemoteException e) {
                                e = e;
                                aT().c.b("Failed to send event to the service", e);
                                if (jCurrentTimeMillis != 0) {
                                    oml.c(this.t).b(13, jCurrentTimeMillis, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                                }
                            }
                        } catch (RemoteException e2) {
                            e = e2;
                            jElapsedRealtime = 0;
                        }
                    } catch (RemoteException e3) {
                        e = e3;
                        jCurrentTimeMillis = 0;
                        jElapsedRealtime = 0;
                    }
                } else if (obj instanceof lfy) {
                    try {
                        lcoVar.y((lfy) obj, lbgVar3);
                    } catch (RemoteException e4) {
                        aT().c.b("Failed to send user property to the service", e4);
                    }
                } else if (obj instanceof lbq) {
                    try {
                        lcoVar.r((lbq) obj, lbgVar3);
                    } catch (RemoteException e5) {
                        aT().c.b("Failed to send conditional user property to the service", e5);
                    }
                } else if (G().F(null, lcl.aO) && (obj instanceof lcc)) {
                    try {
                        lcoVar.u(((lcc) obj).a(), lbgVar3);
                    } catch (RemoteException e6) {
                        aT().c.b("Failed to send default event parameters to the service", e6);
                    }
                } else {
                    aT().c.a("Discarding data. Unrecognized parcel type.");
                }
                i4++;
                lbgVar2 = lbgVar3;
            }
            i2++;
            i = size;
        }
    }

    protected final void E(lbq lbqVar) {
        boolean z;
        o();
        a();
        lgr lgrVarK = k();
        lgrVarK.L();
        byte[] bArrAC = lga.aC(lbqVar);
        if (bArrAC.length <= 131072) {
            if (lgrVarK.v(2, bArrAC)) {
                z = true;
            }
            B(new gqc(this, s(true), z, new lbq(lbqVar), 2));
        }
        lgrVarK.aT().d.a("Conditional user property too long for local database. Sending directly to service");
        z = false;
        B(new gqc(this, s(true), z, new lbq(lbqVar), 2));
    }

    public final void F(lhf lhfVar) {
        o();
        a();
        B(new ihq(this, lhfVar, 13, (short[]) null));
    }

    public final void N(Bundle bundle) {
        boolean z;
        o();
        a();
        lcc lccVar = new lcc(bundle);
        if (G().F(null, lcl.aO)) {
            lgr lgrVarK = k();
            lgrVarK.L();
            byte[] bArrAC = lga.aC(lccVar);
            if (bArrAC == null) {
                lgrVarK.aT().d.a("Null default event parameters; not writing to database");
            } else if (bArrAC.length > 131072) {
                lgrVarK.aT().d.a("Default event parameters too long for local database. Sending directly to service");
            } else if (lgrVarK.v(4, bArrAC)) {
                z = true;
            }
            z = false;
        } else {
            z = false;
        }
        B(new lfc(this, s(false), z, lccVar, bundle));
    }

    public final void O(lco lcoVar) {
        o();
        this.b = lcoVar;
        A();
        v();
    }

    public final boolean P() {
        o();
        a();
        return this.b != null;
    }

    final boolean Q() {
        o();
        a();
        return !T() || L().k() >= ((Integer) lcl.aJ.b(null)).intValue();
    }

    final boolean R() {
        o();
        a();
        return !T() || L().k() >= 234200;
    }

    final boolean S() {
        o();
        a();
        return !T() || L().k() >= 241200;
    }

    public final boolean T() {
        o();
        a();
        if (this.c == null) {
            o();
            a();
            ldl ldlVarJ = J();
            ldlVarJ.o();
            boolean z = false;
            Boolean boolValueOf = !ldlVarJ.b().contains("use_service") ? null : Boolean.valueOf(ldlVarJ.b().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                if (h().s() != 1) {
                    aT().k.a("Checking service availability");
                    int iAs = L().as();
                    if (iAs == 0) {
                        aT().k.a("Service available");
                    } else if (iAs == 1) {
                        aT().k.a("Service missing");
                    } else if (iAs != 2) {
                        if (iAs == 3) {
                            aT().f.a("Service disabled");
                        } else if (iAs == 9) {
                            aT().f.a("Service invalid");
                        } else if (iAs != 18) {
                            aT().f.b("Unexpected service status", Integer.valueOf(iAs));
                        } else {
                            aT().f.a("Service updating");
                        }
                        z2 = false;
                    } else {
                        aT().j.a("Service container out of date");
                        if (L().k() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                } else {
                    z = true;
                }
                if (!z && G().s()) {
                    aT().c.a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    ldl ldlVarJ2 = J();
                    ldlVarJ2.o();
                    SharedPreferences.Editor editorEdit = ldlVarJ2.b().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.c = Boolean.valueOf(z2);
        }
        return this.c.booleanValue();
    }

    protected final void U() {
        o();
        a();
        if (Q()) {
            B(new lfa(this, s(false), 2));
        }
    }

    @Override // defpackage.lbc
    protected final boolean f() {
        return false;
    }

    public final lbg s(boolean z) {
        long jAbs;
        Pair pair;
        lct lctVarH = h();
        String str = null;
        if (z) {
            lcz lczVarAT = aT();
            if (lczVarAT.J().c != null) {
                ldj ldjVar = lczVarAT.J().c;
                ldl ldlVar = ldjVar.e;
                ldlVar.o();
                ldlVar.o();
                long jA = ldjVar.a();
                if (jA == 0) {
                    ldjVar.b();
                    jAbs = 0;
                } else {
                    jAbs = Math.abs(jA - System.currentTimeMillis());
                }
                long j = ldjVar.d;
                if (jAbs < j) {
                    pair = null;
                } else if (jAbs > (j << 1)) {
                    ldjVar.b();
                    pair = null;
                } else {
                    String string = ldlVar.b().getString(ldjVar.c, null);
                    long j2 = ldlVar.b().getLong(ldjVar.b, 0L);
                    ldjVar.b();
                    pair = (string == null || j2 <= 0) ? ldl.a : new Pair(string, Long.valueOf(j2));
                }
                if (pair != null && pair != ldl.a) {
                    str = String.valueOf(pair.second) + ':' + ((String) pair.first);
                }
            }
        }
        return lctVarH.u(str);
    }

    final void t() {
        o();
        a();
        if (P()) {
            return;
        }
        if (T()) {
            lfe lfeVar = this.a;
            lff lffVar = lfeVar.c;
            lffVar.o();
            Context contextAS = lffVar.aS();
            synchronized (lfeVar) {
                if (lfeVar.a) {
                    lfeVar.c.aT().k.a("Connection attempt already in progress");
                    return;
                }
                if (lfeVar.b != null && (lfeVar.b.x() || lfeVar.b.w())) {
                    lfeVar.c.aT().k.a("Already awaiting connection attempt");
                    return;
                }
                lfeVar.b = new lcv(contextAS, Looper.getMainLooper(), lfeVar, lfeVar);
                lfeVar.c.aT().k.a("Connecting to remote service");
                lfeVar.a = true;
                if (lfeVar.b == null) {
                    throw new NullPointerException("null reference");
                }
                lfeVar.b.H();
                return;
            }
        }
        if (G().s()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = aS().getPackageManager().queryIntentServices(new Intent().setClassName(aS(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            aT().c.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(aS(), "com.google.android.gms.measurement.AppMeasurementService"));
        lfe lfeVar2 = this.a;
        lff lffVar2 = lfeVar2.c;
        lffVar2.o();
        Context contextAS2 = lffVar2.aS();
        ksp kspVarA = ksp.a();
        synchronized (lfeVar2) {
            if (lfeVar2.a) {
                lfeVar2.c.aT().k.a("Connection attempt already in progress");
            } else {
                lff lffVar3 = lfeVar2.c;
                lffVar3.aT().k.a("Using local app measurement service");
                lfeVar2.a = true;
                kspVarA.c(contextAS2, intent, lffVar3.a, 129);
            }
        }
    }

    public final void u() {
        o();
        a();
        lfe lfeVar = this.a;
        if (lfeVar.b != null && (lfeVar.b.w() || lfeVar.b.x())) {
            lfeVar.b.l();
        }
        lfeVar.b = null;
        try {
            ksp.a().b(aS(), lfeVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.b = null;
    }

    public final void v() {
        o();
        lcx lcxVar = aT().k;
        List list = this.g;
        lcxVar.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                aT().c.b("Task exception while flushing queue", e);
            }
        }
        this.g.clear();
        this.h.a();
    }

    public final void w(AtomicReference atomicReference) {
        o();
        a();
        B(new dzn(this, atomicReference, s(false), 6));
    }

    public final void x(ComponentName componentName) {
        o();
        if (this.b != null) {
            this.b = null;
            aT().k.b("Disconnected from device MeasurementService", componentName);
            o();
            t();
        }
    }

    public final void y(List list) {
        o();
        a();
        if (G().F(null, lcl.aR)) {
            B(new dzn((Object) this, (Object) s(true), (Object) list, 5, (byte[]) null));
        }
    }
}
