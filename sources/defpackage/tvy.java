package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tvy {
    public final Set a = new HashSet();
    public RecyclerView b;
    private nt c;
    private qa d;

    private final nt d() {
        if (this.c == null) {
            this.c = new tvw(this);
        }
        return this.c;
    }

    private final qa e() {
        if (this.d == null) {
            this.d = new tvx(this);
        }
        return this.d;
    }

    public final void a(SwipeLayout swipeLayout) {
        this.a.add(swipeLayout);
    }

    public final void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.Z(d());
            this.b.aE(e());
        }
        this.b = recyclerView;
        if (recyclerView != null) {
            recyclerView.w(d());
            this.b.aC(e());
        }
    }

    public final void c(SwipeLayout swipeLayout) {
        this.a.remove(swipeLayout);
    }
}
