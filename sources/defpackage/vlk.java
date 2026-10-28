package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vlk implements vlo {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/dataplan/DefaultMobileDataPlanInfoProvider2");
    public final aunn b;
    public final vyo c;
    public final AtomicReference d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    private final Executor f;
    private final aunn g;
    private final agfr h;
    private final aunn i;

    public vlk(aunn aunnVar, Executor executor, aunn aunnVar2, vyo vyoVar, Context context, aunn aunnVar3) {
        this.b = aunnVar;
        this.f = executor;
        this.g = aunnVar2;
        this.c = vyoVar;
        this.i = aunnVar3;
        this.h = aguu.al(new tar(context, 3));
        ahno.av(vyoVar.a()).m(new vlj(this, 3), executor);
    }

    private final boolean e() {
        vyo vyoVar = this.c;
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
        return (vli) this.d.get();
    }

    @Override // defpackage.vlo
    public final String b() {
        return (String) this.e.get();
    }

    public final void c() {
        TelephonyManager telephonyManager = (TelephonyManager) this.h.io();
        int simState = telephonyManager.getSimState();
        AtomicReference atomicReference = this.e;
        if (simState == 5) {
            atomicReference.set(telephonyManager.getSimOperator());
        } else {
            atomicReference.set(null);
        }
    }

    public final void d() {
        aunn aunnVar;
        aont aontVar;
        agrx agrxVar = agso.a;
        aunn aunnVar2 = this.i;
        if (aunnVar2 == null || (aunnVar = this.g) == null) {
            return;
        }
        c();
        String str = (String) this.e.get();
        if (str != null) {
            vyo vyoVar = this.c;
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
                        ahno.at(((xpl) aunnVar.io()).l(), new hhi(this, new vlh((wjr) aunnVar2.io(), str), 11, null), this.f);
                        return;
                    }
                }
            }
        }
        this.d.set(null);
    }

    @tcc
    public void handleConnectivityChangedEvent(tfn tfnVar) {
        Executor executor;
        Executor executor2;
        agrx agrxVar = agso.a;
        if (!tfnVar.a) {
            this.d.set(null);
            this.e.set(null);
            return;
        }
        if (((tfq) this.b.io()).j(0)) {
            if (!e() || (executor = this.f) == null) {
                d();
                return;
            } else {
                executor.execute(afwl.i(new vlj(this, 4)));
                return;
            }
        }
        this.d.set(null);
        if (!e() || (executor2 = this.f) == null) {
            c();
        } else {
            executor2.execute(afwl.i(new vlj(this, 5)));
        }
    }
}
