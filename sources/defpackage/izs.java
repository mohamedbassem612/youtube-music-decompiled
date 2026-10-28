package defpackage;

import android.app.Dialog;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class izs extends izn {
    private static final agrf p = agrf.h("com/google/android/apps/youtube/music/ui/menu/MusicMultiSelectMenuBottomSheetDialogFragment");
    public adly o = null;

    @Override // defpackage.izp
    protected final int k() {
        return R.layout.music_multi_select_menu_bottom_sheet_dialog_fragment;
    }

    @Override // defpackage.izp
    protected final adkz l() {
        admu admuVar = new admu();
        Object obj = ((izp) this).m;
        if (obj != null) {
            for (apji apjiVar : ((anrw) obj).d) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(anrx.b);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anrx.b);
                    apjiVar.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                    admuVar.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                } else {
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anro.a);
                    apjiVar.c(aihlVarCheckIsLite3);
                    if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anro.a);
                        apjiVar.c(aihlVarCheckIsLite4);
                        Object objK2 = apjiVar.j.k(aihlVarCheckIsLite4.d);
                        admuVar.add(objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    } else {
                        ((agrc) ((agrc) p.c().i(agso.a, "MultiSelectMenuFragment")).k("com/google/android/apps/youtube/music/ui/menu/MusicMultiSelectMenuBottomSheetDialogFragment", "createContentAdapter", 95, "MusicMultiSelectMenuBottomSheetDialogFragment.java")).t("Unrecognized renderer in menu.");
                    }
                }
            }
        }
        return admuVar;
    }

    @Override // defpackage.izp
    protected final adlz n() {
        return new gob(this, 13);
    }

    @Override // defpackage.izp
    protected final void o(Dialog dialog) {
        int i;
        Window window;
        View viewFindViewById = dialog.findViewById(R.id.container);
        Rect rect = new Rect();
        fx fxVar = (fx) getActivity();
        if (fxVar == null || (window = fxVar.getWindow()) == null) {
            i = 0;
        } else {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.top;
        }
        viewFindViewById.setPadding(0, i, 0, 0);
    }

    @Override // defpackage.izp
    protected final void p(admh admhVar, admo admoVar) {
        Object obj = ((izp) this).m;
        if (obj != null) {
            anrw anrwVar = (anrw) obj;
            if ((anrwVar.b & 1) != 0) {
                apji apjiVar = anrwVar.c;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(anrq.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    apji apjiVar2 = ((anrw) ((izp) this).m).c;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anrq.a);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                    ViewGroup viewGroup = (ViewGroup) this.l.findViewById(R.id.fixed_menu_title_container);
                    View viewS = kro.S((anrp) objC, admhVar, null, admoVar);
                    if (viewS != null) {
                        viewGroup.addView(viewS);
                    }
                }
            }
        }
    }
}
