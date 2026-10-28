package defpackage;

import android.support.v7.widget.Toolbar;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.Arrays;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gpa implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gpa(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        isj isjVar;
        Object iskVar;
        switch (this.$cid) {
            case 0:
                return Integer.valueOf(((cc) this.a).getContext().getResources().getDimensionPixelSize(R.dimen.bottom_bar_overlay_offset));
            case 1:
                return Integer.valueOf(((cc) this.a).getContext().getResources().getDimensionPixelSize(R.dimen.bottom_bar_overlay_offset));
            case 2:
                Toolbar toolbar = ((gpl) this.a).B;
                if (toolbar == null) {
                    return null;
                }
                return toolbar.findViewById(R.id.history_menu_item);
            case 3:
                gpl gplVar = (gpl) this.a;
                return gplVar.s == null ? Optional.empty() : gplVar.U(gplVar.ao);
            case 4:
                apji apjiVar = ((anki) this.a).q;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                return (ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            case 5:
                apji apjiVar2 = ((anki) this.a).l;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (ajnf) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            case 6:
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anvp.a);
                aihi aihiVar = (aihi) this.a;
                aihiVar.c(aihlVarCheckIsLite3);
                Object objK3 = aihiVar.j.k(aihlVarCheckIsLite3.d);
                return (anvo) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3));
            case 7:
                return ijl.N(((ijl) this.a).D);
            case 8:
                Object obj = this.a;
                ipr iprVar = (ipr) obj;
                return taf.a(iprVar.a, afxd.f(iprVar.f.n(iprVar.d.e())), new iii(obj, 8));
            case 9:
                iuf iufVar = (iuf) this.a;
                ((hcb) iufVar.j.io()).c();
                isjVar = new isj(iufVar.b, iufVar.n.l(263, 45828915L, false));
                return isjVar;
            case 10:
                iuf iufVar2 = (iuf) this.a;
                ((hcb) iufVar2.j.io()).c();
                iskVar = new isk(iufVar2.b);
                return iskVar;
            case 11:
                iuf iufVar3 = (iuf) this.a;
                ((hcb) iufVar3.j.io()).c();
                isjVar = new isj(iufVar3.b, iufVar3.n.l(263, 45828915L, false));
                return isjVar;
            case 12:
                iuf iufVar4 = (iuf) this.a;
                iskVar = new isl(iufVar4.b, ((hcb) iufVar4.j.io()).c());
                return iskVar;
            case 13:
                iuf iufVar5 = (iuf) this.a;
                ((hcb) iufVar5.j.io()).c();
                iskVar = new isk(iufVar5.b);
                return iskVar;
            case 14:
                iuf iufVar6 = (iuf) this.a;
                ((hcb) iufVar6.j.io()).c();
                isjVar = new isj(iufVar6.b, iufVar6.n.l(263, 45828915L, false));
                return isjVar;
            case 15:
                iuf iufVar7 = (iuf) this.a;
                iskVar = new isl(iufVar7.b, ((hcb) iufVar7.j.io()).c());
                return iskVar;
            case 16:
                iuf iufVar8 = (iuf) this.a;
                ((hcb) iufVar8.j.io()).c();
                iskVar = new isk(iufVar8.b);
                return iskVar;
            case 17:
                iuf iufVar9 = (iuf) this.a;
                iskVar = new isl(iufVar9.b, ((hcb) iufVar9.j.io()).c());
                return iskVar;
            case 18:
                return ((icj) this.a).t;
            case 19:
                Object obj2 = this.a;
                agsn agsnVar = joz.a;
                return fhz.ad((wgi) obj2, "player-page-assistive-cast-btn");
            default:
                return Arrays.asList((smr) this.a);
        }
    }
}
