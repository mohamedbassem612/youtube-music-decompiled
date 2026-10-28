package defpackage;

import com.google.android.libraries.youtube.reel.internal.player.ReelPlayerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ima extends zkk {
    final /* synthetic */ imb a;

    public ima(imb imbVar) {
        this.a = imbVar;
    }

    @Override // defpackage.agfr
    public final /* bridge */ /* synthetic */ Object io() {
        imb imbVar = this.a;
        ReelPlayerView reelPlayerView = imbVar.ba;
        int iG = (reelPlayerView == null || reelPlayerView.getHeight() <= 0) ? twm.g(imbVar.getActivity()) : reelPlayerView.getHeight();
        return new zkj(Math.round(iG * 1.777f), iG, false);
    }
}
