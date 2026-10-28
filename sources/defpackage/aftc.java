package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aftc {
    public afvl a;
    public boolean b;
    public afvl c;
    public boolean d;
    public afvn e;
    private final cf f;
    private final Context g;
    private afvl h;
    private boolean i;
    private boolean j;
    private afvn k;
    private afvn l;

    public aftc(cf cfVar, Context context) {
        this.f = cfVar;
        this.g = context;
    }

    private final afuy A(afuy afuyVar) {
        afuy afuyVarE = afuy.e(afuyVar, afuy.d(((afvv) atqp.a(this.g, afvv.class)).bo()));
        afuyVarE.getClass();
        return afuyVarE;
    }

    private final String B(String str) {
        return str + ' ' + this.g.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void C(String str, String str2, Intent intent) {
        afuy afuyVarA;
        aftx aftxVar = afty.d;
        this.c = ((afvh) aftxVar.get()).c;
        long j = afwl.a;
        afvl afvlVarQ = afwl.q(intent);
        afuy afuyVar = afvf.a;
        afuw afuwVarC = afux.a.c();
        afuwVarC.a(afvf.c, new afsz());
        afuy afuyVarF = ((afuy) afuwVarC).f();
        if (afvlVarQ != null) {
            afty.e((afvh) aftxVar.get(), afvlVarQ);
            this.a = afvlVarQ;
            afuyVar.getClass();
            afuyVarA = A(afuyVar);
        } else {
            afvl afvlVar = this.a;
            if (afvlVar != null) {
                afty.e((afvh) aftxVar.get(), afvlVar);
                afuyVar.getClass();
                afuyVarA = A(afuyVar);
            } else {
                this.j = afty.p();
                if (ahno.aD()) {
                    afvl afvlVar2 = afty.k;
                    if (afvlVar2 != null) {
                        afty.k = null;
                    } else {
                        afvlVar2 = null;
                    }
                    if (afvlVar2 != null) {
                        this.k = afvlVar2;
                        afty.e((afvh) aftxVar.get(), afvlVar2);
                        this.l = afwt.d(156, B(str), afuy.e(afuyVarF, afvf.a(afve.h)), true);
                    } else {
                        afvq afvqVarAs = ((afvu) aguu.av(this.g, afvu.class)).as();
                        String strB = B(str);
                        afuy afuyVarE = afuy.e(afuyVar, afvf.a(afve.h));
                        afuyVarE.getClass();
                        this.k = afvqVarAs.b(155, strB, afuyVarE);
                    }
                }
                afuyVar.getClass();
                afuyVarA = A(afuyVar);
                this.a = ((afvh) aftxVar.get()).c;
            }
        }
        this.e = afwt.d(154, B(str2), afuy.e(afuyVarA, afvf.a(afve.b)), true);
        qpj.a().post(new acem(this, 13));
    }

    private final void D() {
        if (this.i) {
            this.a = null;
            this.i = false;
        }
    }

    private final void E() {
        afvl afvlVar = this.h;
        if (afvlVar != null) {
            this.a = afvlVar;
            this.h = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [afvl, afvn] */
    private final void F() {
        ?? r1;
        if (this.b) {
            return;
        }
        synchronized (afwl.c) {
            r1 = afwl.d;
            afwl.d = null;
        }
        if (r1 != 0) {
            this.b = true;
            this.a = r1;
        }
    }

    private final void G() {
        afvn afvnVar = this.e;
        if (afvnVar == null) {
            return;
        }
        Objects.toString(afvnVar);
        throw new IllegalStateException("Expected lifecycleStepSpan to be null but was: ".concat(afvnVar.toString()));
    }

    public final afvn a() {
        afuy afuyVar = aftg.a;
        afvn afvnVarN = n("finish", aftg.a);
        afvl afvlVarB = afty.b();
        this.h = afvlVarB;
        afvlVarB.getClass();
        synchronized (afwl.c) {
            afwl.d = afvlVarB;
        }
        return new afsy(afvnVarN, new afta((afvn) afvlVarB, 2), 1);
    }

    public final afvn b() {
        G();
        return n("onAttachedToWindow", null);
    }

    public final afvn c() {
        G();
        return new afsy(n("Back pressed", null), afty.h(), 2);
    }

    public final afvn d() {
        E();
        r("onDestroy", afvf.a(afve.g));
        return new afta(this, 0);
    }

    public final afvn e(Intent intent) {
        intent.getClass();
        C("Reintenting into", "onNewIntent", intent);
        return new aftb(this, 1);
    }

    public final afvn f() {
        E();
        r("onPause", afvf.a(afve.e));
        return new afta(this, 1);
    }

    public final afvn g() {
        aftx aftxVar = afty.d;
        this.c = ((afvh) aftxVar.get()).c;
        afty.e((afvh) aftxVar.get(), this.a);
        return new aftq(n("onPostResume", null), this, 1);
    }

    public final afvn h() {
        D();
        afuy afuyVar = afux.a;
        afuyVar.getClass();
        r("onRestart", afuyVar);
        return new aftb(this, 1);
    }

    public final afvn i() {
        D();
        F();
        r("onResume", afvf.a(afve.d));
        return new aftb(this, 1);
    }

    public final afvn j() {
        D();
        F();
        r("onStart", afvf.a(afve.c));
        return new aftb(this, 1);
    }

    public final afvn k() {
        E();
        r("onStop", afvf.a(afve.f));
        return new afta(this, 1);
    }

    public final afvn l() {
        G();
        return n("onSupportNavigateUp", null);
    }

    public final afvn m() {
        G();
        return n("onUserInteraction", null);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    public final afvn n(String str, afuy afuyVar) {
        if (afty.o()) {
            if (afuyVar == null) {
                afuyVar = afux.a;
            }
            afuyVar.getClass();
            return afwt.d(162, str, A(afuyVar), true);
        }
        afvq afvqVarAs = ((afvs) atqp.a(this.g, afvs.class)).as();
        afvqVarAs.getClass();
        if (afuyVar == null) {
            return afvqVarAs.d(str, 160);
        }
        Object obj = afvqVarAs.d;
        afuy afuyVarE = afuy.e((afuy) afvqVarAs.b.io(), afuyVar);
        afuyVarE.getClass();
        return ((afwd) obj).b(str, afuyVarE, 161);
    }

    public final void o() {
        dd supportFragmentManager = this.f.getSupportFragmentManager();
        if (supportFragmentManager != null) {
            supportFragmentManager.n(new afvp(((afvs) atqp.a(this.g, afvs.class)).as()));
        }
    }

    public final void p(boa boaVar) {
        boaVar.getClass();
        bnz bnzVar = boa.Companion;
        int iOrdinal = boaVar.ordinal();
        if (iOrdinal == 0) {
            if (this.d) {
                s();
                this.d = false;
                return;
            }
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            s();
        } else {
            Objects.toString(boaVar);
            throw new UnsupportedOperationException("Unknown lifecycle: ".concat(boaVar.toString()));
        }
    }

    public final void q() {
        this.i = true;
        cf cfVar = this.f;
        if (cfVar.isChangingConfigurations() || cfVar.isFinishing()) {
            return;
        }
        this.a = null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    public final void r(String str, afuy afuyVar) {
        aftx aftxVar = afty.d;
        this.c = ((afvh) aftxVar.get()).c;
        afuy afuyVarE = afuy.e(afvf.a, afuyVar);
        afvl afvlVar = this.a;
        if (afvlVar != null) {
            afty.e((afvh) aftxVar.get(), afvlVar);
            afuyVarE.getClass();
            afuyVarE = A(afuyVarE);
        } else {
            this.j = afty.p();
            if (afty.o()) {
                afuyVarE.getClass();
                afuyVarE = A(afuyVarE);
            } else {
                Context context = this.g;
                afvq afvqVarAs = ((afvs) atqp.a(context, afvs.class)).as();
                afuyVarE.getClass();
                Class<?> cls = context.getClass();
                cls.getClass();
                String str2 = cls.getSimpleName() + ": " + str;
                Object obj = afvqVarAs.d;
                afuy afuyVarE2 = afuy.e((afuy) afvqVarAs.b.io(), afuyVarE);
                afuyVarE2.getClass();
                int i = afvqVarAs.a;
                this.k = ((afwd) obj).b(str2, afuyVarE2, 159);
            }
            this.a = ((afvh) aftxVar.get()).c;
        }
        this.e = afwt.d(158, B(str), afuyVarE, true);
    }

    public final void s() {
        afvn afvnVar = this.e;
        if (afvnVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        afvnVar.close();
        this.e = null;
        if (this.j) {
            this.j = false;
            afty.k();
        }
        afvn afvnVar2 = this.l;
        if (afvnVar2 != null) {
            afvnVar2.close();
        }
        this.l = null;
        afvn afvnVar3 = this.k;
        if (afvnVar3 != null) {
            afvnVar3.close();
        }
        this.k = null;
        afty.e((afvh) afty.d.get(), this.c);
        this.c = null;
    }

    public final afvn t() {
        G();
        D();
        F();
        if (this.a == null) {
            return n("onActivityResult", null);
        }
        afvl afvlVarB = afty.b();
        afty.d(this.a);
        return new afsy(n("onActivityResult", null), afvlVarB, 0);
    }

    public final afvn u() {
        F();
        Intent intent = this.f.getIntent();
        intent.getClass();
        C("Intenting into", "onCreate", intent);
        return new aftb(this, 1);
    }

    public final afvn v() {
        afty.t();
        aftu aftuVar = new aftu(1);
        if (afty.o()) {
            return aftuVar;
        }
        Context context = this.g;
        afvq afvqVarAs = ((afvs) atqp.a(context, afvs.class)).as();
        Class<?> cls = context.getClass();
        cls.getClass();
        return new aftb(afvqVarAs.d(String.valueOf(cls.getSimpleName()).concat(": onCreatePanelMenu"), 157), 0);
    }

    public final afvn w() {
        G();
        return n("onOptionsItemSelected", null);
    }

    public final afvn x() {
        G();
        return n("onPictureInPictureModeChanged", null);
    }

    public final afvn y() {
        D();
        afuy afuyVar = afux.a;
        afuyVar.getClass();
        r("onPostCreate", afuyVar);
        return new aftb(this, 1);
    }

    public final afvn z() {
        afuy afuyVar = afux.a;
        afuyVar.getClass();
        r("onSaveInstanceState", afuyVar);
        return new afta(this, 1);
    }
}
