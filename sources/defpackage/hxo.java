package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.player.audiovideoswitcher.ui.AudioVideoSwitcherToggleView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxo extends axx {
    final /* synthetic */ AudioVideoSwitcherToggleView a;

    public hxo(AudioVideoSwitcherToggleView audioVideoSwitcherToggleView) {
        this.a = audioVideoSwitcherToggleView;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = this.a;
        bbzVar.k(new bby(null, 16, String.format(audioVideoSwitcherToggleView.g, audioVideoSwitcherToggleView.m ? audioVideoSwitcherToggleView.k : audioVideoSwitcherToggleView.j), null, null));
    }
}
