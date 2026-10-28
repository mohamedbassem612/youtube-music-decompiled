package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vnm implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vnm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0191  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, xnu] */
    /* JADX WARN: Type inference failed for: r9v38, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v39, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r9v40, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [awqg, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        StickyHeaderContainer stickyHeaderContainer;
        boolean z;
        StickyHeaderContainer stickyHeaderContainer2;
        nh nhVar;
        aeei aeeiVar;
        int i = 0;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.a;
                final vro vroVar = (vro) obj;
                vnr vnrVar = (vnr) obj2;
                if (vnrVar.h != null && (stickyHeaderContainer = vnrVar.i) != null) {
                    stickyHeaderContainer.addView(vroVar.k());
                    LoadingFrameLayout loadingFrameLayout = vnrVar.h;
                    vroVar.getClass();
                    loadingFrameLayout.e(new aeja() { // from class: vnk
                        @Override // defpackage.aeja
                        public final void a() {
                            vroVar.r();
                        }
                    });
                    Optional optionalF = vnrVar.f();
                    if (optionalF.isPresent()) {
                        ((RecyclerView) optionalF.get()).ab = null;
                        if (!vnrVar.v.l(337, 45781749L, false)) {
                            ayq ayqVar = vnrVar.B;
                            String strI = ayqVar != null ? ayqVar.I(vroVar) : ((vmz) obj2).w();
                            akuj akujVar = ((vmz) obj2).f;
                            if (akujVar != null) {
                                akuh akuhVar = akujVar.h;
                                if (akuhVar == null) {
                                    akuhVar = akuh.a;
                                }
                                apoo apooVar = (akuhVar.b == 49399797 ? (apoq) akuhVar.c : apoq.a).h;
                                if (apooVar == null) {
                                    apooVar = apoo.a;
                                }
                                z = apooVar.b == 153515154;
                            }
                            if ((Objects.equals(strI, "engagement-panel-timeline-view-consolidated") || Objects.equals(strI, "PAmodern_transcript_view")) && z) {
                                vxz vxzVar = vnrVar.u;
                                if (!vxzVar.l(172, 45747233L, false)) {
                                    aeeiVar = vnrVar.r;
                                    if (aeeiVar != null) {
                                        aeeiVar.e();
                                        vnrVar.r = null;
                                    }
                                } else if (!vnrVar.f().isEmpty() && (stickyHeaderContainer2 = vnrVar.i) != null) {
                                    RecyclerView recyclerView = (RecyclerView) vnrVar.f().get();
                                    if (vnrVar.r == null && (nhVar = recyclerView.m) != null) {
                                        vnrVar.r = new aeei(stickyHeaderContainer2, recyclerView, nhVar, vxzVar);
                                    }
                                }
                            } else {
                                aeeiVar = vnrVar.r;
                                if (aeeiVar != null) {
                                    aeeiVar.e();
                                    vnrVar.r = null;
                                }
                            }
                        }
                        vny vnyVar = vnrVar.k;
                        if (vnrVar.t.l(3, 45368918L, false) && vnyVar != null && vnrVar.ae()) {
                            vps vpsVar = vnrVar.c;
                            View viewA = vnyVar.a();
                            RecyclerView recyclerView2 = (RecyclerView) optionalF.get();
                            vpsVar.b = viewA;
                            vpsVar.a = recyclerView2;
                        }
                    }
                    tbt tbtVar = vnrVar.b;
                    tbtVar.l(obj2);
                    if (vroVar.l().g()) {
                        tbtVar.h(obj2, vroVar.l().c());
                    }
                    break;
                }
                break;
            case 1:
                vro vroVar2 = (vro) obj;
                apof apofVar = (apof) this.a;
                vroVar2.v(apofVar.c, (apofVar.b & 4) != 0 ? apofVar.d : 0, null);
                break;
            case 2:
                this.a.l((xgz) obj);
                break;
            case 3:
                ((aehd) obj).a();
                vsc vscVar = (vsc) this.a;
                vscVar.j = Optional.empty();
                vscVar.k = false;
                break;
            case 4:
                avnr.b((AtomicReference) this.a);
                break;
            case 5:
                avnr.b((AtomicReference) this.a);
                break;
            case 6:
                wwv.v(obj, this.a.e());
                break;
            case 7:
                this.a.j((String) obj);
                break;
            case 8:
                ((xdb) this.a).f((String) obj, false, true);
                break;
            case 9:
                ((zs) obj).q(new xdo(this.a, i));
                break;
            case 10:
                ((woo) obj).G = (amyf) this.a;
                break;
            case 11:
                this.a.a((xvn) obj);
                break;
            case 12:
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                amxm amxmVar = (amxm) aihfVar.instance;
                amwt amwtVar = (amwt) ((aihf) obj).build();
                amxm amxmVar2 = amxm.a;
                amwtVar.getClass();
                amxmVar.g = amwtVar;
                amxmVar.b |= 16;
                break;
            case 13:
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                amxs amxsVar = (amxs) aihfVar2.instance;
                amwt amwtVar2 = (amwt) ((aihf) obj).build();
                amxs amxsVar2 = amxs.a;
                amwtVar2.getClass();
                amxsVar.f = amwtVar2;
                amxsVar.b |= 8;
                break;
            case 14:
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                amxn amxnVar = (amxn) aihfVar3.instance;
                amwt amwtVar3 = (amwt) ((aihf) obj).build();
                amxn amxnVar2 = amxn.a;
                amwtVar3.getClass();
                amxnVar.g = amwtVar3;
                amxnVar.b |= 64;
                break;
            case 15:
                ((ywh) this.a).z((arfb) obj);
                break;
            case 16:
                ((yyu) this.a).a.b.z((arfb) obj);
                break;
            case 17:
                this.a.invoke(obj);
                break;
            case 18:
                this.a.invoke(obj);
                break;
            case 19:
                this.a.invoke(obj);
                break;
            default:
                this.a.invoke(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
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
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
