package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yde implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ yde(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v54, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, vxe] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajnf ajnfVar = null;
        switch (this.$cid) {
            case 0:
                ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                xgj xgjVar = new xgj(xhb.b(36381));
                ydf ydfVar = (ydf) this.a;
                ydfVar.e.o(amebVar, xgjVar, null);
                rmv rmvVar = ydfVar.m;
                rmvVar.getClass();
                ydfVar.b(rmvVar.b);
                return;
            case 1:
                ameb amebVar2 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                xgj xgjVar2 = new xgj(xhb.b(36380));
                ydf ydfVar2 = (ydf) this.a;
                ydfVar2.e.o(amebVar2, xgjVar2, null);
                ((TvSignInActivity) ydfVar2.a.getActivity()).finish();
                return;
            case 2:
                ameb amebVar3 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                xgj xgjVar3 = new xgj(xhb.b(36384));
                ydf ydfVar3 = (ydf) this.a;
                ydfVar3.e.o(amebVar3, xgjVar3, null);
                ydfVar3.a();
                return;
            case 3:
                ameb amebVar4 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                xgj xgjVar4 = new xgj(xhb.b(36383));
                ydf ydfVar4 = (ydf) this.a;
                ydfVar4.e.o(amebVar4, xgjVar4, null);
                ydfVar4.a();
                return;
            case 4:
                aatv aatvVar = (aatv) this.a;
                if (view == aatvVar.t) {
                    ajnfVar = aatvVar.v;
                } else if (view == aatvVar.u) {
                    ajnfVar = aatvVar.w;
                }
                aatvVar.d(ajnfVar);
                aatvVar.s.dismiss();
                return;
            case 5:
                ((absa) this.a).b();
                return;
            case 6:
                acmf acmfVar = ((acmg) this.a).g;
                if (acmfVar != null) {
                    acmfVar.i();
                    return;
                }
                return;
            case 7:
                ((acvc) this.a).s.b();
                return;
            case 8:
                ((acvc) this.a).s.a(false);
                return;
            case 9:
                acmx acmxVar = ((acvc) this.a).s;
                acmxVar.b = 4;
                acrp acrpVarB = acmo.b(acmxVar.a.j());
                if (acrpVarB instanceof acrd) {
                    throw null;
                }
                return;
            case 10:
                acmx acmxVar2 = ((acvc) this.a).s;
                acmxVar2.b = 5;
                acrp acrpVarB2 = acmo.b(acmxVar2.a.j());
                if (acrpVarB2 instanceof acrd) {
                    throw null;
                }
                return;
            case 11:
                Iterator it = ((acvc) this.a).a.iterator();
                while (it.hasNext()) {
                    ((ime) it.next()).i();
                }
                return;
            case 12:
                ((bp) this.a).iN();
                return;
            case 13:
                adjy adjyVar = (adjy) this.a;
                View view2 = adjyVar.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                View view3 = adjyVar.c;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                adjyVar.d = false;
                return;
            case 14:
                adjy adjyVar2 = (adjy) this.a;
                View view4 = adjyVar2.c;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                View view5 = adjyVar2.b;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
                adjyVar2.d = true;
                return;
            case 15:
                ((gr) this.a).dismiss();
                return;
            case 16:
                Object obj = this.a;
                adny adnyVar = (adny) obj;
                tuk.i(adnyVar.getCurrentFocus());
                String string = adnyVar.d.getText().toString();
                akoa akoaVar = (akoa) adnyVar.e.getSelectedItem();
                akoa akoaVar2 = (akoa) adnyVar.f.getSelectedItem();
                String string2 = adnyVar.g.getText().toString();
                adnz adnzVar = adnyVar.h;
                eqq eqqVar = adnzVar.d;
                eqqVar.b = true;
                amkl amklVar = adnzVar.a;
                if (eqqVar.d(amklVar, adnyVar, string, akoaVar, akoaVar2, true)) {
                    Object obj2 = adnzVar.c;
                    agkh agkhVar = new agkh(4);
                    agkhVar.e("com.google.android.libraries.youtube.innertube.services.flags.user_comments", string);
                    agkhVar.e("com.google.android.libraries.youtube.innertube.endpoint.tag", obj2);
                    if (akoaVar != null && akoaVar2 != null) {
                        aihf aihfVarCreateBuilder = alpi.a.createBuilder();
                        int iIntValue = akoaVar.c == 6 ? ((Integer) akoaVar.d).intValue() : 0;
                        aihfVarCreateBuilder.copyOnWrite();
                        alpi alpiVar = (alpi) aihfVarCreateBuilder.instance;
                        alpiVar.b |= 1;
                        alpiVar.c = iIntValue;
                        int iIntValue2 = akoaVar2.c == 6 ? ((Integer) akoaVar2.d).intValue() : 0;
                        aihfVarCreateBuilder.copyOnWrite();
                        alpi alpiVar2 = (alpi) aihfVarCreateBuilder.instance;
                        alpiVar2.b |= 2;
                        alpiVar2.d = iIntValue2;
                        aihfVarCreateBuilder.copyOnWrite();
                        alpi alpiVar3 = (alpi) aihfVarCreateBuilder.instance;
                        string2.getClass();
                        alpiVar3.b |= 4;
                        alpiVar3.e = string2;
                        agkhVar.e("com.google.android.libraries.youtube.innertube.services.flags.legal_report_details", (alpi) aihfVarCreateBuilder.build());
                    }
                    agev agevVar = adnzVar.b;
                    ?? r14 = eqqVar.c;
                    ajng ajngVar = amklVar.n;
                    if (ajngVar == null) {
                        ajngVar = ajng.a;
                    }
                    ajnf ajnfVar2 = ajngVar.c;
                    if (ajnfVar2 == null) {
                        ajnfVar2 = ajnf.a;
                    }
                    ajwo ajwoVar = ajnfVar2.q;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    r14.c(ajwoVar, agkhVar.d(true));
                    ((gr) obj).dismiss();
                    return;
                }
                return;
            case 17:
                int i = adyk.b;
                this.a.run();
                return;
            case 18:
                ((adzb) this.a).c();
                return;
            case 19:
                ((adze) this.a).c();
                return;
            default:
                aeal aealVar = ((aeam) this.a).d;
                if (aealVar != null) {
                    aealVar.a();
                    return;
                }
                return;
        }
    }
}
