package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tsi {
    public final AudioTrack a;
    public int b;
    public Runnable c;
    public volatile boolean d;
    private final ScheduledExecutorService e;
    private ScheduledFuture f;

    public tsi(ScheduledExecutorService scheduledExecutorService) {
        this.e = scheduledExecutorService;
        AudioTrack audioTrackBuild = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(24000).setChannelMask(4).build()).setBufferSizeInBytes(Math.max(AudioTrack.getMinBufferSize(24000, 4, 2), 48000)).setTransferMode(1).build();
        audioTrackBuild.getClass();
        this.a = audioTrackBuild;
        audioTrackBuild.setPositionNotificationPeriod(2400);
        audioTrackBuild.setPlaybackPositionUpdateListener(new tsh(this), aao.c(Looper.getMainLooper()));
    }

    public final synchronized void a(Runnable runnable) {
        if (this.d) {
            return;
        }
        this.c = runnable;
        if (this.b != 0) {
            AudioTrack audioTrack = this.a;
            int playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
            int i = this.b;
            if (playbackHeadPosition < i) {
                audioTrack.setNotificationMarkerPosition(i);
                try {
                    audioTrack.stop();
                } catch (IllegalStateException unused) {
                }
                this.f = this.e.schedule(new szq(this, 14), ((((long) Math.max(0, this.b - this.a.getPlaybackHeadPosition())) * 1000) / 24000) + 150, TimeUnit.MILLISECONDS);
                return;
            }
        }
        f();
    }

    public final synchronized void b() {
        if (!this.d) {
            try {
                AudioTrack audioTrack = this.a;
                if (audioTrack.getState() == 1 && audioTrack.getPlayState() != 3) {
                    audioTrack.play();
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final synchronized void c() {
        e();
        try {
            this.a.release();
        } catch (IllegalStateException unused) {
        }
    }

    public final synchronized void d(float f) {
        if (!this.d) {
            try {
                AudioTrack audioTrack = this.a;
                if (audioTrack.getState() == 1) {
                    audioTrack.setVolume(f);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final synchronized void e() {
        this.d = true;
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f = null;
        this.c = null;
        try {
            AudioTrack audioTrack = this.a;
            if (audioTrack.getState() == 1) {
                audioTrack.pause();
                audioTrack.flush();
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final synchronized void f() {
        if (!this.d) {
            ScheduledFuture scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f = null;
            Runnable runnable = this.c;
            this.c = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
