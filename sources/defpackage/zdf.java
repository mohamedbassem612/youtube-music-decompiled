package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zdf implements cpl {
    public final cqs a;
    protected final aaqp[] b;
    private final cio c;
    private final boolean d;
    private final boolean e;
    private final zjr f;
    private final int g;
    private final bye h;
    private final int i;
    private final wiu j;
    private final ywn k;
    private final yxr l;
    private final boolean m;
    private boolean n;
    private String o;
    private final tfq p;
    private final xxj[] q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zdf] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    protected zdf(cio cioVar, wgs[] wgsVarArr, zjr zjrVar, int[] iArr, cqs cqsVar, int i, bye byeVar, int i2, xxj[] xxjVarArr, wiu wiuVar, tfq tfqVar, ywn ywnVar, yxr yxrVar) {
        cvi jtrVar;
        ?? obj = new Object();
        obj.o = "";
        obj.c = cioVar;
        obj.m = zjrVar.j.l(73, 45379400L, false);
        obj.d = zjrVar.S().e;
        obj.e = zjrVar.j.m(25, 45367256L);
        obj.f = zjrVar;
        obj.a = cqsVar;
        obj.g = i;
        obj.h = byeVar;
        obj.i = i2;
        obj.q = xxjVarArr;
        obj.j = wiuVar;
        long jC = cioVar.c(0);
        obj.p = tfqVar;
        obj.k = ywnVar;
        obj.l = yxrVar;
        ?? r1 = cioVar.d(0).f;
        ArrayList arrayList = new ArrayList();
        for (int i3 : iArr) {
            arrayList.addAll(((cij) r1.get(i3)).c);
        }
        obj.b = new aaqp[cqsVar.q()];
        int i4 = 0;
        zdf zdfVar = obj;
        while (i4 < zdfVar.b.length) {
            int iN = cqsVar.n(i4);
            ciy ciyVar = (ciy) arrayList.get(iN);
            wgs wgsVar = wgsVarArr[iN];
            aaqp[] aaqpVarArr = zdfVar.b;
            String str = ciyVar.c.p;
            cpf cpfVar = null;
            if (str != null && !bsy.m(str)) {
                if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm")) {
                    jtrVar = zjrVar.S().J ? new jtr() : new czc(null);
                } else {
                    agke agkeVar = agpi.a;
                    jtrVar = zjrVar.S().I ? new juc(0, agkeVar, null, zjrVar.dZ()) : new zaj(agkeVar, zjrVar.dZ());
                }
                cpfVar = new cpf(jtrVar, i, ciyVar.c);
            }
            aaqpVarArr[i4] = new aaqp(jC, ciyVar, wgsVar, cpfVar, ciyVar.k());
            i4++;
            zdfVar = this;
        }
    }

    private final void j(wgs wgsVar, wiu wiuVar, int i, int i2, long j, Uri uri) {
        if (wiuVar.aw(akwl.EXO_PLAYER_CONFIG_FEATURES_DEBUG_LOGGING_FOR_PACING) && wgsVar.af()) {
            String str = "itag." + wgsVar.e() + ";str." + (wgsVar.W() ? 1 : 0) + ";fsr." + i + ";conn." + i2 + ";rate." + j;
            if (str.equals(this.o)) {
                return;
            }
            ywn ywnVar = this.k;
            ywnVar.w("pasp", str);
            if (uri.getQueryParameter("mpr") != null) {
                ywnVar.w("ppp", "vcs");
            }
            this.o = str;
        }
    }

    private final cuz k(aaqp aaqpVar) {
        Object obj;
        if (!this.m || aaqpVar == null || (obj = aaqpVar.d) == null) {
            return null;
        }
        return ((cpf) obj).a();
    }

    private static final long l(aaqp aaqpVar, cpo cpoVar, long j, long j2, long j3) {
        if (cpoVar != null) {
            long jH = cpoVar.h();
            if (jH != -1) {
                return jH;
            }
        }
        return bwp.t(aaqpVar.g(j), j2, j3);
    }

    @Override // defpackage.cpl
    public final int a(long j, List list) {
        cqs cqsVar = this.a;
        return cqsVar.q() < 2 ? list.size() : cqsVar.e(j, list);
    }

    @Override // defpackage.cpl
    public final long b(long j, cdv cdvVar) {
        int i = 0;
        while (true) {
            aaqp[] aaqpVarArr = this.b;
            if (i >= aaqpVarArr.length) {
                return j;
            }
            aaqp aaqpVar = aaqpVarArr[i];
            if (aaqpVar.c != null) {
                long jG = aaqpVar.g(j);
                long jH = aaqpVar.h(jG);
                return cdvVar.a(j, jH, (jH >= j || jG >= aaqpVar.e() + (-1)) ? jH : aaqpVar.h(jG + 1));
            }
            i++;
        }
    }

    public final cpq c(int i, long j, cpo cpoVar, long j2) {
        aaqp aaqpVar = this.b[i];
        if (aaqpVar.c != null) {
            cio cioVar = this.c;
            long j3 = aaqpVar.j(cioVar, j2);
            long jK = aaqpVar.k(cioVar, j2);
            long jL = l(aaqpVar, cpoVar, j, j3, jK);
            if (jL >= j3) {
                return new zde(aaqpVar, jL, jK);
            }
        }
        return cpq.b;
    }

    @Override // defpackage.cpl
    public final void e(cpg cpgVar) {
        int iA;
        Object obj;
        cpf cpfVar;
        cuz cuzVarA;
        if (cpgVar instanceof zcz) {
            iA = this.a.a(((zcz) cpgVar).h);
        } else {
            iA = cpgVar instanceof cpn ? this.a.a(((cpn) cpgVar).h) : -1;
        }
        if (iA >= 0) {
            aaqp[] aaqpVarArr = this.b;
            aaqp aaqpVar = aaqpVarArr[iA];
            if (aaqpVar.c != null || (obj = aaqpVar.d) == null || (cuzVarA = (cpfVar = (cpf) obj).a()) == null) {
                return;
            }
            ciy ciyVar = (ciy) aaqpVar.b;
            aaqpVarArr[iA] = new aaqp(aaqpVar.a, ciyVar, (wgs) aaqpVar.e, cpfVar, new cib(cuzVarA, ciyVar.f));
        }
    }

    @Override // defpackage.cpl
    public final void f() {
        int i = 0;
        while (true) {
            aaqp[] aaqpVarArr = this.b;
            if (i >= aaqpVarArr.length) {
                return;
            }
            Object obj = aaqpVarArr[i].d;
            if (obj != null) {
                ((cpf) obj).c();
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // defpackage.cpl
    public final boolean h(cpg cpgVar, boolean z, aae aaeVar, crj crjVar) {
        cqs cqsVar;
        long jElapsedRealtime;
        int iQ;
        int i;
        int i2;
        yvt yvtVarD;
        if (!z) {
            return false;
        }
        if (this.c.d || !(cpgVar instanceof cpo)) {
            cqsVar = this.a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
            iQ = cqsVar.q();
            i2 = 0;
            for (i = 0; i < iQ; i++) {
                if (cqsVar.s(i, jElapsedRealtime)) {
                    i2++;
                }
            }
            yvtVarD = crjVar.d(new cri(1, 0, iQ, i2, false), aaeVar);
            if (yvtVarD != null || yvtVarD.b != 2 || !cqsVar.r(cqsVar.a(cpgVar.h), yvtVarD.a)) {
                return false;
            }
        } else {
            Object obj = aaeVar.c;
            if (!(obj instanceof byv) || ((byv) obj).d != 404) {
                cqsVar = this.a;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                iQ = cqsVar.q();
                i2 = 0;
                while (i < iQ) {
                    if (cqsVar.s(i, jElapsedRealtime)) {
                        i2++;
                    }
                }
                yvtVarD = crjVar.d(new cri(1, 0, iQ, i2, false), aaeVar);
                if (yvtVarD != null) {
                    return false;
                }
                return false;
            }
            aaqp aaqpVar = this.b[this.a.a(cpgVar.h)];
            if (aaqpVar.c == null) {
                cqsVar = this.a;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                iQ = cqsVar.q();
                i2 = 0;
                while (i < iQ) {
                    if (cqsVar.s(i, jElapsedRealtime)) {
                        i2++;
                    }
                }
                yvtVarD = crjVar.d(new cri(1, 0, iQ, i2, false), aaeVar);
                if (yvtVarD != null) {
                    return false;
                }
                return false;
            }
            long jE = aaqpVar.e();
            if (jE == -1 || jE == 0) {
                cqsVar = this.a;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                iQ = cqsVar.q();
                i2 = 0;
                while (i < iQ) {
                    if (cqsVar.s(i, jElapsedRealtime)) {
                        i2++;
                    }
                }
                yvtVarD = crjVar.d(new cri(1, 0, iQ, i2, false), aaeVar);
                if (yvtVarD != null) {
                    return false;
                }
                return false;
            }
            if (((cpo) cpgVar).h() <= (aaqpVar.d() + jE) - 1) {
                cqsVar = this.a;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                iQ = cqsVar.q();
                i2 = 0;
                while (i < iQ) {
                    if (cqsVar.s(i, jElapsedRealtime)) {
                        i2++;
                    }
                }
                yvtVarD = crjVar.d(new cri(1, 0, iQ, i2, false), aaeVar);
                if (yvtVarD != null) {
                    return false;
                }
                return false;
            }
            this.n = true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0130  */
    /* JADX WARN: Code duplicated, block: B:35:0x0134  */
    /* JADX WARN: Code duplicated, block: B:37:0x0141  */
    /* JADX WARN: Code duplicated, block: B:42:0x0150  */
    /* JADX WARN: Code duplicated, block: B:87:0x0374  */
    /* JADX WARN: Code duplicated, block: B:89:0x0379  */
    /* JADX WARN: Code duplicated, block: B:92:0x0383  */
    @Override // defpackage.cpl
    public final void i(ccy ccyVar, long j, List list, fsz fszVar) {
        long jE;
        cio cioVar;
        boolean z;
        long jK;
        long jL;
        long j2;
        long j3;
        Object zdbVar;
        long jCurrentTimeMillis = System.currentTimeMillis() * 1000;
        cpo cpoVar = list.isEmpty() ? null : (cpo) list.get(list.size() - 1);
        cqs cqsVar = this.a;
        int iQ = cqsVar.q();
        cpq[] cpqVarArr = new cpq[iQ];
        int i = 0;
        while (i < iQ) {
            cpo cpoVar2 = cpoVar;
            cpqVarArr[i] = c(i, j, cpoVar2, jCurrentTimeMillis);
            i++;
            cpoVar = cpoVar2;
        }
        cpo cpoVar3 = cpoVar;
        long j4 = ccyVar.a;
        cqsVar.m(j4, j - j4, -9223372036854775807L, list, cpqVarArr);
        aaqp aaqpVar = this.b[cqsVar.f()];
        Object obj = aaqpVar.d;
        if (obj == null) {
            if (aaqpVar.c != null) {
                jE = aaqpVar.e();
                cioVar = this.c;
                z = true;
                if (jE == 0) {
                    long j5 = aaqpVar.j(cioVar, jCurrentTimeMillis);
                    jK = aaqpVar.k(cioVar, jCurrentTimeMillis);
                    jL = l(aaqpVar, cpoVar3, j, j5, jK);
                    if (jL > jK) {
                        if (cioVar.d) {
                            z = true;
                        } else {
                            z = true;
                        }
                    } else if (cioVar.d) {
                        z = true;
                    } else {
                        z = true;
                    }
                } else if (cioVar.d) {
                    z = false;
                }
                fszVar.a = z;
                return;
            }
            return;
        }
        Object obj2 = aaqpVar.b;
        cpf cpfVar = (cpf) obj;
        civ civVar = cpfVar.a == null ? ((ciy) obj2).h : null;
        civ civVarL = aaqpVar.c == null ? ((ciy) obj2).l() : null;
        if (civVar == null && civVarL == null) {
            if (aaqpVar.c != null) {
                jE = aaqpVar.e();
                cioVar = this.c;
                z = true;
                if (jE == 0) {
                    long j6 = aaqpVar.j(cioVar, jCurrentTimeMillis);
                    jK = aaqpVar.k(cioVar, jCurrentTimeMillis);
                    jL = l(aaqpVar, cpoVar3, j, j6, jK);
                    if (jL > jK && (!this.n || jL < jK)) {
                        long j7 = aaqpVar.a;
                        if (j7 == -9223372036854775807L) {
                            j2 = -9223372036854775807L;
                        } else if (aaqpVar.h(jL) >= j7) {
                            z = true;
                        } else {
                            j2 = j7;
                        }
                        int iMin = (int) Math.min(this.i, (jK - jL) + 1);
                        if (j2 == -9223372036854775807L) {
                            j3 = -1;
                            break;
                        }
                        while (true) {
                            if (iMin <= 1) {
                                j3 = -1;
                                break;
                            }
                            j3 = -1;
                            if (aaqpVar.h((((long) iMin) + jL) - 1) < j2) {
                                break;
                            } else {
                                iMin--;
                            }
                        }
                        long j8 = true != list.isEmpty() ? -9223372036854775807L : j;
                        bye byeVar = this.h;
                        int i2 = this.g;
                        bse bseVarC = cqsVar.c();
                        int iG = cqsVar.g();
                        Object objH = cqsVar.h();
                        Object obj3 = aaqpVar.b;
                        long jH = aaqpVar.h(jL);
                        civ civVarI = aaqpVar.i(jL);
                        ciy ciyVar = (ciy) obj3;
                        String str = ((cim) ciyVar.d.get(0)).a;
                        if (obj == null) {
                            long jF = aaqpVar.f(jL);
                            Uri uriA = civVarI.a(str);
                            Object obj4 = aaqpVar.e;
                            wiu wiuVar = this.j;
                            tfq tfqVar = this.p;
                            wgs wgsVar = (wgs) obj4;
                            long jAz = yno.az(wgsVar, wiuVar, iG, tfqVar.a());
                            zs zsVar = new zs(uriA);
                            zsVar.z(jAz);
                            Uri uriX = zsVar.x();
                            j(wgsVar, wiuVar, iG, tfqVar.a(), jAz, uriX);
                            xxj[] xxjVarArr = this.q;
                            ypp yppVarA = ypq.a();
                            yppVarA.n(xxjVarArr);
                            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                            yppVarA.h(j4 / 1000);
                            yppVarA.g(jH / 1000);
                            yppVarA.f((jF - jH) / 1000);
                            yppVarA.e(wgsVar.g);
                            yppVarA.i(this.k);
                            yppVarA.f = k(aaqpVar);
                            yppVarA.g = obj4;
                            if (this.f.cI()) {
                                yppVarA.j(tok.MEDIA_PLAYER_VOD_CHUNK);
                            }
                            byh byhVar = new byh();
                            byhVar.a = uriX;
                            byhVar.g = civVarI.a;
                            byhVar.h = civVarI.b;
                            byhVar.i = ciyVar.m();
                            byhVar.k = yppVarA.a();
                            zdbVar = new cpr(byeVar, byhVar.a(), bseVarC, iG, objH, jH, jF, jL, i2, bseVarC);
                        } else {
                            civ civVar2 = civVarI;
                            int i3 = 1;
                            int i4 = 1;
                            while (i3 < iMin) {
                                civ civVarB = civVar2.b(aaqpVar.i(jL + ((long) i3)), str);
                                if (civVarB == null) {
                                    break;
                                }
                                i4++;
                                i3++;
                                civVar2 = civVarB;
                            }
                            long jF2 = aaqpVar.f(jL + ((long) i4) + j3);
                            if (this.e || j7 == -9223372036854775807L || j7 > jF2) {
                                j7 = -9223372036854775807L;
                            }
                            Uri uriA2 = civVar2.a(str);
                            Object obj5 = aaqpVar.e;
                            wiu wiuVar2 = this.j;
                            tfq tfqVar2 = this.p;
                            wgs wgsVar2 = (wgs) obj5;
                            int i5 = i4;
                            long jAz2 = yno.az(wgsVar2, wiuVar2, iG, tfqVar2.a());
                            zs zsVar2 = new zs(uriA2);
                            zsVar2.z(jAz2);
                            Uri uriX2 = zsVar2.x();
                            j(wgsVar2, wiuVar2, iG, tfqVar2.a(), jAz2, uriX2);
                            xxj[] xxjVarArr2 = this.q;
                            ypp yppVarA2 = ypq.a();
                            yppVarA2.n(xxjVarArr2);
                            TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                            yppVarA2.h(j4 / 1000);
                            yppVarA2.g(jH / 1000);
                            yppVarA2.f((jF2 - jH) / 1000);
                            yppVarA2.e(wgsVar2.g);
                            yppVarA2.i(this.k);
                            yppVarA2.f = k(aaqpVar);
                            yppVarA2.g = obj5;
                            if (this.f.cI()) {
                                yppVarA2.j(tok.MEDIA_PLAYER_VOD_CHUNK);
                            }
                            byh byhVar2 = new byh();
                            byhVar2.a = uriX2;
                            byhVar2.g = civVar2.a;
                            byhVar2.h = civVar2.b;
                            byhVar2.i = ciyVar.m();
                            byhVar2.k = yppVarA2.a();
                            zdbVar = new zdb(byeVar, byhVar2.a(), bseVarC, iG, objH, jH, jF2, j8, j7, jL, i5, -ciyVar.f, (cpf) obj, this.l, i2);
                        }
                    } else if (cioVar.d || cioVar.a() - 1 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (cioVar.d && cioVar.a() - 1 <= 0) {
                    z = false;
                }
                fszVar.a = z;
                return;
            }
            return;
        }
        bye byeVar2 = this.h;
        bse bseVarC2 = cqsVar.c();
        int iG2 = cqsVar.g();
        Object objH2 = cqsVar.h();
        ciy ciyVar2 = (ciy) obj2;
        String str2 = ((cim) ciyVar2.d.get(0)).a;
        if (civVar != null) {
            civ civVarB2 = civVar.b(civVarL, str2);
            if (civVarB2 != null) {
                civVar = civVarB2;
            }
        } else {
            civVar = civVarL;
        }
        zs zsVar3 = new zs(civVar.a(str2));
        Object obj6 = aaqpVar.e;
        wgs wgsVar3 = (wgs) obj6;
        zsVar3.z(yno.az(wgsVar3, this.j, iG2, this.p.a()));
        Uri uriX3 = zsVar3.x();
        xxj[] xxjVarArr3 = this.q;
        ypp yppVarA3 = ypq.a();
        yppVarA3.n(xxjVarArr3);
        TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
        yppVarA3.h(j4 / 1000);
        yppVarA3.e(wgsVar3.g);
        yppVarA3.i(this.k);
        yppVarA3.g = obj6;
        if (this.f.cI()) {
            yppVarA3.j(tok.MEDIA_PLAYER_VOD_CHUNK);
        }
        byh byhVar3 = new byh();
        byhVar3.a = uriX3;
        byhVar3.g = civVar.a;
        byhVar3.h = civVar.b;
        byhVar3.i = ciyVar2.m();
        byhVar3.k = yppVarA3.a();
        byi byiVarA = byhVar3.a();
        zdbVar = this.d ? new zcz(byeVar2, byiVarA, bseVarC2, iG2, objH2, cpfVar) : new cpn(byeVar2, byiVarA, bseVarC2, iG2, objH2, cpfVar);
        fszVar.b = zdbVar;
    }

    @Override // defpackage.cpl
    public final void d() {
    }

    @Override // defpackage.cpl
    public final void g() {
    }
}
