package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acuu implements abuo {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/player/sequencer/ReelVideoPlaybackItemHandler");
    private static final abnt h;
    private static final Predicate i;
    public final abvk e;
    public final actv f;
    public final hno g;
    private final abwf j;
    private final Executor k;
    private final abvn l;
    private final acsv m;
    private final aunn n;
    private final aeiy q;
    public final Object b = new Object();
    public abul c = null;
    public final Set d = new HashSet();
    private final arfb o = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
    private String p = null;

    static {
        ahsk ahskVarA = abnt.a();
        ahskVarA.e(2000L);
        h = ahskVarA.c();
        i = new aaep(20);
    }

    public acuu(abwf abwfVar, actv actvVar, hno hnoVar, aeiy aeiyVar, Executor executor, abvn abvnVar, acsv acsvVar, aunn aunnVar) {
        this.j = abwfVar;
        this.f = actvVar;
        this.g = hnoVar;
        this.q = aeiyVar;
        this.k = executor;
        this.l = abvnVar;
        this.e = abvnVar.o();
        this.m = acsvVar;
        this.n = aunnVar;
    }

    public static final String f(abvz abvzVar) {
        ajwo ajwoVar;
        String strW = abvzVar.a().w();
        if (!TextUtils.isEmpty(strW) || (ajwoVar = abvzVar.a().b) == null) {
            return strW;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return strW;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        return ((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).o;
    }

    private final String g() {
        abvk abvkVar = this.e;
        acfw acfwVarI = abvkVar.i();
        wjf wjfVarC = acfwVarI != null ? acfwVarI.c() : null;
        return (wjfVarC == null || TextUtils.isEmpty(wjfVarC.G())) ? abvkVar.n() : wjfVarC.G();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    private final void h(abut abutVar, ajwo ajwoVar) {
        Pair pairA;
        hno hnoVar = this.g;
        if (hnoVar.bh() && ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            String str = ((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).U;
            if (!str.isEmpty()) {
                abutVar.a = str;
            }
        }
        if (hnoVar.aj()) {
            acsv acsvVar = this.m;
            acsb acsbVar = null;
            if (!acsvVar.e.aO() && ajwoVar != null && (pairA = acsvVar.a(ajwoVar)) != null && pairA.second != null) {
                ajwo ajwoVar2 = (ajwo) pairA.second;
                long jLongValue = ((Long) pairA.first).longValue();
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar2.c(aihlVarCheckIsLite2);
                if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                    ajwoVar2.c(aihlVarCheckIsLite3);
                    Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                    apfp apfpVar = (apfp) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                    if (acsv.i(apfpVar, alvu.b) != null) {
                        acsbVar = new acsb(acsvVar, ajwoVar2, jLongValue, new avgj(acsvVar, null));
                    } else {
                        if (((apfpVar.i == 44 ? (apfq) apfpVar.k : apfq.a).b & 1) != 0) {
                            acsbVar = new acsb(acsvVar, ajwoVar2, jLongValue, new avgj(acsvVar, null));
                        }
                    }
                }
            }
            if (acsbVar != null) {
                abutVar.b = acsbVar;
            }
        }
    }

    private static final boolean i(abun abunVar) {
        if (abunVar instanceof abvz) {
            return aecm.ai(((abvz) abunVar).a().b);
        }
        return false;
    }

    private final aami j() {
        abwy abwyVarT;
        arfb arfbVar = this.o;
        int i2 = -1;
        if (this.g.z() && (abwyVarT = this.l.t()) != null) {
            abxo abxoVar = (abxo) abwyVarT.b();
            if (abxoVar instanceof abxl) {
                abxl abxlVar = (abxl) abxoVar;
                i2 = abxlVar.a;
                arfbVar = abxlVar.d;
            } else if (abxoVar instanceof abxm) {
                arfbVar = ((abxm) abxoVar).a;
            }
        }
        return new aami(i2, arfbVar);
    }

    @Override // defpackage.abuo
    public final /* synthetic */ ListenableFuture a(abun abunVar, abug abugVar) {
        xir xirVarD;
        Predicate aciyVar;
        ajwo ajwoVar;
        acsv acsvVar;
        abul abulVar = abugVar.c;
        abvz abvzVar = (abvz) abunVar;
        int i2 = abugVar.e.b;
        int i3 = abulVar.b + 1;
        hno hnoVar = this.g;
        boolean z = hnoVar.L() && hnoVar.aY() && i2 > i3;
        abun abunVar2 = abugVar.d;
        boolean z2 = !(abunVar2 instanceof abvz) || (i(abunVar2) && !((vxz) hnoVar.k).m(68, 45779637L)) || (i(abvzVar) && !((vxz) hnoVar.k).m(69, 45779638L));
        boolean z3 = i2 == i3 && !z2;
        abuf abufVarT = abug.t(abugVar);
        abufVarT.f(z3);
        if (z3 || (z && !z2)) {
            abufVarT.g(h);
        }
        abug abugVarA = abufVarT.a();
        vxz vxzVar = (vxz) hnoVar.k;
        abnl abnlVarA = (!vxzVar.l(41, 45656443L, false) || i(abvzVar)) ? abvzVar.a() : abvzVar.a().g().a();
        ajwo ajwoVar2 = abvzVar.a().b;
        if (ajwoVar2 != null) {
            if (hnoVar.aj() && !hnoVar.ar() && (acsvVar = this.m) != null) {
                acsvVar.e(ajwoVar2);
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar2.c(aihlVarCheckIsLite);
            Object objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
            xirVarD = this.q.d((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        } else {
            xirVarD = null;
        }
        boolean z4 = abugVarA.g;
        aami aamiVarJ = j();
        abnp abnpVarZ = aawr.z(xirVarD, z4, hnoVar.aI() || z4, null, hnoVar.ba(), aamiVarJ.a, (arfb) aamiVarJ.b, false, hnoVar.w());
        abut abutVarH = abuu.h();
        abutVarH.b(abnlVarA);
        abutVarH.c(abnpVarZ);
        abutVarH.e(abvzVar.g());
        h(abutVarH, ajwoVar2);
        abuu abuuVarA = abutVarH.a();
        if (hnoVar.aY()) {
            if (abugVarA.e.b > abugVarA.c.b + 1 && i(abuuVarA) && !vxzVar.l(40, 45656437L, false)) {
                return hnoVar.aI() ? ahng.l() : aher.a;
            }
        }
        if (vxzVar.l(45, 45661515L, false) && (ajwoVar = abuuVarA.a.b) != null) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite3);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                aofb aofbVarA = aofb.a(((apfp) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).r);
                if (aofbVarA == null) {
                    aofbVarA = aofb.OFFLINE_TYPE_UNKNOWN;
                }
                if (aofbVarA == aofb.OFFLINE_MODE_TYPE_AUTO_OFFLINE || aofbVarA == aofb.OFFLINE_MODE_TYPE_EMERGENCY_BUFFER) {
                    return aher.a;
                }
            }
        }
        if (hnoVar.B()) {
            String strF = f(abuuVarA);
            if (!TextUtils.isEmpty(strF)) {
                synchronized (this.b) {
                    abul abulVar2 = abugVarA.c;
                    if (!Objects.equals(abulVar2, this.c)) {
                        this.c = abulVar2;
                        this.d.clear();
                    }
                    if (!this.d.add(strF)) {
                        return aher.a;
                    }
                }
            }
        }
        Executor executor = this.k;
        hno hnoVar2 = this.g;
        if (((vxz) hnoVar2.k).l(24, 45643442L, false)) {
            this.f.E(new acst(abuuVarA.a.b));
        }
        if (hnoVar2.C()) {
            aciyVar = new iab(this, abugVar, 13, null);
        } else if (abugVar.c.b == 0 && d()) {
            aciyVar = new acwb(1);
        } else {
            abwf abwfVar = this.j;
            abwfVar.getClass();
            aciyVar = new aciy(abwfVar, 9);
        }
        boolean zL = ((vxz) hnoVar2.m).l(104, 45822223L, false);
        abwf abwfVar2 = this.j;
        ListenableFuture listenableFutureG = zL ? abwfVar2.g(abuuVarA, abugVarA, aciyVar, i) : abwfVar2.f(abuuVarA, abugVarA, aciyVar);
        taf.i(listenableFutureG, executor, new gwc(this, (abvz) abuuVarA, abugVarA, 9), new xwl(this, abuuVarA, 16), null);
        return ahno.ar(listenableFutureG, new abzr(13), executor);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0112  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (e(r14) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        if (e(r14) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        return;
     */
    @Override // defpackage.abuo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void b(defpackage.abun r14, defpackage.abuc r15) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acuu.b(abun, abuc):void");
    }

    @Override // defpackage.abuo
    public final /* synthetic */ void c(abun abunVar, abun abunVar2) {
    }

    public final boolean d() {
        return ahno.aa(this.e.n());
    }

    public final boolean e(abun abunVar) {
        if (!(abunVar instanceof abvz)) {
            return false;
        }
        abvz abvzVar = (abvz) abunVar;
        hno hnoVar = this.g;
        String strF = (hnoVar.C() || hnoVar.aJ()) ? f(abvzVar) : abvzVar.a().w();
        return !TextUtils.isEmpty(strF) && TextUtils.equals(strF, g());
    }
}
