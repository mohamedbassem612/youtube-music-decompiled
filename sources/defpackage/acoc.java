package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.libraries.youtube.reel.internal.player.ReelPlayerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acoc extends tud {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ acoi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acoc(acoi acoiVar, String str, int i, int i2) {
        super(str);
        this.a = i;
        this.b = i2;
        this.c = acoiVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        acoi acoiVar = this.c;
        ReelPlayerView reelPlayerView = acoiVar.ba;
        if (reelPlayerView != null) {
            if (this.a == reelPlayerView.getWidth() && this.b == reelPlayerView.getHeight()) {
                return;
            }
            ViewTreeObserver viewTreeObserver = reelPlayerView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            acoiVar.j.notifyObservers();
        }
    }
}
