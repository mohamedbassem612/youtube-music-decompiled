package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpe {
    public int a;
    public final xgm b;
    public final acpc c;
    public final Executor d;
    public final acqz e;
    public View f;
    public RecyclerView g;
    public acpd h;
    public xhc i;
    public AccessibilityManager j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean q;
    public final hno s;
    private final ahey t;
    public int n = -1;
    public long o = 0;
    public int r = 1;
    public ListenableFuture p = aher.a;

    public acpe(xgm xgmVar, acpc acpcVar, hno hnoVar, Executor executor, ahey aheyVar, acqz acqzVar) {
        this.b = xgmVar;
        this.c = acpcVar;
        this.s = hnoVar;
        this.d = executor;
        this.t = aheyVar;
        this.e = acqzVar;
    }

    public final ListenableFuture a() {
        return this.t.schedule(new abyz(this, 19), this.o, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        this.q = false;
        this.p.cancel(false);
    }

    public final void c() {
        View view = this.f;
        if (view != null) {
            acfz.I(view, false);
        }
    }

    public final void d() {
        if (this.f == null || !e()) {
            return;
        }
        c();
        if (this.i == null || this.a != 3) {
            return;
        }
        xgn xgnVarHB = this.b.hB();
        ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
        xhc xhcVar = this.i;
        xhcVar.getClass();
        xgnVarHB.o(amebVar, new xgj(xhcVar), null);
        this.i = null;
    }

    public final boolean e() {
        View view = this.f;
        return view != null && view.getVisibility() == 0;
    }

    public final void f(int i) {
        acpc acpcVar = this.c;
        ahcs.e(ahcs.e(acpcVar.a(), afwl.a(new abzr(11)), acpcVar.a), afwl.a(new gvw(this, i, 4)), this.d);
    }
}
