package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nh {
    public final ni b = new ni();
    public boolean c = false;
    public final int d = 1;

    public abstract int a();

    public int b(int i) {
        return 0;
    }

    public long c(int i) {
        return -1L;
    }

    public abstract oh e(ViewGroup viewGroup, int i);

    public final void h(int i) {
        this.b.d(i, 1);
    }

    public final void j(int i, int i2) {
        this.b.c(i, i2, null);
    }

    public final oh jV(ViewGroup viewGroup, int i) {
        if (awt.a()) {
            String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i));
        }
        oh ohVarE = e(viewGroup, i);
        if (ohVarE.a.getParent() != null) {
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        }
        ohVarE.f = i;
        return ohVarE;
    }

    public final void jW() {
        this.b.a();
    }

    public final void jX(int i) {
        this.b.c(i, 1, null);
    }

    public final void jY(int i, int i2) {
        this.b.b(i, i2);
    }

    public final void jZ(int i, int i2, Object obj) {
        this.b.c(i, i2, obj);
    }

    public final void l(int i, int i2) {
        this.b.d(i, i2);
    }

    public final void m(int i, int i2) {
        this.b.e(i, i2);
    }

    public final void n(int i) {
        this.b.e(i, 1);
    }

    public abstract void o(oh ohVar, int i);

    public void p(oh ohVar, int i, List list) {
        o(ohVar, i);
    }

    public final void t(boolean z) {
        if (this.b.f()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.c = z;
    }

    public boolean u(oh ohVar) {
        return false;
    }

    public final void x(qa qaVar) {
        this.b.registerObserver(qaVar);
    }

    public final void y(qa qaVar) {
        this.b.unregisterObserver(qaVar);
    }

    public void v() {
    }

    public void w() {
    }

    public void q(oh ohVar) {
    }

    public void r(oh ohVar) {
    }

    public void s(oh ohVar) {
    }
}
