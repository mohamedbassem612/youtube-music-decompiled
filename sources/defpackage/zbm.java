package defpackage;

import android.net.Uri;
import j$.util.Optional;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zbm implements cpl, zaw {
    final zbb a;
    private final wiu b;
    private final String c;
    private final wgs[] d;
    private final bye f;
    private final cqs g;
    private final zjr i;
    private cpo j;
    private final tfq k;
    private final xxj[] l;
    private final Map e = new HashMap();
    private final Map h = new HashMap();

    public zbm(wiu wiuVar, wgs[] wgsVarArr, zgy zgyVar, bzg bzgVar, cqs cqsVar, String str, int i, xxj[] xxjVarArr, tfq tfqVar, zjr zjrVar) {
        this.i = zjrVar;
        zkf.a(wgsVarArr.length > 0);
        for (int i2 = 0; i2 < cqsVar.q(); i2++) {
            wgs wgsVar = wgsVarArr[cqsVar.n(i2)];
            zkf.b(wgsVar.Z(), "Format " + wgsVar.f + " is not OTF.");
        }
        this.b = wiuVar;
        this.c = str;
        bye byeVarE = zgyVar.e(zha.c, str, Optional.ofNullable(wgsVarArr[0].c));
        this.f = byeVarE;
        if (bzgVar != null) {
            byeVarE.e(bzgVar);
        }
        this.g = cqsVar;
        this.a = new zbb();
        this.d = wgsVarArr;
        this.l = xxjVarArr;
        this.k = tfqVar;
        for (wgs wgsVar2 : wgsVarArr) {
            bse bseVarM = wgsVar2.m();
            this.e.put(bseVarM, new cpf(yno.N(wgsVar2.B(), new agqj("http://youtube.com/streaming/otf/durations/112015"), this), i, bseVarM));
        }
    }

    @Override // defpackage.cpl
    public final int a(long j, List list) {
        return this.g.e(j, list);
    }

    @Override // defpackage.cpl
    public final void f() {
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ((cpf) it.next()).c();
        }
    }

    @Override // defpackage.cpl
    public final synchronized boolean h(cpg cpgVar, boolean z, aae aaeVar, crj crjVar) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[Catch: all -> 0x022d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x002b, B:9:0x002f, B:11:0x0039, B:13:0x0045, B:17:0x0053, B:55:0x0124, B:57:0x0155, B:59:0x0173, B:60:0x0178, B:65:0x0201, B:61:0x01a3, B:63:0x01cb, B:64:0x01d0, B:21:0x0075, B:23:0x007c, B:27:0x0085, B:29:0x008d, B:31:0x00a1, B:38:0x00b5, B:41:0x00bf, B:42:0x00e1, B:44:0x00e9, B:46:0x00f3, B:48:0x00fa, B:68:0x0207, B:69:0x0218, B:70:0x0219, B:71:0x022a), top: B:76:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf A[Catch: all -> 0x022d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x002b, B:9:0x002f, B:11:0x0039, B:13:0x0045, B:17:0x0053, B:55:0x0124, B:57:0x0155, B:59:0x0173, B:60:0x0178, B:65:0x0201, B:61:0x01a3, B:63:0x01cb, B:64:0x01d0, B:21:0x0075, B:23:0x007c, B:27:0x0085, B:29:0x008d, B:31:0x00a1, B:38:0x00b5, B:41:0x00bf, B:42:0x00e1, B:44:0x00e9, B:46:0x00f3, B:48:0x00fa, B:68:0x0207, B:69:0x0218, B:70:0x0219, B:71:0x022a), top: B:76:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[Catch: all -> 0x022d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x002b, B:9:0x002f, B:11:0x0039, B:13:0x0045, B:17:0x0053, B:55:0x0124, B:57:0x0155, B:59:0x0173, B:60:0x0178, B:65:0x0201, B:61:0x01a3, B:63:0x01cb, B:64:0x01d0, B:21:0x0075, B:23:0x007c, B:27:0x0085, B:29:0x008d, B:31:0x00a1, B:38:0x00b5, B:41:0x00bf, B:42:0x00e1, B:44:0x00e9, B:46:0x00f3, B:48:0x00fa, B:68:0x0207, B:69:0x0218, B:70:0x0219, B:71:0x022a), top: B:76:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9 A[Catch: all -> 0x022d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x002b, B:9:0x002f, B:11:0x0039, B:13:0x0045, B:17:0x0053, B:55:0x0124, B:57:0x0155, B:59:0x0173, B:60:0x0178, B:65:0x0201, B:61:0x01a3, B:63:0x01cb, B:64:0x01d0, B:21:0x0075, B:23:0x007c, B:27:0x0085, B:29:0x008d, B:31:0x00a1, B:38:0x00b5, B:41:0x00bf, B:42:0x00e1, B:44:0x00e9, B:46:0x00f3, B:48:0x00fa, B:68:0x0207, B:69:0x0218, B:70:0x0219, B:71:0x022a), top: B:76:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3 A[Catch: all -> 0x022d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x002b, B:9:0x002f, B:11:0x0039, B:13:0x0045, B:17:0x0053, B:55:0x0124, B:57:0x0155, B:59:0x0173, B:60:0x0178, B:65:0x0201, B:61:0x01a3, B:63:0x01cb, B:64:0x01d0, B:21:0x0075, B:23:0x007c, B:27:0x0085, B:29:0x008d, B:31:0x00a1, B:38:0x00b5, B:41:0x00bf, B:42:0x00e1, B:44:0x00e9, B:46:0x00f3, B:48:0x00fa, B:68:0x0207, B:69:0x0218, B:70:0x0219, B:71:0x022a), top: B:76:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa A[Catch: all -> 0x022d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x002b, B:9:0x002f, B:11:0x0039, B:13:0x0045, B:17:0x0053, B:55:0x0124, B:57:0x0155, B:59:0x0173, B:60:0x0178, B:65:0x0201, B:61:0x01a3, B:63:0x01cb, B:64:0x01d0, B:21:0x0075, B:23:0x007c, B:27:0x0085, B:29:0x008d, B:31:0x00a1, B:38:0x00b5, B:41:0x00bf, B:42:0x00e1, B:44:0x00e9, B:46:0x00f3, B:48:0x00fa, B:68:0x0207, B:69:0x0218, B:70:0x0219, B:71:0x022a), top: B:76:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0155 A[Catch: all -> 0x022d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x002b, B:9:0x002f, B:11:0x0039, B:13:0x0045, B:17:0x0053, B:55:0x0124, B:57:0x0155, B:59:0x0173, B:60:0x0178, B:65:0x0201, B:61:0x01a3, B:63:0x01cb, B:64:0x01d0, B:21:0x0075, B:23:0x007c, B:27:0x0085, B:29:0x008d, B:31:0x00a1, B:38:0x00b5, B:41:0x00bf, B:42:0x00e1, B:44:0x00e9, B:46:0x00f3, B:48:0x00fa, B:68:0x0207, B:69:0x0218, B:70:0x0219, B:71:0x022a), top: B:76:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0173 A[Catch: all -> 0x022d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x002b, B:9:0x002f, B:11:0x0039, B:13:0x0045, B:17:0x0053, B:55:0x0124, B:57:0x0155, B:59:0x0173, B:60:0x0178, B:65:0x0201, B:61:0x01a3, B:63:0x01cb, B:64:0x01d0, B:21:0x0075, B:23:0x007c, B:27:0x0085, B:29:0x008d, B:31:0x00a1, B:38:0x00b5, B:41:0x00bf, B:42:0x00e1, B:44:0x00e9, B:46:0x00f3, B:48:0x00fa, B:68:0x0207, B:69:0x0218, B:70:0x0219, B:71:0x022a), top: B:76:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a3 A[Catch: all -> 0x022d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x002b, B:9:0x002f, B:11:0x0039, B:13:0x0045, B:17:0x0053, B:55:0x0124, B:57:0x0155, B:59:0x0173, B:60:0x0178, B:65:0x0201, B:61:0x01a3, B:63:0x01cb, B:64:0x01d0, B:21:0x0075, B:23:0x007c, B:27:0x0085, B:29:0x008d, B:31:0x00a1, B:38:0x00b5, B:41:0x00bf, B:42:0x00e1, B:44:0x00e9, B:46:0x00f3, B:48:0x00fa, B:68:0x0207, B:69:0x0218, B:70:0x0219, B:71:0x022a), top: B:76:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01cb A[Catch: all -> 0x022d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x002b, B:9:0x002f, B:11:0x0039, B:13:0x0045, B:17:0x0053, B:55:0x0124, B:57:0x0155, B:59:0x0173, B:60:0x0178, B:65:0x0201, B:61:0x01a3, B:63:0x01cb, B:64:0x01d0, B:21:0x0075, B:23:0x007c, B:27:0x0085, B:29:0x008d, B:31:0x00a1, B:38:0x00b5, B:41:0x00bf, B:42:0x00e1, B:44:0x00e9, B:46:0x00f3, B:48:0x00fa, B:68:0x0207, B:69:0x0218, B:70:0x0219, B:71:0x022a), top: B:76:0x0007 }] */
    @Override // defpackage.cpl
    public final synchronized void i(ccy ccyVar, long j, List list, fsz fszVar) {
        cqs cqsVar;
        char c;
        long jJE;
        long j2;
        long jA;
        long j3;
        long j4;
        zbp zbpVar;
        wgs wgsVar;
        long j5;
        long j6;
        long j7;
        int length;
        wgs wgsVar2;
        zbp zbpVar2;
        Uri uriX;
        xxj[] xxjVarArr;
        ypp yppVarA;
        ypp yppVarA2;
        cqs cqsVar2 = this.g;
        cpq[] cpqVarArr = new cpq[cqsVar2.q()];
        Arrays.fill(cpqVarArr, cpq.b);
        long j8 = ccyVar.a;
        cqsVar2.m(j8, j - j8, -9223372036854775807L, list, cpqVarArr);
        bse bseVarC = cqsVar2.c();
        if (bseVarC == null) {
            fszVar.b = null;
            return;
        }
        wgs wgsVar3 = this.d[cqsVar2.o()];
        if (wgsVar3 == null) {
            throw new IllegalStateException("c.noformatstream;fmt.".concat(String.valueOf(bseVarC.a)));
        }
        cpf cpfVar = (cpf) this.e.get(bseVarC);
        if (cpfVar == null) {
            throw new IllegalStateException("c.nochunkextractor;fmt.".concat(String.valueOf(bseVarC.a)));
        }
        long j9 = true != list.isEmpty() ? -9223372036854775807L : j;
        Map map = this.h;
        zbp zbpVar3 = (zbp) map.get(bseVarC);
        if (zbpVar3 != null) {
            long jA2 = zbpVar3.a;
            if (j >= jA2) {
                fszVar.a = true;
                fszVar.b = null;
                return;
            }
            if (!list.isEmpty()) {
                c = 1;
                cpo cpoVar = (cpo) aguu.K(list);
                cqsVar = cqsVar2;
                if (cpoVar.h.equals(bseVarC)) {
                    jJE = cpoVar.h();
                    if (cpoVar instanceof zbo) {
                        j9 = j;
                    }
                }
                if (jJE == -1) {
                    jJE = zbpVar3.jE(j);
                }
                j2 = jJE;
                if (j2 == -1) {
                    zhq zhqVar = zhq.LIVE;
                    Long lValueOf = Long.valueOf(j);
                    String string = zbpVar3.toString();
                    Object[] objArr = new Object[2];
                    objArr[0] = lValueOf;
                    objArr[c] = string;
                    zhr.e(zhqVar, "Timestamp %dus is invalid for %s", objArr);
                    map.remove(bseVarC);
                    wgsVar = wgsVar3;
                    zbpVar = null;
                    j6 = 0;
                    j5 = 0;
                } else {
                    jA = zbpVar3.a(j2);
                    if (j2 >= 0) {
                        length = zbpVar3.b.length;
                        j3 = j2;
                        if (j3 < length) {
                            if (j3 != length - 1) {
                                jA2 = zbpVar3.a(j3 + 1);
                            }
                        }
                        if (j9 == jA) {
                            j4 = jA2;
                            zbpVar = zbpVar3;
                            wgsVar = wgsVar3;
                            j6 = j3;
                            j7 = jA;
                            j5 = -9223372036854775807L;
                        } else {
                            j4 = jA2;
                            zbpVar = zbpVar3;
                            wgsVar = wgsVar3;
                            j5 = j9;
                            j6 = j3;
                            j7 = jA;
                        }
                    } else {
                        j3 = j2;
                    }
                    jA2 = -9223372036854775807L;
                    if (j9 == jA) {
                        j4 = jA2;
                        zbpVar = zbpVar3;
                        wgsVar = wgsVar3;
                        j6 = j3;
                        j7 = jA;
                        j5 = -9223372036854775807L;
                    } else {
                        j4 = jA2;
                        zbpVar = zbpVar3;
                        wgsVar = wgsVar3;
                        j5 = j9;
                        j6 = j3;
                        j7 = jA;
                    }
                }
                zs zsVarAq = wgsVar.aq();
                zsVarAq.y(this.c);
                wgsVar2 = wgsVar;
                zbpVar2 = zbpVar;
                zsVarAq.z(yno.az(wgsVar2, this.b, cqsVar.g(), this.k.a()));
                zsVarAq.A(j6);
                uriX = zsVarAq.x();
                xxjVarArr = this.l;
                if (zbpVar2 == null) {
                    yppVarA2 = ypq.a();
                    yppVarA2.n(xxjVarArr);
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    yppVarA2.h(j8 / 1000);
                    yppVarA2.e(bseVarC.i);
                    yppVarA2.g = wgsVar2;
                    if (this.i.cI()) {
                        yppVarA2.j(tok.MEDIA_PLAYER_MANIFESTLESS_OTF_CHUNK);
                    }
                    bye byeVar = this.f;
                    byh byhVar = new byh();
                    byhVar.a = uriX;
                    byhVar.k = yppVarA2.a();
                    this.j = new zbo(byeVar, byhVar.a(), bseVarC, cqsVar.g(), cqsVar.h(), j5, cpfVar, this.a);
                } else {
                    yppVarA = ypq.a();
                    yppVarA.n(xxjVarArr);
                    TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                    yppVarA.h(j8 / 1000);
                    yppVarA.c(j7);
                    yppVarA.b(yno.A(j4, j7));
                    yppVarA.e(bseVarC.i);
                    yppVarA.g = wgsVar2;
                    if (this.i.cI()) {
                        yppVarA.j(tok.MEDIA_PLAYER_MANIFESTLESS_OTF_CHUNK);
                    }
                    cqs cqsVar3 = cqsVar;
                    long j10 = j6;
                    bye byeVar2 = this.f;
                    byh byhVar2 = new byh();
                    byhVar2.a = uriX;
                    byhVar2.k = yppVarA.a();
                    this.j = new cpm(byeVar2, byhVar2.a(), bseVarC, cqsVar3.g(), cqsVar3.h(), j7, j4, j5, -9223372036854775807L, j10, 1, 0L, cpfVar);
                }
                fszVar.b = this.j;
            }
            cqsVar = cqsVar2;
            c = 1;
            jJE = -1;
            if (jJE == -1) {
                jJE = zbpVar3.jE(j);
            }
            j2 = jJE;
            if (j2 == -1) {
                zhq zhqVar2 = zhq.LIVE;
                Long lValueOf2 = Long.valueOf(j);
                String string2 = zbpVar3.toString();
                Object[] objArr2 = new Object[2];
                objArr2[0] = lValueOf2;
                objArr2[c] = string2;
                zhr.e(zhqVar2, "Timestamp %dus is invalid for %s", objArr2);
                map.remove(bseVarC);
                wgsVar = wgsVar3;
                zbpVar = null;
                j6 = 0;
                j5 = 0;
            } else {
                jA = zbpVar3.a(j2);
                if (j2 >= 0) {
                    length = zbpVar3.b.length;
                    j3 = j2;
                    if (j3 < length) {
                        if (j3 != length - 1) {
                            jA2 = zbpVar3.a(j3 + 1);
                        }
                    }
                    if (j9 == jA) {
                        j4 = jA2;
                        zbpVar = zbpVar3;
                        wgsVar = wgsVar3;
                        j6 = j3;
                        j7 = jA;
                        j5 = -9223372036854775807L;
                    } else {
                        j4 = jA2;
                        zbpVar = zbpVar3;
                        wgsVar = wgsVar3;
                        j5 = j9;
                        j6 = j3;
                        j7 = jA;
                    }
                } else {
                    j3 = j2;
                }
                jA2 = -9223372036854775807L;
                if (j9 == jA) {
                    j4 = jA2;
                    zbpVar = zbpVar3;
                    wgsVar = wgsVar3;
                    j6 = j3;
                    j7 = jA;
                    j5 = -9223372036854775807L;
                } else {
                    j4 = jA2;
                    zbpVar = zbpVar3;
                    wgsVar = wgsVar3;
                    j5 = j9;
                    j6 = j3;
                    j7 = jA;
                }
            }
            zs zsVarAq2 = wgsVar.aq();
            zsVarAq2.y(this.c);
            wgsVar2 = wgsVar;
            zbpVar2 = zbpVar;
            zsVarAq2.z(yno.az(wgsVar2, this.b, cqsVar.g(), this.k.a()));
            zsVarAq2.A(j6);
            uriX = zsVarAq2.x();
            xxjVarArr = this.l;
            if (zbpVar2 == null) {
                yppVarA2 = ypq.a();
                yppVarA2.n(xxjVarArr);
                TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
                yppVarA2.h(j8 / 1000);
                yppVarA2.e(bseVarC.i);
                yppVarA2.g = wgsVar2;
                if (this.i.cI()) {
                    yppVarA2.j(tok.MEDIA_PLAYER_MANIFESTLESS_OTF_CHUNK);
                }
                bye byeVar3 = this.f;
                byh byhVar3 = new byh();
                byhVar3.a = uriX;
                byhVar3.k = yppVarA2.a();
                this.j = new zbo(byeVar3, byhVar3.a(), bseVarC, cqsVar.g(), cqsVar.h(), j5, cpfVar, this.a);
            } else {
                yppVarA = ypq.a();
                yppVarA.n(xxjVarArr);
                TimeUnit timeUnit4 = TimeUnit.MICROSECONDS;
                yppVarA.h(j8 / 1000);
                yppVarA.c(j7);
                yppVarA.b(yno.A(j4, j7));
                yppVarA.e(bseVarC.i);
                yppVarA.g = wgsVar2;
                if (this.i.cI()) {
                    yppVarA.j(tok.MEDIA_PLAYER_MANIFESTLESS_OTF_CHUNK);
                }
                cqs cqsVar4 = cqsVar;
                long j11 = j6;
                bye byeVar4 = this.f;
                byh byhVar4 = new byh();
                byhVar4.a = uriX;
                byhVar4.k = yppVarA.a();
                this.j = new cpm(byeVar4, byhVar4.a(), bseVarC, cqsVar4.g(), cqsVar4.h(), j7, j4, j5, -9223372036854775807L, j11, 1, 0L, cpfVar);
            }
            fszVar.b = this.j;
        }
        j5 = j;
        cqsVar = cqsVar2;
        wgsVar = wgsVar3;
        zbpVar = zbpVar3;
        j6 = 0;
        j4 = -9223372036854775807L;
        j7 = -9223372036854775807L;
        zs zsVarAq3 = wgsVar.aq();
        zsVarAq3.y(this.c);
        wgsVar2 = wgsVar;
        zbpVar2 = zbpVar;
        zsVarAq3.z(yno.az(wgsVar2, this.b, cqsVar.g(), this.k.a()));
        zsVarAq3.A(j6);
        uriX = zsVarAq3.x();
        xxjVarArr = this.l;
        if (zbpVar2 == null) {
            yppVarA2 = ypq.a();
            yppVarA2.n(xxjVarArr);
            TimeUnit timeUnit5 = TimeUnit.MICROSECONDS;
            yppVarA2.h(j8 / 1000);
            yppVarA2.e(bseVarC.i);
            yppVarA2.g = wgsVar2;
            if (this.i.cI()) {
                yppVarA2.j(tok.MEDIA_PLAYER_MANIFESTLESS_OTF_CHUNK);
            }
            bye byeVar5 = this.f;
            byh byhVar5 = new byh();
            byhVar5.a = uriX;
            byhVar5.k = yppVarA2.a();
            this.j = new zbo(byeVar5, byhVar5.a(), bseVarC, cqsVar.g(), cqsVar.h(), j5, cpfVar, this.a);
        } else {
            yppVarA = ypq.a();
            yppVarA.n(xxjVarArr);
            TimeUnit timeUnit6 = TimeUnit.MICROSECONDS;
            yppVarA.h(j8 / 1000);
            yppVarA.c(j7);
            yppVarA.b(yno.A(j4, j7));
            yppVarA.e(bseVarC.i);
            yppVarA.g = wgsVar2;
            if (this.i.cI()) {
                yppVarA.j(tok.MEDIA_PLAYER_MANIFESTLESS_OTF_CHUNK);
            }
            cqs cqsVar5 = cqsVar;
            long j12 = j6;
            bye byeVar6 = this.f;
            byh byhVar6 = new byh();
            byhVar6.a = uriX;
            byhVar6.k = yppVarA.a();
            this.j = new cpm(byeVar6, byhVar6.a(), bseVarC, cqsVar5.g(), cqsVar5.h(), j7, j4, j5, -9223372036854775807L, j12, 1, 0L, cpfVar);
        }
        fszVar.b = this.j;
    }

    @Override // defpackage.zaw
    public final synchronized void j(ywx ywxVar) {
        if (this.j instanceof zbo) {
            this.h.put(this.j.h, zbp.c(ywxVar));
        }
    }

    @Override // defpackage.zaw
    public final synchronized void k(IOException iOException) {
        this.a.c = iOException;
    }

    @Override // defpackage.cpl
    public final void d() {
    }

    @Override // defpackage.cpl
    public final void g() {
    }

    @Override // defpackage.cpl
    public final void e(cpg cpgVar) {
    }

    @Override // defpackage.cpl
    public final long b(long j, cdv cdvVar) {
        return j;
    }
}
