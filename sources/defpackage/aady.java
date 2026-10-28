package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aady implements aaqt {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideosStore");
    private static final long q;
    public final mbc b;
    public final String c;
    public final awmd d;
    public final awmd e;
    public final awmd f;
    public final Executor g;
    public final awmd h;
    public final awmd i;
    public final awmd j;
    public final avlr k;
    public final aadx l = new aadx(this);
    public final boolean m;
    public final aado n;
    public final vxz o;
    public final ci p;
    private final Executor r;
    private final boolean s;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        q = 2592000L;
    }

    public aady(mbc mbcVar, String str, awmd awmdVar, awmd awmdVar2, ci ciVar, awmd awmdVar3, aado aadoVar, Executor executor, Executor executor2, afip afipVar, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, avlr avlrVar, vxz vxzVar, aauk aaukVar) {
        this.b = mbcVar;
        this.c = str;
        this.d = awmdVar;
        this.e = awmdVar2;
        this.p = ciVar;
        this.f = awmdVar3;
        this.n = aadoVar;
        this.g = executor;
        this.r = executor2;
        this.h = awmdVar4;
        this.i = awmdVar5;
        this.j = awmdVar6;
        this.k = avlrVar;
        this.o = vxzVar;
        this.m = aaukVar.H();
        this.s = aaukVar.A();
        afipVar.O(new aaet(this, 1));
    }

    private final boolean v(boolean z) {
        aado aadoVar = this.n;
        if (z) {
            return aadoVar.C();
        }
        aadoVar.p().isDone();
        return true;
    }

    @Override // defpackage.aaqt
    public final /* synthetic */ aamt a(String str) {
        return b(str, true);
    }

    @Override // defpackage.aaqt
    public final aamt b(String str, boolean z) {
        if (v(z)) {
            return ((aaew) this.h.io()).f(str);
        }
        return null;
    }

    @Override // defpackage.aaqt
    public final ListenableFuture c() {
        return ahno.aq(new iud(this, 13), this.r);
    }

    @Override // defpackage.aaqt
    public final ListenableFuture d() {
        return afxd.f(this.n.p()).g(new vzs(this, 9), this.r).b(aais.class, new wvk(12), MoreExecutors.directExecutor());
    }

    @Override // defpackage.aaqt
    public final ListenableFuture e(String str) {
        return afxd.f(this.n.p()).g(new aaat(this, str, 3, null), this.s ? MoreExecutors.directExecutor() : this.r).b(aais.class, new xwx(15), MoreExecutors.directExecutor());
    }

    @Override // defpackage.aaqt
    public final ListenableFuture f() {
        return afxd.f(this.n.p()).g(new vzs(this, 10), this.r).b(aais.class, new wvk(13), MoreExecutors.directExecutor());
    }

    @Override // defpackage.aaqt
    public final ListenableFuture g() {
        return this.n.p();
    }

    @Override // defpackage.aaqt
    public final /* synthetic */ Collection h() {
        return s();
    }

    final Set i(List list) {
        aamt aamtVarB;
        taq.c();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aamo aamoVar = (aamo) it.next();
            if (!((aaew) this.h.io()).as(aamoVar.d()) && ((aamtVarB = b(aamoVar.d(), true)) == null || aamtVarB.j() || ((aamtVarB.l() && aamtVarB.o()) || aamtVarB.t()))) {
                hashSet.add(aamoVar.d());
            }
        }
        return hashSet;
    }

    final void j() {
        this.n.y(new aahv());
    }

    final void k(String str) {
        aamt aamtVarB = b(str, true);
        if (aamtVarB != null) {
            q(aamtVarB);
            this.n.y(new aaht(aamtVarB));
        }
    }

    public final void l(String str) {
        this.n.y(new aaia(str));
        ((aaqx) this.j.io()).f(s().size());
    }

    final void m(String str) {
        n(str, aogv.UNKNOWN_FAILURE_REASON);
    }

    public final void n(String str, aogv aogvVar) {
        aamt aamtVarB = b(str, true);
        if (aamtVarB != null) {
            String.valueOf(aamtVarB.n);
            this.n.y(new aaif(aamtVarB, aogvVar));
        }
    }

    public final void o(aamu aamuVar) {
        int i = aamuVar.b;
        int i2 = aamuVar.a;
        int i3 = aamuVar.c;
        this.n.y(new aaih(aamuVar));
    }

    @Override // defpackage.aaqt
    public final void p(String str, boolean z) {
        k(str);
        j();
        if (z) {
            aaqx aaqxVar = (aaqx) this.j.io();
            aaqxVar.f(s().size());
            aaqz aaqzVarB = aaqxVar.b();
            aaqzVarB.b(str);
            o(aaqzVarB.a());
        }
    }

    final void q(aamt aamtVar) {
        aams aamsVar = aamtVar.m;
        if (aamsVar != null) {
            mbc mbcVar = this.b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long jMin = Math.min(Math.max((aamsVar.a() - mbcVar.f().toEpochMilli()) / 1000, 0L), q) + 1;
            aado aadoVar = this.n;
            aadoVar.j.schedule(new aadi(aadoVar, new aadw(this, aamsVar.b, 1), 5), jMin, TimeUnit.SECONDS);
        }
    }

    @Override // defpackage.aaqt
    public final void r(String str, long j) {
        this.g.execute(new laz(this, str, j, 13));
    }

    @Override // defpackage.aaqt
    public final Collection s() {
        return !v(true) ? agpi.a : ((aaew) this.h.io()).l();
    }

    @Override // defpackage.aaqt
    public final void t(String str, aoen aoenVar) {
        this.n.u(new yag((Object) this, (Object) str, (Object) aoenVar, 20, (char[]) null));
    }

    public final void u(String str, aoen aoenVar) {
        taq.c();
        aaew aaewVar = (aaew) this.h.io();
        if (!aaewVar.x(str, 1, aoenVar)) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideosStore", "removeVideoInBackground", 1243, "DefaultOfflineVideosStore.java")).w("Failed removing video %s from database", str);
        } else {
            l(str);
            aaewVar.n(str);
        }
    }
}
