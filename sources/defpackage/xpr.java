package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xpr implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xpr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xgx xgxVar;
        int i = 1;
        boolean z = false;
        Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                xgj xgjVar = new xgj(xhb.b(27858));
                Object obj = this.a;
                xpw xpwVar = (xpw) obj;
                xpwVar.b.o(amebVar, xgjVar, null);
                xvk xvkVar = (xvk) view.getTag();
                xpt xptVar = new xpt();
                xptVar.k = new xxj(obj, objArr == true ? 1 : 0);
                Bundle bundle = new Bundle();
                bundle.putString("deviceId", xvkVar.k().b);
                bundle.putString("screenName", xvkVar.c());
                cc ccVar = xpwVar.a;
                xptVar.setTargetFragment(ccVar, 0);
                xptVar.setArguments(bundle);
                xptVar.h(ccVar.getActivity().getSupportFragmentManager(), "confirmRemoveDialog");
                break;
            case 1:
                ((xpk) ((xpl) this.a).a).dismiss();
                break;
            case 2:
                dii diiVar = (dii) view.getTag();
                boolean zO = diiVar.o();
                Object obj2 = this.a;
                if (!zO) {
                    xqe xqeVar = (xqe) obj2;
                    xqeVar.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(27847)), null);
                    if (!xqeVar.f.a(false, new xrb(obj2, diiVar, i))) {
                        xqeVar.b(diiVar);
                    }
                } else {
                    xqe xqeVar2 = (xqe) obj2;
                    xqeVar2.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(27848)), null);
                    xqeVar2.d.P();
                }
                break;
            case 3:
                xqe xqeVar3 = (xqe) this.a;
                if (!xqeVar3.v) {
                    xqeVar3.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(27851)), null);
                    xqeVar3.a.getActivity().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                } else {
                    xqeVar3.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(27852)), null);
                    xqeVar3.a();
                }
                break;
            case 4:
                xqe xqeVar4 = (xqe) this.a;
                xqeVar4.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(27849)), null);
                cf activity = xqeVar4.a.getActivity();
                if (activity instanceof PairWithTvActivity) {
                    yno.di((PairWithTvActivity) activity, PairWithTvActivity.class, 1, null);
                }
                break;
            case 5:
                xqe xqeVar5 = (xqe) this.a;
                xqeVar5.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(27853)), null);
                cf activity2 = xqeVar5.a.getActivity();
                if (activity2 instanceof PairWithTvActivity) {
                    yno.di((PairWithTvActivity) activity2, PairWithTvActivity.class, 2, null);
                }
                break;
            case 6:
                xqe xqeVar6 = (xqe) this.a;
                xqeVar6.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(27852)), null);
                xqeVar6.a();
                break;
            case 7:
                ameb amebVar2 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                xgj xgjVar2 = new xgj(xhb.b(27855));
                Object obj3 = this.a;
                xqi xqiVar = (xqi) obj3;
                xqiVar.b.o(amebVar2, xgjVar2, null);
                if (!xqiVar.c.a(false, new xrv(obj3, 1))) {
                    xqiVar.b();
                }
                break;
            case 8:
                ameb amebVar3 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                xgj xgjVar3 = new xgj(xhb.b(27856));
                xqi xqiVar2 = (xqi) this.a;
                xqiVar2.b.o(amebVar3, xgjVar3, null);
                xqiVar2.c();
                break;
            case 9:
                Intent intent = new Intent("android.intent.action.VIEW");
                xsq xsqVar = (xsq) this.a;
                xsqVar.b = intent;
                xsqVar.b.setData(xtj.a);
                yno.dc(xsqVar.a, xsqVar.b);
                xsj xsjVar = xsqVar.c.c;
                xgx xgxVar2 = xsjVar.C;
                xhb.b(55768);
                xsjVar.y(xgxVar2);
                break;
            case 10:
                xsr xsrVar = (xsr) this.a;
                aeda aedaVar = xsrVar.b;
                if (aedaVar != null) {
                    if (aedaVar.f() && aedaVar.g()) {
                        z = true;
                    }
                    Context context = xsrVar.a;
                    xsh xshVar = xsrVar.c;
                    Intent intentDe = yno.de(context, z);
                    xshVar.a = true;
                    yno.dc(context, intentDe);
                    xsj xsjVar2 = xshVar.c;
                    xgx xgxVar3 = xsjVar2.B;
                    xhb.b(82853);
                    xsjVar2.y(xgxVar3);
                }
                break;
            case 11:
                ((xst) this.a).a.d();
                break;
            case 12:
                xsu xsuVar = (xsu) this.a;
                xsj xsjVar3 = xsuVar.k.c;
                xgx xgxVar4 = xsjVar3.K;
                xhb.b(210364);
                xsjVar3.y(xgxVar4);
                xsuVar.q.d();
                break;
            case 13:
                xsu xsuVar2 = (xsu) this.a;
                xsj xsjVar4 = xsuVar2.k.c;
                xgx xgxVar5 = xsjVar4.J;
                xhb.b(210363);
                xsjVar4.y(xgxVar5);
                xsuVar2.k.b.b();
                xsuVar2.k.b(xsuVar2.getActivity());
                if (!xsuVar2.k.f()) {
                    xsuVar2.l.d(xsuVar2.m);
                }
                break;
            case 14:
                xsv xsvVar = (xsv) this.a;
                xsj xsjVar5 = xsvVar.d.c;
                xgx xgxVar6 = xsjVar5.D;
                xhb.b(78759);
                xsjVar5.y(xgxVar6);
                xsvVar.b(xsvVar.a, yct.LISTENING.ordinal());
                break;
            case 15:
                xsv xsvVar2 = (xsv) this.a;
                xsj xsjVar6 = xsvVar2.d.c;
                xgx xgxVar7 = xsjVar6.E;
                xhb.b(78760);
                xsjVar6.y(xgxVar7);
                xsvVar2.b(xsvVar2.a, yct.NOT_LISTENING_WITH_DPAD.ordinal());
                break;
            case 16:
                xtd xtdVar = (xtd) this.a;
                xsh xshVar2 = (xsh) xtdVar.d;
                xsj xsjVar7 = xshVar2.c;
                xgx xgxVar8 = xsjVar7.A;
                xhb.b(12927);
                xsjVar7.y(xgxVar8);
                xshVar2.b.h(false);
                Object objF = tym.M((Context) xtdVar.b).f();
                cf cfVar = objF instanceof cf ? (cf) objF : null;
                if (cfVar != null) {
                    xshVar2.h(cfVar, 2);
                }
                break;
            case 17:
                xtg xtgVar = (xtg) this.a;
                xsh xshVar3 = xtgVar.b;
                if (!zik.bS(xshVar3.g)) {
                    xshVar3.l.a();
                    xsj xsjVar8 = xshVar3.c;
                    xgn xgnVar = xsjVar8.x;
                    if (xgnVar != null && (xgxVar = xsjVar8.F) != null) {
                        xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgxVar, null);
                    }
                    xshVar3.h((cf) xtgVar.a, 3);
                }
                break;
            case 18:
                ((xtv) this.a).p(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.cast.settings.CastSettingsActivity").putExtra("ACTIVITY_TYPE", "CastSettings"));
                break;
            case 19:
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("https://support.google.com/youtube/answer/7640706?hl=%@"));
                xtv xtvVar = (xtv) this.a;
                xtvVar.p(intent2);
                xtvVar.o(xtvVar.z);
                break;
            default:
                Object obj4 = this.a;
                xug xugVar = (xug) obj4;
                if (xugVar.Y.o()) {
                    xugVar.X.P();
                }
                ((gr) obj4).dismiss();
                break;
        }
    }

    public xpr(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
