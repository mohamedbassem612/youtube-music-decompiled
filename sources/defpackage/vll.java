package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vll implements vlo {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/dataplan/DefaultMobileDataPlanInfoProvider");
    public final AtomicReference b;
    private final Executor c;
    private final awmd d;
    private final vyo e;
    private final TelephonyManager f;
    private final AtomicReference g;
    private final tfq h;
    private final wjr i;
    private xpl j;

    public vll(tfq tfqVar, Executor executor, awmd awmdVar, vyo vyoVar, Context context, wjr wjrVar) {
        aont aontVar;
        AtomicReference atomicReference = new AtomicReference();
        this.b = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.g = atomicReference2;
        this.h = tfqVar;
        this.c = executor;
        this.d = awmdVar;
        this.e = vyoVar;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        telephonyManager.getClass();
        this.f = telephonyManager;
        this.i = wjrVar;
        if (vyoVar == null || vyoVar.b() == null) {
            aontVar = aont.a;
        } else {
            anew anewVar = vyoVar.b().j;
            aontVar = (anewVar == null ? anew.a : anewVar).i;
            if (aontVar == null) {
                aontVar = aont.a;
            }
        }
        if (tfqVar.i()) {
            if (aontVar.c && atomicReference.get() == null && tfqVar.j(0)) {
                f();
            } else if (atomicReference2.get() == null) {
                c();
            }
        }
    }

    private final boolean g() {
        vyo vyoVar = this.e;
        if (vyoVar != null && vyoVar.b() != null) {
            aqjb aqjbVar = vyoVar.b().t;
            if (aqjbVar == null) {
                aqjbVar = aqjb.a;
            }
            if (aqjbVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vlo
    public final vli a() {
        return (vli) this.b.get();
    }

    @Override // defpackage.vlo
    public final String b() {
        return (String) this.g.get();
    }

    public final void c() {
        Executor executor;
        if (!g() || (executor = this.c) == null) {
            d();
        } else {
            executor.execute(afwl.i(new vlj(this, 0)));
        }
    }

    public final void d() {
        TelephonyManager telephonyManager = this.f;
        int simState = telephonyManager.getSimState();
        AtomicReference atomicReference = this.g;
        if (simState == 5) {
            atomicReference.set(telephonyManager.getSimOperator());
        } else {
            atomicReference.set(null);
        }
    }

    public final void e() {
        awmd awmdVar;
        Executor executor;
        aont aontVar;
        agrx agrxVar = agso.a;
        wjr wjrVar = this.i;
        if (wjrVar == null || (awmdVar = this.d) == null || (executor = this.c) == null) {
            return;
        }
        d();
        String str = (String) this.g.get();
        if (str != null) {
            vyo vyoVar = this.e;
            if (vyoVar == null || vyoVar.b() == null) {
                aontVar = aont.a;
            } else {
                anew anewVar = vyoVar.b().j;
                if (anewVar == null) {
                    anewVar = anew.a;
                }
                aontVar = anewVar.i;
                if (aontVar == null) {
                    aontVar = aont.a;
                }
            }
            Iterator it = aontVar.b.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((aons) it.next()).b.iterator();
                while (it2.hasNext()) {
                    if (((String) it2.next()).equals(str)) {
                        if (this.j == null) {
                            this.j = (xpl) awmdVar.io();
                        }
                        ahng.x(this.j.l(), new hhi(this, new vlh(wjrVar, str), 10, null), executor);
                        return;
                    }
                }
            }
        }
        this.b.set(null);
    }

    public final void f() {
        Executor executor;
        agrx agrxVar = agso.a;
        if (!g() || (executor = this.c) == null) {
            e();
        } else {
            executor.execute(afwl.i(new vlj(this, 2)));
        }
    }

    @tcc
    public void handleConnectivityChangedEvent(tfn tfnVar) {
        agrx agrxVar = agso.a;
        if (!tfnVar.a) {
            this.b.set(null);
            this.g.set(null);
        } else if (this.h.j(0)) {
            f();
        } else {
            this.b.set(null);
            c();
        }
    }
}
