package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.music.player.audiovideoswitcher.ui.AudioVideoSwitcherToggleView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxm extends ggb {
    final /* synthetic */ AudioVideoSwitcherToggleView e;

    public hxm(AudioVideoSwitcherToggleView audioVideoSwitcherToggleView) {
        this.e = audioVideoSwitcherToggleView;
    }

    @Override // defpackage.ggb
    public final void b(int i) {
        Drawable drawable = this.e.c;
        int i2 = jkl.a;
        if (drawable != null) {
            drawable.mutate().setTint(i);
        }
    }
}
