package defpackage;

import android.content.res.ColorStateList;
import com.google.android.apps.youtube.music.player.audiovideoswitcher.ui.AudioVideoSwitcherToggleView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxn extends ggb {
    final /* synthetic */ AudioVideoSwitcherToggleView e;

    public hxn(AudioVideoSwitcherToggleView audioVideoSwitcherToggleView) {
        this.e = audioVideoSwitcherToggleView;
    }

    @Override // defpackage.ggb
    public final void b(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        int i2 = bac.a;
        this.e.setBackgroundTintList(colorStateListValueOf);
    }
}
