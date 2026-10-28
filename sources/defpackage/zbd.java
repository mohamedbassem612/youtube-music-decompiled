package defpackage;

import android.net.Uri;
import android.util.Pair;
import j$.util.Optional;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zbd implements cpl, zha, zaw {
    static final long a;
    private final long B;
    private int E;
    private final zjr H;
    private boolean I;
    private final tfq J;
    private final int K;
    private final xxj[] L;
    final zbc b;
    private final String d;
    private final bss e;
    private final bye f;
    private final cqs g;
    private final zfc h;
    private final zbk i;
    private final int j;
    private final zbg m;
    private final boolean n;
    private final long o;
    private final wiu p;
    private final yxb q;
    private zbe r;
    private zbj s;
    private Exception t;
    private boolean u;
    private final long w;
    private long x;
    private final long y;
    private long z;
    private final Map k = new HashMap();
    private final Map l = new HashMap();
    private long v = -9223372036854775807L;
    private long A = -9223372036854775807L;
    private long C = -9223372036854775807L;
    private long D = -1;
    private int F = 0;
    private long G = -9223372036854775807L;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 14400000000L;
    }

    public zbd(wiu wiuVar, wgs[] wgsVarArr, zgy zgyVar, yxb yxbVar, bzg bzgVar, zbg zbgVar, cqs cqsVar, zfc zfcVar, zbk zbkVar, String str, int i, boolean z, boolean z2, bss bssVar, xxj[] xxjVarArr, tfq tfqVar, zjr zjrVar) {
        this.x = -9223372036854775807L;
        this.z = -9223372036854775807L;
        zkf.a(wgsVarArr.length > 0);
        this.d = str;
        bye byeVarE = zgyVar.e(this, str, Optional.ofNullable(wgsVarArr[0].c));
        this.f = byeVarE;
        if (bzgVar != null) {
            byeVarE.e(bzgVar);
        }
        this.q = yxbVar;
        this.m = zbgVar;
        this.g = cqsVar;
        this.h = zfcVar;
        this.i = zbkVar;
        this.j = i;
        this.p = wiuVar;
        this.b = new zbc(this);
        for (wgs wgsVar : wgsVarArr) {
            bse bseVarM = wgsVar.m();
            this.k.put(bseVarM, wgsVar);
            this.l.put(bseVarM, new cpf(yno.N(wgsVar.B(), agpr.a, this), i, bseVarM));
        }
        this.u = true;
        this.n = z;
        int iP = 3;
        this.E = true == z2 ? 3 : 1;
        this.e = bssVar;
        akwm akwmVar = wiuVar.d.f;
        if (((akwmVar == null ? akwm.b : akwmVar).e & 64) != 0) {
            akwm akwmVar2 = wiuVar.d.f;
            iP = atqp.P((akwmVar2 == null ? akwm.b : akwmVar2).aB);
            if (iP == 0) {
                iP = 2;
            }
        }
        this.K = iP;
        this.L = xxjVarArr;
        this.J = tfqVar;
        this.H = zjrVar;
        Long lT = wiuVar.T();
        if (lT != null) {
            this.w = lT.longValue();
            Long lS = wiuVar.S();
            if (lS != null) {
                this.x = TimeUnit.MILLISECONDS.toMicros(lS.longValue());
            }
            Long lR = wiuVar.R();
            Long lQ = wiuVar.Q();
            this.y = lR != null ? lR.longValue() : -1L;
            this.z = lQ != null ? TimeUnit.MILLISECONDS.toMicros(lQ.longValue()) : -9223372036854775807L;
        } else {
            this.w = wgsVarArr[0].ak();
            this.y = wgsVarArr[0].aj();
        }
        wgs wgsVar2 = wgsVarArr[0];
        this.o = (long) (wgsVar2.b.B * 1000000.0d);
        double dA = wgsVar2.a();
        this.B = dA > 0.0d ? (long) (dA * 1000000.0d) : a;
    }

    private final synchronized void A() {
        try {
            zbj zbjVar = this.s;
            zbj zbjVarS = s();
            this.s = zbjVarS;
            zbg zbgVar = this.m;
            zbgVar.b(zbjVarS);
            if (zbjVar == null && this.w != -1 && !this.H.i.l(140, 45647750L, false)) {
                zbgVar.a("tmln", this.s.r + ";start." + this.p.v());
            }
        } catch (zbi e) {
            v("manifest.unparseable", e.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        if (r9 >= (r7 << 1)) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean B(long r21) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbd.B(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        if (r13 > r12.B) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean C(long r13, long r15, long r17) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L6f
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            r4 = 1
            if (r0 == 0) goto L76
            long r5 = defpackage.zbj.d     // Catch: java.lang.Throwable -> L73
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 < 0) goto L76
            int r5 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r5 != 0) goto L1f
            if (r0 == 0) goto L76
            goto L20
        L1f:
            r2 = r15
        L20:
            zbj r0 = r12.s     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L30
            long r5 = r0.j     // Catch: java.lang.Throwable -> L73
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L76
            long r5 = r0.k     // Catch: java.lang.Throwable -> L73
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 > 0) goto L76
        L30:
            long r5 = r12.w     // Catch: java.lang.Throwable -> L73
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L44
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 != 0) goto L44
            long r5 = r12.q(r5)     // Catch: java.lang.Throwable -> L73
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 <= 0) goto L76
        L44:
            long r5 = r12.y     // Catch: java.lang.Throwable -> L73
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r10 = -2
            if (r9 == 0) goto L51
            long r5 = r5 + r10
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 > 0) goto L76
        L51:
            int r5 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            r6 = 3
            if (r5 == 0) goto L63
            int r5 = r12.E     // Catch: java.lang.Throwable -> L73
            r7 = 2
            if (r5 == r7) goto L5d
            if (r5 != r6) goto L63
        L5d:
            long r7 = r17 + r10
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 > 0) goto L76
        L63:
            int r2 = r12.E     // Catch: java.lang.Throwable -> L73
            if (r2 != r6) goto L6f
            if (r0 != 0) goto L6f
            long r2 = r12.B     // Catch: java.lang.Throwable -> L73
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 > 0) goto L76
        L6f:
            monitor-exit(r12)
            goto L78
        L71:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L73
            throw r13
        L73:
            r0 = move-exception
            r13 = r0
            goto L71
        L76:
            monitor-exit(r12)
            r1 = r4
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbd.C(long, long, long):boolean");
    }

    private final synchronized String D(elr elrVar) {
        String strC;
        String strC2;
        zbe zbeVar;
        strC = elrVar.C("x-head-seqnum");
        strC2 = elrVar.C("x-head-time-millis");
        zbeVar = this.r;
        return "headsq." + strC + ";headms." + strC2 + ";sq." + (zbeVar != null ? Long.valueOf(zbeVar.k()) : "null").toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r10 <= r7) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized long p(long r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.w     // Catch: java.lang.Throwable -> L40
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            long r5 = r9.y     // Catch: java.lang.Throwable -> L40
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 != 0) goto L39
        Lf:
            int r5 = r9.E     // Catch: java.lang.Throwable -> L40
            r6 = 3
            if (r5 != r6) goto L18
            monitor-exit(r9)
            r0 = 0
            goto L3d
        L18:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 == 0) goto L3b
            if (r4 == 0) goto L3b
            long r7 = r9.x     // Catch: java.lang.Throwable -> L40
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L31
            zbj r4 = r9.s     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L30
            long r7 = r4.j     // Catch: java.lang.Throwable -> L40
            goto L31
        L30:
            r7 = r5
        L31:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L3b
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 > 0) goto L3b
        L39:
            monitor-exit(r9)
            goto L3d
        L3b:
            monitor-exit(r9)
            r0 = r2
        L3d:
            return r0
        L3e:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L40
            throw r10
        L40:
            r10 = move-exception
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbd.p(long):long");
    }

    private final synchronized long q(long j) {
        long j2;
        zbj zbjVar = this.s;
        j2 = -9223372036854775807L;
        if (zbjVar == null) {
            long j3 = this.w;
            if (j3 != -1 && j == j3) {
                j2 = this.x;
            } else if (this.E == 3) {
                j2 = j * this.o;
            }
        } else if (j != -1 && j >= 0) {
            long j4 = zbjVar.g;
            if (j <= j4) {
                long j5 = zbjVar.h;
                if (j >= j5) {
                    long j6 = zbjVar.i;
                    if (j <= j6 || j6 == -1) {
                        if (j5 == -1 || j != j5) {
                            long j7 = j4 - j;
                            long j8 = zbjVar.f;
                            long j9 = zbjVar.m;
                            Long.signum(j7);
                            j2 = j8 - (j7 * j9);
                        } else {
                            j2 = zbjVar.j;
                        }
                    }
                }
            }
        }
        return j2;
    }

    private final synchronized Pair r(Long l, Long l2) {
        if (l2 != null && l != null) {
            if (l2.longValue() != -1) {
                if (l.longValue() != -9223372036854775807L && this.E != 2 && (this.D == -1 || this.v == -9223372036854775807L || l2.longValue() > this.D || l.longValue() > this.v + 40000)) {
                    long jLongValue = this.D != -1 ? l2.longValue() - this.D : -1L;
                    long jLongValue2 = this.v != -9223372036854775807L ? l.longValue() - this.v : -9223372036854775807L;
                    this.v = l.longValue();
                    long jLongValue3 = l2.longValue();
                    this.D = jLongValue3;
                    this.h.f(jLongValue3, this.v);
                    A();
                    return Pair.create(Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
                }
            }
        }
        return null;
    }

    private final synchronized zbj s() {
        return new zbj(this.v, this.D, this.w, this.y, this.x, this.z, this.A, this.B, this.o, this.h.b(), this.C, this.n, this.E, this.e, this.K, this.H);
    }

    private final synchronized void t(Long l, Long l2) {
        zkf.d(this.r);
        long j = this.x;
        long j2 = this.z;
        Object objValueOf = l != null ? Long.valueOf(bwp.F(l.longValue())) : "null";
        long j3 = this.w;
        Object obj = l2 != null ? l2 : "null";
        String string = objValueOf.toString();
        String string2 = obj.toString();
        Object objValueOf2 = j3 != -1 ? Long.valueOf(j3) : "UNSET";
        long j4 = this.y;
        String string3 = objValueOf2.toString();
        String string4 = (j4 != -1 ? Long.valueOf(j4) : "UNSET").toString();
        String string5 = (j != -9223372036854775807L ? Long.valueOf(bwp.F(j)) : "UNSET").toString();
        String str = "maxtime." + string + ";maxsq." + string2 + ";mindvrsq." + string3 + ";maxdvrsq." + string4 + ";mindvrtime." + string5 + ";maxdvrtime." + (j2 != -9223372036854775807L ? Long.valueOf(bwp.F(j2)) : "UNSET").toString();
        zav zavVar = null;
        if (l != null) {
            if (this.x != -9223372036854775807L && l.longValue() < this.x) {
                zavVar = new zav(this.r.m(), "x-head-time-millis", str);
            } else if (this.z != -9223372036854775807L && l.longValue() < this.z) {
                zavVar = new zav(this.r.m(), "x-head-time-millis", str);
            }
        }
        if (zavVar == null && l2 != null) {
            if (j3 != -1 && l2.longValue() < j3) {
                zavVar = new zav(this.r.m(), "x-head-seqnum", str);
            } else if (j4 != -1 && l2.longValue() < j4) {
                zavVar = new zav(this.r.m(), "x-head-seqnum", str);
            }
        }
        if (zavVar != null) {
            zhr.e(zhq.LIVE, "cpn=%s: Track %d Stale WindowedLiveConfig: %s", this.d, Integer.valueOf(this.j), str);
            throw zavVar;
        }
    }

    private final synchronized void u() {
        if (this.D != -1 && this.v != -9223372036854775807L) {
            A();
        }
    }

    private final synchronized void v(String str, String str2) {
        zbe zbeVar = this.r;
        long jF = -1;
        if (zbeVar != null && zbeVar.l() != -9223372036854775807L) {
            jF = bwp.F(zbeVar.l());
        }
        zbg zbgVar = this.m;
        zbgVar.a.post(new yts(zbgVar, new zhz(str, jF, str2), 19));
    }

    private final synchronized void w(ywx ywxVar) {
        zkf.d(this.r);
        zkf.a(ywxVar.a.equals("http://youtube.com/streaming/metadata/segment/102015"));
        Integer numB = ywxVar.b("Sequence-Number");
        if (numB == null) {
            throw new bsz("Sequence-Number not found in EmbeddedMetadata", null, true, 1);
        }
        long jK = this.r.k();
        zbe zbeVar = this.r;
        if (jK == -1) {
            zbeVar.t(numB.intValue());
            if (this.r.a == -9223372036854775807L) {
                long jA = this.i.a(this, numB.intValue());
                if (jA != numB.intValue()) {
                    zhr.e(zhq.LIVE, "cpn=%s: Track %d Live head race, got sequence %d, coordinatedSequence %d", this.d, Integer.valueOf(this.j), numB, Long.valueOf(jA));
                    throw new zat(numB.intValue(), jA);
                }
            }
        } else if (zbeVar.k() != numB.intValue()) {
            throw new bsz("Expected sequence " + this.r.k() + " got sequence " + numB, null, true, 1);
        }
        Long lC = ywxVar.c("Ingestion-Walltime-Us");
        if (lC != null) {
            this.r.r(lC.longValue());
        }
        if ("T".equals(ywxVar.d("Stream-Finished"))) {
            this.r.t = true;
        }
    }

    private final synchronized void x() {
        this.F = 0;
        this.G = -9223372036854775807L;
    }

    private final synchronized void y(long j) {
        int i;
        long j2;
        zkf.d(this.r);
        long j3 = this.r.a - j;
        long j4 = this.o;
        long jFloor = (long) Math.floor(j3 / j4);
        zbe zbeVar = this.r;
        this.m.a("skms", "fmt." + zbeVar.h.a + ";liveSeq." + this.D + ";liveMs." + (this.v / 1000) + ";seekMs." + (zbeVar.a / 1000) + ";loadedMs." + (j / 1000) + ";loadedSeq." + zbeVar.k() + ";errorChunks." + jFloor + ";misses." + this.F);
        zhr.e(zhq.LIVE, "Track %d Seek miss, loaded sequence %d starts at time %.1f sec, errorChunks %d", Integer.valueOf(this.j), Long.valueOf(this.r.k()), Double.valueOf(((double) j) / 1000000.0d), Long.valueOf(jFloor));
        long jMax = Math.max(this.r.k() + jFloor, 0L);
        Long.signum(jFloor);
        long jMax2 = Math.max(j + (jFloor * j4), zbj.d);
        long j5 = this.w;
        long j6 = -1;
        if (j5 != -1) {
            jMax = Math.max(jMax, j5);
        }
        long j7 = this.y;
        if (j7 != -1) {
            jMax = Math.min(jMax, j7);
        }
        zbj zbjVar = this.s;
        if (zbjVar != null) {
            jMax = Math.min(jMax, zbjVar.jE(zbjVar.k));
        }
        long j8 = this.x;
        if (j8 != -9223372036854775807L) {
            jMax2 = Math.max(jMax2, j8);
        }
        long j9 = this.z;
        if (j9 != -9223372036854775807L) {
            jMax2 = Math.min(jMax2, j9);
        }
        long j10 = this.v;
        if (j10 != -9223372036854775807L) {
            jMax2 = Math.min(jMax2, j10);
        }
        long jAbs = Math.abs(j3);
        if (jMax != this.r.k()) {
            i = 1;
            long j11 = jMax2;
            long j12 = this.G;
            if ((j12 == -9223372036854775807L || jAbs < j12) && this.F < 8) {
                j2 = j11;
                j6 = jMax;
            }
            this.F += i;
            this.G = jAbs;
            throw new zau(this.r.a, jFloor, j6, j2);
        }
        i = 1;
        j2 = -9223372036854775807L;
        this.F += i;
        this.G = jAbs;
        throw new zau(this.r.a, jFloor, j6, j2);
    }

    private final synchronized void z(zbe zbeVar) {
        long jK = zbeVar.k();
        long jQ = q(jK);
        long jZ = yno.z(jQ, this.o);
        zs zsVar = new zs(zbeVar.m().a);
        ((tyt) zsVar.a).h("headm");
        zsVar.A(jK);
        zbeVar.u(jK, jQ, jZ, zsVar.x());
    }

    @Override // defpackage.cpl
    public final int a(long j, List list) {
        return this.g.e(j, list);
    }

    final synchronized long c(long j) {
        long j2;
        zbj zbjVar = this.s;
        if (zbjVar != null) {
            return zbjVar.jE(j);
        }
        long j3 = this.x;
        if (j3 != -9223372036854775807L && j == j3) {
            j2 = this.w;
        } else {
            if (this.E != 3 || j == 0 || j == this.H.v() || j < zbj.d || this.w != -1 || j >= this.B) {
                return -1L;
            }
            j2 = j / this.o;
        }
        return j2;
    }

    @Override // defpackage.cpl
    public final synchronized void e(cpg cpgVar) {
        if (cpgVar instanceof zbe) {
            zbe zbeVar = (zbe) cpgVar;
            if (cpgVar == this.r && this.E == 1 && zbeVar.t) {
                this.E = 2;
                this.D = zbeVar.k();
                this.v = zbeVar.l();
                this.A = zbeVar.i();
                zhq zhqVar = zhq.ABR;
                zbeVar.k();
                zbeVar.l();
                zbeVar.i();
                this.h.e(this.D, this.v);
                u();
            }
        }
    }

    @Override // defpackage.cpl
    public final void f() {
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            ((cpf) it.next()).c();
        }
    }

    @Override // defpackage.cpl
    public final void g() {
        this.g.t();
    }

    @Override // defpackage.cpl
    public final synchronized boolean h(cpg cpgVar, boolean z, aae aaeVar, crj crjVar) {
        if ((cpgVar instanceof zbe) && cpgVar == this.r) {
            Object obj = aaeVar.c;
            this.i.d();
            if (obj instanceof zat) {
                if (!z) {
                    z = false;
                }
                this.t = (Exception) obj;
                return true;
            }
            if (obj instanceof zau) {
                if (!z) {
                    z = false;
                }
                this.t = (Exception) obj;
                return true;
            }
            if (!(obj instanceof ywu) || !z) {
                if (obj instanceof zar) {
                    this.r.q();
                    return false;
                }
                if (obj instanceof byv) {
                    zhr.e(zhq.LIVE, "cpn=%s: Track %d Http status %d blocked load", this.d, Integer.valueOf(this.j), Integer.valueOf(((byv) obj).d));
                }
                if (this.r.m().a.getQueryParameter("headm") != null) {
                    long jK = this.r.k();
                    zbe zbeVar = this.r;
                    if (jK != -1) {
                        z(zbeVar);
                    } else {
                        zbeVar.v(zbeVar.m().a);
                    }
                }
            }
            this.t = (Exception) obj;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a4 A[PHI: r5
      0x01a4: PHI (r5v12 long) = (r5v11 long), (r5v13 long) binds: [B:98:0x0193, B:101:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01c4 A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cd A[PHI: r4
      0x01cd: PHI (r4v16 long) = (r4v15 long), (r4v19 long) binds: [B:110:0x01c0, B:112:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x01dc A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01eb A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:127:0x0200 A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0239 A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x023d A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0241 A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0248 A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x025e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0262 A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x026c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0271  */
    /* JADX WARN: Code duplicated, block: B:146:0x0279 A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x027c A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x02ac A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f8 A[Catch: all -> 0x030d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0024, B:41:0x007a, B:43:0x0083, B:45:0x008b, B:47:0x0093, B:49:0x00c4, B:52:0x00c9, B:54:0x00d9, B:112:0x01c4, B:115:0x01ce, B:117:0x01dc, B:123:0x01eb, B:125:0x01f4, B:127:0x0200, B:128:0x0202, B:131:0x0239, B:141:0x0262, B:146:0x0279, B:148:0x027e, B:150:0x02ac, B:151:0x02b1, B:147:0x027c, B:132:0x023d, B:134:0x0241, B:136:0x024a, B:135:0x0248, B:155:0x02e6, B:156:0x02f7, B:157:0x02f8, B:158:0x030a, B:58:0x00f2, B:59:0x00fb, B:61:0x00ff, B:63:0x0103, B:66:0x0110, B:71:0x012b, B:74:0x013b, B:76:0x0141, B:78:0x0149, B:80:0x0151, B:88:0x0178, B:95:0x0188, B:99:0x0195, B:104:0x01a5, B:82:0x0165, B:11:0x002d, B:21:0x004b, B:24:0x0051, B:26:0x0055, B:36:0x0073, B:31:0x0063, B:34:0x006b, B:14:0x0035, B:17:0x003d, B:19:0x0041), top: B:163:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[ADDED_TO_REGION] */
    @Override // defpackage.cpl
    public final synchronized void i(ccy ccyVar, long j, List list, fsz fszVar) {
        List list2;
        zbe zbeVar;
        zbe zbeVar2;
        long j2;
        long jP;
        boolean z;
        long j3;
        boolean z2;
        long jP2;
        long j4;
        long j5;
        long jL;
        zbe zbeVar3;
        long j6;
        wgs wgsVar;
        long j7;
        long jF;
        Uri uriA;
        long j8;
        zs zsVar;
        Object obj;
        cpf cpfVar;
        int i;
        int i2;
        long j9;
        long j10;
        ypp yppVarA;
        long j11 = j;
        synchronized (this) {
            Exception exc = this.t;
            this.t = null;
            if (list.isEmpty()) {
                list2 = list;
                zbeVar = null;
            } else {
                list2 = list;
                zbeVar = (zbe) list2.get(list.size() - 1);
            }
            boolean z3 = this.n;
            if (!z3 || zbeVar != null) {
                int i3 = this.E;
                if ((i3 != 2 && i3 != 3) || this.D == -1 || zbeVar == null || (!zbeVar.t && zbeVar.k() < this.D)) {
                    if (this.E != 3) {
                        zbeVar2 = zbeVar;
                        j2 = this.y;
                        if (j2 != -1 || zbeVar == null || zbeVar.k() != j2) {
                            zbeVar = zbeVar2;
                        }
                    } else if (zbeVar != null) {
                        zbj zbjVar = this.s;
                        if (zbjVar != null) {
                            if (zbeVar.i() < zbjVar.k) {
                            }
                        }
                        zbeVar2 = zbeVar;
                        j2 = this.y;
                        if (j2 != -1) {
                        }
                        zbeVar = zbeVar2;
                    } else {
                        zbeVar2 = null;
                        j2 = this.y;
                        if (j2 != -1) {
                        }
                        zbeVar = zbeVar2;
                    }
                }
                fszVar.a = true;
                return;
            }
            long j12 = ccyVar.a;
            zbe zbeVar4 = zbeVar;
            long jMax = Math.max(yno.A((zbeVar == null || zbeVar.i() == -9223372036854775807L) ? j11 : zbeVar.i(), j12), 0L);
            long jA = yno.A(this.v, j12);
            cqs cqsVar = this.g;
            cpq[] cpqVarArr = new cpq[cqsVar.q()];
            Arrays.fill(cpqVarArr, cpq.b);
            cqsVar.m(j12, jMax, jA, list2, cpqVarArr);
            bse bseVarC = cqsVar.c();
            if (bseVarC == null) {
                fszVar.b = null;
                return;
            }
            long j13 = this.v;
            zfc zfcVar = this.h;
            long jA2 = yno.A(j13, zfcVar.b());
            if (exc instanceof zat) {
                jP2 = ((zat) exc).a;
                jL = -9223372036854775807L;
            } else {
                if (zbeVar4 == null) {
                    if ((exc instanceof ywu) && (zbeVar3 = this.r) != null) {
                        jP2 = zbeVar3.k();
                        jL = zbeVar3.l();
                    } else if (j11 == 0) {
                        jP2 = p(-9223372036854775807L);
                        jL = -9223372036854775807L;
                        j5 = -9223372036854775807L;
                        j4 = -9223372036854775807L;
                        z = true;
                    } else if (j11 == jA2 && jA2 != -9223372036854775807L && this.E == 1) {
                        z = true;
                        jL = -9223372036854775807L;
                        j4 = -9223372036854775807L;
                        jP2 = -1;
                        j5 = -9223372036854775807L;
                    } else {
                        zhq zhqVar = zhq.ABR;
                        if (exc instanceof zau) {
                            zau zauVar = (zau) exc;
                            if (j11 == zauVar.a) {
                                jP = zauVar.b;
                                long jQ = zauVar.c;
                                if (jP == -1) {
                                    x();
                                    jP = c(j11);
                                    jQ = q(jP);
                                    j11 = -9223372036854775807L;
                                }
                                j3 = jQ;
                                z = false;
                            } else {
                                x();
                                jP = -1;
                                z = true;
                                j3 = -9223372036854775807L;
                            }
                        } else {
                            jP = -1;
                            z = true;
                            j3 = -9223372036854775807L;
                        }
                        if (z3) {
                            if (jP == -1) {
                                jP = z ? c(j11) : -1L;
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (jP == -1) {
                            jP = z ? this.i.b(j11) : -1L;
                        }
                        if (jP == -1) {
                            jP = p(j11);
                            if (z2 && z) {
                                jP2 = jP;
                            } else {
                                jP2 = jP;
                                j11 = -9223372036854775807L;
                            }
                        } else {
                            jP2 = jP;
                        }
                        j4 = -9223372036854775807L;
                        j5 = C(j11, jP2, this.D) ? -9223372036854775807L : j11;
                        jL = j3;
                    }
                    if (jL != j4) {
                        if (z) {
                            jL = q(jP2);
                        } else {
                            jL = j4;
                        }
                    }
                    j6 = this.o;
                    wgsVar = (wgs) this.k.get(bseVarC);
                    if (wgsVar != null) {
                        throw new IllegalStateException("Missing FormatStreamModel for format ".concat(String.valueOf(bseVarC.a)));
                    }
                    yxb yxbVar = this.q;
                    if (jP2 != -1) {
                        j7 = jP2;
                    } else {
                        j7 = -1;
                    }
                    if (jL != j4) {
                        jF = bwp.F(jL);
                    } else {
                        jF = -1;
                    }
                    uriA = yxbVar.a(wgsVar, j7, jF);
                    j8 = j5;
                    if (uriA == null) {
                        uriA = wgsVar.e;
                    }
                    zsVar = new zs(uriA);
                    zsVar.y(this.d);
                    zsVar.z(yno.az(wgsVar, this.p, cqsVar.g(), this.J.a()));
                    obj = zsVar.a;
                    ((tyt) obj).h("smb");
                    cpfVar = (cpf) this.l.get(bseVarC);
                    if (cpfVar != null) {
                        throw new IllegalStateException("Missing ChunkExtractor for format ".concat(String.valueOf(bseVarC.a)));
                    }
                    if (jP2 != -1) {
                        zsVar.A(jP2);
                    } else {
                        i = zfcVar.i;
                        if (i > 0) {
                            i2 = ((zfcVar.n + i) - 1) / i;
                        } else {
                            i2 = zfcVar.h;
                        }
                        ((tyt) obj).e("headm", Integer.toString(i2));
                        this.u = true;
                        jP2 = -1;
                    }
                    if (jP2 == -1) {
                        j9 = j8;
                        j10 = jP2;
                    } else if (j8 == j4) {
                        this.i.f(this);
                        j10 = -1;
                        j9 = j4;
                    } else {
                        j9 = j8;
                        j10 = -1;
                    }
                    if (j9 != j4) {
                        zhq zhqVar2 = zhq.ABR;
                    } else {
                        zhq zhqVar3 = zhq.ABR;
                    }
                    bye byeVar = this.f;
                    xxj[] xxjVarArr = this.L;
                    yppVarA = ypq.a();
                    yppVarA.n(xxjVarArr);
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    yppVarA.h(j12 / 1000);
                    yppVarA.c(jL);
                    yppVarA.b(j6);
                    yppVarA.e(bseVarC.i);
                    yppVarA.g = wgsVar;
                    if (this.H.cI()) {
                        yppVarA.j(tok.MEDIA_PLAYER_MANIFESTLESS_LIVE_CHUNK);
                    }
                    long jZ = yno.z(jL, j6);
                    byh byhVar = new byh();
                    byhVar.a = zsVar.x();
                    byhVar.k = yppVarA.a();
                    zbe zbeVar5 = new zbe(byeVar, byhVar.a(), bseVarC, cqsVar.g(), cqsVar.h(), jL, jZ, j9, j10, cpfVar, this.b);
                    this.r = zbeVar5;
                    fszVar.b = zbeVar5;
                }
                jP2 = zbeVar4.o();
                jL = zbeVar4.i();
            }
            j5 = -9223372036854775807L;
            j4 = -9223372036854775807L;
            z = true;
            if (jL != j4) {
                if (z) {
                    jL = q(jP2);
                } else {
                    jL = j4;
                }
            }
            j6 = this.o;
            wgsVar = (wgs) this.k.get(bseVarC);
            if (wgsVar != null) {
                throw new IllegalStateException("Missing FormatStreamModel for format ".concat(String.valueOf(bseVarC.a)));
            }
            yxb yxbVar2 = this.q;
            if (jP2 != -1) {
                j7 = jP2;
            } else {
                j7 = -1;
            }
            if (jL != j4) {
                jF = bwp.F(jL);
            } else {
                jF = -1;
            }
            uriA = yxbVar2.a(wgsVar, j7, jF);
            j8 = j5;
            if (uriA == null) {
                uriA = wgsVar.e;
            }
            zsVar = new zs(uriA);
            zsVar.y(this.d);
            zsVar.z(yno.az(wgsVar, this.p, cqsVar.g(), this.J.a()));
            obj = zsVar.a;
            ((tyt) obj).h("smb");
            cpfVar = (cpf) this.l.get(bseVarC);
            if (cpfVar != null) {
                throw new IllegalStateException("Missing ChunkExtractor for format ".concat(String.valueOf(bseVarC.a)));
            }
            if (jP2 != -1) {
                zsVar.A(jP2);
            } else {
                i = zfcVar.i;
                if (i > 0) {
                    i2 = ((zfcVar.n + i) - 1) / i;
                } else {
                    i2 = zfcVar.h;
                }
                ((tyt) obj).e("headm", Integer.toString(i2));
                this.u = true;
                jP2 = -1;
            }
            if (jP2 == -1) {
                j9 = j8;
                j10 = jP2;
            } else if (j8 == j4) {
                this.i.f(this);
                j10 = -1;
                j9 = j4;
            } else {
                j9 = j8;
                j10 = -1;
            }
            if (j9 != j4) {
                zhq zhqVar4 = zhq.ABR;
            } else {
                zhq zhqVar5 = zhq.ABR;
            }
            bye byeVar2 = this.f;
            xxj[] xxjVarArr2 = this.L;
            yppVarA = ypq.a();
            yppVarA.n(xxjVarArr2);
            TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
            yppVarA.h(j12 / 1000);
            yppVarA.c(jL);
            yppVarA.b(j6);
            yppVarA.e(bseVarC.i);
            yppVarA.g = wgsVar;
            if (this.H.cI()) {
                yppVarA.j(tok.MEDIA_PLAYER_MANIFESTLESS_LIVE_CHUNK);
            }
            long jZ2 = yno.z(jL, j6);
            byh byhVar2 = new byh();
            byhVar2.a = zsVar.x();
            byhVar2.k = yppVarA.a();
            zbe zbeVar6 = new zbe(byeVar2, byhVar2.a(), bseVarC, cqsVar.g(), cqsVar.h(), jL, jZ2, j9, j10, cpfVar, this.b);
            this.r = zbeVar6;
            fszVar.b = zbeVar6;
        }
    }

    @Override // defpackage.zaw
    public final synchronized void j(ywx ywxVar) {
        zkf.d(this.r);
        this.r.p(ywxVar);
        if (ywxVar.a.equals("http://youtube.com/streaming/metadata/segment/102015")) {
            if (ywxVar.b("Sequence-Number") == null) {
                throw new bsz("Sequence-Number not found in EmbeddedMetadata", null, true, 1);
            }
            w(ywxVar);
        }
    }

    @Override // defpackage.zaw
    public final synchronized void k(IOException iOException) {
        o(iOException);
    }

    final synchronized ywu l() {
        Exception exc = this.t;
        if (!(exc instanceof ywu)) {
            return null;
        }
        return (ywu) exc;
    }

    @Override // defpackage.zha
    public final synchronized void m(int i, Map map) {
        zkf.d(this.r);
        Long lValueOf = null;
        elr elrVar = new elr(map, (byte[]) null);
        String strC = elrVar.C("x-head-time-millis");
        if (strC != null) {
            try {
                lValueOf = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(Long.parseLong(strC)));
            } catch (NumberFormatException unused) {
            }
        }
        Long lB = elrVar.B("x-head-seqnum");
        if (lB == null || lB.longValue() < 0 || lValueOf == null || lValueOf.longValue() < 0) {
            this.m.a("lvhead", D(elrVar));
        } else if (this.p.aw(akwl.EXO_PLAYER_CONFIG_FEATURES_LOG_HTTP_HEADER_DECREASED) && this.D != -1 && this.v != -9223372036854775807L && (lB.longValue() < this.D || lValueOf.longValue() + this.o < this.v)) {
            this.m.a("lvhead", "trk." + this.j + ";maxsq." + this.D + ";maxms." + bwp.F(this.v) + ';' + D(elrVar));
        }
        t(lValueOf, lB);
        r(lValueOf, lB);
        try {
            this.r.z(i, elrVar);
        } catch (zhm e) {
            long j = this.o;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            throw new zas(e, j / 1000);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0068 A[Catch: all -> 0x0289, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0017, B:8:0x0021, B:14:0x0068, B:16:0x006f, B:18:0x0083, B:20:0x0089, B:22:0x00a8, B:24:0x00af, B:26:0x00c1, B:28:0x00d4, B:30:0x010b, B:32:0x0124, B:34:0x012a, B:35:0x012d, B:37:0x0133, B:39:0x013c, B:40:0x0177, B:41:0x0178, B:43:0x017e, B:45:0x0187, B:46:0x01c2, B:48:0x01ce, B:50:0x01d5, B:52:0x01df, B:54:0x01ee, B:56:0x01f4, B:58:0x01fa, B:60:0x0204, B:62:0x0209, B:64:0x020e, B:66:0x0216, B:68:0x0225, B:70:0x022d, B:72:0x0235, B:74:0x0244, B:76:0x024c, B:79:0x0261, B:80:0x0268, B:81:0x0269, B:82:0x0270, B:83:0x0271, B:84:0x0284, B:11:0x005d), top: B:91:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0119  */
    /* JADX WARN: Code duplicated, block: B:34:0x012a A[Catch: all -> 0x0289, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0017, B:8:0x0021, B:14:0x0068, B:16:0x006f, B:18:0x0083, B:20:0x0089, B:22:0x00a8, B:24:0x00af, B:26:0x00c1, B:28:0x00d4, B:30:0x010b, B:32:0x0124, B:34:0x012a, B:35:0x012d, B:37:0x0133, B:39:0x013c, B:40:0x0177, B:41:0x0178, B:43:0x017e, B:45:0x0187, B:46:0x01c2, B:48:0x01ce, B:50:0x01d5, B:52:0x01df, B:54:0x01ee, B:56:0x01f4, B:58:0x01fa, B:60:0x0204, B:62:0x0209, B:64:0x020e, B:66:0x0216, B:68:0x0225, B:70:0x022d, B:72:0x0235, B:74:0x0244, B:76:0x024c, B:79:0x0261, B:80:0x0268, B:81:0x0269, B:82:0x0270, B:83:0x0271, B:84:0x0284, B:11:0x005d), top: B:91:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ee A[Catch: all -> 0x0289, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0017, B:8:0x0021, B:14:0x0068, B:16:0x006f, B:18:0x0083, B:20:0x0089, B:22:0x00a8, B:24:0x00af, B:26:0x00c1, B:28:0x00d4, B:30:0x010b, B:32:0x0124, B:34:0x012a, B:35:0x012d, B:37:0x0133, B:39:0x013c, B:40:0x0177, B:41:0x0178, B:43:0x017e, B:45:0x0187, B:46:0x01c2, B:48:0x01ce, B:50:0x01d5, B:52:0x01df, B:54:0x01ee, B:56:0x01f4, B:58:0x01fa, B:60:0x0204, B:62:0x0209, B:64:0x020e, B:66:0x0216, B:68:0x0225, B:70:0x022d, B:72:0x0235, B:74:0x0244, B:76:0x024c, B:79:0x0261, B:80:0x0268, B:81:0x0269, B:82:0x0270, B:83:0x0271, B:84:0x0284, B:11:0x005d), top: B:91:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0209 A[Catch: all -> 0x0289, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0017, B:8:0x0021, B:14:0x0068, B:16:0x006f, B:18:0x0083, B:20:0x0089, B:22:0x00a8, B:24:0x00af, B:26:0x00c1, B:28:0x00d4, B:30:0x010b, B:32:0x0124, B:34:0x012a, B:35:0x012d, B:37:0x0133, B:39:0x013c, B:40:0x0177, B:41:0x0178, B:43:0x017e, B:45:0x0187, B:46:0x01c2, B:48:0x01ce, B:50:0x01d5, B:52:0x01df, B:54:0x01ee, B:56:0x01f4, B:58:0x01fa, B:60:0x0204, B:62:0x0209, B:64:0x020e, B:66:0x0216, B:68:0x0225, B:70:0x022d, B:72:0x0235, B:74:0x0244, B:76:0x024c, B:79:0x0261, B:80:0x0268, B:81:0x0269, B:82:0x0270, B:83:0x0271, B:84:0x0284, B:11:0x005d), top: B:91:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0225 A[Catch: all -> 0x0289, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0017, B:8:0x0021, B:14:0x0068, B:16:0x006f, B:18:0x0083, B:20:0x0089, B:22:0x00a8, B:24:0x00af, B:26:0x00c1, B:28:0x00d4, B:30:0x010b, B:32:0x0124, B:34:0x012a, B:35:0x012d, B:37:0x0133, B:39:0x013c, B:40:0x0177, B:41:0x0178, B:43:0x017e, B:45:0x0187, B:46:0x01c2, B:48:0x01ce, B:50:0x01d5, B:52:0x01df, B:54:0x01ee, B:56:0x01f4, B:58:0x01fa, B:60:0x0204, B:62:0x0209, B:64:0x020e, B:66:0x0216, B:68:0x0225, B:70:0x022d, B:72:0x0235, B:74:0x0244, B:76:0x024c, B:79:0x0261, B:80:0x0268, B:81:0x0269, B:82:0x0270, B:83:0x0271, B:84:0x0284, B:11:0x005d), top: B:91:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:70:0x022d A[Catch: all -> 0x0289, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0017, B:8:0x0021, B:14:0x0068, B:16:0x006f, B:18:0x0083, B:20:0x0089, B:22:0x00a8, B:24:0x00af, B:26:0x00c1, B:28:0x00d4, B:30:0x010b, B:32:0x0124, B:34:0x012a, B:35:0x012d, B:37:0x0133, B:39:0x013c, B:40:0x0177, B:41:0x0178, B:43:0x017e, B:45:0x0187, B:46:0x01c2, B:48:0x01ce, B:50:0x01d5, B:52:0x01df, B:54:0x01ee, B:56:0x01f4, B:58:0x01fa, B:60:0x0204, B:62:0x0209, B:64:0x020e, B:66:0x0216, B:68:0x0225, B:70:0x022d, B:72:0x0235, B:74:0x0244, B:76:0x024c, B:79:0x0261, B:80:0x0268, B:81:0x0269, B:82:0x0270, B:83:0x0271, B:84:0x0284, B:11:0x005d), top: B:91:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0235 A[Catch: all -> 0x0289, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0017, B:8:0x0021, B:14:0x0068, B:16:0x006f, B:18:0x0083, B:20:0x0089, B:22:0x00a8, B:24:0x00af, B:26:0x00c1, B:28:0x00d4, B:30:0x010b, B:32:0x0124, B:34:0x012a, B:35:0x012d, B:37:0x0133, B:39:0x013c, B:40:0x0177, B:41:0x0178, B:43:0x017e, B:45:0x0187, B:46:0x01c2, B:48:0x01ce, B:50:0x01d5, B:52:0x01df, B:54:0x01ee, B:56:0x01f4, B:58:0x01fa, B:60:0x0204, B:62:0x0209, B:64:0x020e, B:66:0x0216, B:68:0x0225, B:70:0x022d, B:72:0x0235, B:74:0x0244, B:76:0x024c, B:79:0x0261, B:80:0x0268, B:81:0x0269, B:82:0x0270, B:83:0x0271, B:84:0x0284, B:11:0x005d), top: B:91:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0261 A[Catch: all -> 0x0289, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0017, B:8:0x0021, B:14:0x0068, B:16:0x006f, B:18:0x0083, B:20:0x0089, B:22:0x00a8, B:24:0x00af, B:26:0x00c1, B:28:0x00d4, B:30:0x010b, B:32:0x0124, B:34:0x012a, B:35:0x012d, B:37:0x0133, B:39:0x013c, B:40:0x0177, B:41:0x0178, B:43:0x017e, B:45:0x0187, B:46:0x01c2, B:48:0x01ce, B:50:0x01d5, B:52:0x01df, B:54:0x01ee, B:56:0x01f4, B:58:0x01fa, B:60:0x0204, B:62:0x0209, B:64:0x020e, B:66:0x0216, B:68:0x0225, B:70:0x022d, B:72:0x0235, B:74:0x0244, B:76:0x024c, B:79:0x0261, B:80:0x0268, B:81:0x0269, B:82:0x0270, B:83:0x0271, B:84:0x0284, B:11:0x005d), top: B:91:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0269 A[Catch: all -> 0x0289, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0017, B:8:0x0021, B:14:0x0068, B:16:0x006f, B:18:0x0083, B:20:0x0089, B:22:0x00a8, B:24:0x00af, B:26:0x00c1, B:28:0x00d4, B:30:0x010b, B:32:0x0124, B:34:0x012a, B:35:0x012d, B:37:0x0133, B:39:0x013c, B:40:0x0177, B:41:0x0178, B:43:0x017e, B:45:0x0187, B:46:0x01c2, B:48:0x01ce, B:50:0x01d5, B:52:0x01df, B:54:0x01ee, B:56:0x01f4, B:58:0x01fa, B:60:0x0204, B:62:0x0209, B:64:0x020e, B:66:0x0216, B:68:0x0225, B:70:0x022d, B:72:0x0235, B:74:0x0244, B:76:0x024c, B:79:0x0261, B:80:0x0268, B:81:0x0269, B:82:0x0270, B:83:0x0271, B:84:0x0284, B:11:0x005d), top: B:91:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0271 A[Catch: all -> 0x0289, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0017, B:8:0x0021, B:14:0x0068, B:16:0x006f, B:18:0x0083, B:20:0x0089, B:22:0x00a8, B:24:0x00af, B:26:0x00c1, B:28:0x00d4, B:30:0x010b, B:32:0x0124, B:34:0x012a, B:35:0x012d, B:37:0x0133, B:39:0x013c, B:40:0x0177, B:41:0x0178, B:43:0x017e, B:45:0x0187, B:46:0x01c2, B:48:0x01ce, B:50:0x01d5, B:52:0x01df, B:54:0x01ee, B:56:0x01f4, B:58:0x01fa, B:60:0x0204, B:62:0x0209, B:64:0x020e, B:66:0x0216, B:68:0x0225, B:70:0x022d, B:72:0x0235, B:74:0x0244, B:76:0x024c, B:79:0x0261, B:80:0x0268, B:81:0x0269, B:82:0x0270, B:83:0x0271, B:84:0x0284, B:11:0x005d), top: B:91:0x000b }] */
    final synchronized void n(long j) {
        long j2;
        boolean zX;
        char c;
        long j3;
        long j4;
        long j5;
        zbe zbeVar;
        bse bseVar;
        wgs wgsVar;
        long jK;
        long jL;
        long j6;
        long j7;
        long j8;
        Long lValueOf;
        Pair pairR;
        zkf.d(this.r);
        char c2 = 0;
        if (j == 0) {
            if (this.r.k() != 0) {
                v("invalid.timestamp", "timeMs." + Long.valueOf(bwp.F(0L)).toString() + ";track." + this.j + ";sq." + this.r.k());
                j2 = 0L;
                zX = false;
            } else {
                j2 = 0;
            }
            c = 1;
            if (zX) {
                j3 = 0;
                if (this.y == -1 || (pairR = r((lValueOf = Long.valueOf(j2)), Long.valueOf(this.r.k()))) == null) {
                    c = 1;
                    j4 = -1;
                    j3 = 0;
                    j5 = -9223372036854775807L;
                } else {
                    j4 = -1;
                    if (this.I) {
                        j5 = -9223372036854775807L;
                    } else {
                        this.I = true;
                        zbg zbgVar = this.m;
                        int i = this.j;
                        j5 = -9223372036854775807L;
                        long jK2 = this.r.k();
                        String strValueOf = String.valueOf(((Long) pairR.first).longValue() != -1 ? (Serializable) pairR.first : "UNSET");
                        zbgVar.a("uhbc", "track." + i + ";sq." + jK2 + ";sqDiff." + strValueOf + ";msDiff." + (((Long) pairR.second).longValue() != -9223372036854775807L ? Long.valueOf(bwp.F(((Long) pairR.second).longValue())) : "UNSET").toString());
                    }
                    t(lValueOf, Long.valueOf(this.r.k()));
                }
                if (B(j2)) {
                    y(j2);
                }
                j7 = this.x;
                if (j7 == j5 && j2 < j7 - (this.o << c)) {
                    byi byiVarM = this.r.m();
                    long jK3 = this.r.k();
                    int i2 = bwp.a;
                    throw new zav(byiVarM, "x-head-time-millis", "sq." + jK3 + ";parsed." + bwp.F(j2) + ";mindvrtime." + bwp.F(this.x));
                }
                j8 = this.z;
                if (j8 != j5 && j2 > j8 + (this.o << c)) {
                    byi byiVarM2 = this.r.m();
                    long jK4 = this.r.k();
                    int i3 = bwp.a;
                    throw new zav(byiVarM2, "x-head-time-millis", "sq." + jK4 + ";parsed." + bwp.F(j2) + ";maxdvrtime." + bwp.F(this.z));
                }
            } else {
                j3 = 0;
                c = 1;
                j4 = -1;
                j5 = -9223372036854775807L;
            }
            x();
            if (this.u && this.r.n() > j3) {
                this.C = this.r.n() - j2;
                this.u = false;
                c2 = c;
            }
            if (zX) {
                j6 = this.w;
                if (j6 == j4 && this.x == j5 && this.r.k() == j6) {
                    this.x = j2;
                } else if (c2 != 0) {
                }
                u();
            } else if (c2 != 0) {
                u();
            }
            if (zX && this.r.w()) {
                zbeVar = this.r;
                Map map = this.k;
                bseVar = zbeVar.h;
                wgsVar = (wgs) map.get(bseVar);
                if (wgsVar != null) {
                    throw new IllegalStateException("Missing FormatStreamModel for format ".concat(String.valueOf(String.valueOf(bseVar))));
                }
                jK = zbeVar.k();
                if (jK != j4) {
                    throw new IllegalStateException("Missing sequence for chunk");
                }
                jL = zbeVar.l();
                if (jL != j5) {
                    throw new IllegalStateException("Missing start time for chunk");
                }
                if (this.H.i.m(164, 45664992L) || !this.p.aA()) {
                    ((yyz) this.m.b).b.f(wgsVar, jK, bwp.F(jL), zbeVar.y());
                }
            }
        }
        j2 = j;
        zX = this.r.x(j2);
        c = 1;
        if (zX) {
            j3 = 0;
            if (this.y == -1) {
                c = 1;
                j4 = -1;
                j3 = 0;
                j5 = -9223372036854775807L;
            } else {
                c = 1;
                j4 = -1;
                j3 = 0;
                j5 = -9223372036854775807L;
            }
            if (B(j2)) {
                y(j2);
            }
            j7 = this.x;
            if (j7 == j5) {
            }
            j8 = this.z;
            if (j8 != j5) {
                byi byiVarM3 = this.r.m();
                long jK5 = this.r.k();
                int i4 = bwp.a;
                throw new zav(byiVarM3, "x-head-time-millis", "sq." + jK5 + ";parsed." + bwp.F(j2) + ";maxdvrtime." + bwp.F(this.z));
            }
        } else {
            j3 = 0;
            c = 1;
            j4 = -1;
            j5 = -9223372036854775807L;
        }
        x();
        if (this.u) {
            this.C = this.r.n() - j2;
            this.u = false;
            c2 = c;
        }
        if (zX) {
            j6 = this.w;
            if (j6 == j4) {
                if (c2 != 0) {
                    u();
                }
            } else if (c2 != 0) {
                u();
            }
        } else if (c2 != 0) {
            u();
        }
        if (zX) {
            zbeVar = this.r;
            Map map2 = this.k;
            bseVar = zbeVar.h;
            wgsVar = (wgs) map2.get(bseVar);
            if (wgsVar != null) {
                throw new IllegalStateException("Missing FormatStreamModel for format ".concat(String.valueOf(String.valueOf(bseVar))));
            }
            jK = zbeVar.k();
            if (jK != j4) {
                throw new IllegalStateException("Missing sequence for chunk");
            }
            jL = zbeVar.l();
            if (jL != j5) {
                throw new IllegalStateException("Missing start time for chunk");
            }
            if (this.H.i.m(164, 45664992L)) {
            }
            ((yyz) this.m.b).b.f(wgsVar, jK, bwp.F(jL), zbeVar.y());
        }
    }

    public final synchronized void o(IOException iOException) {
        this.b.c = iOException;
    }

    @Override // defpackage.cpl
    public final void d() {
    }

    @Override // defpackage.cpl
    public final long b(long j, cdv cdvVar) {
        return j;
    }
}
