package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cgr {
    private long A;
    private long B;
    private final qcb C;
    public final bvd a;
    public final long[] b;
    public final AudioTrack c;
    public final int d;
    public final long e;
    public final boolean f;
    public final cgh g;
    public float h;
    public long i;
    public long j;
    public long k;
    public Method l;
    public long m;
    public long n;
    public int o;
    public int p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    private long y;
    private long z;

    public cgr(qcb qcbVar, bvd bvdVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.C = qcbVar;
        this.a = bvdVar;
        this.c = audioTrack;
        try {
            this.l = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.v = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.g = new cgh(audioTrack, qcbVar);
        int sampleRate = audioTrack.getSampleRate();
        this.d = sampleRate;
        boolean zAb = bwp.ab(i);
        this.f = zAb;
        this.e = zAb ? bwp.B(i3 / i2, sampleRate) : -9223372036854775807L;
        this.z = 0L;
        this.A = 0L;
        this.w = false;
        this.B = 0L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.n = 0L;
        this.m = 0L;
        this.h = 1.0f;
        this.i = -9223372036854775807L;
    }

    private final long f() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 ? this.s : bwp.u(bwp.v(bwp.y(this.a.b()) - this.q, this.h), this.d) + this.s;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    public final long a() {
        long j;
        if (this.q != -9223372036854775807L) {
            return Math.min(this.t, f());
        }
        long jB = this.a.b();
        if (jB - this.y >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1 && (this.x || playState != 2)) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.z;
                    if (j > playbackHeadPosition) {
                        if (this.w) {
                            this.B += j;
                            this.w = false;
                        } else if (j - playbackHeadPosition >= 2147483648L) {
                            this.A++;
                        } else {
                            e();
                            this.g.c(0);
                        }
                    }
                    this.z = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.z <= 0 || playState != 3) {
                    this.r = -9223372036854775807L;
                    j = this.z;
                    if (j > playbackHeadPosition) {
                        if (this.w) {
                            this.B += j;
                            this.w = false;
                        } else if (j - playbackHeadPosition >= 2147483648L) {
                            this.A++;
                        } else {
                            e();
                            this.g.c(0);
                        }
                    }
                    this.z = playbackHeadPosition;
                } else if (this.r == -9223372036854775807L) {
                    this.r = jB;
                }
            }
            this.y = jB;
        }
        return this.z + this.B + (this.A << 32);
    }

    public final long b(long j) {
        long jV;
        if (this.p == 0) {
            jV = this.q != -9223372036854775807L ? bwp.B(f(), this.d) : c();
        } else {
            jV = bwp.v(j + this.j, this.h);
        }
        long jMax = Math.max(0L, jV - this.m);
        return this.q != -9223372036854775807L ? Math.min(bwp.B(this.t, this.d), jMax) : jMax;
    }

    public final long c() {
        return bwp.B(a(), this.d);
    }

    public final void d(long j) {
        long j2 = this.i;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jX = bwp.x(j - j2, this.h);
        bvd bvdVar = this.a;
        final long jA = bvdVar.a() - bwp.F(jX);
        this.i = -9223372036854775807L;
        dje djeVar = ((cgo) this.C.a).p;
        if (djeVar.i()) {
            djeVar.h(-1, new bvs() { // from class: cgl
                @Override // defpackage.bvs
                public final void a(Object obj) {
                    cgc cgcVar;
                    cgx cgxVar = (cgx) obj;
                    chd chdVar = cgxVar.b;
                    if (!cgxVar.equals(chdVar.a) || (cgcVar = chdVar.c) == null) {
                        return;
                    }
                    cgcVar.f(jA);
                }
            });
        }
    }

    public final void e() {
        this.j = 0L;
        this.p = 0;
        this.o = 0;
        this.k = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
    }
}
