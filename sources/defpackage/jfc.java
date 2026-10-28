package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfc extends admr {
    public final ViewGroup a;
    public final ViewGroup b;
    public final View c;
    private final admd d;
    private final admh e;
    private final ViewGroup f;
    private final ViewGroup g;
    private final ViewGroup h;
    private final View i;
    private final acxn j;

    public jfc(Context context, admh admhVar, acxn acxnVar) {
        this.e = admhVar;
        jdw jdwVar = new jdw(context);
        this.d = jdwVar;
        this.j = acxnVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_split_view, (ViewGroup) null);
        this.i = viewInflate;
        this.f = (ViewGroup) viewInflate.findViewById(R.id.header_container);
        this.a = (ViewGroup) viewInflate.findViewById(R.id.sub_header_container);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.featured_content_container);
        this.h = viewGroup;
        this.b = (ViewGroup) viewInflate.findViewById(R.id.main_content_container);
        this.c = viewInflate.findViewById(R.id.toolbar_divider);
        this.g = (ViewGroup) viewInflate.findViewById(R.id.overall_container);
        jdwVar.c(viewInflate);
        viewGroup.setClipToPadding(false);
        viewGroup.setPaddingRelative(0, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.mini_player_height));
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.d).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.i.setVisibility(8);
        this.a.removeAllViews();
        ViewGroup viewGroup = this.f;
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.h;
        viewGroup2.setVisibility(8);
        ViewGroup viewGroup3 = this.b;
        viewGroup3.removeAllViews();
        viewGroup3.setVisibility(8);
        kro.X(viewGroup, admhVar);
        kro.X(viewGroup2, admhVar);
        kro.X(viewGroup3, admhVar);
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        apji apjiVar;
        View view = this.i;
        anxp anxpVar = (anxp) obj;
        int iX = jnj.x(view.getContext());
        this.a.setPaddingRelative(iX, 0, iX, 0);
        this.g.setPaddingRelative(iX, 0, iX, 0);
        apji apjiVar2 = null;
        if ((anxpVar.b & 4) != 0) {
            apjiVar = anxpVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
        } else {
            apjiVar = null;
        }
        Optional optionalH = kro.H(apjiVar, ajtd.a);
        if (optionalH.isPresent()) {
            view.setVisibility(0);
            ViewGroup viewGroup = this.f;
            viewGroup.setVisibility(0);
            kro.Q((ajta) optionalH.get(), viewGroup, this.e, new adly(adlyVar));
        }
        if ((anxpVar.b & 8) != 0 && (apjiVar2 = anxpVar.e) == null) {
            apjiVar2 = apji.a;
        }
        Optional optionalH2 = kro.H(apjiVar2, anlk.a);
        if (optionalH2.isPresent()) {
            view.setVisibility(0);
            ViewGroup viewGroup2 = this.h;
            viewGroup2.setVisibility(0);
            kro.Q((anlj) optionalH2.get(), viewGroup2, this.e, adlyVar);
        } else if ((anxpVar.b & 8) != 0) {
            apji apjiVar3 = anxpVar.e;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar3.c(aihlVarCheckIsLite);
            if (apjiVar3.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar4 = anxpVar.e;
                if (apjiVar4 == null) {
                    apjiVar4 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar4.c(aihlVarCheckIsLite2);
                Object objK = apjiVar4.j.k(aihlVarCheckIsLite2.d);
                acxm acxmVarA = this.j.a((akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
                view.setVisibility(0);
                ViewGroup viewGroup3 = this.h;
                viewGroup3.setVisibility(0);
                kro.Q(acxmVarA, viewGroup3, this.e, adlyVar);
            }
        }
        this.d.e(adlyVar);
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anxp) obj).c.G();
    }
}
