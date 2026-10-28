package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cgg {
    public final AudioTrack a;
    public final AudioTimestamp b = new AudioTimestamp();
    public long c;
    public long d;
    public long e;
    public boolean f;
    public long g;

    public cgg(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.b.nanoTime / 1000;
    }
}
