package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dn {
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    public String m;
    public int n;
    public CharSequence o;
    int p;
    CharSequence q;
    ArrayList r;
    ArrayList s;
    ArrayList u;
    final ArrayList e = new ArrayList();
    boolean l = true;
    boolean t = false;

    public abstract void e();

    public abstract void f();

    public void g(int i, cc ccVar, String str, int i2) {
        throw null;
    }

    public boolean j() {
        throw null;
    }

    public void k(cc ccVar) {
        throw null;
    }

    public void l(cc ccVar) {
        throw null;
    }

    public void m(cc ccVar) {
        throw null;
    }

    final void n(dm dmVar) {
        this.e.add(dmVar);
        dmVar.d = this.f;
        dmVar.e = this.g;
        dmVar.f = this.h;
        dmVar.g = this.i;
    }

    public final void o(String str) {
        if (!this.l) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.k = true;
        this.m = str;
    }

    public final void p() {
        if (this.k) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.l = false;
    }

    public final void q(int i, cc ccVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        g(i, ccVar, str, 2);
    }

    public final void r() {
        this.t = true;
    }

    public final void s(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.h = 0;
        this.i = i3;
    }
}
