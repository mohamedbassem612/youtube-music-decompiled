package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zbe extends zai {
    private volatile boolean A;
    private volatile boolean B;
    private final cpf C;
    public final zbb s;
    volatile boolean t;
    private boolean u;
    private long v;
    private long w;
    private final ArrayList x;
    private long y;
    private volatile int z;

    public zbe(bye byeVar, byi byiVar, bse bseVar, int i, Object obj, long j, long j2, long j3, long j4, cpf cpfVar, zbb zbbVar) {
        super(byeVar, byiVar, bseVar, i, obj, j, j2, j3, j4);
        this.x = new ArrayList();
        this.z = -1;
        this.C = cpfVar;
        this.s = zbbVar;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.u = true;
    }

    private final synchronized void A() {
        this.y = 0L;
        this.x.clear();
        this.v = -9223372036854775807L;
        this.u = true;
    }

    @Override // defpackage.crm
    public final synchronized void a() {
        this.A = true;
    }

    @Override // defpackage.crm
    public final void b() {
        long j;
        long j2;
        long j3;
        synchronized (this) {
            j = this.y;
            j2 = this.w;
        }
        if (j != 0) {
            zhq zhqVar = zhq.ABR;
        }
        byi byiVarA = m().a(j);
        if (j2 != -9223372036854775807L) {
            tyt tytVar = new tyt(byiVarA.a);
            tytVar.e("min_lmt", String.valueOf(j2));
            byiVarA = byiVarA.c(tytVar.a());
        }
        try {
            bze bzeVar = this.m;
            cvb cvbVar = new cvb(bzeVar, byiVarA.h, bzeVar.b(byiVarA));
            if (j == 0) {
                this.C.b(new zbn(this, 1), -9223372036854775807L, -9223372036854775807L);
            }
            do {
                try {
                    if (this.A) {
                        break;
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        this.y = cvbVar.b - m().h;
                        throw th;
                    }
                }
            } while (this.C.d(cvbVar));
            synchronized (this) {
                try {
                    j3 = cvbVar.b - m().h;
                    this.y = j3;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (j3 <= 0) {
                zhr.e(zhq.LIVE, "EmptyChunkException, sequence %d, httpStatus %d", Long.valueOf(k()), Integer.valueOf(this.z));
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                throw new zaq(this.z, k(), m(), Math.max(this.l - this.k, 0L) / 1000);
            }
            synchronized (this) {
                try {
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.m.f();
            s();
        } catch (Throwable th4) {
            this.m.f();
            throw th4;
        }
    }

    @Override // defpackage.cpo
    public final synchronized long h() {
        return o();
    }

    @Override // defpackage.cpo
    public final synchronized boolean j() {
        return this.B;
    }

    final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        long j;
        j = this.o;
        return j != -1 ? 1 + j : -1L;
    }

    final synchronized void p(ywx ywxVar) {
        this.x.add(ywxVar);
    }

    final synchronized void q() {
        if (m().a.getQueryParameter("headm") != null) {
            this.w = -9223372036854775807L;
            t(-1L);
            this.q = -9223372036854775807L;
            this.r = -9223372036854775807L;
        }
        A();
    }

    final synchronized void r(long j) {
        this.v = j;
    }

    final synchronized void s() {
        this.B = !this.A;
    }

    final synchronized void t(long j) {
        this.o = j;
    }

    final synchronized void u(long j, long j2, long j3, Uri uri) {
        t(j);
        this.q = j2;
        this.r = j3;
        v(uri);
    }

    final synchronized void v(Uri uri) {
        this.p = this.p.c(uri);
        this.w = -9223372036854775807L;
        A();
    }

    final synchronized boolean w() {
        return !this.x.isEmpty();
    }

    final synchronized boolean x(long j) {
        this.r = j;
        if (!this.u) {
            return false;
        }
        this.q = j;
        this.u = false;
        return true;
    }

    final synchronized ywx[] y() {
        return (ywx[]) this.x.toArray(new ywx[0]);
    }

    public final synchronized void z(int i, elr elrVar) {
        this.z = i;
        if (i == 204) {
            throw new zhm(204, "Chunk not available yet. Need to retry.", m());
        }
        Long lB = elrVar.B("x-segment-lmt");
        long jLongValue = lB != null ? lB.longValue() : -9223372036854775807L;
        long j = this.w;
        if (j != -9223372036854775807L && j != jLongValue) {
            zhr.e(zhq.LIVE, "LastModifiedTime changed for sequence %d", Long.valueOf(k()));
            this.w = Math.max(this.w, jLongValue);
            throw new zar(m(), k());
        }
        this.w = jLongValue;
    }
}
