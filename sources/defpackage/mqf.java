package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mqf implements View.OnAttachStateChangeListener, nt {
    public final RecyclerView a;
    public mqd b;
    public ahgb c;
    private final nrp d;
    private boolean e = false;
    private final Float f;

    public mqf(RecyclerView recyclerView, nrp nrpVar, Float f) {
        this.a = recyclerView;
        this.d = nrpVar;
        this.f = f;
    }

    private final od d(float f) {
        return new mqe(this.a.getContext(), f);
    }

    public final int a() {
        nh nhVar = this.a.m;
        if (nhVar != null) {
            return nhVar.a();
        }
        return 0;
    }

    public final void b(int i, boolean z) {
        if (c()) {
            boolean z2 = true;
            if (!this.e) {
                RecyclerView recyclerView = this.a;
                recyclerView.w(this);
                recyclerView.addOnAttachStateChangeListener(this);
                this.e = true;
            }
            nrp nrpVar = this.d;
            if (nrpVar != null) {
                if (z) {
                    Float f = this.f;
                    if (f != null && f.floatValue() > 0.0f) {
                        nrpVar.b(i, d(f.floatValue()));
                        return;
                    }
                } else {
                    z2 = false;
                }
                nrpVar.c(i, z2);
                return;
            }
            RecyclerView recyclerView2 = this.a;
            if (!z) {
                recyclerView2.ab(i);
                return;
            }
            Float f2 = this.f;
            np npVar = recyclerView2.n;
            if (f2 == null || f2.floatValue() <= 0.0f || npVar == null) {
                recyclerView2.aj(i);
                return;
            }
            od odVarD = d(f2.floatValue());
            odVarD.b = i;
            npVar.startSmoothScroll(odVarD);
        }
    }

    public final boolean c() {
        return this.a.q;
    }

    @Override // defpackage.nt
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        ahgb ahgbVar = this.c;
        if (ahgbVar == null || !((AtomicBoolean) ahgbVar.c).get()) {
            return false;
        }
        ahgbVar.M();
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        mqd mqdVar = this.b;
        if (mqdVar != null) {
            int i = mqg.d;
            ((ahgb) mqdVar.b).M();
            mqg.b.remove(mqdVar.a);
        }
        RecyclerView recyclerView = this.a;
        recyclerView.Z(this);
        recyclerView.removeOnAttachStateChangeListener(this);
        this.e = false;
    }

    @Override // defpackage.nt
    public final void f(boolean z) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // defpackage.nt
    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
