package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gsn extends gut {
    private final Context a;
    private final vxe b;
    private final abfv c;

    public gsn(Context context, vxe vxeVar, abfv abfvVar) {
        context.getClass();
        this.a = context;
        vxeVar.getClass();
        this.b = vxeVar;
        this.c = abfvVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aitc.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aitc.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aitd aitdVar = ((aitc) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
        if (aitdVar == null) {
            aitdVar = aitd.a;
        }
        if ((aitdVar.b & 1) != 0) {
            Context context = this.a;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aitc.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            aitd aitdVar2 = ((aitc) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).c;
            if (aitdVar2 == null) {
                aitdVar2 = aitd.a;
            }
            akxk akxkVar = aitdVar2.c;
            if (akxkVar == null) {
                akxkVar = akxk.a;
            }
            acwp.i(context, akxkVar, this.b, null, tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), this.c);
        }
    }
}
