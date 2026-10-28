package defpackage;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import java.io.IOException;
import java.security.Key;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yfi {
    public final jsk a;
    public final byc b;
    final String c;
    final long d;
    public long e;
    final long f;
    public final zjr g;
    public ywn h;
    public final boolean i;
    public volatile jsp l;
    private final yfh n;
    private final yhi o;
    private final ydm p;
    public final AtomicLong j = new AtomicLong();
    public final AtomicLong k = new AtomicLong();
    public volatile int m = 1;

    public yfi(jsk jskVar, byc bycVar, yfh yfhVar, long j, long j2, zjr zjrVar, ydm ydmVar, yhi yhiVar, ywn ywnVar) {
        this.h = ywn.b;
        this.a = jskVar;
        this.b = bycVar;
        this.n = yfhVar;
        this.c = yfhVar.t();
        this.d = j;
        this.f = j2;
        this.g = zjrVar;
        this.p = ydmVar;
        this.o = yhiVar;
        this.h = ywnVar;
        this.i = zjrVar.j.m(189, 45621036L);
    }

    public static yfi e(jsk jskVar, Key key, yfh yfhVar, long j, long j2, zjr zjrVar, ydm ydmVar, yhi yhiVar, ywn ywnVar) {
        yfhVar.t();
        return new yfi(jskVar, new bxr(key.getEncoded(), new jsm(jskVar, 20480, zjrVar), new byte[20480]), yfhVar, j, j2, zjrVar, ydmVar, yhiVar, ywnVar);
    }

    public final void a() {
        if (this.m == 2) {
            this.b.a();
        }
        d();
        this.m = 3;
        this.j.set(0L);
    }

    public final void b(boolean z) throws IOException {
        if (this.m != 3) {
            boolean zO = true;
            if (this.m == 1) {
                a();
                return;
            }
            if (this.l == null) {
                throw new IllegalStateException("Not holding writeLock. Key.".concat(this.c));
            }
            a();
            ydm ydmVar = this.p;
            jsk jskVar = this.a;
            if (ydmVar != null) {
                if (((ygs) ydmVar.a).g.E(this.c, new agqj(jskVar)) == null) {
                    zO = false;
                }
            } else {
                zO = jskVar.o(this.c, this.d, this.f);
            }
            if (!zO) {
                if (!this.g.bF() || this.e + this.k.get() == this.f) {
                    c();
                    if (!z) {
                        throw new IOException("FailureWritingToKey.".concat(this.c));
                    }
                    return;
                }
                return;
            }
            yhi yhiVar = this.o;
            if (yhiVar != null) {
                yfh yfhVar = this.n;
                ydm ydmVar2 = ((yhj) yhiVar.a).d;
                if (ydmVar2 != null) {
                    Object obj = yhiVar.b;
                    int i = yfhVar.c;
                    FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = yfhVar.b;
                    ((yhq) ydmVar2.a).c(yfhVar.a, formatIdOuterClass$FormatId, i, (TimeRangeOuterClass$TimeRange) obj);
                }
            }
        }
    }

    public final void c() {
        zhq zhqVar = zhq.ABR;
        jsk jskVar = this.a;
        for (jsp jspVar : jskVar.g(this.c)) {
            try {
                long j = this.d;
                long j2 = this.f;
                if (j2 == -1) {
                    j2 = this.k.get();
                }
                long j3 = jspVar.b;
                long j4 = j2 + j;
                boolean z = true;
                if (jspVar.c + j3 > j && j4 > j3) {
                    z = false;
                }
                if (jspVar.c()) {
                    if (j <= j3 && j3 < j4) {
                        jskVar.m(jspVar);
                    }
                } else if (!z) {
                    jskVar.m(jspVar);
                }
            } catch (Exception e) {
                ywn ywnVar = this.h;
                zhv zhvVarA = ygs.a();
                zhvVarA.d = e;
                zhvVarA.f("c", "evictFailed");
                zhvVarA.f("streamKey", this.c);
                zhvVarA.f("segmentOffset", String.valueOf(this.d));
                zhvVarA.f("segmentSize", String.valueOf(this.f));
                ywnVar.k(zhvVarA.a());
            }
        }
    }

    public final void d() {
        if (this.l != null) {
            this.a.l(this.l);
            this.l = null;
        }
    }
}
