package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aald implements aahd {
    public final hwz a;
    private final awmd b;
    private final Executor c;
    private final awmd d;
    private final awmd e;
    private final aauk f;
    private final awkv g = new awkx();
    private boolean h;
    private final boolean i;

    public aald(awmd awmdVar, Executor executor, awmd awmdVar2, awmd awmdVar3, hwz hwzVar, aauk aaukVar) {
        this.b = awmdVar;
        this.c = executor;
        this.d = awmdVar2;
        this.e = awmdVar3;
        this.a = hwzVar;
        this.f = aaukVar;
        this.i = aaukVar.A();
    }

    public static final agke e(int i) {
        agjz agjzVar = new agjz(4);
        for (int i2 = 0; i2 < i; i2++) {
            agjzVar.h(Optional.empty());
        }
        return agjzVar.g();
    }

    private final void f(String str, aahc aahcVar) {
        aaha aahaVarE = aahb.e();
        aahaVarE.b(str);
        aahaVarE.c(76);
        aahaVarE.a = aahcVar;
        this.g.kk(aahaVarE.a());
    }

    @Override // defpackage.aahd
    public final ListenableFuture a(zwa zwaVar, List list) {
        if (this.f.K()) {
            wcn wcnVarB = ((wco) this.d.io()).b(zwaVar);
            ArrayList arrayList = new ArrayList();
            Collection.EL.stream(list).forEach(new aalb(arrayList, wcnVarB, 0));
            return ahno.ar(tzk.b(avlh.B(arrayList).j(new aalc(1)).H(new aalc(0)).ai().w(new yrb(list, 7))), new aakt(4), this.c);
        }
        if (!zwaVar.h()) {
            awmd awmdVar = this.b;
            if (((aanb) awmdVar.io()).b().s().equals(zwaVar.k())) {
                if (this.i) {
                    aaqt aaqtVarL = ((aanb) awmdVar.io()).b().l();
                    return afxd.f(aaqtVarL.g()).g(new hco(this, list, aaqtVarL, 16, (char[]) null), this.c).b(aais.class, new aagw(list, 10), MoreExecutors.directExecutor());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ahno.ar(((aanb) awmdVar.io()).b().l().e((String) it.next()), new aagw(this, 11), this.c));
                }
                return ahno.au(arrayList2).k(new wko(arrayList2, 17), this.c);
            }
        }
        return ahng.n(e(list.size()));
    }

    @Override // defpackage.aahd
    public final ListenableFuture b(zwa zwaVar, String str) {
        if (this.f.K()) {
            return ahno.ar(tzk.e(((wco) this.d.io()).b(zwaVar).g(wfs.g(76, str)).g(aret.class).t()), new aakt(3), this.c);
        }
        if (!zwaVar.h()) {
            awmd awmdVar = this.b;
            if (((aanb) awmdVar.io()).b().s().equals(zwaVar.k())) {
                return ahno.ar(((aanb) awmdVar.io()).b().l().e(str), new aagw(this, 9), this.c);
            }
        }
        return ahng.n(Optional.empty());
    }

    @Override // defpackage.aahd
    public final avlr c(zwa zwaVar) {
        if (this.f.K()) {
            return ((wco) this.d.io()).b(zwaVar).i(aret.class).K(new xdx(20));
        }
        if (!this.h) {
            ((tbt) this.e.io()).f(this);
            this.h = true;
        }
        return this.g.aI().N().ag();
    }

    public final ListenableFuture d(zwa zwaVar) {
        if (this.f.K()) {
            wcn wcnVarB = ((wco) this.d.io()).b(zwaVar);
            awas awasVar = new awas(wcnVarB.q(76).k().D(new xdx(18), false, Alert.DURATION_SHOW_INDEFINITELY), new yrb(wcnVarB, 6));
            avnn avnnVar = atqp.l;
            return ahno.ar(tzk.b(awasVar.K(new xdx(19)).as()), new aakt(4), this.c);
        }
        if (!zwaVar.h()) {
            awmd awmdVar = this.b;
            if (((aanb) awmdVar.io()).b().s().equals(zwaVar.k())) {
                return ahno.ar(((aanb) awmdVar.io()).b().l().f(), new aagw(this, 12), this.c);
            }
        }
        return ahng.n(agpi.a);
    }

    @tcc
    public void handleOfflineVideoCompleteEvent(aahz aahzVar) {
        f(aahzVar.a.b(), aahc.e);
    }

    @tcc
    public void handleOfflineVideoDeleteEvent(aaia aaiaVar) {
        f(aaiaVar.a, aahc.g);
    }
}
