package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aemw implements adma {
    public final vxe a;
    private final View b;
    private final LinearLayout c;
    private final TextView d;
    private final TextView e;
    private final Context f;
    private final int g;

    public aemw(Context context, vxe vxeVar) {
        View viewInflate = View.inflate(context, R.layout.share_panel_title_v15, null);
        this.b = viewInflate;
        this.d = (TextView) viewInflate.findViewById(R.id.title);
        this.c = (LinearLayout) viewInflate.findViewById(R.id.share_panel_title_layout);
        this.e = (TextView) viewInflate.findViewById(R.id.add_contacts_button);
        this.a = vxeVar;
        this.f = context;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.share_panel_title_padding);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.e.setVisibility(8);
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        aqsq aqsqVar = (aqsq) obj;
        if ((aqsqVar.b & 1) != 0) {
            alayVar = aqsqVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        TextView textView = this.d;
        textView.setText(ackj.k(null, alayVar, null, false));
        TextView textView2 = this.e;
        if ((aqsqVar.b & 2) != 0) {
            alayVar2 = aqsqVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView2, vxl.a(null, alayVar2, this.a, false));
        textView2.setOnClickListener(new aems((Object) this, (aihn) aqsqVar, 2));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setHighlightColor(0);
        if ((aqsqVar.b & 16) != 0) {
            LinearLayout linearLayout = this.c;
            linearLayout.setOrientation(1);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -2;
            textView.setLayoutParams(layoutParams);
            aemy aemyVarB = new aemx(this.f).b();
            linearLayout.addView(aemyVarB.a);
            apji apjiVar = aqsqVar.e;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aqsv.a);
            apjiVar.c(aihlVarCheckIsLite);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
            aemyVarB.d((aqsr) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        }
        View view = this.b;
        int i = this.g;
        view.setPadding(i, i, i, i);
        aenh.m(view);
    }
}
