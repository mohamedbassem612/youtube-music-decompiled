package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmx extends absg {
    public jmo a;
    private final zwb j;
    private final awmd k;

    public jmx(Context context, zwb zwbVar, awmd awmdVar, absl abslVar) {
        super(context, abslVar);
        this.j = zwbVar;
        this.k = awmdVar;
        f();
    }

    @Override // defpackage.absg
    protected final zwa b() {
        return this.j.e();
    }

    @Override // defpackage.absg
    protected final void c(alvl alvlVar, sxu sxuVar, String str) {
        absi absiVarJ = j();
        if (absiVarJ == null || absiVarJ.a() == null) {
            absh.a(sxuVar, h(alvlVar, str));
        } else {
            ((rql) this.k.io()).d(absiVarJ.a(), new jmw(this, alvlVar, sxuVar, str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    @Override // defpackage.absg
    public final void d(alvl alvlVar, sxu sxuVar, String str) {
        akdd akddVar;
        if ((alvlVar.b & 64) == 0) {
            akddVar = null;
        } else {
            alvk alvkVar = alvlVar.h;
            if (alvkVar == null) {
                alvkVar = alvk.a;
            }
            if (alvkVar.b == 64099105) {
                alvk alvkVar2 = alvlVar.h;
                if (alvkVar2 == null) {
                    alvkVar2 = alvk.a;
                }
                akddVar = alvkVar2.b == 64099105 ? (akdd) alvkVar2.c : akdd.a;
            } else {
                akddVar = null;
            }
        }
        jmo jmoVar = this.a;
        if (jmoVar == null || akddVar == null) {
            super.d(alvlVar, sxuVar, str);
            return;
        }
        jmoVar.d = akddVar;
        jmv jmvVar = new jmv(this, alvlVar, sxuVar, str);
        if (jmoVar.d != null) {
            xgm xgmVar = jmoVar.c;
            xgmVar.hB().d(new xgj(jmoVar.d.m, (amud) null));
            jmoVar.e = acwl.i(jmoVar.a, jmoVar.d, jmoVar.b, xgmVar.hB(), jmoVar.f, false, false, new jmn(jmoVar, jmvVar), null, null, null, null, false);
        }
        r(jmoVar);
    }

    @Override // defpackage.absg
    public final void e() {
        p();
    }

    public final void f() {
        this.e = k();
        q(false);
    }

    @Override // defpackage.absg
    protected final boolean g() {
        return this.j.u();
    }

    @tcc
    public void onSignIn(zwt zwtVar) {
        f();
    }

    @tcc
    public void onSignOut(zwu zwuVar) {
        f();
    }
}
