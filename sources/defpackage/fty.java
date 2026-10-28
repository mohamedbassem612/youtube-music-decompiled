package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fty extends fgv {
    public final fua a;
    final fhd d;

    public fty(fhd fhdVar, fua fuaVar) {
        super(fhdVar, fuaVar);
        this.a = fuaVar;
        this.d = fhdVar;
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fua a() {
        fua fuaVar = this.a;
        fiq fiqVarQ = fuaVar.J;
        if (fiqVarQ == null) {
            fiqVarQ = fua.q(this.d, fuaVar, 1008096338);
        }
        fuaVar.J = fiqVarQ;
        fiq fiqVarQ2 = fuaVar.K;
        if (fiqVarQ2 == null) {
            fiqVarQ2 = fua.q(this.d, fuaVar, -50354224);
        }
        fuaVar.K = fiqVarQ2;
        fiq fiqVarQ3 = fuaVar.L;
        if (fiqVarQ3 == null) {
            fiqVarQ3 = fua.q(this.d, fuaVar, -430503342);
        }
        fuaVar.L = fiqVarQ3;
        fiq fiqVarQ4 = fuaVar.M;
        if (fiqVarQ4 == null) {
            fiqVarQ4 = fua.q(this.d, fuaVar, -1410879082);
        }
        fuaVar.M = fiqVarQ4;
        fiq fiqVarQ5 = fuaVar.N;
        if (fiqVarQ5 == null) {
            fiqVarQ5 = fua.q(this.d, fuaVar, 2092727750);
        }
        fuaVar.N = fiqVarQ5;
        fiq fiqVarQ6 = fuaVar.O;
        if (fiqVarQ6 == null) {
            fiqVarQ6 = fua.q(this.d, fuaVar, -122250828);
        }
        fuaVar.O = fiqVarQ6;
        fiq fiqVarQ7 = fuaVar.P;
        if (fiqVarQ7 == null) {
            fiqVarQ7 = fua.q(this.d, fuaVar, 663828400);
        }
        fuaVar.P = fiqVarQ7;
        fiq fiqVarQ8 = fuaVar.Q;
        if (fiqVarQ8 == null) {
            fiqVarQ8 = fua.q(this.d, fuaVar, -537896591);
        }
        fuaVar.Q = fiqVarQ8;
        return fuaVar;
    }

    public final void c(fip fipVar) {
        this.a.H = fipVar;
    }

    public final void d(TextUtils.TruncateAt truncateAt) {
        this.a.c = truncateAt;
    }

    public final void e(int i) {
        this.a.e = i;
    }

    public final void f(int i) {
        this.a.r = i;
    }

    public final void g(Typeface typeface) {
        this.a.F = typeface;
    }
}
