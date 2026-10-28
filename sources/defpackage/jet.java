package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jet extends admr {
    private final Context a;
    private final admh b;
    private final admd c;
    private final View d;
    private final LinearLayout e;
    private final LinearLayout f;

    public jet(Context context, jer jerVar) {
        this.a = context;
        this.b = jerVar.a;
        jdw jdwVar = new jdw(context);
        this.c = jdwVar;
        View viewInflate = View.inflate(context, R.layout.music_side_aligned_item, null);
        this.d = viewInflate;
        this.e = (LinearLayout) viewInflate.findViewById(R.id.start_items);
        this.f = (LinearLayout) viewInflate.findViewById(R.id.end_items);
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.c).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        kro.Z(((jdw) this.c).a, 0, 0);
        kro.X(this.e, admhVar);
        kro.X(this.f, admhVar);
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        admd admdVar = this.c;
        anwz anwzVar = (anwz) obj;
        adly adlyVarT = kro.T(((jdw) admdVar).a, adlyVar);
        boolean zJ = adlyVar.j("hideSideAlignedItemRenderer");
        View view = this.d;
        if (zJ) {
            view.setVisibility(4);
            view.setPadding(0, 1, 0, 0);
            return;
        }
        view.setVisibility(0);
        Context context = this.a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.item_medium_spacing);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.item_small_spacing);
        if (adlyVar.j("useChartsPadding")) {
            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.item_large_spacing);
            view.setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, dimensionPixelSize);
        } else if (adlyVar.j("useLibraryPadding") || adlyVar.j("useArtistDiscographyPadding")) {
            int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.item_large_spacing);
            view.setPadding(dimensionPixelSize4, 0, dimensionPixelSize4, 0);
        } else {
            view.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        }
        for (apji apjiVar : anwzVar.c) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anxa.b);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anxa.b);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                kro.P((anxa) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)), this.e, this.b, adlyVarT);
            } else {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aqay.a);
                apjiVar.c(aihlVarCheckIsLite3);
                if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aqay.a);
                    apjiVar.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar.j.k(aihlVarCheckIsLite4.d);
                    kro.P((aqaw) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2)), this.e, this.b, adlyVarT);
                } else {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(anxo.a);
                    apjiVar.c(aihlVarCheckIsLite5);
                    if (apjiVar.j.n(aihlVarCheckIsLite5.d)) {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(anxo.a);
                        apjiVar.c(aihlVarCheckIsLite6);
                        Object objK3 = apjiVar.j.k(aihlVarCheckIsLite6.d);
                        kro.P((anxn) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3)), this.e, this.b, adlyVarT);
                    }
                }
            }
        }
        for (apji apjiVar2 : anwzVar.d) {
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(anxa.b);
            apjiVar2.c(aihlVarCheckIsLite7);
            if (apjiVar2.j.n(aihlVarCheckIsLite7.d)) {
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(anxa.b);
                apjiVar2.c(aihlVarCheckIsLite8);
                Object objK4 = apjiVar2.j.k(aihlVarCheckIsLite8.d);
                kro.P((anxa) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4)), this.f, this.b, adlyVarT);
            } else {
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aqay.a);
                apjiVar2.c(aihlVarCheckIsLite9);
                if (apjiVar2.j.n(aihlVarCheckIsLite9.d)) {
                    aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aqay.a);
                    apjiVar2.c(aihlVarCheckIsLite10);
                    Object objK5 = apjiVar2.j.k(aihlVarCheckIsLite10.d);
                    kro.P((aqaw) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5)), this.f, this.b, adlyVarT);
                } else {
                    aihl aihlVarCheckIsLite11 = aihn.checkIsLite(ajnp.b);
                    apjiVar2.c(aihlVarCheckIsLite11);
                    if (apjiVar2.j.n(aihlVarCheckIsLite11.d)) {
                        aihl aihlVarCheckIsLite12 = aihn.checkIsLite(ajnp.b);
                        apjiVar2.c(aihlVarCheckIsLite12);
                        Object objK6 = apjiVar2.j.k(aihlVarCheckIsLite12.d);
                        kro.Q(new heg((ajno) (objK6 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK6))), this.f, this.b, adlyVarT);
                        if (adlyVar.j("useLibraryPadding")) {
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), context.getResources().getDimensionPixelSize(R.dimen.item_extra_extra_small_spacing), view.getPaddingBottom());
                        }
                    }
                }
            }
        }
        admdVar.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anwz) obj).e.G();
    }
}
