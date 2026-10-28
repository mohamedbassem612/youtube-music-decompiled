package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class az implements Animation.AnimationListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ ea a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ ba d;

    public az(ea eaVar, ViewGroup viewGroup, View view, ba baVar) {
        this.a = eaVar;
        this.b = viewGroup;
        this.c = view;
        this.d = baVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new bf(viewGroup, this.c, this.d, 1));
        if (dd.aa(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (dd.aa(2)) {
            Objects.toString(this.a);
        }
    }
}
