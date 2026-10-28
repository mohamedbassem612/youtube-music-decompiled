package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class yto implements MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, ytr {
    public ytq a;
    private final MediaPlayer b;
    private wiu c;

    public yto() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.a = null;
        this.c = null;
        this.b = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnVideoSizeChangedListener(this);
        mediaPlayer.setOnBufferingUpdateListener(this);
        mediaPlayer.setOnSeekCompleteListener(this);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnInfoListener(this);
    }

    @Override // defpackage.ytr
    public final int B() {
        return this.b.getAudioSessionId();
    }

    @Override // defpackage.ytr
    public final int C() {
        return this.b.getCurrentPosition();
    }

    @Override // defpackage.ytr
    public final int D() {
        return this.b.getDuration();
    }

    @Override // defpackage.ytr
    public final void E() {
        this.b.pause();
    }

    @Override // defpackage.ytr
    public final void F() {
        this.b.prepareAsync();
    }

    @Override // defpackage.ytr
    public final void G() {
        this.b.release();
    }

    @Override // defpackage.ytr
    public final void H(int i) {
        this.b.setAudioStreamType(i);
    }

    @Override // defpackage.ytr
    public final void I(Context context, Uri uri, Map map, wiu wiuVar) throws IOException {
        this.b.setDataSource(context, uri, (Map<String, String>) map);
        this.c = wiuVar;
    }

    @Override // defpackage.ytr
    public final void J(SurfaceHolder surfaceHolder) {
        try {
            this.b.setDisplay(surfaceHolder);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.ytr
    public final void K(ytq ytqVar) {
        this.a = ytqVar;
    }

    @Override // defpackage.ytr
    public final void L(PlaybackParams playbackParams) {
        this.b.setPlaybackParams(playbackParams);
    }

    @Override // defpackage.ytr
    public final void N(Surface surface) {
        try {
            this.b.setSurface(surface);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.ytr
    public final void O(float f, float f2) {
        this.b.setVolume(yno.cA(this.c, f), yno.cA(this.c, f2));
    }

    @Override // defpackage.ytr
    public final void P() {
        this.b.start();
    }

    @Override // defpackage.ytr
    public final void Q(long j, int i) {
        if (j > 2147483647L || j < -2147483648L) {
            zvp.a(zvn.a, zvm.f, "32 bit integer overflow attempting to seekTo: " + j + '.');
            return;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            this.b.seekTo(j, 3);
            return;
        }
        if (i2 == 2) {
            this.b.seekTo(j, 2);
            return;
        }
        if (i2 == 3) {
            this.b.seekTo(j, 1);
            return;
        }
        MediaPlayer mediaPlayer = this.b;
        if (i2 != 4) {
            mediaPlayer.seekTo((int) j);
        } else {
            mediaPlayer.seekTo(j, 0);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        ytq ytqVar = this.a;
        if (ytqVar != null) {
            ytqVar.c(i);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        ytq ytqVar = this.a;
        if (ytqVar != null) {
            ytqVar.d();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        ytq ytqVar = this.a;
        return ytqVar != null && ytqVar.e(i, i2);
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        ytq ytqVar = this.a;
        if (ytqVar == null) {
            return false;
        }
        ytqVar.f(i, i2);
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        ytq ytqVar = this.a;
        if (ytqVar != null) {
            ytqVar.a(this);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        ytq ytqVar = this.a;
        if (ytqVar != null) {
            ytqVar.g();
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        ytq ytqVar = this.a;
        if (ytqVar != null) {
            ytqVar.b(this, i, i2);
        }
    }

    @Override // defpackage.ytr
    public final void M(boolean z) {
    }
}
