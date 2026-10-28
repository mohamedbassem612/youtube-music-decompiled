package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class svs extends admr implements DialogInterface.OnDismissListener {
    public final Runnable a;
    public final Runnable b;
    public final View c;
    public int d = 0;
    private final LayoutInflater e;
    private final vxe f;
    private final Map g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final LinearLayout l;
    private final TextView m;
    private final aeaa n;
    private final TextView o;
    private final aeaa p;
    private arqk q;

    public svs(Context context, vxe vxeVar, afip afipVar, aciz acizVar, Runnable runnable, Runnable runnable2, Map map) {
        this.f = vxeVar;
        this.a = runnable;
        this.b = runnable2;
        this.g = map;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.e = layoutInflaterFrom;
        View viewInflate = layoutInflaterFrom.inflate(true != acizVar.C() ? R.layout.upgrade_dialog : R.layout.upgrade_dialog_modern_type, (ViewGroup) null, false);
        this.c = viewInflate;
        this.h = (TextView) viewInflate.findViewById(R.id.title);
        this.i = (TextView) viewInflate.findViewById(R.id.offer_display_title);
        this.j = (TextView) viewInflate.findViewById(R.id.access_message);
        this.k = (TextView) viewInflate.findViewById(R.id.legal_text);
        this.l = (LinearLayout) viewInflate.findViewById(R.id.billing_details_container);
        TextView textView = (TextView) viewInflate.findViewById(R.id.continue_button);
        this.m = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.cancel_button);
        this.o = textView2;
        this.n = afipVar.d(textView);
        this.p = afipVar.d(textView2);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        alay alayVar;
        ajnf ajnfVar;
        arqk arqkVar = (arqk) obj;
        xgn xgnVar = adlyVar.b;
        this.q = arqkVar;
        arqj arqjVar = arqkVar.c;
        if (arqjVar == null) {
            arqjVar = arqj.a;
        }
        alay alayVar2 = arqjVar.b;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        this.h.setText(ackj.k(null, alayVar2, null, false));
        TextView textView = this.i;
        arqj arqjVar2 = arqkVar.c;
        if (arqjVar2 == null) {
            arqjVar2 = arqj.a;
        }
        alay alayVar3 = arqjVar2.c;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        tuk.u(textView, ackj.k(null, alayVar3, null, false));
        TextView textView2 = this.j;
        arqj arqjVar3 = arqkVar.c;
        if (arqjVar3 == null) {
            arqjVar3 = arqj.a;
        }
        alay alayVar4 = arqjVar3.d;
        if (alayVar4 == null) {
            alayVar4 = alay.a;
        }
        textView2.setText(ackj.k(null, alayVar4, null, false));
        TextView textView3 = this.k;
        if ((arqkVar.b & 2) != 0) {
            alayVar = arqkVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView3, ackj.k(null, alayVar, null, false));
        LinearLayout linearLayout = this.l;
        linearLayout.removeAllViews();
        for (arqi arqiVar : arqkVar.d) {
            View viewInflate = this.e.inflate(R.layout.billing_item, (ViewGroup) null, false);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.title);
            alay alayVar5 = arqiVar.b;
            if (alayVar5 == null) {
                alayVar5 = alay.a;
            }
            textView4.setText(ackj.k(null, alayVar5, null, false));
            TextView textView5 = (TextView) viewInflate.findViewById(R.id.subtitle);
            alay alayVar6 = arqiVar.c;
            if (alayVar6 == null) {
                alayVar6 = alay.a;
            }
            textView5.setText(ackj.k(null, alayVar6, null, false));
            TextView textView6 = (TextView) viewInflate.findViewById(R.id.description);
            alay alayVar7 = arqiVar.d;
            if (alayVar7 == null) {
                alayVar7 = alay.a;
            }
            textView6.setText(ackj.k(null, alayVar7, null, false));
            linearLayout.addView(viewInflate);
        }
        if ((arqkVar.b & 8) != 0) {
            aeaa aeaaVar = this.p;
            apji apjiVar = arqkVar.g;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
            aeaaVar.a((ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)), xgnVar, null);
            aeaaVar.c = new sug(this, 2);
        } else {
            this.o.setVisibility(8);
        }
        aeaa aeaaVar2 = this.n;
        apji apjiVar2 = arqkVar.f;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
        apjiVar2.c(aihlVarCheckIsLite2);
        if (apjiVar2.j.n(aihlVarCheckIsLite2.d)) {
            apji apjiVar3 = arqkVar.f;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
            apjiVar3.c(aihlVarCheckIsLite3);
            Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite3.d);
            ajnfVar = (ajnf) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
        } else {
            ajnfVar = null;
        }
        aeaaVar2.a(ajnfVar, xgnVar, this.g);
        aeaaVar2.c = new sug(this, 3);
        if (arqkVar.h.size() != 0) {
            this.f.d(arqkVar.h, null);
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arqk) obj).j.G();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.q.i.size() == 0 || this.d == 1) {
            return;
        }
        this.f.d(this.q.i, null);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
