package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xlv extends xlu {
    public String c = "";

    @Override // defpackage.xlu, defpackage.yeb
    public final void b(tgo tgoVar) {
        super.b(tgoVar);
        tgn tgnVar = tgoVar.d;
        if (tgnVar == null) {
            ((agrc) ((agrc) xly.a.b().i(agso.a, "MDX.browserchannel")).k("com/google/android/libraries/youtube/mdx/browserchannel/HttpClientBrowserChannelClient$BindChannelHttpResponseHandler", "handleResponse", 420, "HttpClientBrowserChannelClient.java")).t("Bind Channel: http response body is null");
            return;
        }
        try {
            this.c = tgnVar.d();
        } catch (IOException e) {
            this.b = e;
        }
    }
}
