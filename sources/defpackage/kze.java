package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kze extends kzg {
    private final ldr a;
    private final ler b;

    public kze(ldr ldrVar) {
        kro.l(ldrVar);
        this.a = ldrVar;
        this.b = ldrVar.i();
    }

    @Override // defpackage.les
    public final int a(String str) {
        kro.i(str);
        return 25;
    }

    @Override // defpackage.les
    public final long b() {
        return this.a.l().s();
    }

    @Override // defpackage.les
    public final String c() {
        return this.b.u();
    }

    @Override // defpackage.les
    public final String d() {
        return this.b.v();
    }

    @Override // defpackage.les
    public final String e() {
        return this.b.w();
    }

    @Override // defpackage.les
    public final String f() {
        return this.b.x();
    }

    @Override // defpackage.les
    public final List g(String str, String str2) {
        ler lerVar = this.b;
        if (lerVar.aU().l()) {
            lerVar.aT().c.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (a.x()) {
            lerVar.aT().c.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        lerVar.t.aU().a(atomicReference, 5000L, "get conditional user properties", new aew(lerVar, atomicReference, str, str2, 15));
        List list = (List) atomicReference.get();
        if (list != null) {
            return lga.D(list);
        }
        lerVar.aT().c.b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    @Override // defpackage.les
    public final Map h(String str, String str2, boolean z) {
        ler lerVar = this.b;
        if (lerVar.aU().l()) {
            lerVar.aT().c.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (a.x()) {
            lerVar.aT().c.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        lerVar.t.aU().a(atomicReference, 5000L, "get user properties", new lbe(lerVar, atomicReference, str, str2, z, 2));
        List<lfy> list = (List) atomicReference.get();
        if (list == null) {
            lerVar.aT().c.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        afv afvVar = new afv(list.size());
        for (lfy lfyVar : list) {
            Object objA = lfyVar.a();
            if (objA != null) {
                afvVar.put(lfyVar.b, objA);
            }
        }
        return afvVar;
    }

    @Override // defpackage.les
    public final void i(String str) {
        ldr ldrVar = this.a;
        lba lbaVarC = ldrVar.c();
        ksr ksrVar = ldrVar.x;
        lbaVarC.a(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.les
    public final void j(String str, String str2, Bundle bundle) {
        this.a.i().A(str, str2, bundle);
    }

    @Override // defpackage.les
    public final void k(String str) {
        ldr ldrVar = this.a;
        lba lbaVarC = ldrVar.c();
        ksr ksrVar = ldrVar.x;
        lbaVarC.b(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.les
    public final void l(String str, String str2, Bundle bundle) {
        this.b.E(str, str2, bundle);
    }

    @Override // defpackage.les
    public final void m(Bundle bundle) {
        ler lerVar = this.b;
        lerVar.aV();
        lerVar.W(bundle, System.currentTimeMillis());
    }
}
