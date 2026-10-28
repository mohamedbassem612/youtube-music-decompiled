package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aegp implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aegp(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, zwa] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        if (this.$cid == 0) {
            String str = (String) obj;
            str.getClass();
            Object obj2 = this.b;
            Object obj3 = this.a;
            arkf arkfVar = arkf.WEB_VIEW_USE_CASE_GAMEPLAY_MINI_APP;
            if (obj2 == arkfVar || obj2 == arkf.WEB_VIEW_USE_CASE_MY_AD_CENTER) {
                ?? r5 = this.c;
                if (!r5.l().isEmpty()) {
                    aegs aegsVar = (aegs) obj3;
                    if (aegsVar.m != null) {
                        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
                        builderBuildUpon.appendQueryParameter("pageId", r5.l());
                        String string = builderBuildUpon.toString();
                        HashMap map = new HashMap();
                        if (!r5.l().isEmpty() && (obj2 == arkfVar || obj2 == arkf.WEB_VIEW_USE_CASE_MY_AD_CENTER)) {
                            map.put("X-Goog-PageId", r5.l());
                        }
                        aegsVar.m.loadUrl(string, map);
                        return;
                    }
                }
            }
            WebView webView = ((aegs) obj3).m;
            if (webView != null) {
                webView.loadUrl(str);
                return;
            }
            return;
        }
        affd affdVar = (affd) obj;
        adfn adfnVar = (adfn) this.a;
        Activity activity = adfnVar.b;
        dd supportFragmentManager = ((cf) activity).getSupportFragmentManager();
        Object obj4 = this.b;
        Object obj5 = this.c;
        if (activity.isDestroyed() || activity.isFinishing() || supportFragmentManager.A || supportFragmentManager.ad()) {
            return;
        }
        try {
            affdVar.getClass();
            adfi adfiVar = (adfi) ((aihf) obj4).build();
            adfj adfjVar = new adfj();
            auom.f(adfjVar);
            afpu.e(adfjVar, affdVar);
            afpl.b(adfjVar, adfiVar);
            adfjVar.iR(adfiVar.d);
            adfjVar.h(supportFragmentManager, "ElementsDialogFragment");
            mfw mfwVar = ((mfx) obj5).j;
            if (mfwVar != null) {
                adfjVar.peer().e = mfwVar;
            }
        } catch (IllegalStateException e) {
            zvl zvlVar = adfnVar.c;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
            zvjVarA.d("Error showing modern dialog");
            zvjVarA.f(e);
            zvlVar.a(zvjVarA.a());
        }
    }
}
