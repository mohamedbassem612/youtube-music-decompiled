package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;
import j$.lang.Iterable$EL;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxm extends gut {
    private final jki a;

    public gxm(jki jkiVar) {
        this.a = jkiVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        ixi ixiVar;
        aihl aihlVar = apxx.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        jki jkiVar = this.a;
        apxx apxxVar = (apxx) objC;
        if (Objects.equals(jkiVar.e(), "GeneratedThumbnailsSelectorFragment") && (jkiVar.b() instanceof hdj)) {
            hdj hdjVar = (hdj) jkiVar.b();
            int i = apxxVar.c;
            ytf ytfVar = hdjVar.L;
            if (ytfVar == null || (ixiVar = hdjVar.t) == null || hdjVar.o == null) {
                return;
            }
            agke agkeVarB = ixiVar.b();
            if (((Optional) ytfVar.d).isPresent()) {
                int iIntValue = ((Integer) ((Optional) ytfVar.d).get()).intValue();
                ?? r2 = ytfVar.e;
                if (iIntValue < r2.size()) {
                    r2.set(((Integer) ((Optional) ytfVar.d).get()).intValue(), agkeVarB);
                }
            }
            hdjVar.L.d = Optional.of(Integer.valueOf(i));
            ytf ytfVar2 = hdjVar.L;
            if (ytfVar2 != null) {
                Iterable$EL.forEach(ytfVar2.a, new hgi(1));
                ((View) hdjVar.L.a.get(i)).setForeground(hdjVar.getContext().getDrawable(R.drawable.generative_prompt_term_selected_background));
            }
            hdjVar.t.h(hdjVar.L.h(i));
            ixi ixiVar2 = hdjVar.t;
            ytf ytfVar3 = hdjVar.L;
            ixiVar2.d = i < ytfVar3.e.size() ? (ajsx) ytfVar3.c.get(i) : ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_SINGLE_SELECT_ALWAYS_SELECTED;
            hdjVar.o.setVisibility(0);
            hdjVar.s(hdjVar.l(hdjVar.s, i).d);
        }
    }
}
