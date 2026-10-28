package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcg implements acwm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public jcg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [gmr, java.lang.Object] */
    @Override // defpackage.acwm
    public final void b() {
        ajwo ajwoVar;
        int i = this.$cid;
        if (i != 0) {
            ?? r7 = this.a;
            if (i != 1) {
                ((upg) r7).n();
                return;
            } else {
                r7.a();
                return;
            }
        }
        jch jchVar = (jch) this.a;
        if (jchVar.d != null) {
            alhu alhuVar = (alhu) jchVar.c;
            int i2 = alhuVar.c;
            if (i2 == 7) {
                ajwoVar = i2 == 7 ? (ajwo) alhuVar.d : ajwo.a;
            } else {
                ajwoVar = null;
            }
            if (ajwoVar != null) {
                ioc iocVar = jchVar.d;
                Object obj = jchVar.c;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(akyq.a);
                ajwoVar.c(aihlVarCheckIsLite);
                if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    ((agrc) ((agrc) ioc.a.b()).k("com/google/android/apps/youtube/music/search/ui/SearchInputFragment", "onSuggestionDeleted", 1139, "SearchInputFragment.java")).t("Invalid feedback endpoint for deleting suggestion");
                } else if (!kro.M(iocVar)) {
                    wpw wpwVarG = iocVar.J.g();
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akyq.a);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    wpwVarG.e(((akyo) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b);
                    wpwVarG.n(ajwoVar.c);
                    admu admuVar = iocVar.w;
                    if (admuVar != null) {
                        admuVar.remove(obj);
                    }
                    taf.h(iocVar.J.h(wpwVarG), iocVar.b, new ihw(4));
                }
                HashMap map = new HashMap();
                map.put("com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag", jchVar.c);
                vxe vxeVar = jchVar.e;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akyq.a);
                ajwoVar.c(aihlVarCheckIsLite3);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                vxeVar.d(((akyo) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).c, map);
            }
        }
    }

    @Override // defpackage.acwm
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.acwm
    public final /* synthetic */ void c(boolean z) {
    }
}
