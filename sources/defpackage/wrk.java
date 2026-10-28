package defpackage;

import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrk implements vxc {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/innertube/services/notification/RecordNotificationInteractionsCommandResolver");
    public final awmd a;
    private final Executor c;
    private final wva d;

    public wrk(wva wvaVar, awmd awmdVar, Executor executor) {
        this.d = wvaVar;
        this.a = awmdVar;
        this.c = executor;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (objS == null) {
            ((agrc) ((agrc) b.c()).k("com/google/android/libraries/youtube/innertube/services/notification/RecordNotificationInteractionsCommandResolver", "resolve", 49, "RecordNotificationInteractionsCommandResolver.java")).t("recordNotificationServiceEndpointCommand did not have proper tag.");
        }
        wva wvaVar = this.d;
        wrl wrlVar = new wrl(wvaVar.b, wvaVar.e.e());
        aihl aihlVar = apdc.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        wrlVar.a = ((apdc) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c.G();
        wrlVar.n(ajwoVar.c);
        Object objS2 = tym.S(map, "ALL_IMAGES_LOADED");
        if (objS2 instanceof Boolean) {
            Boolean bool = (Boolean) objS2;
            bool.booleanValue();
            wrlVar.b = Optional.of(bool);
        }
        Executor executor = this.c;
        taf.i(((wnh) wvaVar.d).b(wrlVar, executor, null), executor, new tsq(12), new itt(this, objS, 17), null);
        awmd awmdVar = this.a;
        if (awmdVar != null) {
            vxe vxeVar = (vxe) awmdVar.io();
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            vxeVar.e(((apdc) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).d, objS);
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
