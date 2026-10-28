package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gtz extends gut {
    public final awmd a;
    private final Activity b;
    private final Handler c;

    public gtz(Activity activity, awmd awmdVar, Handler handler) {
        this.b = activity;
        this.a = awmdVar;
        this.c = handler;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        String strH;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajfb.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajfb.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ajfa ajfaVar = (ajfa) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if (ajfaVar.b.isEmpty()) {
            ComponentCallbacks2 componentCallbacks2 = this.b;
            strH = componentCallbacks2 instanceof wfw ? ((wfw) componentCallbacks2).h() : "";
        } else {
            strH = ajfaVar.b;
        }
        if (TextUtils.isEmpty(strH)) {
            agrx agrxVar = agso.a;
        } else {
            this.c.postDelayed(new fuc(this, strH, 6), 200L);
        }
    }
}
