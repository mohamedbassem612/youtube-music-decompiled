package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gte extends gut {
    public final awmd a;
    private final Context b;
    private final awmd c;
    private final abfv d;

    public gte(Context context, awmd awmdVar, awmd awmdVar2, abfv abfvVar) {
        this.b = context;
        this.a = awmdVar;
        this.c = awmdVar2;
        this.d = abfvVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return true;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        akdd akddVar;
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akdb.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akdb.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            akdc akdcVar = ((akdb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d;
            if (akdcVar == null) {
                akdcVar = akdc.a;
            }
            akddVar = akdcVar.c;
            if (akddVar == null) {
                akddVar = akdd.a;
            }
        } else {
            akddVar = null;
        }
        akdd akddVar2 = akddVar;
        akddVar2.getClass();
        acwl.i(this.b, akddVar2, (vxe) this.a.io(), (xgn) this.c.io(), null, true, true, new hqy(this, akddVar2.l, map, 1), tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), null, null, this.d, false);
    }
}
