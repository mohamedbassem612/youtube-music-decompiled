package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yek extends zio {
    public final bye a;
    private final zef b;

    public yek(final yej yejVar) {
        HashSet hashSet;
        bye yowVar;
        wiu wiuVar;
        zha zhaVar;
        int i;
        hed hedVar;
        ypm ypmVarW;
        abxv abxvVar;
        zim zimVar = yejVar.q;
        final wiu wiuVar2 = zimVar.c;
        String str = zimVar.a;
        zha zhaVar2 = zimVar.g;
        final boolean zDv = yejVar.n.dv();
        byw bywVarD = d(yejVar.n, yejVar.b, wiuVar2, yejVar.w, yejVar.d, zDv, yejVar.q.i, yejVar.y);
        zjr zjrVar = yejVar.n;
        zim zimVar2 = yejVar.q;
        byw ypgVar = new ypg(new yps(bywVarD, zjrVar, wiuVar2, zimVar2.b, zimVar2.i), yejVar.p);
        if (yejVar.t != null && (hedVar = yejVar.v) != null && str != null && (ypmVarW = hedVar.w(str)) != null && (abxvVar = yejVar.t) != null) {
            ypgVar = abxvVar.k(ypgVar, ypmVarW);
        }
        jvf jvfVarC = c(wiuVar2, ypgVar, yejVar.e, yejVar.r, b(yejVar.n, yejVar.q));
        alik alikVarB = yejVar.c.b();
        if (alikVarB != null) {
            anew anewVar = alikVarB.j;
            ajbv ajbvVar = (anewVar == null ? anew.a : anewVar).g;
            hashSet = new HashSet((ajbvVar == null ? ajbv.a : ajbvVar).p);
        } else {
            hashSet = new HashSet();
        }
        yph yphVar = new yph(jvfVarC, hashSet, yejVar.q.i, yejVar.n);
        agfr agfrVar = new agfr() { // from class: yei
            @Override // defpackage.agfr
            public final Object io() {
                yej yejVar2 = yejVar;
                zjr zjrVar2 = yejVar2.n;
                String str2 = yejVar2.b;
                hed hedVar2 = yejVar2.w;
                Executor executor = yejVar2.d;
                ywn ywnVar = yejVar2.q.i;
                wiu wiuVar3 = wiuVar2;
                return new ypg(yek.c(wiuVar3, yek.d(zjrVar2, str2, wiuVar3, hedVar2, executor, zDv, ywnVar, yejVar2.y), null, yejVar2.r, yek.b(yejVar2.n, yejVar2.q)), yejVar2.p);
            }
        };
        zjr zjrVar2 = yejVar.n;
        if ((zjrVar2.aQ() || zjrVar2.R().j == -1) && !(yejVar.q.f && yejVar.n.R().s)) {
            yowVar = new yow(agfrVar, yphVar, yejVar.s, wiuVar2, yejVar.n, new zip(yejVar.g, zhaVar2), yejVar.k, yejVar.j, yejVar.q.i);
            wiuVar = wiuVar2;
        } else {
            yowVar = new you(yphVar, yejVar.s, wiuVar2, new zip(yejVar.g, zhaVar2), yejVar.q.i);
            wiuVar = wiuVar2;
        }
        bye byeVar = yowVar;
        wiu wiuVar3 = wiuVar;
        zeh zehVar = yejVar.o;
        wjr wjrVar = yejVar.u;
        String str2 = (String) yejVar.q.h.orElse(null);
        ywn ywnVar = yejVar.q.i;
        zjr zjrVar3 = yejVar.n;
        zef zefVar = new zef(wiuVar3, zehVar, wjrVar, str, str2, ywnVar, zjrVar3);
        this.b = zefVar;
        bye bzdVar = new bzd(byeVar, zefVar);
        boolean z = zjrVar3.Y().i;
        boolean z2 = yejVar.n.Y().f;
        if (z && !z2 && yejVar.m && yejVar.q.h.isPresent()) {
            zhaVar = zhaVar2;
            bzdVar = yejVar.x.u(yejVar.l, bzdVar, zhaVar, (String) yejVar.q.h.get(), str);
        } else {
            zhaVar = zhaVar2;
        }
        ynu ynuVar = yejVar.i;
        if (ynuVar != null && yejVar.n.D != zrv.ANDROID_EMBEDDED_PLAYER) {
            jsk jskVar = yejVar.q.e;
            bzdVar = jskVar == null ? ynuVar.a(bzdVar, agpi.a) : ynuVar.a(bzdVar, Collections.singletonList(jskVar));
        }
        ygn ygnVar = yejVar.h;
        bzdVar = ygnVar != null ? ygnVar.a(bzdVar, agpi.a) : bzdVar;
        e(bzdVar, yejVar.f);
        if (yejVar.m) {
            if (!z && !z2 && yejVar.q.h.isPresent()) {
                bzdVar = yejVar.x.u(yejVar.l, bzdVar, zhaVar, (String) yejVar.q.h.get(), str);
            }
            alik alikVarB2 = yejVar.c.b();
            if (alikVarB2 != null) {
                anew anewVar2 = alikVarB2.j;
                akwn akwnVar = (anewVar2 == null ? anew.a : anewVar2).f;
                i = (akwnVar == null ? akwn.a : akwnVar).c;
            } else {
                i = 0;
            }
            bzdVar = i > 0 ? new zja(bzdVar, i) : bzdVar;
            if (yejVar.z != null) {
                bzdVar = new ypn(bzdVar, yejVar.q.d);
            }
        }
        this.a = bzdVar;
    }

    public static jvh b(zjr zjrVar, zim zimVar) {
        String str;
        return (!zjrVar.j.l(91, 45399626L, false) || (str = zimVar.a) == null) ? new jvg() : ypz.c(str, zjrVar.eA());
    }

    public static jvf c(wiu wiuVar, byw bywVar, bzg[] bzgVarArr, int i, jvh jvhVar) {
        int i2;
        if (i == 2) {
            akwm akwmVar = wiuVar.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            i2 = akwmVar.ar;
        } else {
            akwm akwmVar2 = wiuVar.d.f;
            if (akwmVar2 == null) {
                akwmVar2 = akwm.b;
            }
            i2 = akwmVar2.t;
        }
        jvf jvfVar = new jvf(bywVar, i2, -1L, jvhVar);
        e(jvfVar, bzgVarArr);
        return jvfVar;
    }

    public static byw d(zjr zjrVar, String str, wiu wiuVar, hed hedVar, Executor executor, boolean z, ywn ywnVar, hhb hhbVar) {
        CronetEngine cronetEngineY = hedVar.y(zjrVar.eE());
        if (cronetEngineY != null) {
            return hhbVar.k(cronetEngineY, executor, byw.a, wiuVar.m(), wiuVar.n(), true, z);
        }
        if (zjrVar.R().E || zjrVar.R().F) {
            ywnVar.l("ncrn", "1");
        }
        byl bylVar = new byl();
        bylVar.b = str;
        bylVar.a = byw.a;
        bylVar.c = wiuVar.m();
        bylVar.d = wiuVar.n();
        bylVar.f = z;
        return bylVar.a();
    }

    private static void e(bye byeVar, bzg[] bzgVarArr) {
        if (bzgVarArr != null) {
            for (bzg bzgVar : bzgVarArr) {
                byeVar.e(bzgVar);
            }
        }
    }

    @Override // defpackage.zio
    public final bye a() {
        return this.a;
    }
}
