package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdi extends admr {
    private final View a;
    private final ViewGroup b;
    private final jer c;
    private final acxn d;

    public jdi(Context context, jer jerVar, acxn acxnVar) {
        this.c = jerVar;
        View viewInflate = View.inflate(context, R.layout.music_element_header_in_section_list, null);
        this.a = viewInflate;
        this.b = (ViewGroup) viewInflate.findViewById(R.id.elements_container);
        this.d = acxnVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        kro.X(this.b, admhVar);
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        anob anobVar = (anob) obj;
        apji apjiVar = anobVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = anobVar.c;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            acxm acxmVarA = this.d.a((akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            jer jerVar = this.c;
            ViewGroup viewGroup = this.b;
            View viewR = kro.R(acxmVarA, jerVar.a, viewGroup, adlyVar);
            if (viewR != null) {
                viewGroup.addView(viewR);
            }
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
