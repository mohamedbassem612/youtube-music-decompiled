package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hko implements gfp {
    private final gey a;
    private final ivu b;
    private final zqs c;

    public hko(gey geyVar, ivu ivuVar, zqs zqsVar) {
        geyVar.getClass();
        ivuVar.getClass();
        this.a = geyVar;
        this.b = ivuVar;
        this.c = zqsVar;
    }

    @Override // defpackage.gfp
    public final /* synthetic */ void d(ajwo ajwoVar) {
        fhz.ap(this, ajwoVar);
    }

    @Override // defpackage.gfp
    public final void e(ajwo ajwoVar, Map map, gnl gnlVar) {
        ajwoVar.getClass();
        gnlVar.getClass();
    }

    @Override // defpackage.gfp
    public final void f(ajwo ajwoVar, Map map) {
        ajwoVar.getClass();
    }

    @Override // defpackage.gfp
    public final void g(ajwo ajwoVar) {
        ajwoVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    @Override // defpackage.gfp
    public final void j(ajwo ajwoVar, Map map) {
        Object obj;
        ajwoVar.getClass();
        this.b.d();
        if (map == null) {
            map = awnp.a;
        }
        String strAf = fhz.af(ajwoVar);
        strAf.getClass();
        int length = strAf.length();
        zqs zqsVar = this.c;
        if (length == 0) {
            zqsVar.m(new irv(ajwoVar, map));
        } else {
            hel helVar = new hel(ajwoVar);
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apni.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apng apngVar = (apng) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                aihl aihlVar = apnd.b;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                apngVar.c(aihlVarCheckIsLite3);
                if (apngVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apni.a);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                    apng apngVar2 = (apng) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
                    apngVar2.c(aihlVarCheckIsLite5);
                    Object objK3 = apngVar2.j.k(aihlVarCheckIsLite5.d);
                    helVar.a = ((alxu) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).toByteArray();
                } else if (map.containsKey("searchbox_stats_bytes")) {
                    obj = map.get("searchbox_stats_bytes");
                    if (obj instanceof byte[]) {
                        helVar.a = (byte[]) obj;
                    }
                }
            } else if (map.containsKey("searchbox_stats_bytes")) {
                obj = map.get("searchbox_stats_bytes");
                if (obj instanceof byte[]) {
                    helVar.a = (byte[]) obj;
                }
            }
            helVar.m = map;
            zqsVar.m(new iry(helVar));
        }
        this.a.j(false);
    }

    @Override // defpackage.gfp
    public final void k(hel helVar) {
        this.b.d();
        this.c.m(new iry(helVar));
        this.a.j(false);
    }

    @Override // defpackage.gfp
    public final void l(String str, Map map) {
        str.getClass();
    }

    @Override // defpackage.gfp
    public final void m(ajwo ajwoVar) {
        ajwoVar.getClass();
    }

    @Override // defpackage.gfp
    public final void n(ajwo ajwoVar) {
        ajwoVar.getClass();
    }

    @Override // defpackage.gfp
    public final void o(byte[] bArr, String str, int i) {
        str.getClass();
        this.b.d();
        this.c.m(new isd(bArr, str, i));
        this.a.j(false);
    }

    @Override // defpackage.gfp
    public final void c() {
    }

    @Override // defpackage.gfp
    public final void p(ins insVar) {
    }

    @Override // defpackage.gfp
    public final void h(ajwo ajwoVar, affd affdVar) {
    }
}
