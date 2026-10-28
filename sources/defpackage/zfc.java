package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zfc {
    public static final zfc a = new zfc(wiu.c, null, wja.c, ywn.b, true, new ytj(12));
    public final long b;
    public final boolean c;
    public volatile boolean d;
    public final boolean e;
    public final boolean f;
    public final amsb g;
    public final int h;
    public final int i;
    public boolean l;
    public boolean m;
    public final int n;
    public final int o;
    public boolean p;
    public final wiu q;
    public final ywn r;
    private final amwn s;
    private final agfr v;
    private int x;
    private final int y;
    private volatile long t = -1;
    private volatile long u = -1;
    public volatile long j = -1;
    public volatile long k = Long.MAX_VALUE;
    private volatile long w = Long.MAX_VALUE;

    public zfc(wiu wiuVar, zjr zjrVar, wja wjaVar, ywn ywnVar, boolean z, agfr agfrVar) {
        amsb amsbVarA;
        this.q = wiuVar;
        this.r = ywnVar;
        this.v = agfrVar;
        this.c = wjaVar.B();
        boolean z2 = wjaVar.z();
        this.f = z2;
        if (wjaVar.B() && wjaVar.D() && !wjaVar.H()) {
            akwm akwmVar = wiuVar.d.f;
            amsbVarA = amsb.a((akwmVar == null ? akwm.b : akwmVar).Z);
            amsbVarA = amsbVarA == null ? amsb.LIVE_ONLY_PEG_STRATEGY_UNKNOWN : amsbVarA;
            this.g = amsbVarA;
            this.p = true;
        } else {
            amsbVarA = amsb.LIVE_ONLY_PEG_STRATEGY_DO_NOT_PEG;
            this.g = amsbVarA;
        }
        this.l = wjaVar.z() && z;
        if (zjrVar != null) {
            this.b = zjrVar.v();
        } else {
            this.b = 0L;
        }
        if (z2) {
            ywnVar.m(this.l);
        }
        this.e = wjaVar.H();
        this.h = wjaVar.k;
        amwn amwnVar = wjaVar.l;
        this.s = amwnVar;
        this.i = wjaVar.b();
        int i = wiuVar.i();
        this.y = i;
        zkf.d(amsbVarA);
        zkf.d(amwnVar);
        if (amsbVarA.equals(amsb.LIVE_ONLY_PEG_STRATEGY_SEEK_ON_REBUFFER_ESTIMATE_DURATION)) {
            int iOrdinal = amwnVar.ordinal();
            i = iOrdinal != 2 ? iOrdinal != 3 ? 15000 : 4000 : 6000;
        }
        this.x = i;
        this.n = wiuVar.j();
        this.o = wiuVar.s();
    }

    public final long a() {
        if (!this.d) {
            long j = this.w;
            if (j != Long.MAX_VALUE) {
                return ((Long) this.v.io()).longValue() + j;
            }
            return Long.MAX_VALUE;
        }
        if (this.u != -1) {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            return this.u / 1000;
        }
        if (this.k == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
        return this.k / 1000;
    }

    public final long b() {
        return TimeUnit.MILLISECONDS.toMicros(this.n);
    }

    public final long c() {
        long j = this.k;
        if (j == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.MILLISECONDS.toMicros(this.i) + j;
    }

    public final void d() {
        if (this.g.ordinal() == 3) {
            boolean z = true;
            if (!this.m && (!this.l || this.e)) {
                z = false;
            }
            this.m = z;
        }
        if (this.l) {
            this.r.m(false);
        }
        this.l = false;
        this.p = false;
    }

    public final void e(long j, long j2) {
        if (this.c) {
            this.d = true;
            if (j == -1 || this.t != -1) {
                return;
            }
            this.t = j;
            this.u = j2;
            ywn ywnVar = this.r;
            zgh zghVar = zgh.LIVE_STREAM_END_SOURCE_MEDIA_EMBEDDED;
            long j3 = this.j;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            ywnVar.u(zghVar, j, j3, this.k / 1000);
        }
    }

    public final void f(long j, long j2) {
        if (!this.c || this.d) {
            return;
        }
        if (this.k == Long.MAX_VALUE || j2 > this.k) {
            this.j = j;
            this.k = j2;
            if (this.d) {
                return;
            }
            if (j2 == Long.MAX_VALUE) {
                this.w = Long.MAX_VALUE;
                return;
            }
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long j3 = j2 / 1000;
            long jA = a();
            if (j3 > jA || jA == Long.MAX_VALUE) {
                this.w = j3 - ((Long) this.v.io()).longValue();
            }
        }
    }

    public final void g() {
        amsb amsbVar = this.g;
        zkf.d(amsbVar);
        if (amsbVar.equals(amsb.LIVE_ONLY_PEG_STRATEGY_SEEK_ON_REBUFFER_ESTIMATE_DURATION)) {
            this.x = Math.min(this.x + this.i, this.y);
        }
    }

    public final boolean h(long j, long j2) {
        return this.c && j != this.b && j != -9223372036854775807L && j >= 0 && j2 != Long.MAX_VALUE && j2 > 0 && this.x + this.n < ((int) (j2 - j));
    }
}
