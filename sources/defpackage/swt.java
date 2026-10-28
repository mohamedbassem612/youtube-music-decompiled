package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swt implements adma, sts {
    private final LayoutInflater a;
    private final admd b;
    private final vxe c;
    private final TextView d;
    private final TextView e;
    private final aeaa f;
    private final aeaa g;
    private final aeaa h;
    private final stu i;
    private aqtf j;
    private final LinearLayout k;
    private final LinkedList l;

    public swt(Context context, swd swdVar, afip afipVar, vxe vxeVar, stu stuVar) {
        this.b = swdVar;
        this.c = vxeVar;
        this.i = stuVar;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.a = layoutInflaterFrom;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.unlimited_manage_subscription_page, (ViewGroup) null);
        this.d = (TextView) viewInflate.findViewById(R.id.subscription_title);
        this.e = (TextView) viewInflate.findViewById(R.id.additional_info);
        this.f = afipVar.d((TextView) viewInflate.findViewById(R.id.manage_family_button));
        this.g = afipVar.d((TextView) viewInflate.findViewById(R.id.manage_subscription_button));
        this.h = afipVar.d((TextView) viewInflate.findViewById(R.id.manage_fix_fop_button));
        this.k = (LinearLayout) viewInflate.findViewById(R.id.details_list_container);
        this.l = new LinkedList();
        swdVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((swd) this.b).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.i.c(this);
    }

    @Override // defpackage.sts
    public final void d(boolean z) {
        if (z) {
            aqtf aqtfVar = this.j;
            if ((aqtfVar.b & 64) != 0) {
                vxe vxeVar = this.c;
                ajwo ajwoVar = aqtfVar.j;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.c(ajwoVar, null);
            }
        }
    }

    @Override // defpackage.stt
    public final boolean f() {
        return false;
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        ajnf ajnfVar;
        ajnf ajnfVar2;
        ajnf ajnfVar3;
        LinearLayout linearLayout;
        aqtf aqtfVar = (aqtf) obj;
        this.i.b(this);
        if (Objects.equals(this.j, aqtfVar)) {
            return;
        }
        this.j = aqtfVar;
        xgn xgnVar = adlyVar.b;
        xgnVar.w(new xgj(aqtfVar.h, (amud) null), null);
        TextView textView = this.d;
        alay alayVar = aqtfVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        LinearLayout linearLayout2 = this.k;
        linearLayout2.removeAllViews();
        for (int i = 0; i < aqtfVar.d.size(); i++) {
            if ((((aqth) aqtfVar.d.get(i)).b & 1) != 0) {
                aqtg aqtgVar = ((aqth) aqtfVar.d.get(i)).c;
                if (aqtgVar == null) {
                    aqtgVar = aqtg.a;
                }
                LinkedList linkedList = this.l;
                if (i < linkedList.size()) {
                    linearLayout = (LinearLayout) linkedList.get(i);
                } else {
                    LinearLayout linearLayout3 = (LinearLayout) this.a.inflate(R.layout.unlimited_manage_subscription_page_offer_item, (ViewGroup) null);
                    linkedList.add(linearLayout3);
                    linearLayout = linearLayout3;
                }
                TextView textView2 = (TextView) linearLayout.findViewById(R.id.title);
                alay alayVar2 = aqtgVar.b;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
                tuk.u(textView2, ackj.k(null, alayVar2, null, false));
                TextView textView3 = (TextView) linearLayout.findViewById(R.id.content);
                alay alayVar3 = aqtgVar.c;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                tuk.u(textView3, ackj.k(null, alayVar3, null, false));
                linearLayout2.addView(linearLayout);
            }
        }
        tuk.u(this.e, aqtfVar.f.isEmpty() ? null : ackj.f(TextUtils.concat(System.getProperty("line.separator")), vxl.b(aqtfVar.f, this.c)));
        aeaa aeaaVar = this.f;
        aqte aqteVar = aqtfVar.i;
        if (aqteVar == null) {
            aqteVar = aqte.a;
        }
        if (aqteVar.b == 65153809) {
            aqte aqteVar2 = aqtfVar.i;
            if (aqteVar2 == null) {
                aqteVar2 = aqte.a;
            }
            ajnfVar = aqteVar2.b == 65153809 ? (ajnf) aqteVar2.c : ajnf.a;
        } else {
            ajnfVar = null;
        }
        aeaaVar.a(ajnfVar, xgnVar, null);
        aeaa aeaaVar2 = this.g;
        ajng ajngVar = aqtfVar.e;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        if ((ajngVar.b & 1) != 0) {
            ajng ajngVar2 = aqtfVar.e;
            if (ajngVar2 == null) {
                ajngVar2 = ajng.a;
            }
            ajnfVar2 = ajngVar2.c;
            if (ajnfVar2 == null) {
                ajnfVar2 = ajnf.a;
            }
        } else {
            ajnfVar2 = null;
        }
        aeaaVar2.a(ajnfVar2, xgnVar, null);
        aeaa aeaaVar3 = this.h;
        apji apjiVar = aqtfVar.g;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = aqtfVar.g;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            ajnfVar3 = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        } else {
            ajnfVar3 = null;
        }
        aeaaVar3.a(ajnfVar3, xgnVar, null);
        this.b.e(adlyVar);
    }
}
