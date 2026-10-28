package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xcg implements Animation.AnimationListener {
    public final View a;
    public final View b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final int d;
    public final int e;
    public boolean f;
    public xch g;

    public xcg(ViewGroup viewGroup, View view, int i, int i2) {
        this.a = view;
        this.b = viewGroup;
        this.e = i;
        this.d = i2;
        viewGroup.removeAllViews();
        viewGroup.setTranslationY(0.0f);
        viewGroup.addView(view);
        viewGroup.setVisibility(8);
        this.f = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        xcg xcgVar;
        this.a.setVisibility(8);
        xch xchVar = this.g;
        if (xchVar == null || (xcgVar = xchVar.a) == null || this != xcgVar) {
            return;
        }
        xchVar.m();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
