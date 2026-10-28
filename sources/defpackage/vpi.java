package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vpi implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vpi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v17, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19, types: [axsp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v20, types: [axsp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v49, types: [java.lang.Object, tyy] */
    /* JADX WARN: Type inference failed for: r13v50, types: [java.lang.Object, xgn] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        vob vobVarC;
        String strY;
        ListenableFuture listenableFutureC;
        amwf amwfVar;
        amwf amwfVar2;
        xgn xgnVar;
        ameb amebVar;
        xgn xgnVar2;
        axx axxVar = null;
        switch (this.$cid) {
            case 0:
                ajmm ajmmVar = (ajmm) obj;
                vnr vnrVar = ((vpk) this.a).k;
                if (vnrVar != null) {
                    vnrVar.U(ajmmVar);
                    return;
                }
                return;
            case 1:
                vpk vpkVar = (vpk) this.a;
                vpkVar.u(vpkVar.b, vpkVar.e);
                vpkVar.u(vpkVar.c, vpkVar.f);
                vpkVar.u(vpkVar.d, vpkVar.g);
                for (ovo ovoVar : vpkVar.i) {
                    Object obj2 = ovoVar.b;
                    if (obj2 != null) {
                        vpkVar.u((View) obj2, ovoVar.a);
                    }
                }
                return;
            case 2:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return;
                }
                vor vorVar = (vor) ((agew) optional.get()).a;
                ajwo ajwoVar = (ajwo) ((agew) optional.get()).b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aqzk.b);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                aqzk aqzkVar = (aqzk) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                String strAc = tzk.ac(aqzkVar);
                if (strAc == null || (vobVarC = vorVar.c(strAc)) == null || (strY = tzk.Y(aqzkVar)) == null) {
                    return;
                }
                Object obj3 = this.a;
                boolean z = aqzkVar.g;
                boolean zH = vobVarC.H();
                xdi.f(vobVarC, true);
                if (zH) {
                    xdi xdiVar = (xdi) obj3;
                    Object obj4 = xdiVar.l;
                    apxr apxrVar = aqzkVar.f;
                    if (apxrVar == null) {
                        apxrVar = apxr.a;
                    }
                    listenableFutureC = ((wrv) obj4).d(xdiVar.a(strY, apxrVar, yno.F(ajwoVar), true));
                } else {
                    xdi xdiVar2 = (xdi) obj3;
                    Object obj5 = xdiVar2.l;
                    apxr apxrVar2 = aqzkVar.f;
                    if (apxrVar2 == null) {
                        apxrVar2 = apxr.a;
                    }
                    listenableFutureC = ((wrv) obj5).c(xdiVar2.a(strY, apxrVar2, yno.F(ajwoVar), false), xdiVar2.n);
                }
                xdi xdiVar3 = (xdi) obj3;
                taf.k(xdiVar3.h, listenableFutureC, new svm(obj3, vobVarC, 19), new aelp(xdiVar3, vobVarC, aqzkVar, z, ajwoVar, 1));
                return;
            case 3:
                int iOrdinal = ((vqb) obj).ordinal();
                Object obj6 = this.a;
                switch (iOrdinal) {
                    case 1:
                    case 5:
                        vqg vqgVar = (vqg) obj6;
                        vqgVar.v(false);
                        ((vpt) obj6).q(vqgVar.a.getString(R.string.sync_to_video));
                        return;
                    case 2:
                    case 4:
                    case 6:
                        ((vqg) obj6).v(false);
                        ((vpt) obj6).p(false);
                        return;
                    case 3:
                        ((vqg) obj6).v(true);
                        ((vpt) obj6).p(false);
                        return;
                    default:
                        return;
                }
            case 4:
                weo weoVar = (weo) obj;
                weh wehVar = weoVar.c;
                boolean z2 = wehVar instanceof amwf;
                Object obj7 = this.a;
                if (z2) {
                    amwf amwfVar3 = (amwf) wehVar;
                    if (amwfVar3 != null) {
                        ((vqg) obj7).s = amwfVar3.g() && !amwfVar3.getSyncEnabled().booleanValue();
                    }
                    if (amwfVar3 != null) {
                        vqg vqgVar2 = (vqg) obj7;
                        if (!vqgVar2.s && vqgVar2.r.g()) {
                            ((vng) vqgVar2.r.c()).d.kk(Integer.valueOf(amwfVar3.e() ? amwfVar3.getActiveItemIndex().intValue() : -1));
                        }
                    }
                } else {
                    ((vqg) obj7).s = true;
                }
                vqg vqgVar3 = (vqg) obj7;
                if (vqgVar3.s) {
                    ((vpt) obj7).p(false);
                    return;
                }
                if (vqgVar3.r.g()) {
                    return;
                }
                awli awliVar = vqgVar3.q;
                Object objAu = awliVar.au();
                Boolean bool = Boolean.FALSE;
                if (Objects.equals(objAu, bool)) {
                    ((vpt) obj7).p(true);
                    return;
                }
                if (z2 && (amwfVar = (amwf) wehVar) != null && amwfVar.f()) {
                    amwi currentSyncMode = amwfVar.getCurrentSyncMode();
                    amwi amwiVar = amwi.SYNC_MODE_USER_BROWSING;
                    if (currentSyncMode == amwiVar) {
                        weh wehVar2 = weoVar.b;
                        if ((wehVar2 instanceof amwf) && ((amwfVar2 = (amwf) wehVar2) == null || !amwfVar2.f() || amwfVar2.getCurrentSyncMode() == amwiVar)) {
                            return;
                        }
                        awliVar.kk(bool);
                        ((vpt) obj7).q(vqgVar3.a.getString(R.string.sync_to_video));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((vqx) this.a).c = ((Boolean) obj).booleanValue();
                return;
            case 6:
                ((vtg) this.a).i = ((Integer) obj).intValue();
                return;
            case 7:
                this.a.kk((Integer) obj);
                return;
            case 8:
                this.a.kk((Rect) obj);
                return;
            case 9:
                ((vtj) this.a).a = (vti) obj;
                return;
            case 10:
                ((vuu) this.a).a((vun) obj);
                return;
            case 11:
                xpl xplVar = (xpl) obj;
                Object obj8 = xplVar.b;
                Object obj9 = xplVar.a;
                vtt vttVar = (vtt) this.a;
                if (vttVar.f == null || vttVar.h == null || vttVar.i == null) {
                    return;
                }
                if (((agkz) obj9).size() <= 1) {
                    bac.p(vttVar.f, null);
                    vttVar.f.setClickable(false);
                    vttVar.f.setImportantForAccessibility(2);
                    return;
                }
                View view = vttVar.f;
                int i = bac.a;
                view.setImportantForAccessibility(1);
                vttVar.f.setClickable(true);
                int iOrdinal2 = ((vun) obj8).ordinal();
                if (iOrdinal2 == 0) {
                    axxVar = vttVar.h;
                } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                    axxVar = vttVar.i;
                }
                bac.p(vttVar.f, axxVar);
                return;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj10 = this.a;
                vtt vttVar2 = (vtt) obj10;
                avlh avlhVar = vttVar2.g;
                View view2 = vttVar2.f;
                if (view2 == null || avlhVar == null) {
                    return;
                }
                int i2 = 8;
                if (!zBooleanValue) {
                    view2.setVisibility(8);
                    vttVar2.e.b();
                    return;
                }
                view2.setVisibility(0);
                vttVar2.f.setZ(1.0f);
                avmm avmmVar = vttVar2.e;
                avmmVar.b();
                avlh avlhVarAc = vttVar2.d.ac(avlhVar, new jnx(i2));
                axfd axfdVar = vttVar2.p;
                axfdVar.getClass();
                avlh avlhVarH = avlhVarAc.H(new ugm(axfdVar, 7));
                vuu vuuVar = vttVar2.a;
                vuuVar.getClass();
                avmmVar.c(avlhVarH.ak(new vpi(vuuVar, 10)));
                avmmVar.c(avlh.f(avlhVar, vttVar2.b.b(), new jnx(9)).ak(new vpi(obj10, 11)));
                return;
            case 13:
                ((ValueAnimator) this.a).start();
                return;
            case 14:
                ((vua) this.a).g = ((Integer) obj).intValue();
                return;
            case 15:
                ((vua) this.a).f = ((Integer) obj).intValue();
                return;
            case 16:
                axiz axizVar = (axiz) obj;
                boolean zBooleanValue2 = ((Boolean) axizVar.a()).booleanValue();
                Object objB = axizVar.b();
                Object objC = axizVar.c();
                if (!zBooleanValue2 || (xgnVar = (xgn) ((vum) this.a).d.a()) == null) {
                    return;
                }
                int iOrdinal3 = ((vuy) objB).ordinal();
                if (iOrdinal3 == 0) {
                    amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_DRAG_DROP;
                } else {
                    if (iOrdinal3 != 1 && iOrdinal3 != 2) {
                        throw new RuntimeException(null, null);
                    }
                    amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_SWIPE;
                }
                xgnVar.o(amebVar, vum.a, vum.a((vun) objC));
                return;
            case 17:
                agew agewVar = (agew) obj;
                vun vunVar = (vun) agewVar.a;
                if (!((Boolean) agewVar.b).booleanValue() || (xgnVar2 = (xgn) ((vum) this.a).d.a()) == null) {
                    return;
                }
                xgz xgzVar = vum.a;
                xgnVar2.A(xgzVar, vum.a(vunVar));
                if (vunVar.equals(vun.d)) {
                    xgnVar2.p(xgzVar, vum.a(vunVar));
                    return;
                } else {
                    xgnVar2.w(xgzVar, vum.a(vunVar));
                    return;
                }
            case 18:
                xgz xgzVar2 = vum.a;
                ?? A = this.a.a();
                if (A != 0) {
                    A.d(vum.a);
                    return;
                }
                return;
            case 19:
                ((vuw) this.a).c = ((Integer) obj).intValue();
                return;
            default:
                ((vuw) this.a).a = ((Integer) obj).intValue();
                return;
        }
    }
}
