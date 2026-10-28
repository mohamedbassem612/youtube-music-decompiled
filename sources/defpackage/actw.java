package defpackage;

import android.util.SparseBooleanArray;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class actw implements tdj {
    public final actx a;
    public final hno j;
    private final abvk k;
    private final abvn l;
    private final Optional m;
    private final abmt n;
    private final tqj o;
    private int p;
    private final adif r;
    private final adif s;
    public final awly b = new awli().az();
    public final SparseBooleanArray d = new SparseBooleanArray();
    public boolean e = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    private int q = 0;
    public final avmm c = new avmm();

    public actw(abvk abvkVar, abvn abvnVar, actx actxVar, adif adifVar, Optional optional, abmt abmtVar, tqj tqjVar, vwt vwtVar, awmd awmdVar, hno hnoVar, adif adifVar2) {
        this.k = abvkVar;
        this.l = abvnVar;
        this.a = actxVar;
        this.s = adifVar;
        this.m = optional;
        this.n = abmtVar;
        this.o = tqjVar;
        this.j = hnoVar;
        this.r = adifVar2;
        actxVar.i = adifVar;
        vwtVar.y().E(new hmg(actxVar, adifVar, 15, null));
        if (abmtVar.g.l(311, 45740270L, false)) {
            awmdVar.io();
        }
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void a() {
        nsh.b(this);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.c;
    }

    public final int d() {
        int i;
        int i2;
        if (this.j.U()) {
            return this.a.a();
        }
        if (!this.e) {
            return 0;
        }
        this.b.kk(Boolean.TRUE);
        this.k.ap(false, 19);
        SparseBooleanArray sparseBooleanArray = this.d;
        synchronized (sparseBooleanArray) {
            do {
                i = this.p + 1;
                this.p = i;
                if (i == Integer.MAX_VALUE) {
                    this.p = 1;
                    i = 1;
                }
            } while (sparseBooleanArray.get(i));
            sparseBooleanArray.put(this.p, true);
            i2 = this.p;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002d A[Catch: all -> 0x0031, DONT_GENERATE, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x0019, B:12:0x0022, B:14:0x0026, B:16:0x002b, B:18:0x002d), top: B:25:0x0013 }] */
    public final void e(int i) {
        if (this.j.U()) {
            this.a.d(i);
            return;
        }
        SparseBooleanArray sparseBooleanArray = this.d;
        synchronized (sparseBooleanArray) {
            if (i != 0) {
                if (sparseBooleanArray.get(i)) {
                    sparseBooleanArray.delete(i);
                    if (sparseBooleanArray.size() == 0 && this.e) {
                        f();
                    }
                }
            }
            throw th;
        }
    }

    public final void f() {
        hno hnoVar = this.j;
        if (hnoVar.U()) {
            this.a.e();
            return;
        }
        if (hnoVar.U()) {
            if (this.a.f()) {
                return;
            }
        } else if (this.g && this.s.i() == apdw.REEL_LOOP_BEHAVIOR_END_SCREEN) {
            return;
        }
        if (this.h) {
            return;
        }
        this.b.kk(Boolean.FALSE);
        abvk abvkVar = this.k;
        acfw acfwVarI = abvkVar.i();
        wjf wjfVarC = acfwVarI != null ? acfwVarI.c() : null;
        if (wjfVarC != null && wjfVarC.V() && !aawr.y(abvkVar)) {
            abvkVar.af(this.n.j());
        }
        abvkVar.A();
    }

    public final void g(boolean z) {
        if (this.j.U()) {
            this.a.f = z;
        } else {
            this.h = z;
        }
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void gY() {
        nsh.c(this);
    }

    public final void h(boolean z) {
        if (this.j.al()) {
            int i = this.q;
            if (!z) {
                e(i);
                this.q = 0;
            } else if (i == 0) {
                this.q = d();
            }
        }
    }

    public final boolean i() {
        boolean z;
        if (this.j.U()) {
            return this.a.g();
        }
        SparseBooleanArray sparseBooleanArray = this.d;
        synchronized (sparseBooleanArray) {
            z = sparseBooleanArray.size() > 0;
        }
        return z;
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        int i = tqr.a;
        tqj tqjVar = this.o;
        if (tqjVar.a(1073951408) != 0 || tqjVar.k(1073820339)) {
            return;
        }
        this.c.b();
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        int i = tqr.a;
        tqj tqjVar = this.o;
        if (tqjVar.a(1073951408) != 0 || tqjVar.k(1073820339)) {
            return;
        }
        avmm avmmVar = this.c;
        abvn abvnVar = this.l;
        int i2 = 5;
        avmmVar.c(((avlh) abvnVar.r().n).al(new acte(this, 10), new acrr(i2)));
        avmmVar.c(abvnVar.P().al(new acte(this, 11), new acrr(i2)));
        Optional optional = this.m;
        acrj acrjVar = new acrj(this, 4);
        optional.isPresent();
        Object obj = acrjVar.a;
        ((actw) obj).c.c(((ilx) optional.get()).a.af(new acte(obj, 9)));
        if (this.j.U()) {
            avmmVar.c(((avlr) this.r.a).ag(new acte(this, 12), new acrr(i2)));
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
