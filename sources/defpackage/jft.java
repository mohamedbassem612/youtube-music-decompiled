package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jft implements izc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ admr a;
    private final adly b;
    private final xgn c;
    private final aihn d;

    public jft(admr admrVar, adly adlyVar, aihn aihnVar, xgn xgnVar, int i) {
        this.$cid = i;
        this.a = admrVar;
        this.b = adlyVar;
        this.d = aihnVar;
        this.c = xgnVar;
    }

    @Override // defpackage.izc
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            aihn aihnVar = this.d;
            jfu jfuVar = (jfu) this.a;
            grj grjVar = jfuVar.c;
            anzi anziVar = (anzi) aihnVar;
            if (grjVar.e(anziVar)) {
                adly adlyVar = this.b;
                if (adlyVar.j("hideKeyboardOnClick")) {
                    tuk.i(jfuVar.b);
                }
                xgn xgnVar = this.c;
                ajwo ajwoVarF = xgnVar.f(grjVar.a(anziVar));
                HashMap map = new HashMap();
                map.put("com.google.android.libraries.youtube.logging.interaction_logger", xgnVar);
                map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aihnVar);
                map.putAll(adlyVar.e());
                jfuVar.a.c(ajwoVarF, map);
                return;
            }
            return;
        }
        aihn aihnVar2 = this.d;
        if (i == 1) {
            anlj anljVar = (anlj) aihnVar2;
            if ((anljVar.b & 64) != 0) {
                xgn xgnVar2 = this.c;
                ajwo ajwoVar = anljVar.j;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                ajwo ajwoVarF2 = xgnVar2.f(ajwoVar);
                HashMap map2 = new HashMap();
                map2.put("com.google.android.libraries.youtube.logging.interaction_logger", xgnVar2);
                map2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aihnVar2);
                map2.putAll(this.b.e());
                ((jcu) this.a).a.c(ajwoVarF2, map2);
                return;
            }
            return;
        }
        jfv jfvVar = (jfv) this.a;
        grj grjVar2 = jfvVar.e;
        anzi anziVar2 = (anzi) aihnVar2;
        if (grjVar2.e(anziVar2)) {
            adly adlyVar2 = this.b;
            if (adlyVar2.j("hideKeyboardOnClick")) {
                tuk.i(jfvVar.b);
            }
            xgn xgnVar3 = this.c;
            ajwo ajwoVarF3 = xgnVar3.f(grjVar2.a(anziVar2));
            HashMap map3 = new HashMap();
            map3.put("com.google.android.libraries.youtube.logging.interaction_logger", xgnVar3);
            map3.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aihnVar2);
            map3.putAll(adlyVar2.e());
            jfvVar.a.c(ajwoVarF3, map3);
        }
    }
}
