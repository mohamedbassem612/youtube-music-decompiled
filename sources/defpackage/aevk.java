package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aevk implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public aevk(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aevj aevjVar;
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        bdr bdrVar = swipeDismissBehavior.f;
        if (bdrVar != null && bdrVar.l()) {
            this.b.postOnAnimation(this);
        } else {
            if (!this.c || (aevjVar = swipeDismissBehavior.g) == null) {
                return;
            }
            aevjVar.a(this.b);
        }
    }
}
