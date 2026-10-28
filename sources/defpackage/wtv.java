package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wtv implements aheh {
    final /* synthetic */ ajwo a;
    final /* synthetic */ Map b;
    final /* synthetic */ wtw c;

    public wtv(wtw wtwVar, ajwo ajwoVar, Map map) {
        this.a = ajwoVar;
        this.b = map;
        this.c = wtwVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        ttm ttmVar = this.c.c;
        if (ttmVar != null) {
            ttmVar.e(th);
        }
        ((agrc) ((agrc) ((agrc) wtw.a.c()).j(th)).k("com/google/android/libraries/youtube/innertube/services/setting/SetSettingCommandResolver", "handleError", '_', "SetSettingCommandResolver.java")).t("Error requesting SetSetting");
    }

    @Override // defpackage.aheh
    public final void b(Object obj) {
        if (obj != null) {
            wtw wtwVar = this.c;
            ajwo ajwoVar = this.a;
            Map map = this.b;
            alyd alydVar = (alyd) obj;
            awmd awmdVar = wtwVar.b;
            if (awmdVar != null) {
                Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                vxe vxeVar = (vxe) awmdVar.io();
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apqf.b);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                vxeVar.e(((apqf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).g, objS);
                ((vxe) awmdVar.io()).e(alydVar.c, null);
            }
        }
    }
}
