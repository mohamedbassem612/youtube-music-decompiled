package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class oq extends ns {
    RecyclerView a;
    private Scroller b;
    private final qa c = new oo(this);

    public abstract int a(np npVar, int i, int i2);

    public abstract View b(np npVar);

    public abstract int[] c(np npVar, View view);

    protected od d(np npVar) {
        return i(npVar);
    }

    @Override // defpackage.ns
    public boolean e(int i, int i2) {
        int i3;
        od odVarD;
        int iA;
        RecyclerView recyclerView = this.a;
        np npVar = recyclerView.n;
        if (npVar == null || recyclerView.m == null || ((Math.abs(i2) <= (i3 = recyclerView.H) && Math.abs(i) <= i3) || !(npVar instanceof oc) || (odVarD = d(npVar)) == null || (iA = a(npVar, i, i2)) == -1)) {
            return false;
        }
        odVarD.b = iA;
        npVar.startSmoothScroll(odVarD);
        return true;
    }

    public void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.aE(this.c);
                this.a.G = null;
            }
            this.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.G != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                recyclerView.aC(this.c);
                RecyclerView recyclerView3 = this.a;
                recyclerView3.G = this;
                this.b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                g();
            }
        }
    }

    final void g() {
        np npVar;
        View viewB;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (npVar = recyclerView.n) == null || (viewB = b(npVar)) == null) {
            return;
        }
        int[] iArrC = c(npVar, viewB);
        int i = iArrC[0];
        if (i == 0) {
            if (iArrC[1] == 0) {
                return;
            } else {
                i = 0;
            }
        }
        this.a.aA(i, iArrC[1], false);
    }

    public final int[] h(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    @Deprecated
    protected od i(np npVar) {
        if (npVar instanceof oc) {
            return new op(this, this.a.getContext());
        }
        return null;
    }
}
