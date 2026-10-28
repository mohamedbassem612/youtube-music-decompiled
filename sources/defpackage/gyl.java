package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyl extends gut {
    public final ttm a;
    public final vxe b;
    public final awkx c;
    public final jin d;
    private final Executor e;
    private final aaqf f;

    public gyl(aaqf aaqfVar, ttm ttmVar, vxe vxeVar, awkx awkxVar, jin jinVar, Executor executor) {
        aaqfVar.getClass();
        this.f = aaqfVar;
        ttmVar.getClass();
        this.a = ttmVar;
        vxeVar.getClass();
        this.b = vxeVar;
        awkxVar.getClass();
        this.c = awkxVar;
        this.d = jinVar;
        this.e = executor;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        addn addnVar = (addn) tym.U(map, "command_status_callback", addn.class);
        avpr avprVarB = (addnVar == null || addnVar.a()) ? null : addnVar.b();
        aaqf aaqfVar = this.f;
        wuf wufVar = new wuf(aaqfVar.b, aaqfVar.c.e());
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqyw.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        String str = (String) aguu.J((List) ahno.ad(((aqyw) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d, agpi.a), "");
        if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
            wufVar.a.add(str);
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqyw.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        String str2 = ((aqyw) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).f;
        if (!str2.isEmpty()) {
            wufVar.c = str2;
        }
        aihl aihlVar = appx.b;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            appw appwVar = (appw) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
            if (!appwVar.c.isEmpty()) {
                wufVar.p(appwVar.c);
            }
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aqyw.b);
        ajwoVar.c(aihlVarCheckIsLite5);
        Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
        if ((((aqyw) (objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4))).c & 1) != 0) {
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aqyw.b);
            ajwoVar.c(aihlVarCheckIsLite6);
            Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
            wufVar.b = ((aqyw) (objK5 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK5))).e;
        }
        wufVar.n(ajwoVar.c);
        taf.i(((wnh) aaqfVar.e).a(wufVar), this.e, new gwc(this, str, avprVarB, 4), new gst((gut) this, map, str, avprVarB, 7), null);
    }
}
