package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xaw extends AnimatorListenerAdapter {
    final /* synthetic */ TextView a;
    final /* synthetic */ String b;

    public xaw(TextView textView, String str) {
        this.a = textView;
        this.b = str;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setText(this.b);
    }
}
