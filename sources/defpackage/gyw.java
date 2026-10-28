package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gyw extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/WebviewCommandResolver");
    private final Activity b;
    private final zwb c;
    private final acwd d;
    private final ScheduledExecutorService e;
    private final omj f;

    public gyw(Activity activity, omj omjVar, zwb zwbVar, acwd acwdVar, ScheduledExecutorService scheduledExecutorService) {
        this.b = activity;
        this.f = omjVar;
        this.c = zwbVar;
        this.d = acwdVar;
        this.e = scheduledExecutorService;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arkr.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        arkr arkrVar = (arkr) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        String str = arkrVar.c;
        if (TextUtils.isEmpty(str)) {
            ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/command/WebviewCommandResolver", "resolve", 65, "WebviewCommandResolver.java")).t("Empty URI in WebviewCommand");
            return;
        }
        if (!arkrVar.d) {
            d(str);
            return;
        }
        typ.f(str);
        try {
            Account accountM = this.f.M(this.c.e());
            if (accountM != null) {
                this.e.execute(new zvx(this.b, accountM, str, new glm(this, 9)));
            }
        } catch (RemoteException | kmj | kmk e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/apps/youtube/music/command/WebviewCommandResolver", "loadUrlFromAuthToken", ']', "WebviewCommandResolver.java")).t("Couldn't auth while opening Webview");
        }
    }

    public final void d(String str) {
        if (str != null) {
            acwd acwdVar = this.d;
            Activity activity = this.b;
            Uri uri = Uri.parse(str);
            if (acwdVar.b(activity, uri)) {
                return;
            }
            sxy.f(activity, uri);
        }
    }
}
