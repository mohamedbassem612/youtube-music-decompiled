package defpackage;

import android.view.accessibility.CaptioningManager;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hvf implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hvf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, sxu] */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    ((aarj) ((hvh) this.a).e.io()).a();
                }
                break;
            case 1:
                Optional optionalJ = ((hed) ((gjs) this.a).m.io()).J((affd) obj);
                optionalJ.isPresent();
                ((aesp) optionalJ.get()).h();
                break;
            case 2:
                ieg iegVar = (ieg) obj;
                if (iegVar != null) {
                    idr idrVar = (idr) this.a;
                    if (idrVar.D.l(183, 45682757L, false)) {
                        idrVar.C = iegVar;
                    }
                }
                break;
            case 3:
                alrg alrgVar = (alrg) obj;
                agrx agrxVar = agso.a;
                int i = alrgVar.b & 32;
                Object obj2 = this.a;
                if (i != 0) {
                    algn algnVar = alrgVar.e;
                    if (algnVar == null) {
                        algnVar = algn.a;
                    }
                    if (algnVar.b) {
                        xou xouVar = (xou) obj2;
                        xgn xgnVar = xouVar.c;
                        if (xgnVar.a() != null) {
                            xou.b(xgnVar);
                        } else {
                            xouVar.g = true;
                            if (!xouVar.f) {
                                xouVar.d.f(obj2);
                                xouVar.f = true;
                            }
                        }
                    }
                }
                if ((alrgVar.b & 2) == 0) {
                    ((xou) obj2).a(false);
                    ((agrc) ((agrc) xou.a.b().i(agrxVar, "Handoff.ResponseController")).k("com/google/android/libraries/youtube/mdx/handoff/HandoffResponseController", "processHandoffResponse", 75, "HandoffResponseController.java")).t("No Command found in handoff response.");
                } else {
                    ajwo ajwoVar = alrgVar.d;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(ajig.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        xou xouVar2 = (xou) obj2;
                        if (xouVar2.h.l(250, 45827691L, false)) {
                            Optional optional = (Optional) xouVar2.e.io();
                            if (optional.isPresent()) {
                                xoo xooVar = (xoo) optional.get();
                                ajwo ajwoVar2 = alrgVar.d;
                                if (!xooVar.a()) {
                                    xouVar2.a(false);
                                }
                            }
                        }
                        xouVar2.a(true);
                        vxe vxeVar = xouVar2.b;
                        ajwo ajwoVar3 = alrgVar.d;
                        if (ajwoVar3 == null) {
                            ajwoVar3 = ajwo.a;
                        }
                        vxeVar.a(ajwoVar3);
                    }
                }
                break;
            case 4:
                dhq dhqVar = (dhq) obj;
                if (dhqVar != null) {
                    ((dhp) this.a).gz(dhqVar);
                }
                break;
            case 5:
                this.a.b(null, (List) obj);
                break;
            case 6:
                ((aado) this.a).y(new aahw());
                break;
            case 7:
                ((aaqx) ((aado) this.a).r.io()).f(((Collection) obj).size());
                break;
            case 8:
                Boolean bool = (Boolean) obj;
                abfs abfsVar = (abfs) this.a;
                abfsVar.c = bool;
                if (!bool.booleanValue()) {
                    abfsVar.b.kk(abfq.a(abfsVar.b()));
                } else {
                    awku awkuVar = abfsVar.b;
                    ahvf ahvfVar = new ahvf(abfq.a(true));
                    ahvfVar.f(true);
                    awkuVar.kk(ahvfVar.e());
                }
                break;
            case 9:
                agev agevVar = (agev) obj;
                if (agevVar.g()) {
                    ((acag) this.a).l = (CaptioningManager) agevVar.c();
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    Object obj3 = this.a;
                    vwt vwtVar = ((adsr) obj3).ac;
                    if (vwtVar != null) {
                        vwtVar.D(new acnd(obj3, 20));
                    }
                }
                break;
        }
    }
}
