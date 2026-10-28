package defpackage;

import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aefk implements aeen {
    public View a;
    public CharSequence b;
    public CharSequence c;
    public ajnf d;
    public ajnf e;
    public akrn f;
    public String g;
    public aeem h;
    public aefq i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private float q;
    private Optional r;
    private Optional s;
    private Optional t;
    private short u;

    public aefk(aefl aeflVar) {
        this();
        this.r = Optional.empty();
        this.s = Optional.empty();
        this.t = Optional.empty();
        this.j = aeflVar.a;
        this.k = aeflVar.b;
        this.a = aeflVar.c;
        this.b = aeflVar.d;
        this.c = aeflVar.e;
        this.d = aeflVar.f;
        this.e = aeflVar.g;
        this.f = aeflVar.h;
        this.g = aeflVar.i;
        this.l = aeflVar.j;
        this.m = aeflVar.k;
        this.n = aeflVar.l;
        this.o = aeflVar.m;
        this.p = aeflVar.n;
        this.q = aeflVar.o;
        this.r = aeflVar.p;
        this.s = aeflVar.q;
        this.t = aeflVar.r;
        this.h = aeflVar.s;
        this.i = aeflVar.t;
        this.u = (short) 511;
    }

    public final aefk a(ajnf ajnfVar) {
        aefk aefkVarQ = q();
        aefkVarQ.d = ajnfVar;
        return aefkVarQ;
    }

    public final aefk b(ajnf ajnfVar) {
        aefk aefkVarR = r();
        aefkVarR.e = ajnfVar;
        return aefkVarR;
    }

    public final aefl c() {
        if (this.u == 511) {
            return new aefl(this.j, this.k, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.u & 1) == 0) {
            sb.append(" counterfactual");
        }
        if ((this.u & 2) == 0) {
            sb.append(" duration");
        }
        if ((this.u & 4) == 0) {
            sb.append(" rateLimited");
        }
        if ((this.u & 8) == 0) {
            sb.append(" tapDismissalType");
        }
        if ((this.u & 16) == 0) {
            sb.append(" tapConsumeStrategy");
        }
        if ((this.u & 32) == 0) {
            sb.append(" targetEffectType");
        }
        if ((this.u & 64) == 0) {
            sb.append(" placement");
        }
        if ((this.u & 128) == 0) {
            sb.append(" alignment");
        }
        if ((this.u & 256) == 0) {
            sb.append(" maxWidthPercentage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null acceptFeedbackOnTargetTapEnabled");
        }
        this.s = optional;
    }

    public final void e(int i) {
        this.p = i;
        this.u = (short) (this.u | 128);
    }

    public final void f(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null backgroundColor");
        }
        this.r = optional;
    }

    public final void g(boolean z) {
        this.j = z;
        this.u = (short) (this.u | 1);
    }

    public final void h(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null disableDismissalOnTargetViewChanges");
        }
        this.t = optional;
    }

    @Override // defpackage.aeen
    public final /* bridge */ /* synthetic */ void i(int i) {
        throw null;
    }

    public final void j(int i) {
        this.k = i;
        this.u = (short) (this.u | 2);
    }

    public final void k(float f) {
        this.q = f;
        this.u = (short) (this.u | 256);
    }

    public final void l(int i) {
        this.o = i;
        this.u = (short) (this.u | 64);
    }

    public final void m() {
        this.u = (short) (this.u | 4);
    }

    public final void n(int i) {
        this.m = i;
        this.u = (short) (this.u | 16);
    }

    public final void o(int i) {
        this.l = i;
        this.u = (short) (this.u | 8);
    }

    public final void p(int i) {
        this.n = i;
        this.u = (short) (this.u | 32);
    }

    protected final /* synthetic */ aefk q() {
        return this;
    }

    protected final /* synthetic */ aefk r() {
        return this;
    }

    public aefk(byte[] bArr) {
        this();
        this.r = Optional.empty();
        this.s = Optional.empty();
        this.t = Optional.empty();
    }

    public aefk() {
    }
}
