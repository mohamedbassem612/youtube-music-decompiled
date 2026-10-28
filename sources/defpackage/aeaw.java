package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeaw extends qa implements aeum {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/ui/filterchipbar/PartialPullListener");
    private boolean b;
    private boolean c;
    private boolean d;
    private final qcb e;

    public aeaw(qcb qcbVar) {
        super((byte[]) null);
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = qcbVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        if (this.d || i2 >= 0) {
            return;
        }
        this.e.t();
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        if (this.d || this.b || i != 1) {
            return;
        }
        this.b = true;
    }

    @Override // defpackage.aeum, defpackage.aeui
    public final void m(AppBarLayout appBarLayout, int i) {
        if (this.d) {
            return;
        }
        if (Math.abs(i) == appBarLayout.f() && this.b) {
            this.c = true;
            ((grf) this.e.a).W();
        } else if (i == 0 && this.c) {
            this.e.t();
        }
    }

    public final void o(RecyclerView recyclerView, AppBarLayout appBarLayout) {
        if (this.d) {
            return;
        }
        this.d = true;
        if (recyclerView == null || appBarLayout == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/rendering/ui/filterchipbar/PartialPullListener", "detatchFromTargetViews", 89, "PartialPullListener.java")).t("Disabled PartialPullListener but did not remove it, as one or more of the target  views was null.");
        } else {
            recyclerView.post(new aead(this, recyclerView, 2, null));
            appBarLayout.post(new aead(this, appBarLayout, 3));
        }
    }
}
