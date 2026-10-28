package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zgm {
    public final wjr a;
    private final int b;
    private final mbc c;
    private final mbc d;
    private final vyo e;
    private final Pair f;
    private final twf g;
    private final tyw h;
    private final xeu i;
    private final abuz j;
    private final hno k;
    private final ci l;

    public zgm(mbc mbcVar, mbc mbcVar2, Context context, abuz abuzVar, vyo vyoVar, hno hnoVar, tyw tywVar, ci ciVar, xeu xeuVar, Executor executor) {
        mbcVar.getClass();
        this.c = mbcVar;
        mbcVar2.getClass();
        this.d = mbcVar2;
        abuzVar.getClass();
        this.j = abuzVar;
        this.e = vyoVar;
        this.f = twm.o(context);
        this.b = txz.a(context);
        this.k = hnoVar;
        this.g = (twf) hnoVar.a;
        this.h = tywVar;
        this.l = ciVar;
        this.i = xeuVar;
        this.a = new wjr(hnoVar, executor);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final zgj e(wjm wjmVar, String str, arie arieVar, String str2, String str3, boolean z, wiu wiuVar, boolean z2, boolean z3, aigj aigjVar) {
        wjm wjmVar2;
        int i;
        boolean z4;
        int iAS;
        mbc mbcVar;
        Pair pair;
        hno hnoVar;
        zho zhoVar;
        apbx apbxVar;
        int i2;
        ajdf ajdfVar;
        zgj zgjVar = null;
        if (wjmVar == null) {
            if ((f().c & 4) != 0) {
                amup amupVar = f().f;
                if (amupVar == null) {
                    amupVar = amup.a;
                }
                wjmVar2 = new wjm(amupVar);
            } else if (!f().s) {
                zvp.a(zvn.b, zvm.f, "QoeStatsClient:Null tracking url");
                return null;
            }
            return zgjVar;
        }
        wjmVar2 = wjmVar;
        if (TextUtils.isEmpty(str2)) {
            i = 1;
            if (TextUtils.isEmpty(str2)) {
                z4 = false;
            } else {
                ajdfVar = f().q;
                if (ajdfVar == null) {
                    ajdfVar = ajdf.a;
                }
                if (ajdfVar.c) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            iAS = a.aS(f().g);
            if (iAS != 0 || iAS == 1) {
                i = 2;
            } else {
                int iAS2 = a.aS(f().g);
                if (iAS2 != 0) {
                    i = iAS2;
                }
            }
            hno hnoVar2 = this.k;
            if (i - 1 != 2) {
                mbcVar = this.c;
            } else {
                mbcVar = this.d;
            }
            Uri uriC = wjmVar2.c();
            typ.f(str);
            zgjVar = new zgj(hnoVar2, mbcVar, wjmVar2, yno.cJ(uriC, str, str2, str3, this.j, arieVar, wiuVar), z, str, str3, arieVar, f(), wiuVar, this.b, z4, this.g, this.h, this, z2, z3, this.l, this.i, aigjVar);
            pair = this.f;
            hnoVar = zgjVar.J;
            zft zftVar = zgjVar.c;
            zhoVar = (zho) hnoVar.m;
            zhoVar.d(zftVar);
            if (!zgjVar.y) {
                hnoVar.k.execute(afwl.i(new zdv(zgjVar, 7)));
                zhoVar.d(zgjVar.d);
                apbxVar = zgjVar.i;
                if (apbxVar.m) {
                    i2 = 2;
                    zgjVar.M("ddw", ((Integer) pair.first).toString(), 2);
                    zgjVar.M("ddh", ((Integer) pair.second).toString(), 2);
                } else {
                    i2 = 2;
                }
                if (apbxVar.n) {
                    zgjVar.M("cdevice", Build.DEVICE, i2);
                }
            }
        } else {
            ajdf ajdfVar2 = f().q;
            if (ajdfVar2 == null) {
                ajdfVar2 = ajdf.a;
            }
            if (ajdfVar2.c) {
                i = 1;
                if (TextUtils.isEmpty(str2)) {
                    z4 = false;
                } else {
                    ajdfVar = f().q;
                    if (ajdfVar == null) {
                        ajdfVar = ajdf.a;
                    }
                    if (ajdfVar.c) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                iAS = a.aS(f().g);
                if (iAS != 0) {
                    i = 2;
                } else {
                    i = 2;
                }
                hno hnoVar3 = this.k;
                if (i - 1 != 2) {
                    mbcVar = this.c;
                } else {
                    mbcVar = this.d;
                }
                Uri uriC2 = wjmVar2.c();
                typ.f(str);
                zgjVar = new zgj(hnoVar3, mbcVar, wjmVar2, yno.cJ(uriC2, str, str2, str3, this.j, arieVar, wiuVar), z, str, str3, arieVar, f(), wiuVar, this.b, z4, this.g, this.h, this, z2, z3, this.l, this.i, aigjVar);
                pair = this.f;
                hnoVar = zgjVar.J;
                zft zftVar2 = zgjVar.c;
                zhoVar = (zho) hnoVar.m;
                zhoVar.d(zftVar2);
                if (!zgjVar.y) {
                    hnoVar.k.execute(afwl.i(new zdv(zgjVar, 7)));
                    zhoVar.d(zgjVar.d);
                    apbxVar = zgjVar.i;
                    if (apbxVar.m) {
                        i2 = 2;
                        zgjVar.M("ddw", ((Integer) pair.first).toString(), 2);
                        zgjVar.M("ddh", ((Integer) pair.second).toString(), 2);
                    } else {
                        i2 = 2;
                    }
                    if (apbxVar.n) {
                        zgjVar.M("cdevice", Build.DEVICE, i2);
                    }
                }
            }
        }
        return zgjVar;
    }

    private final apbx f() {
        vyo vyoVar = this.e;
        if (vyoVar == null || vyoVar.b() == null) {
            return apbx.b;
        }
        anew anewVar = vyoVar.b().j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        apbx apbxVar = anewVar.d;
        return apbxVar == null ? apbx.b : apbxVar;
    }

    public final zgj a(String str, String str2, arie arieVar, boolean z, boolean z2) {
        zgj zgjVarN;
        wjr wjrVar = this.a;
        zgj zgjVarM = wjrVar.m(str);
        if (zgjVarM != null) {
            return zgjVarM;
        }
        zgj zgjVarE = e(null, str, arieVar, "", str2, false, wiu.c, z, z2, null);
        return (str == null || zgjVarE == null || (zgjVarN = wjrVar.n(str, zgjVarE)) == null) ? zgjVarE : zgjVarN;
    }

    public final zgj b(wjm wjmVar, String str, arie arieVar, String str2, Integer num, String str3, wja wjaVar, boolean z, wiu wiuVar, aigj aigjVar, boolean z2) {
        zgj zgjVarE = e(wjmVar, str, arieVar, str2, str3, z, wiuVar, z2, false, aigjVar);
        if (zgjVarE == null) {
            return null;
        }
        this.a.o(str, zgjVarE);
        zgjVarE.f(wjmVar, str, str2, num, str3, wjaVar, wiuVar, aigjVar, z2);
        return zgjVarE;
    }

    public final zgj c(String str) {
        return this.a.m(str);
    }

    public final void d(yrr yrrVar) {
        boolean z = yrrVar.w;
        a(yrrVar.b, yrrVar.h, yrrVar.u, yrrVar.f(), z && yrrVar.f() && (yrrVar.n > 0 || yrrVar.o > 0));
    }
}
