package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xoa implements yeb {
    private final /* synthetic */ int $cid;

    public xoa(int i) {
        this.$cid = i;
    }

    @Override // defpackage.yeb
    public final void a(IOException iOException) {
        if (this.$cid != 0) {
            ((agrc) ((agrc) ((agrc) xly.a.b().i(agso.a, "MDX.browserchannel")).j(iOException)).k("com/google/android/libraries/youtube/mdx/browserchannel/HttpClientBrowserChannelClient$1", "handleException", (char) 183, "HttpClientBrowserChannelClient.java")).t("Terminate request failed");
        } else {
            ((agrc) ((agrc) ((agrc) xoc.a.b().i(agso.a, "MDX.com.google.android.libraries.youtube.mdx.discovery.DialYouTubeTvLauncher")).j(iOException)).k("com/google/android/libraries/youtube/mdx/discovery/DialYouTubeTvLauncher$3", "handleException", (char) 318, "DialYouTubeTvLauncher.java")).t("Error stopping YouTubeTV.");
        }
    }

    @Override // defpackage.yeb
    public final void b(tgo tgoVar) {
        if (this.$cid == 0) {
            int i = tgoVar.a;
            if (i != 200) {
                ((agrc) ((agrc) xoc.a.b().i(agso.a, "MDX.com.google.android.libraries.youtube.mdx.discovery.DialYouTubeTvLauncher")).k("com/google/android/libraries/youtube/mdx/discovery/DialYouTubeTvLauncher$3", "handleResponse", 306, "DialYouTubeTvLauncher.java")).u("Error stopping YouTubeTV. Response status code is %d", i);
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                agrf agrfVar = xoc.a;
                agrx agrxVar = agso.a;
            }
        }
    }
}
