package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zep extends zee {
    private int A;
    private final tfq B;
    private final yha C;
    private final xxj D;
    public final zkd c;
    public arfb d;
    private final yup e;
    private wiu f;
    private final agfr g;
    private final float h;
    private final float i;
    private final boolean j;
    private final int k;
    private final agfr l;
    private final String m;
    private final String n;
    private int o;
    private int p;
    private final zkk q;
    private long r;
    private float s;
    private yog t;
    private int u;
    private int v;
    private String w;
    private String x;
    private int y;
    private int z;

    public zep(yup yupVar, tfq tfqVar, wiu wiuVar, yha yhaVar, boolean z, zkk zkkVar, yog yogVar, agfr agfrVar, float f, float f2, String str, String str2, zjr zjrVar, agfr agfrVar2, xxj xxjVar, ywn ywnVar) {
        super(zjrVar, ywnVar);
        this.u = Alert.DURATION_SHOW_INDEFINITELY;
        this.v = 0;
        this.w = "";
        this.x = "";
        this.y = 0;
        this.z = 0;
        this.A = 100;
        this.e = yupVar;
        this.B = tfqVar;
        this.f = wiuVar;
        this.C = yhaVar;
        this.j = z;
        zkj zkjVar = (zkj) zkkVar.io();
        this.o = zkjVar.c;
        this.p = zkjVar.d;
        this.q = zkkVar;
        this.t = yogVar;
        this.g = agfrVar;
        this.h = f;
        this.i = f2;
        this.s = 1.0f;
        this.m = str;
        this.r = Long.MIN_VALUE;
        this.k = zjrVar.eQ();
        this.l = agfrVar2;
        this.n = str2;
        zjrVar.t.isPresent();
        this.D = xxjVar;
        zkd zkdVar = zjrVar.u;
        this.c = zkdVar;
        this.d = zkdVar.f(str2);
    }

    static final yvt h(List list, zed zedVar) {
        if (list.isEmpty()) {
            yxq yxqVar = new yxq();
            yxqVar.a(10000000L);
            yxqVar.b(zedVar.a());
            return yxqVar.c();
        }
        aawx aawxVar = (aawx) list.get(0);
        long j = aawxVar.b - aawxVar.a;
        yxq yxqVar2 = new yxq();
        yxqVar2.a(j);
        yxqVar2.b(zedVar.a());
        return yxqVar2.c();
    }

    private static int i(int i, int i2) {
        if (i <= 0) {
            return i2 <= 240 ? 48000 : 128000;
        }
        return i;
    }

    private final int j() {
        return this.t.c;
    }

    private final zed k(zed[] zedVarArr, long j) {
        int i;
        int i2;
        zjr zjrVar;
        zep zepVar = this;
        zjr zjrVar2 = zepVar.a;
        int iG = (zjrVar2.cH() && zepVar.d.equals(arfb.VIDEO_QUALITY_SETTING_DATA_SAVER)) ? Alert.DURATION_SHOW_INDEFINITELY : zepVar.g();
        int iJ = zepVar.j();
        agfx agfxVar = agdd.a;
        agfp agfpVarB = agfp.b(agfxVar);
        int length = zedVarArr.length;
        int i3 = 0;
        String strC = "";
        long j2 = 0;
        zed zedVar = null;
        while (i3 < length) {
            zed zedVar2 = zedVarArr[i3];
            if (zepVar.n(zedVar2)) {
                i = length;
                i2 = i3;
                if (zepVar.o(zedVar2, j)) {
                    zjrVar = zjrVar2;
                } else {
                    agfp agfpVarB2 = agfp.b(agfxVar);
                    zjrVar = zjrVar2;
                    boolean zF = f(zepVar.C, zedVar2, zepVar.m, zepVar.f, j);
                    if (zjrVar.aJ()) {
                        long jA = agfpVarB2.a(TimeUnit.MICROSECONDS);
                        if (jA > j2) {
                            strC = zedVar2.c();
                            j2 = jA;
                        }
                    }
                    if (!zF) {
                        continue;
                    }
                }
                if (zedVar2.b() <= iG && zedVar2.b() >= iJ) {
                    if (zjrVar.aJ()) {
                        zepVar.m(j2, strC, agfpVarB.a(TimeUnit.MICROSECONDS), zedVarArr.length);
                    }
                    return zedVar2;
                }
                if (zedVar == null) {
                    zedVar = zedVar2;
                }
            } else {
                zjrVar = zjrVar2;
                i = length;
                i2 = i3;
            }
            i3 = i2 + 1;
            zepVar = this;
            length = i;
            zjrVar2 = zjrVar;
        }
        if (!zjrVar2.aJ()) {
            return zedVar;
        }
        m(j2, strC, agfpVarB.a(TimeUnit.MICROSECONDS), zedVarArr.length);
        return zedVar;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0171  */
    private final zed l(zed[] zedVarArr, long j) {
        int length;
        zjr zjrVar;
        boolean z;
        int iMin = Math.min(g(), this.d.equals(arfb.VIDEO_QUALITY_SETTING_DATA_SAVER) ? this.a.f() : Alert.DURATION_SHOW_INDEFINITELY);
        int length2 = zedVarArr.length;
        int i = 0;
        while (true) {
            length = zedVarArr.length;
            if (i >= length) {
                i = length2 - 1;
                break;
            }
            if (zedVarArr[i].b() <= iMin) {
                break;
            }
            i++;
        }
        int iJ = j();
        do {
            length--;
            if (length < 0) {
                length = 0;
                break;
            }
        } while (zedVarArr[length].b() < iJ);
        if (i >= length) {
            return zedVarArr[i];
        }
        agkz agkzVar = this.t.e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            zjrVar = this.a;
            if (i > length) {
                break;
            }
            if (zjrVar.cQ() && !agkzVar.isEmpty() && agkzVar.contains(Integer.valueOf(zik.cn(zedVarArr[i].c())))) {
                arrayList.add(zedVarArr[i]);
            }
            arrayList2.add(zedVarArr[i]);
            i++;
        }
        if (!zjrVar.cQ() || arrayList.isEmpty() || (zjrVar.dc() && !this.t.e())) {
            arrayList = arrayList2;
        }
        zkf.a(!arrayList.isEmpty());
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zed zedVar = (zed) arrayList.get(i2);
            if (n(zedVar)) {
                arrayList3.add(zedVar);
            }
        }
        if (true != arrayList3.isEmpty()) {
            arrayList = arrayList3;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            zed zedVar2 = (zed) arrayList.get(i3);
            int i4 = zedVar2.b.w;
            int i5 = zedVar2.b.x;
            int i6 = this.o;
            int i7 = this.p;
            arfb arfbVar = this.d;
            arfb arfbVar2 = arfb.VIDEO_QUALITY_SETTING_HIGHER_QUALITY;
            if (!yos.c(i4, i5, i6, i7, arfbVar.equals(arfbVar2) ? this.i : this.h) || zedVar2.a() > j) {
                z = false;
            } else {
                long jA = zedVar2.a();
                int i8 = i(((Integer) this.g.io()).intValue(), zedVar2.b());
                yog yogVar = this.t;
                wiu wiuVar = this.f;
                tfq tfqVar = this.B;
                if (yos.b(jA, i8, yogVar, wiuVar, tfqVar.a())) {
                    if (!this.t.e()) {
                        this.t.d();
                    }
                    if (this.d.equals(arfbVar2) || (!yos.f(zedVar2.b(), tfqVar, this.k) && (this.t.e() || yno.s(this.C, this.m, this.f, zedVar2.c())))) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            i3++;
            if (z) {
                return zedVar2;
            }
        }
        return (zed) aguu.K(arrayList);
    }

    private final void m(long j, String str, long j2, int i) {
        int i2 = this.A;
        this.A = i2 - 1;
        if (i2 > 0) {
            this.b.w("cml", "m.read;src.default." + j2 + ";details." + i + '.' + str + '.' + j);
        }
    }

    private final boolean n(zed zedVar) {
        return zedVar.b() < this.u || p(zedVar);
    }

    private final boolean o(zed zedVar, long j) {
        return yno.r(this.C, zedVar, this.m, this.f, this.j, j);
    }

    private static boolean p(zed zedVar) {
        return wir.u().contains(Integer.valueOf(zik.cn(zedVar.c())));
    }

    private final long q(long j, yvt yvtVar, long j2) {
        int i;
        akwm akwmVar = this.f.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        if (!akwmVar.P) {
            return j;
        }
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = yvtVar.a;
        int i2 = 0;
        if (j3 > 0 && (i = yvtVar.b) > 0) {
            i2 = (int) ((((double) i) * 8000000.0d) / j3);
        }
        return Math.max(0L, (j + j3) - ((j3 * ((long) i2)) / j2));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11851. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // defpackage.zee
    public final void a(java.util.List r37, long r38, long r40, defpackage.zed[] r42, defpackage.zec r43) {
        /*
            Method dump skipped, instruction units count: 1185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zep.a(java.util.List, long, long, zed[], zec):void");
    }

    @Override // defpackage.zee
    public final void b(wiu wiuVar) {
        this.f = wiuVar;
    }

    @Override // defpackage.zee
    public final void c(float f) {
        this.s = f;
    }

    @Override // defpackage.zee
    public final void d(yog yogVar) {
        this.t = yogVar;
    }

    @Override // defpackage.zee
    public final void e(zkj zkjVar) {
        this.o = zkjVar.c;
        this.p = zkjVar.d;
    }

    final int g() {
        return this.t.b;
    }
}
