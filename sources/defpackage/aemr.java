package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aemr implements adma {
    private final vxe a;
    private final xgn b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final View g;
    private final adzx h;
    private final Runnable i;

    public aemr(Context context, vxe vxeVar, ci ciVar, xgn xgnVar, aeki aekiVar, Runnable runnable) {
        this.b = xgnVar;
        this.i = runnable;
        this.a = vxeVar;
        View viewInflate = View.inflate(context, R.layout.community_post_section, null);
        this.c = viewInflate;
        aenh.m(viewInflate);
        this.d = (TextView) viewInflate.findViewById(R.id.title);
        this.e = (TextView) viewInflate.findViewById(R.id.subtitle);
        TextView textView = (TextView) viewInflate.findViewById(R.id.post_button);
        this.f = textView;
        View viewFindViewById = viewInflate.findViewById(R.id.tooltip_anchor);
        this.g = viewFindViewById;
        this.h = new adzx(vxeVar, ciVar, textView, null);
        tuk.k(textView, textView.getBackground(), 0);
        aqrx aqrxVar = aekiVar.a.f;
        if ((aqrxVar == null ? aqrx.a : aqrxVar).b == 102716411) {
            aekz aekzVar = aekiVar.b;
            aqrx aqrxVar2 = aekiVar.a.f;
            aqrxVar2 = aqrxVar2 == null ? aqrx.a : aqrxVar2;
            aekzVar.n = aqrxVar2.b == 102716411 ? (alhq) aqrxVar2.c : alhq.a;
            aekzVar.o = viewFindViewById;
            aekzVar.c();
        }
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        View view = this.c;
        aqry aqryVar = (aqry) obj;
        view.setVisibility(0);
        ajng ajngVar = aqryVar.e;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        if ((ajngVar.b & 1) == 0) {
            view.setVisibility(8);
            return;
        }
        TextView textView = this.d;
        if ((aqryVar.b & 1) != 0) {
            alayVar = aqryVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        textView.setText(ackj.k(null, alayVar, null, false));
        TextView textView2 = this.e;
        if ((aqryVar.b & 2) != 0) {
            alayVar2 = aqryVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        textView2.setText(vxl.a(null, alayVar2, this.a, false));
        ajng ajngVar2 = aqryVar.e;
        if (ajngVar2 == null) {
            ajngVar2 = ajng.a;
        }
        ajnf ajnfVar = ajngVar2.c;
        if (ajnfVar == null) {
            ajnfVar = ajnf.a;
        }
        TextView textView3 = this.f;
        if ((ajnfVar.b & 64) != 0) {
            alayVar3 = ajnfVar.m;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        textView3.setText(ackj.k(null, alayVar3, null, false));
        afv afvVar = new afv(1);
        afvVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.i);
        this.h.a(ajnfVar, this.b, afvVar);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
