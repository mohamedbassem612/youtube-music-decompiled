package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class on extends nl {
    boolean k = true;

    public abstract boolean e(oh ohVar);

    public abstract boolean f(oh ohVar, oh ohVar2, int i, int i2, int i3, int i4);

    public abstract boolean g(oh ohVar, int i, int i2, int i3, int i4);

    public abstract boolean h(oh ohVar);

    @Override // defpackage.nl
    public final boolean n(oh ohVar) {
        return !this.k || ohVar.t();
    }

    @Override // defpackage.nl
    public final boolean p(oh ohVar, cwp cwpVar, cwp cwpVar2) {
        int i;
        int i2;
        return (cwpVar == null || ((i = cwpVar.a) == (i2 = cwpVar2.a) && cwpVar.b == cwpVar2.b)) ? e(ohVar) : g(ohVar, i, cwpVar.b, i2, cwpVar2.b);
    }

    @Override // defpackage.nl
    public final boolean q(oh ohVar, oh ohVar2, cwp cwpVar, cwp cwpVar2) {
        int i;
        int i2;
        int i3 = cwpVar.a;
        int i4 = cwpVar.b;
        if (ohVar2.A()) {
            int i5 = cwpVar.a;
            i2 = cwpVar.b;
            i = i5;
        } else {
            i = cwpVar2.a;
            i2 = cwpVar2.b;
        }
        return f(ohVar, ohVar2, i3, i4, i, i2);
    }

    @Override // defpackage.nl
    public final boolean r(oh ohVar, cwp cwpVar, cwp cwpVar2) {
        int top;
        int left;
        int i = cwpVar.a;
        int i2 = cwpVar.b;
        View view = ohVar.a;
        if (cwpVar2 == null) {
            left = view.getLeft();
            top = view.getTop();
        } else {
            int i3 = cwpVar2.a;
            top = cwpVar2.b;
            left = i3;
        }
        if (ohVar.v() || (i == left && i2 == top)) {
            return h(ohVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return g(ohVar, i, i2, left, top);
    }

    @Override // defpackage.nl
    public final boolean s(oh ohVar, cwp cwpVar, cwp cwpVar2) {
        int i = cwpVar.a;
        int i2 = cwpVar2.a;
        if (i != i2 || cwpVar.b != cwpVar2.b) {
            return g(ohVar, i, cwpVar.b, i2, cwpVar2.b);
        }
        k(ohVar);
        return false;
    }

    public final void u() {
        this.k = false;
    }
}
