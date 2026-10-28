package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class glr extends MediaPlayer implements MediaPlayer.OnPreparedListener {
    public gls a;
    public boolean b = false;

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.b = true;
        gls glsVar = this.a;
        if (glsVar != null) {
            glsVar.onPrepared(mediaPlayer);
        }
    }
}
