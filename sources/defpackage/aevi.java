package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aevi implements bcl {
    final /* synthetic */ SwipeDismissBehavior a;

    public aevi(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    @Override // defpackage.bcl
    public final boolean a(View view) {
        int width;
        aevj aevjVar;
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        boolean z = false;
        if (!swipeDismissBehavior.q(view)) {
            return false;
        }
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.i;
        if (i == 0) {
            if (z2) {
                width = -view.getWidth();
            }
            int i2 = bac.a;
            view.offsetLeftAndRight(width);
            view.setAlpha(0.0f);
            aevjVar = swipeDismissBehavior.g;
            if (aevjVar != null) {
                aevjVar.a(view);
            }
            return true;
        }
        z = z2;
        if (i != 1 || z) {
            width = view.getWidth();
        } else {
            width = -view.getWidth();
        }
        int i3 = bac.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        aevjVar = swipeDismissBehavior.g;
        if (aevjVar != null) {
            aevjVar.a(view);
        }
        return true;
    }
}
