package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aekv extends adsv implements aeks {
    public final Context a;
    public final aeky b;
    public final aduv c;
    public final vxe d;
    private final admu e;
    private final List f = new ArrayList();

    public aekv(aqss aqssVar, Context context, aeky aekyVar, aduv aduvVar, vxe vxeVar) {
        admu admuVar = new admu();
        this.e = admuVar;
        admuVar.e(new hde(12));
        admuVar.e(new hde(13));
        this.a = context;
        this.b = aekyVar;
        this.c = aduvVar;
        this.d = vxeVar;
        for (apji apjiVar : aqssVar.b) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                ajnf ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                this.f.add(ajnfVar);
                this.e.add(ajnfVar);
            }
        }
        aekyVar.b(true);
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.e;
    }

    @Override // defpackage.aeks
    public final void c(admh admhVar) {
        admhVar.d(ajnf.class, new rle(this, 13));
    }

    @Override // defpackage.aeks
    public final void b(List list) {
    }
}
