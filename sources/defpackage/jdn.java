package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdn extends admr {
    private final Context a;
    private final admd b;
    private final View c;
    private final ImageView d;
    private final adia e;
    private final View f;
    private final TextView g;
    private final TextView h;

    public jdn(Context context, adhv adhvVar) {
        this.a = context;
        jdw jdwVar = new jdw(context);
        this.b = jdwVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_expandable_shelf_simple_header, (ViewGroup) null);
        this.c = viewInflate;
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.expandable_header_thumbnail);
        this.d = imageView;
        this.f = viewInflate.findViewById(R.id.background_overlay);
        this.g = (TextView) viewInflate.findViewById(R.id.expandable_header_title);
        this.h = (TextView) viewInflate.findViewById(R.id.expandable_header_subtitle);
        this.e = new adia(adhvVar, imageView, false);
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.b).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.e.a();
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        anoi anoiVar = (anoi) obj;
        apji apjiVar = anoiVar.b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arfw.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = anoiVar.b;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arfw.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            aqmh aqmhVar = ((arfv) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            ImageView imageView = this.d;
            imageView.setBackgroundColor(aqmhVar.d);
            int color = aqmhVar.d;
            if (color == 0) {
                color = this.a.getColor(R.color.shelf_default_background_color);
            }
            imageView.setBackgroundColor(color);
            this.e.f(aqmhVar, null);
        }
        View view = this.c;
        aiqe aiqeVar = anoiVar.g;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        kro.aa(view, aiqeVar);
        View view2 = this.f;
        anld anldVar = anoiVar.e;
        if (anldVar == null) {
            anldVar = anld.a;
        }
        ixt.i(adlyVar, view2, anldVar, false);
        TextView textView = this.g;
        alay alayVar = anoiVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        TextView textView2 = this.h;
        alay alayVar2 = anoiVar.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        tuk.u(textView2, ackj.k(null, alayVar2, null, false));
        this.b.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anoi) obj).f.G();
    }
}
