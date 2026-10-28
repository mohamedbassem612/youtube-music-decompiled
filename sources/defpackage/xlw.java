package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xlw extends xlu {
    private final xln c;

    public xlw(xln xlnVar) {
        this.c = xlnVar;
    }

    @Override // defpackage.xlu, defpackage.yeb
    public final void b(tgo tgoVar) {
        super.b(tgoVar);
        tgn tgnVar = tgoVar.d;
        if (tgnVar == null) {
            ((agrc) ((agrc) xly.a.b().i(agso.a, "MDX.browserchannel")).k("com/google/android/libraries/youtube/mdx/browserchannel/HttpClientBrowserChannelClient$HangingGetHttpResponseHandler", "handleResponse", 450, "HttpClientBrowserChannelClient.java")).t("Hanging gets response body is null");
            return;
        }
        try {
            InputStream inputStreamC = tgnVar.c();
            byte[] bArr = new byte[SemanticState.Modal];
            while (true) {
                int i = inputStreamC.read(bArr);
                if (i <= 0) {
                    agrf agrfVar = xly.a;
                    agrx agrxVar = agso.a;
                    return;
                }
                this.c.b(new String(bArr, 0, i, StandardCharsets.UTF_8).toCharArray());
            }
        } catch (IOException e) {
            this.b = e;
        }
    }
}
