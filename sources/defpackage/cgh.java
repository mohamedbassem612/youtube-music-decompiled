package defpackage;

import android.media.AudioTrack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cgh {
    public final cgg a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public final qcb h;
    private final int i;

    public cgh(AudioTrack audioTrack, qcb qcbVar) {
        this.a = new cgg(audioTrack);
        this.i = audioTrack.getSampleRate();
        this.h = qcbVar;
        c(0);
    }

    public final long a(long j, float f) {
        cgg cggVar = this.a;
        return b(cggVar.e, cggVar.a(), j, f);
    }

    public final long b(long j, long j2, long j3, float f) {
        return bwp.B(j, this.i) + bwp.v(j3 - j2, f);
    }

    public final void c(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.g = -9223372036854775807L;
            this.c = System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }
}
