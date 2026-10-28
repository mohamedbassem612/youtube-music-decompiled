package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.youtube.music.player.audiovideoswitcher.ui.AudioVideoSwitcherToggleView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hxp {
    public float a;
    public float b;
    public boolean c;
    public int d;
    public final /* synthetic */ AudioVideoSwitcherToggleView e;

    public hxp(AudioVideoSwitcherToggleView audioVideoSwitcherToggleView) {
        this.e = audioVideoSwitcherToggleView;
    }

    public final void a() {
        AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = this.e;
        View viewB = audioVideoSwitcherToggleView.b(true);
        View viewB2 = audioVideoSwitcherToggleView.b(false);
        Rect rectA = audioVideoSwitcherToggleView.a(viewB);
        Rect rectA2 = audioVideoSwitcherToggleView.a(viewB2);
        Rect bounds = audioVideoSwitcherToggleView.c.getBounds();
        if (Math.abs(bounds.centerX() - rectA.centerX()) >= Math.abs(bounds.centerX() - rectA2.centerX())) {
            viewB = viewB2;
        }
        if (audioVideoSwitcherToggleView.d != viewB) {
            audioVideoSwitcherToggleView.performClick();
        } else {
            audioVideoSwitcherToggleView.c(viewB);
        }
    }
}
