package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.engagementpanel.LinearScrollToItemLayoutManager;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vno extends AnimatorListenerAdapter {
    final /* synthetic */ LinearScrollToItemLayoutManager a;
    final /* synthetic */ Optional b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    public vno(LinearScrollToItemLayoutManager linearScrollToItemLayoutManager, Optional optional, int i, int i2) {
        this.a = linearScrollToItemLayoutManager;
        this.b = optional;
        this.c = i;
        this.d = i2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b((RecyclerView) this.b.get(), this.c, this.d);
    }
}
