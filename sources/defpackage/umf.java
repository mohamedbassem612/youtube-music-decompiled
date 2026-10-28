package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Size;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class umf extends uhv implements uxm {
    public static final agrf b = agrf.h("com/google/android/libraries/youtube/creation/editor/ShortsVideoEffectsController");
    public final DisplayMetrics c;
    public final awly d;
    public final awly e;
    public ume f;
    public final ujl g;
    public final aaok h;
    private final avmb i;
    private final ukp j;
    private final awmd k;
    private final awly l;
    private final avmm m;
    private final avmm n;
    private final qcb o;

    public umf(cc ccVar, Executor executor, avmb avmbVar, ukp ukpVar, awmd awmdVar, qcb qcbVar, aaok aaokVar) {
        super(ccVar, true);
        this.c = ccVar.getResources().getDisplayMetrics();
        this.i = avmbVar;
        this.g = new ujl(executor);
        this.j = ukpVar;
        this.k = awmdVar;
        this.o = qcbVar;
        this.h = aaokVar;
        this.m = new avmm();
        this.n = new avmm();
        Boolean bool = Boolean.TRUE;
        this.d = new awli(bool).az();
        this.e = new awli(bool).az();
        this.l = new awli(Boolean.FALSE).az();
        this.f = new ume(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    private final void r() {
        Optional optional = this.f.f;
        uhe uheVar = new uhe(this, 11);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            uql uqlVar = (uql) obj;
            umf umfVar = (umf) uheVar.a;
            uqlVar.l.i(umfVar.g);
            uqlVar.g.j.i(obj);
            ume umeVar = umfVar.f;
            Optional.empty();
            Optional.empty();
            Optional.empty();
            Optional.empty();
            Optional.empty();
            Optional.empty();
            umfVar.f = new ume(umeVar.a, umeVar.b, umeVar.c, umeVar.d, umeVar.e, Optional.empty());
        }
        this.m.b();
        this.l.kk(Boolean.FALSE);
    }

    @Override // defpackage.uhv
    public final void g() {
        this.n.c(this.j.d().O(this.i).K(new ugm(this, 4)).ag(new jeh(20), new vqe(1)));
    }

    @Override // defpackage.uhv
    public final void iX() {
        this.n.b();
        if (this.h.S()) {
            return;
        }
        r();
    }

    public final Optional l(long j) {
        Optional optional = this.f.f;
        umd umdVar = new umd(j, 0);
        if (true != optional.isPresent()) {
            return optional;
        }
        Object obj = optional.get();
        long j2 = umdVar.a;
        uql uqlVar = (uql) obj;
        if (!uqlVar.n.H()) {
            return Optional.empty();
        }
        Optional optionalE = uqlVar.f.e(j2);
        sla slaVar = new sla(obj, 13);
        if (true != optionalE.isPresent()) {
            return optionalE;
        }
        Object obj2 = optionalE.get();
        return ((uql) slaVar.a).e((augy) obj2);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, uxi] */
    public final void m(uxi uxiVar) {
        Optional optional = this.f.f;
        uhe uheVar = new uhe(uxiVar, 9);
        if (true == optional.isPresent()) {
            ((uql) optional.get()).f(uheVar.a.a(), true);
        }
    }

    public final boolean n(ume umeVar) {
        ume umeVar2 = this.f;
        Optional optional = umeVar2.b;
        Optional optional2 = umeVar.b;
        if (optional.equals(optional2) && umeVar2.c.equals(umeVar.c) && umeVar2.d.equals(umeVar.d) && umeVar2.e.equals(umeVar.e)) {
            return false;
        }
        r();
        this.f = umeVar;
        Optional optional3 = umeVar.e;
        if (optional3.isPresent() && optional2.isPresent()) {
            Optional optional4 = umeVar.c;
            if (optional4.isPresent()) {
                qcb qcbVar = this.o;
                usd usdVar = (usd) optional3.get();
                optional4.get();
                umeVar.d.get();
                Object obj = optional2.get();
                awmd awmdVar = this.k;
                gif gifVar = (gif) qcbVar.a;
                ght ghtVar = gifVar.a;
                Context context = (Context) ghtVar.v.io();
                gjx gjxVar = gifVar.c;
                zf zfVar = (zf) gjxVar.R.io();
                uql uqlVar = new uql(context, zfVar, gjxVar.S, (aaok) ghtVar.a.iz.io(), gjxVar.T, (Executor) ghtVar.B.io(), (ahey) ghtVar.u.io(), ((ulj) gjxVar.X.io()).k(), ((ulj) gjxVar.X.io()).h(), awmdVar, new zf((Context) gjxVar.a.v.io(), (byte[]) null, (byte[]) null), usdVar, (Size) obj);
                uqlVar.g.j.h(uqlVar);
                uqlVar.l.h(this.g);
                avmm avmmVar = this.m;
                awly awlyVar = uqlVar.i;
                avmb avmbVar = this.i;
                avlr avlrVarO = awlyVar.H().O(avmbVar);
                awly awlyVar2 = this.d;
                awlyVar2.getClass();
                int i = 14;
                avlr avlrVarO2 = uqlVar.j.H().O(avmbVar);
                awly awlyVar3 = this.e;
                awlyVar3.getClass();
                avmmVar.e(avlrVarO.af(new uln(awlyVar2, i)), avlrVarO2.af(new uln(awlyVar3, i)));
                Optional optional5 = this.f.a;
                uhe uheVar = new uhe(uqlVar, 8);
                if (true == optional5.isPresent()) {
                    ((uql) uheVar.a).h((atzv) optional5.get());
                }
                ume umeVar3 = this.f;
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                this.f = new ume(umeVar3.a, umeVar3.b, umeVar3.c, umeVar3.d, umeVar3.e, Optional.of(uqlVar));
                this.l.kk(Boolean.TRUE);
            }
        }
        return true;
    }

    public final void o(uvw uvwVar) {
        this.g.h(uvwVar);
    }

    public final void p(uvw uvwVar) {
        this.g.i(uvwVar);
    }

    public final void q(ahgb ahgbVar) {
        Optional optional = this.f.f;
        uhe uheVar = new uhe(ahgbVar, 10);
        if (true == optional.isPresent()) {
            ((uql) optional.get()).t((ahgb) uheVar.a);
        }
    }
}
