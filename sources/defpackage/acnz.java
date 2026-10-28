package defpackage;

import com.google.android.libraries.youtube.reel.internal.player.ReelPlayerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acnz extends zkk {
    final /* synthetic */ acoi a;

    public acnz(acoi acoiVar) {
        this.a = acoiVar;
    }

    @Override // defpackage.agfr
    public final /* bridge */ /* synthetic */ Object io() {
        acoi acoiVar = this.a;
        ReelPlayerView reelPlayerView = acoiVar.ba;
        reelPlayerView.getClass();
        return new zkj(reelPlayerView.getWidth(), acoiVar.ba.getHeight(), false);
    }
}
