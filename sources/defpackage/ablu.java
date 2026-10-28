package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.player.features.storyboard.ScrubbedPreviewView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ablu extends AnimatorListenerAdapter {
    final /* synthetic */ ScrubbedPreviewView a;

    public ablu(ScrubbedPreviewView scrubbedPreviewView) {
        this.a = scrubbedPreviewView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ScrubbedPreviewView scrubbedPreviewView = this.a;
        if (scrubbedPreviewView.getAlpha() == 0.0f) {
            tuk.l(scrubbedPreviewView, false);
            scrubbedPreviewView.a.setImageBitmap(null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        tuk.l(this.a, true);
    }
}
