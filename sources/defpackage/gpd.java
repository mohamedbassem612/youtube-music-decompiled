package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gpd implements BiConsumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gpd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int height;
        goc gocVar;
        Toolbar toolbar;
        int height2;
        int height3;
        switch (this.$cid) {
            case 0:
                Integer num = (Integer) obj;
                Object obj3 = this.a;
                if (kro.M((cc) obj3)) {
                    return;
                }
                gpl gplVar = (gpl) obj3;
                if (gplVar.am != null) {
                    if (num.intValue() == 0) {
                        gplVar.am.q(3);
                    } else {
                        gplVar.am.q(2);
                    }
                }
                Toolbar toolbar2 = gplVar.B;
                if (toolbar2 == null || gplVar.aj == null || (height = toolbar2.getHeight() + gplVar.aj.getHeight()) <= 0) {
                    return;
                }
                float fMin = 1.0f - Math.min((-num.intValue()) / height, 1.0f);
                gplVar.B.setAlpha(fMin);
                gplVar.aj.setAlpha(fMin);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                Object obj4 = this.a;
                if (kro.M((cc) obj4) || (toolbar = (gocVar = (goc) obj4).B) == null || (height2 = toolbar.getHeight()) <= 0) {
                    return;
                }
                float fMin2 = 1.0f - Math.min((-num2.intValue()) / height2, 1.0f);
                View view = gocVar.ab;
                if (view == null || view.getVisibility() != 0) {
                    gocVar.B.setAlpha(fMin2);
                    return;
                }
                View view2 = gocVar.ab;
                if (view2 != null) {
                    view2.setAlpha(fMin2);
                    return;
                }
                return;
            case 2:
                Integer num3 = (Integer) obj;
                grs grsVar = (grs) this.a;
                Toolbar toolbar3 = grsVar.d;
                if (toolbar3 == null || (height3 = toolbar3.getHeight()) <= 0) {
                    return;
                }
                grsVar.d.setAlpha(1.0f - Math.min((-num3.intValue()) / height3, 1.0f));
                return;
            case 3:
                aihf aihfVarCreateBuilder = aodz.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aodz aodzVar = (aodz) aihfVarCreateBuilder.instance;
                aoeb aoebVar = (aoeb) ((aihf) obj2).build();
                aoebVar.getClass();
                aodzVar.c = aoebVar;
                aodzVar.b |= 1;
                ((agkh) this.a).e((String) obj, (aodz) aihfVarCreateBuilder.build());
                return;
            case 4:
                aga agaVar = ElementsServices.a;
                int[] iArr = (int[]) this.a;
                int i = iArr[0];
                int i2 = i << 1;
                iArr[i2 + 1] = ((Integer) obj).intValue();
                iArr[i2 + 2] = ((opm) obj2).a();
                iArr[0] = i + 1;
                return;
            case 5:
                qvc qvcVar = (qvc) obj;
                Optional optionalC = nrb.c((ListenableFuture) obj2);
                if (optionalC.isPresent()) {
                    ((qxt) this.a).c.put(qvcVar.c, (qvk) optionalC.get());
                    return;
                }
                return;
            case 6:
                qup qupVar = (qup) obj;
                qup qupVar2 = (qup) obj2;
                quu quuVar = (quu) qupVar.b;
                quu quuVar2 = (quu) qupVar2.b;
                boolean z = quuVar instanceof quv;
                Object obj5 = this.a;
                int i3 = 19;
                if (z && (quuVar2 instanceof quv)) {
                    Iterable$EL.forEach(new rjg(qupVar, qupVar2, (char[]) null).a, new rcp(obj5, i3));
                    return;
                }
                if ((quuVar instanceof qux) && (quuVar2 instanceof qux)) {
                    Iterable$EL.forEach(new rjg(qupVar, qupVar2, (int[]) null).a, new rcp(obj5, i3));
                    return;
                } else {
                    if ((quuVar instanceof quy) && (quuVar2 instanceof quy)) {
                        Iterable$EL.forEach(new rjg(qupVar, qupVar2, (short[]) null).a, new rcp(obj5, i3));
                        return;
                    }
                    return;
                }
            case 7:
                ((vae) ((yhi) this.a).b).v((String) obj);
                ((agfp) obj2).f();
                return;
            case 8:
                vou vouVar = (vou) obj2;
                akuj akujVarU = vouVar.b.u();
                if (akujVarU == null || ahno.aa(tzk.aa(akujVarU))) {
                    return;
                }
                aihf aihfVarCreateBuilder2 = vst.a.createBuilder();
                int i4 = vouVar.c;
                aihfVarCreateBuilder2.copyOnWrite();
                vst vstVar = (vst) aihfVarCreateBuilder2.instance;
                vstVar.b |= 4;
                vstVar.e = i4;
                aihfVarCreateBuilder2.copyOnWrite();
                vst vstVar2 = (vst) aihfVarCreateBuilder2.instance;
                vstVar2.c = akujVarU;
                vstVar2.b |= 1;
                ajwo ajwoVar = vouVar.e;
                if (ajwoVar != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    vst vstVar3 = (vst) aihfVarCreateBuilder2.instance;
                    vstVar3.d = ajwoVar;
                    vstVar3.b |= 2;
                }
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                vss vssVar = (vss) aihfVar.instance;
                vst vstVar4 = (vst) aihfVarCreateBuilder2.build();
                vss vssVar2 = vss.a;
                vstVar4.getClass();
                aiie aiieVar = vssVar.b;
                if (!aiieVar.c()) {
                    vssVar.b = aihn.mutableCopy(aiieVar);
                }
                vssVar.b.add(vstVar4);
                return;
            case 9:
                xgt xgtVar = (xgt) obj;
                xgtVar.k();
                ((xgo) this.a).m(xgtVar, amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SCREEN_CLOSED, (xie) obj2);
                return;
            case 10:
                xgt xgtVar2 = (xgt) obj;
                xgtVar2.k();
                xgo xgoVar = (xgo) this.a;
                xgoVar.m(xgtVar2, amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SCREEN_DESTROYED, (xie) obj2);
                if (xgoVar.h) {
                    ((xhk) xgoVar.d.io()).c(xgtVar2);
                    return;
                }
                return;
            case 11:
                ((xgo) this.a).l((xgt) obj, (xie) obj2);
                return;
            case 12:
                ((xgo) this.a).m((xgt) obj, amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_HIDDEN, (xie) obj2);
                return;
            case 13:
                xgt xgtVar3 = (xgt) obj;
                xie xieVar = (xie) obj2;
                aihf aihfVarCreateBuilder3 = amcd.a.createBuilder();
                String str = xgtVar3.a;
                aihfVarCreateBuilder3.copyOnWrite();
                amcd amcdVar = (amcd) aihfVarCreateBuilder3.instance;
                str.getClass();
                amcdVar.b |= 1;
                amcdVar.c = str;
                amec amecVar = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SHOWN;
                aihfVarCreateBuilder3.copyOnWrite();
                amcd amcdVar2 = (amcd) aihfVarCreateBuilder3.instance;
                amcdVar2.f = amecVar.i;
                amcdVar2.b |= 8;
                argn argnVarC = xgo.c(xgtVar3.f);
                aihfVarCreateBuilder3.copyOnWrite();
                amcd amcdVar3 = (amcd) aihfVarCreateBuilder3.instance;
                argnVarC.getClass();
                amcdVar3.d = argnVarC;
                amcdVar3.b |= 2;
                amcd amcdVar4 = (amcd) aihfVarCreateBuilder3.build();
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                amcdVar4.getClass();
                alouVar.d = amcdVar4;
                alouVar.c = 72;
                xgo xgoVar2 = (xgo) this.a;
                xgoVar2.d(alosVar, xgtVar3, xieVar);
                ((xhf) xgoVar2.c.io()).h(amcdVar4, xieVar);
                return;
            case 14:
                abvs abvsVar = (abvs) this.a;
                ListenableFuture listenableFuture = (ListenableFuture) obj2;
                abul abulVar = (abul) abvsVar.h.get((String) obj);
                abvsVar.a(listenableFuture, abulVar, abulVar != null ? aasc.f(abulVar, abvsVar.i) : null);
                return;
            case 15:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                acfs acfsVar = ((acfg) this.a).r;
                if (acfsVar != null) {
                    acfsVar.H(str2, str3, false);
                    return;
                }
                return;
            case 16:
                String str4 = (String) obj;
                aijp aijpVar = (aijp) obj2;
                if (aijpVar != null) {
                    Object obj6 = this.a;
                    aihf aihfVarCreateBuilder4 = adej.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    adej adejVar = (adej) aihfVarCreateBuilder4.instance;
                    str4.getClass();
                    adejVar.b |= 1;
                    adejVar.c = str4;
                    aihfVarCreateBuilder4.copyOnWrite();
                    adej adejVar2 = (adej) aihfVarCreateBuilder4.instance;
                    adejVar2.d = aijpVar;
                    adejVar2.b |= 2;
                    aihf aihfVar2 = (aihf) obj6;
                    aihfVar2.copyOnWrite();
                    adel adelVar = (adel) aihfVar2.instance;
                    adej adejVar3 = (adej) aihfVarCreateBuilder4.build();
                    adel adelVar2 = adel.a;
                    adejVar3.getClass();
                    aiie aiieVar2 = adelVar.j;
                    if (!aiieVar2.c()) {
                        adelVar.j = aihn.mutableCopy(aiieVar2);
                    }
                    adelVar.j.add(adejVar3);
                    return;
                }
                return;
            case 17:
                acjx acjxVar = (acjx) obj;
                abfv abfvVar = (abfv) obj2;
                ?? r0 = abfvVar.b;
                if (r0 != 0) {
                    ((adtv) this.a).ay(r0, acjxVar, (adto) abfvVar.a);
                    return;
                }
                return;
            default:
                bpt bptVar = (bpt) obj2;
                affd affdVar = (affd) bptVar.a(afnr.a);
                Object obj7 = this.a;
                if (affdVar != null) {
                    int i5 = ((afon) obj7).a.getArguments().getInt("TIKTOK_FRAGMENT_ACCOUNT_ID");
                    int i6 = affdVar.a;
                    ahno.S(i6 == i5, "Cannot use AccountViewModelFactory on a different account than the fragment the factory is from. Found: %s, Factory fragment: %s", i6, i5);
                    return;
                }
                bpp bppVar = (bpp) bptVar.a(bpd.b);
                if (bppVar instanceof cc) {
                    cc ccVar = ((afon) obj7).a;
                    ahno.U(bppVar == ccVar, "Cannot use AccountViewModelFactory on a different fragment than the fragment the factory is from. Found: %s, Factory fragment: %s", bppVar, ccVar);
                    return;
                } else {
                    cc ccVar2 = ((afon) obj7).a;
                    if (ccVar2.getView() == null || bppVar != ccVar2.getViewLifecycleOwner()) {
                        throw new IllegalStateException("AccountViewModels can only use account fragments and account-based Navigation back stack entries as the owner. Found the owner: ".concat(String.valueOf(String.valueOf(bppVar))));
                    }
                    return;
                }
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            default:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
