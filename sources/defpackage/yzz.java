package defpackage;

import android.os.Handler;
import androidx.media3.exoplayer.ExoPlayer;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yzz extends cqz {
    public final yye a;
    private final List b = new ArrayList();
    private final Handler c;

    public yzz(yye yyeVar, Handler handler) {
        this.a = yyeVar;
        this.c = handler;
    }

    private static cdr e(zjr zjrVar) {
        int i = 2;
        if (!zjrVar.y && !zjrVar.S().ab) {
            i = 1;
        }
        return new cdr(i);
    }

    private final cqs g(zcf zcfVar, coy coyVar, wgs[] wgsVarArr, zco zcoVar) {
        wiu wiuVar;
        String str;
        zfc zfcVar;
        for (int i = 0; i < coyVar.b; i++) {
            bto btoVarB = coyVar.b(i);
            List listO = o(btoVarB, wgsVarArr);
            if (!listO.isEmpty()) {
                int size = listO.size();
                yye yyeVar = this.a;
                if (size == 1) {
                    return new cqt(btoVarB, ((Integer) listO.get(0)).intValue(), true == yyeVar.d.i.m(100, 45619993L) ? 2 : 1, zcoVar);
                }
                zaz zazVar = new zaz(zcfVar, 1);
                int[] iArrS = ahng.S(listO);
                synchronized (zcfVar) {
                    wiuVar = zcfVar.y;
                    str = zcfVar.A.g;
                    zfcVar = zcfVar.x;
                }
                yza yzaVar = yyeVar.a;
                yoe yoeVar = zcoVar.b;
                zjr zjrVar = yyeVar.d;
                tfq tfqVar = yyeVar.s;
                yup yupVar = yzaVar.e;
                yha yhaVar = yzaVar.q;
                yog yogVarC = yoeVar.c();
                akwm akwmVar = wiuVar.d.f;
                if (akwmVar == null) {
                    akwmVar = akwm.b;
                }
                zkk zkkVar = yyeVar.f;
                boolean z = akwmVar.L;
                float fG = wiuVar.g();
                float fD = wiuVar.d();
                String str2 = zcfVar.a;
                zfcVar.getClass();
                yxx yxxVar = new yxx(new zep(yupVar, tfqVar, wiuVar, yhaVar, z, zkkVar, yogVarC, zazVar, fG, fD, str, str2, zjrVar, new tar(zfcVar, 18), new xxj(zcfVar, null), zcfVar.Z), btoVarB, zcoVar, wiuVar.aL(), wiuVar.y(), iArrS);
                List list = this.b;
                synchronized (list) {
                    list.add(new WeakReference(yxxVar));
                }
                return yxxVar;
            }
        }
        throw new IllegalStateException("getTrackSelection() failed");
    }

    private static boolean n(zcf zcfVar, boolean z) {
        zjr zjrVar = zcfVar.H;
        return (zjrVar.fn() || !zcfVar.U) && (zjrVar.S().al || !z);
    }

    private static final List o(bto btoVar, wgs[] wgsVarArr) {
        int i = btoVar.a;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            String str = btoVar.b(i2).a;
            for (wgs wgsVar : wgsVarArr) {
                if (wgsVar.f.equals(str)) {
                    arrayList.add(Integer.valueOf(i2));
                    break;
                }
            }
        }
        return arrayList;
    }

    public final void a(ExoPlayer exoPlayer, Object obj, int i) {
        List list = this.b;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                yxx yxxVar = (yxx) ((WeakReference) it.next()).get();
                if (yxxVar != null) {
                    cdn cdnVarD = exoPlayer.d(yxxVar);
                    cdnVarD.f(obj);
                    cdnVarD.g(i);
                    cdnVarD.e();
                } else {
                    it.remove();
                }
            }
        }
    }

    final void b(ExoPlayer exoPlayer, float f) {
        a(exoPlayer, Float.valueOf(f), 10003);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final pob c(zcf zcfVar, coy coyVar, cdq[] cdqVarArr, zcb zcbVar) {
        cqs[] cqsVarArr;
        int i;
        boolean zAllMatch;
        cdr cdrVarE;
        int i2;
        boolean z;
        cdr cdrVar;
        cqs cqsVarG;
        wiu wiuVar;
        String str;
        ywn ywnVar;
        yod yodVar = zcbVar.a;
        yye yyeVar = this.a;
        zco zcoVar = new zco(zcfVar, yodVar, (zjv) zcbVar.b.b, yyeVar.f());
        if (!zcfVar.z) {
            this.c.post(new yts(zcfVar, yodVar, 16, null));
            zcfVar.z = true;
        }
        boolean z2 = zcoVar.e;
        cdr[] cdrVarArr = new cdr[7];
        cqs[] cqsVarArr2 = new cqs[7];
        if (z2) {
            int iAs = yno.as(zcoVar.c, zcfVar.V && !zcfVar.y.i, zcfVar.A != null && zcfVar.A.A);
            cdrVarArr[iAs] = cdr.a;
            cqsVarArr2[iAs] = g(zcfVar, coyVar, yodVar.b, zcoVar);
        }
        if (zcoVar.b.i()) {
            abfv abfvVar = zcbVar.c;
            wgs[] wgsVarArr = yodVar.c;
            zjr zjrVar = yyeVar.d;
            if (zjrVar.fm()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= coyVar.b) {
                        cqsVarArr = cqsVarArr2;
                        i = 0;
                        zAllMatch = false;
                        break;
                    }
                    bto btoVarB = coyVar.b(i3);
                    int i4 = btoVarB.a;
                    ArrayList arrayList = new ArrayList(i4);
                    int i5 = 0;
                    i = 0;
                    while (i5 < i4) {
                        String str2 = btoVarB.b(i5).a;
                        int i6 = i3;
                        int length = wgsVarArr.length;
                        cqs[] cqsVarArr3 = cqsVarArr2;
                        int i7 = 0;
                        while (i7 < length) {
                            int i8 = length;
                            wgs wgsVar = wgsVarArr[i7];
                            int i9 = i7;
                            if (wgsVar.f.equals(str2)) {
                                arrayList.add(wgsVar);
                                break;
                            }
                            i7 = i9 + 1;
                            length = i8;
                        }
                        i5++;
                        i3 = i6;
                        cqsVarArr2 = cqsVarArr3;
                    }
                    int i10 = i3;
                    cqsVarArr = cqsVarArr2;
                    if (!arrayList.isEmpty()) {
                        zAllMatch = Collection.EL.stream(arrayList).allMatch(new iab(zjrVar, cdqVarArr, 8));
                        break;
                    }
                    i3 = i10 + 1;
                    cqsVarArr2 = cqsVarArr;
                }
            } else {
                cqsVarArr = cqsVarArr2;
                zAllMatch = false;
                i = 0;
            }
            cdr cdrVar2 = cdr.a;
            if (zAllMatch && n(zcoVar.a, z2)) {
                cdrVarE = e(zjrVar);
                i2 = 1;
            } else {
                cdrVarE = cdrVar2;
                i2 = i;
            }
            boolean z3 = zAllMatch;
            if (zjrVar.S().am) {
                z3 = (!zAllMatch || i2 == 0) ? i : 1;
            }
            int iAr = yno.ar((zjv) abfvVar.b, z3);
            if (zjrVar.cR()) {
                try {
                    z = (cdqVarArr[i].c(wgsVarArr[i].m()) & 3584) != 0 ? 1 : i;
                } catch (cbo unused) {
                }
                int i11 = cdrVarE.b;
                zhr.a(zhq.EXO, "DSAO renIn " + iAr + ", renCon" + i11 + ", renCa " + z + ", afs " + ((String) DesugarArrays.stream(wgsVarArr).map(new yom(6)).collect(Collectors.joining(", "))));
            }
            zcf zcfVar2 = zcoVar.a;
            yye yyeVar2 = this.a;
            zjr zjrVar2 = yyeVar2.d;
            if (!zjrVar2.m948do()) {
                cdrVar = cdrVarE;
                cqsVarG = g(zcfVar2, coyVar, wgsVarArr, zcoVar);
                break;
            }
            int i12 = i;
            while (true) {
                if (i12 >= coyVar.b) {
                    cdrVar = cdrVarE;
                    cqsVarG = g(zcfVar2, coyVar, wgsVarArr, zcoVar);
                    break;
                }
                bto btoVarB2 = coyVar.b(i12);
                List listO = o(btoVarB2, wgsVarArr);
                if (listO.size() > 1) {
                    yza yzaVar = yyeVar2.a;
                    yyq yyqVar = new yyq(zcfVar2, 3);
                    int[] iArrS = ahng.S(listO);
                    tfq tfqVar = yyeVar2.s;
                    synchronized (zcfVar2) {
                        wiuVar = zcfVar2.y;
                        str = zcfVar2.A.g;
                        ywnVar = zcfVar2.Z;
                    }
                    zez zezVar = new zez(zjrVar2, wiuVar, yzaVar.e, tfqVar, yyqVar, yzaVar.q, str, ywnVar);
                    cdr cdrVar3 = cdrVarE;
                    cqsVarG = new yxx(zezVar, btoVarB2, zcoVar, wiuVar.aL(), wiuVar.y(), iArrS);
                    List list = this.b;
                    synchronized (list) {
                        list.add(new WeakReference(cqsVarG));
                    }
                    cdrVar = cdrVar3;
                    break;
                }
                i12++;
                zjrVar2 = zjrVar2;
            }
            yzy yzyVar = new yzy(cqsVarG, iAr, cdrVar);
            int i13 = yzyVar.b;
            cqsVarArr[i13] = yzyVar.a;
            cdrVarArr[i13] = yzyVar.c;
        } else {
            cqsVarArr = cqsVarArr2;
        }
        return new pob(cdrVarArr, cqsVarArr, btu.a, zcoVar);
    }

    @Override // defpackage.cqz
    public final void p(Object obj) {
        if (obj != null) {
            zkf.a(obj instanceof zco);
            zco zcoVar = (zco) obj;
            zcf zcfVar = zcoVar.a;
            yye yyeVar = this.a;
            zco zcoVar2 = zcfVar.E;
            boolean z = false;
            if (zcoVar2 != null && zcoVar2.e && !zcoVar.e) {
                z = true;
            }
            synchronized (zcfVar) {
                zcfVar.E = zcoVar;
            }
            boolean z2 = z;
            zjr zjrVar = yyeVar.d;
            if (zjrVar.ex()) {
                zcfVar.l(zcoVar.c);
            }
            tfq tfqVar = yyeVar.s;
            Object objIo = yyeVar.f.io();
            if (z2) {
                zcfVar.v(zjrVar, tfqVar, (zkj) objIo, 10002, false);
            } else {
                if (zcfVar.v) {
                    return;
                }
                zcfVar.v(zjrVar, tfqVar, (zkj) objIo, 1, false);
            }
        }
    }

    @Override // defpackage.cqz
    public final pob q(cdq[] cdqVarArr, coy coyVar, cnm cnmVar, btn btnVar) {
        zjv zjvVar;
        boolean z;
        int iAr;
        boolean z2 = false;
        zcf zcfVarC = zce.c(btnVar.e(btnVar.d(btnVar.a(cnmVar.a), new btl(), false).c, new btm(), 0L));
        zkf.d(zcfVarC);
        byte[] bArr = null;
        if (!zcfVarC.P) {
            zcd zcdVar = zcfVarC.C;
            int iOrdinal = zcdVar.b().ordinal();
            if (iOrdinal == 0) {
                return c(zcfVarC, coyVar, cdqVarArr, zcdVar.a());
            }
            if (iOrdinal != 1) {
                throw new RuntimeException(null, null);
            }
            yod yodVar = yod.a;
            abfv abfvVar = zjb.e;
            abfv abfvVar2 = zjb.d;
            int i = zcb.d;
            return c(zcfVarC, coyVar, cdqVarArr, new zcb(yodVar, abfvVar, abfvVar2));
        }
        zkf.c(zcfVarC.ab != zch.a);
        zch zchVar = zcfVarC.ab;
        yoe yoeVarC = zcfVarC.c();
        zcp zcpVar = zchVar.c;
        if (zcpVar != null) {
            zjvVar = ((zbv) zcpVar).a;
            z = false;
        } else {
            zjvVar = zjv.a;
            z = true;
        }
        yye yyeVar = this.a;
        zco zcoVar = new zco(zcfVarC, yoeVarC, zjvVar, yyeVar.f());
        if (!zcfVarC.z) {
            this.c.post(new yts(zcfVarC, yoeVarC, 17, bArr));
            zcfVarC.z = true;
        }
        cdr[] cdrVarArr = new cdr[7];
        cqs[] cqsVarArr = new cqs[7];
        if (zcpVar != null) {
            cqs cqsVarF = zcpVar.f();
            int i2 = ((zbv) zcpVar).b;
            cqsVarArr[i2] = cqsVarF;
            cdrVarArr[i2] = cdr.a;
        }
        zbx zbxVar = zchVar.b;
        if (zbxVar != null) {
            zbu zbuVar = (zbu) zbxVar;
            if (yno.t(yyeVar.d, zbuVar.c, cdqVarArr) && n(zcfVarC, !z)) {
                iAr = yno.ar(zbuVar.a, true);
                cqsVarArr[iAr] = zbxVar.i();
                cdrVarArr[iAr] = e(zcfVarC.H);
            } else {
                iAr = zbuVar.b;
                cqsVarArr[iAr] = zbxVar.i();
                cdrVarArr[iAr] = cdr.a;
            }
            if (zcfVarC.H.cR()) {
                try {
                    if ((cdqVarArr[0].c(((zbu) zbxVar).d) & 3584) != 0) {
                        z2 = true;
                    }
                } catch (cbo unused) {
                }
                zhr.a(zhq.EXO, "DSAO plat renIn " + iAr + ", renCon" + cdrVarArr[iAr].b + ", renCa " + z2 + ", afs " + ((zbu) zchVar.b).c.f);
            }
        }
        return new pob(cdrVarArr, cqsVarArr, btu.a, zcoVar);
    }
}
