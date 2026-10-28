package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gub extends gut {
    private final tbt a;

    public gub(tbt tbtVar) {
        tbtVar.getClass();
        this.a = tbtVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        boolean z = false;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ambl.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                z = true;
            }
        }
        ahno.F(z);
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ambl.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ambk ambkVar = (ambk) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if ((ambkVar.b & 1) != 0) {
            tbt tbtVar = this.a;
            String str = ambkVar.g;
            apji apjiVar = ambkVar.e;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            ambm ambmVarA = ambm.a(ambkVar.f);
            if (ambmVarA == null) {
                ambmVarA = ambm.SHELF_ITEM_INSERT_POSITION_UNSPECIFIED;
            }
            tbtVar.c(new hcl(str, apjiVar, ambmVarA, ambkVar.c == 3 ? (String) ambkVar.d : ""));
        }
    }
}
