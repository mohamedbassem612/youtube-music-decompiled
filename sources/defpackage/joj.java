package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class joj {
    public final LoadingFrameLayout a;
    public final RecyclerView b;
    public final jav c;
    public final LinearLayoutManager d;
    public cc e;
    public boolean f;
    public final aftj g;
    private View h;
    private boolean i;

    public joj(aftj aftjVar, LoadingFrameLayout loadingFrameLayout, RecyclerView recyclerView, jav javVar, LinearLayoutManager linearLayoutManager) {
        this.g = aftjVar;
        this.a = loadingFrameLayout;
        this.b = recyclerView;
        this.c = javVar;
        this.d = linearLayoutManager;
    }

    private final void c() {
        View view = this.h;
        LoadingFrameLayout loadingFrameLayout = this.a;
        if (view == null) {
            jol.n(loadingFrameLayout, this.i);
        } else {
            jol.n(loadingFrameLayout, false);
            jol.n(this.h, this.i);
        }
    }

    public final void a(View view) {
        LoadingFrameLayout loadingFrameLayout = this.a;
        loadingFrameLayout.removeView(this.h);
        this.h = view;
        c();
        loadingFrameLayout.addView(view);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    public final void b(boolean z) {
        this.i = z;
        c();
    }
}
