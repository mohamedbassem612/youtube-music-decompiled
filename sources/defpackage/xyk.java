package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xyk {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/ExternalMessageControllerImpl");
    public final tft b;
    public final ahex c;
    public final zvl d;
    public final vxz e;
    private final ListenableFuture f;

    public xyk(tft tftVar, ListenableFuture listenableFuture, ahex ahexVar, vxz vxzVar, zvl zvlVar) {
        this.b = tftVar;
        this.f = listenableFuture;
        this.c = ahexVar;
        this.e = vxzVar;
        this.d = zvlVar;
    }

    public final void a(xvz xvzVar, String str) {
        if (xvzVar == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.ExternalMessage")).k("com/google/android/libraries/youtube/mdx/remote/ExternalMessageControllerImpl", "sendEvent", 107, "ExternalMessageControllerImpl.java")).t("Either the screenID/loungeToken or the event is null when trying to send a request.");
        } else {
            taf.g(this.f, new gst(this, xvzVar, str, 8));
        }
    }
}
