package defpackage;

import android.graphics.Rect;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Observer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class acae implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acae(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v24, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v35, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v36, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v56, types: [zki, zlm] */
    /* JADX WARN: Type inference failed for: r10v64, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v79, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v80, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        ?? r10;
        switch (this.$cid) {
            case 0:
                acip acipVar = ((aazq) obj).b;
                acag acagVar = (acag) this.a;
                acagVar.q = acipVar;
                acagVar.r = false;
                return;
            case 1:
                aazb aazbVar = (aazb) obj;
                acca accaVar = aazbVar.b;
                String str = aazbVar.a;
                Object obj2 = this.a;
                zgj zgjVar = str != null ? (zgj) ((abzz) obj2).d.get(str) : null;
                if (zgjVar == null || !((abzz) obj2).c.g.l(153, 45658503L, false)) {
                    return;
                }
                int i = aazbVar.d;
                if (i != 1) {
                    if (i != 5) {
                        return;
                    } else {
                        i = 5;
                    }
                }
                if (accaVar == null || accaVar.g()) {
                    return;
                }
                String strA = aazbVar.a();
                String strS = aawr.s(i);
                zgjVar.e.a("cfi", zgjVar.c() + ':' + strA + ':' + strS);
                return;
            case 2:
                ((acag) this.a).q = ((aazq) obj).b;
                return;
            case 3:
                aazb aazbVar2 = (aazb) obj;
                acca accaVar2 = aazbVar2.b;
                if (!aazbVar2.e || accaVar2 == null) {
                    return;
                }
                ((acal) this.a).a.add(accaVar2.a);
                return;
            case 4:
                Rect rect = ((tuy) obj).a.a;
                acdi acdiVar = (acdi) this.a;
                Rect rect2 = acdiVar.aa;
                if (rect2.equals(rect)) {
                    return;
                }
                rect2.set(rect);
                acdiVar.requestLayout();
                return;
            case 5:
                ((acea) this.a).n((aawn) obj);
                return;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                abxv abxvVar = (abxv) this.a;
                int i2 = ((abnc) abxvVar.b).s;
                boolean z = i2 == 2;
                if (i2 == 1 || z != zBooleanValue) {
                    Optional optionalOfNullable = (Optional) abxvVar.a.io();
                    acfu acfuVar = new acfu(zBooleanValue);
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((acfv) optionalOfNullable.get()).aZ(acfuVar.a)));
                    }
                    ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue();
                    return;
                }
                return;
            case 7:
                this.a.invoke(obj);
                return;
            case 8:
                this.a.invoke(obj);
                return;
            case 9:
                ((achb) this.a).h((aazq) obj);
                return;
            case 10:
                acip acipVar2 = ((aazq) obj).b;
                if (acipVar2.a() == 3) {
                    achr achrVar = (achr) this.a;
                    achrVar.D();
                    achrVar.A();
                    achrVar.C(acipVar2.f(), acipVar2.au());
                    return;
                }
                return;
            case 11:
                ((achr) this.a).j = false;
                return;
            case 12:
                aaxo aaxoVar = (aaxo) obj;
                if (aaxoVar != null) {
                    ((yef) ((ci) this.a).a).a.f = aaxoVar.a.i;
                    return;
                }
                return;
            case 13:
                zki zkiVar = ((abmd) obj).b;
                Object obj3 = this.a;
                if (zkiVar == null) {
                    acjj acjjVar = (acjj) obj3;
                    if (acjjVar.equals(acjjVar.b.g)) {
                        acjjVar.d.w(null);
                        return;
                    } else {
                        ((agrc) ((agrc) acjj.a.b()).k("com/google/android/libraries/youtube/player/view/MediaViewAttachmentController", "handleMediaViewSetEvent", 75, "MediaViewAttachmentController.java")).t("Trying to detachMediaView when it wasn't the most recent MediaView Setter");
                        return;
                    }
                }
                acjj acjjVar2 = (acjj) obj3;
                acjjVar2.d.w(zkiVar);
                acfn acfnVar = acjjVar2.b;
                acjj acjjVar3 = acfnVar.g;
                if (acjjVar3 != obj3) {
                    if (acjjVar3 != null) {
                        if (!acjjVar3.e.g.m(282, 45728306L) && (r10 = acjjVar3.c.d) != 0) {
                            r10.H();
                        }
                        Observer observer = acfnVar.c;
                        if (observer != null) {
                            acfnVar.g.a().deleteObserver(observer);
                        }
                    }
                    acfnVar.g = acjjVar2;
                    zkk zkkVarA = acfnVar.g.a();
                    Observer observer2 = acfnVar.c;
                    if (observer2 != null) {
                        zkkVarA.addObserver(observer2);
                    }
                    acfnVar.notifyObservers();
                    return;
                }
                return;
            case 14:
                this.a.invoke(obj);
                return;
            case 15:
                tub tubVar = (tub) obj;
                boolean zEquals = tubVar.b().equals(acjw.d);
                Object obj4 = this.a;
                if (!zEquals) {
                    acjw acjwVarB = tubVar.b();
                    acjw acjwVar = acjw.i;
                    if (acjwVarB.equals(acjwVar)) {
                        String strG = tubVar.g();
                        byte[] bArrG = tubVar.c().G();
                        anin aninVar = ((adsr) obj4).s.b().g;
                        if (aninVar == null) {
                            aninVar = anin.a;
                        }
                        ((adtv) obj4).iM(aawb.af(strG, bArrG, acjwVar, null, false, false, true, aninVar.i));
                        return;
                    }
                    String str2 = "Unexpected continuation type [ContinuationType: " + tubVar.b().toString() + "] ignored";
                    ((agrc) ((agrc) adsr.i.b()).k("com/google/android/libraries/youtube/rendering/ui/AbstractSectionListController", "<init>", 604, "AbstractSectionListController.java")).w("%s", str2);
                    zvp.a(zvn.a, zvm.f, str2);
                    return;
                }
                ajwo ajwoVarD = tubVar.d();
                final int iA = tubVar.a();
                adsr adsrVar = (adsr) obj4;
                synchronized (adsrVar.v) {
                    amuh amuhVar = ((adsr) obj4).s.b().n;
                    if (amuhVar == null) {
                        amuhVar = amuh.a;
                    }
                    amdz amdzVar = amuhVar.d;
                    if (amdzVar == null) {
                        amdzVar = amdz.a;
                    }
                    if (!amdzVar.i || ajwoVarD == null || iA == 0) {
                        ((adsr) obj4).W = ((adtv) obj4).ai;
                        ((adsr) obj4).V = true;
                    } else {
                        final adsr adsrVar2 = (adsr) obj4;
                        ((adsr) obj4).W = new adtq() { // from class: adsn
                            @Override // defpackage.adtq
                            public final void a(acjx acjxVar, ajwo ajwoVar) {
                                xgn xgnVar = adsrVar2.ag;
                                xgnVar.t();
                                if (acjxVar.a() == acjw.d) {
                                    xgnVar.b(xhb.a(iA), ajwoVar, null);
                                }
                            }
                        };
                        ((adsr) obj4).V = false;
                    }
                }
                if (!tubVar.f().isPresent()) {
                    adsrVar.j(tubVar.e(), tubVar.d());
                    return;
                }
                apho aphoVarE = tubVar.e();
                ajwo ajwoVarD2 = tubVar.d();
                akrn akrnVar = (akrn) tubVar.f().get();
                adsrVar.M(false);
                adsrVar.E(akrnVar, null, -1, true, -1);
                ((adtv) obj4).aC(aawb.ae(aphoVarE), ajwoVarD2);
                return;
            case 16:
                Object obj5 = this.a;
                acjw acjwVar2 = acjw.l;
                adtv adtvVar = (adtv) obj5;
                HashMap map = adtvVar.af;
                acjx acjxVar = (acjx) map.get(acjwVar2);
                if (acjxVar != null) {
                    adtvVar.iM(acjxVar);
                    acjw acjwVarA = acjxVar.a();
                    acjx acjxVar2 = (acjx) map.get(acjwVarA);
                    if (acjxVar2 != null) {
                        if (acjxVar2 == acjxVar || acjxVar2.c().equals(acjxVar.c())) {
                            map.remove(acjwVarA);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                aecu aecuVar = (aecu) obj;
                String strE = aecuVar.e();
                int iB = aecuVar.b();
                aecuVar.a();
                Object obj6 = this.a;
                ((adsr) obj6).v(strE, iB, new acnp(obj6, aecuVar, 19));
                return;
            case 18:
                this.a.invoke(obj);
                return;
            case 19:
                this.a.invoke(obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                aeog aeogVar = (aeog) this.a;
                awli awliVar = aeogVar.s;
                if (Objects.equals(awliVar.au(), bool)) {
                    return;
                }
                awliVar.kk(bool);
                aeogVar.e();
                return;
        }
    }
}
