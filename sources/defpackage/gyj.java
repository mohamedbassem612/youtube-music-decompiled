package defpackage;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyj extends gut {
    public final ttm a;
    public final vxe b;
    public final awkx c;
    public final jin d;
    private final Executor e;
    private final aaqf f;

    public gyj(aaqf aaqfVar, ttm ttmVar, vxe vxeVar, awkx awkxVar, jin jinVar, Executor executor) {
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
        wue wueVar = new wue(aaqfVar.b, aaqfVar.c.e());
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqes.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqes aqesVar = (aqes) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        String[] strArr = (String[]) ahno.ad((String[]) aqesVar.c.toArray(new String[0]), new String[0]);
        if (strArr.length != 0) {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str)) {
                wueVar.a.add(str);
            }
            if (!aqesVar.e.isEmpty()) {
                wueVar.c = aqesVar.e;
            }
            aihl aihlVar = appx.b;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite3);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                appw appwVar = (appw) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                if (!appwVar.c.isEmpty()) {
                    wueVar.p(appwVar.c);
                }
            }
            wueVar.b = aqesVar.d;
            wueVar.n(ajwoVar.c);
            taf.i(((wnh) aaqfVar.d).a(wueVar), this.e, new gwc(this, str, avprVarB, 3), new gst((gut) this, map, str, avprVarB, 6), null);
        }
    }
}
