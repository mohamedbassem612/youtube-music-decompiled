package defpackage;

import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addr implements nwg {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/elements/converters/properties/commands/MultiFeedbackTokenCommandHandler");
    public final ttm b;
    private final aapw c;

    public addr(aapw aapwVar, ttm ttmVar) {
        aapwVar.getClass();
        this.c = aapwVar;
        this.b = ttmVar;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return anje.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return a.r();
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb c(Object obj, nwf nwfVar) {
        aapw aapwVar = this.c;
        anje anjeVar = (anje) obj;
        wpw wpwVarG = aapwVar.g();
        Iterator it = anjeVar.c.iterator();
        while (it.hasNext()) {
            wpwVarG.e((String) it.next());
        }
        wpwVarG.a = Boolean.valueOf(anjeVar.c.size() > 1);
        wpwVarG.m();
        ntq ntqVar = nwfVar.d;
        if (ntqVar instanceof adau) {
            String strI = ((adau) ntqVar).a.i();
            if (!TextUtils.isEmpty(strI)) {
                wpwVarG.p(strI);
            }
        }
        return tzk.h(aapwVar.h(wpwVarG)).k(new acym(this, 4));
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb d(mew mewVar, nwf nwfVar) {
        return nrb.a(this, mewVar, nwfVar);
    }
}
