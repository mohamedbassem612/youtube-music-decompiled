package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zez extends zee {
    public wiu c;
    public final String d;
    public final yha e;
    private final yup f;
    private final tyy g;
    private String h;
    private int i;
    private final tfq j;

    public zez(zjr zjrVar, wiu wiuVar, yup yupVar, tfq tfqVar, tyy tyyVar, yha yhaVar, String str, ywn ywnVar) {
        super(zjrVar, ywnVar);
        this.i = 100;
        this.c = wiuVar;
        this.f = yupVar;
        this.j = tfqVar;
        this.g = tyyVar;
        this.e = yhaVar;
        this.d = str;
        this.h = true != wiuVar.aW() ? "249" : "250";
    }

    private final void g(long j, String str, long j2, int i) {
        int i2 = this.i;
        this.i = i2 - 1;
        if (i2 > 0) {
            this.b.w("cml", "m.read;src.opus." + j2 + ";details." + i + '.' + str + '.' + j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x0161  */
    /* JADX WARN: Code duplicated, block: B:61:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b6  */
    @Override // defpackage.zee
    public final void a(List list, long j, long j2, zed[] zedVarArr, zec zecVar) {
        zed zedVar;
        zed zedVar2;
        zed zedVar3;
        int size;
        int i;
        boolean zH;
        ArrayList arrayList = new ArrayList(Arrays.asList(zedVarArr));
        zjr zjrVar = this.a;
        if (zjrVar.S().U && Collection.EL.stream(arrayList).anyMatch(new xdo(this, 13))) {
            Collection.EL.removeIf(arrayList, new xdo(this, 14));
        }
        agke agkeVarN = agke.n(arrayList);
        List listAsList = Arrays.asList(zedVarArr);
        agfx agfxVar = agdd.a;
        agfp agfpVarB = agfp.b(agfxVar);
        Iterator it = listAsList.iterator();
        String strC = "";
        long j3 = 0;
        while (true) {
            if (!it.hasNext()) {
                zedVar = null;
                break;
            }
            zedVar = (zed) it.next();
            yha yhaVar = this.e;
            String str = this.d;
            if (yno.r(yhaVar, zedVar, str, this.c, true, j)) {
                if (!zjrVar.aJ()) {
                    break;
                }
                g(j3, strC, agfpVarB.a(TimeUnit.MICROSECONDS), listAsList.size());
                break;
            }
            agfp agfpVarB2 = agfp.b(agfxVar);
            boolean zF = f(yhaVar, zedVar, str, this.c, j);
            if (zjrVar.aJ()) {
                long jA = agfpVarB2.a(TimeUnit.MICROSECONDS);
                if (jA > j3) {
                    strC = zedVar.c();
                    j3 = jA;
                }
            }
            if (zF) {
                if (!zjrVar.aJ()) {
                    break;
                }
                g(j3, strC, agfpVarB.a(TimeUnit.MICROSECONDS), listAsList.size());
                break;
            }
        }
        zed zedVar4 = zedVar;
        zed zedVar5 = zecVar.c;
        long j4 = j + j2;
        Object objA = this.g.a();
        if (!zjrVar.dW()) {
            int iD = zjrVar.d();
            if (objA != null) {
                wgs wgsVar = (wgs) objA;
                if (wgsVar.d() <= iD) {
                    zedVar2 = (zed) aguu.K(agkeVarN);
                    if (!zjrVar.bX() || !zjrVar.S().K || wir.B().contains(Integer.valueOf(wgsVar.e()))) {
                        break;
                    }
                    Iterator it2 = agkeVarN.iterator();
                    do {
                        if (it2.hasNext()) {
                            zedVar3 = (zed) it2.next();
                        }
                    } while (!zedVar3.c().equals(this.h));
                } else {
                    zedVar2 = (zed) agkeVarN.get(0);
                }
            } else {
                zedVar2 = (zed) agkeVarN.get(0);
            }
            if (zedVar4 != null) {
                int iA = zedVar4.a();
                int iA2 = zedVar3.a();
                zH = this.j.h();
                boolean zR = yno.r(this.e, zedVar4, this.d, this.c, true, j4);
                if (zH || iA > iA2 || zR) {
                    zedVar3 = zedVar4;
                }
            }
            size = list.size();
            if (!zjrVar.S().C && zedVar3 != null) {
                size = yno.q(zjrVar, list, j, this.c.t(this.j.a()), new hsb(zedVar3, 10));
            }
            if (zedVar5 == null) {
                i = 1;
            } else if (zedVar3.equals(zedVar5)) {
                i = 0;
            } else {
                i = 3;
            }
            new afvb(zedVar3, i, 0, size).a(zecVar);
        }
        long jE = this.f.e();
        int i2 = objA != null ? ((wgs) objA).g : 0;
        Iterator it3 = agkeVarN.iterator();
        while (true) {
            if (!it3.hasNext()) {
                zedVar2 = (zed) aguu.K(agkeVarN);
                break;
            }
            zedVar2 = (zed) it3.next();
            long j5 = jE;
            if (((long) zedVar2.a()) + ((long) i2) < j5) {
                break;
            } else {
                jE = j5;
            }
        }
        zedVar3 = zedVar2;
        if (zedVar4 != null) {
            int iA3 = zedVar4.a();
            int iA4 = zedVar3.a();
            zH = this.j.h();
            boolean zR2 = yno.r(this.e, zedVar4, this.d, this.c, true, j4);
            if (zH) {
                zedVar3 = zedVar4;
            } else {
                zedVar3 = zedVar4;
            }
        }
        size = list.size();
        if (!zjrVar.S().C) {
            size = yno.q(zjrVar, list, j, this.c.t(this.j.a()), new hsb(zedVar3, 10));
        }
        if (zedVar5 == null) {
            i = 1;
        } else if (zedVar3.equals(zedVar5)) {
            i = 3;
        } else {
            i = 0;
        }
        new afvb(zedVar3, i, 0, size).a(zecVar);
    }

    @Override // defpackage.zee
    public final void b(wiu wiuVar) {
        this.c = wiuVar;
        this.h = true != wiuVar.aW() ? "249" : "250";
    }
}
