package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatSwipeableContainerLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xbu extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ xbw c;

    public xbu(xbw xbwVar, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = xbwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xbw xbwVar = this.c;
        xbwVar.u = false;
        LiveChatSwipeableContainerLayout liveChatSwipeableContainerLayout = xbwVar.j;
        liveChatSwipeableContainerLayout.setVisibility(8);
        liveChatSwipeableContainerLayout.setTranslationY(0.0f);
        if (this.a) {
            xbwVar.q();
            xbwVar.v.a(xbwVar);
        }
        if (this.b) {
            return;
        }
        xbwVar.r();
    }
}
