package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import android.webkit.PermissionRequest;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehu implements aehi {
    private static final agkz a;
    private static final agkz b;
    private static final agkz c;
    private final Activity d;
    private final acwd e;
    private final vxe f;
    private final ajac g;
    private final agkz h;
    private final Runnable j;
    private Uri k;
    private boolean m;
    private final List i = new ArrayList();
    private boolean l = false;

    static {
        agqj agqjVar = new agqj("https://www.google.com");
        a = agqjVar;
        agqj agqjVar2 = new agqj("https://search-latest.corp.google.com/");
        b = agqjVar2;
        agkx agkxVar = new agkx();
        agkxVar.j(agqjVar);
        agkxVar.j(agqjVar2);
        agkxVar.g();
        c = agkz.u("tel", "mailto", "sms", "mms", "maps", "callto", new String[0]);
    }

    public aehu(arkm arkmVar, Activity activity, Runnable runnable, acwd acwdVar, vxz vxzVar, vxe vxeVar) {
        int iAV;
        boolean z = false;
        this.m = false;
        this.d = activity;
        this.j = runnable;
        this.e = acwdVar;
        this.f = vxeVar;
        ajac ajacVar = arkmVar.f == 62 ? (ajac) arkmVar.g : ajac.a;
        this.g = ajacVar;
        aiie aiieVar = vxzVar.g(45719301L).b;
        if (aiieVar.isEmpty()) {
            this.h = agkz.r("gclid", "wbraid", "gad_campaignid");
        } else {
            this.h = agkz.n(aiieVar);
        }
        int i = ajacVar.c;
        int iAV2 = a.aV(i);
        if ((iAV2 != 0 && iAV2 == 3) || ((iAV = a.aV(i)) != 0 && iAV == 4)) {
            z = true;
        }
        this.m = z;
    }

    private final void v(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        try {
            this.d.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // defpackage.aehi
    public final agkz b() {
        return a;
    }

    @Override // defpackage.aehi
    public final void d() {
        if (this.g.e) {
            this.j.run();
        }
    }

    @Override // defpackage.aehi
    public final void h(String str) {
        if (str == null || this.l) {
            return;
        }
        if (this.k == null) {
            this.k = Uri.parse(str);
        }
        if (!this.g.d) {
            Uri uri = Uri.parse(str);
            agqr it = this.h.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    this.i.add(new Pair(str2, queryParameter));
                }
            }
        }
        this.l = true;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void i(PermissionRequest permissionRequest, agke agkeVar, agke agkeVar2) {
        permissionRequest.deny();
    }

    @Override // defpackage.aehi
    public final boolean n(WebView webView, WebResourceRequest webResourceRequest) {
        Uri uri;
        boolean z = false;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            Uri url = webResourceRequest.getUrl();
            String scheme = url.getScheme();
            if (scheme != null && c.contains(scheme.toLowerCase(Locale.US))) {
                if (webView != null) {
                    webView.stopLoading();
                }
                v(url);
            } else if (this.m && webResourceRequest.isForMainFrame() && (uri = this.k) != null) {
                String host = uri.getHost();
                String host2 = url.getHost();
                if (!((host == null || host2 == null) ? Objects.equals(host, host2) : host.equalsIgnoreCase(host2))) {
                    ajac ajacVar = this.g;
                    if ((ajacVar.b & 32) != 0) {
                        vxe vxeVar = this.f;
                        ajwo ajwoVar = ajacVar.f;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        vxeVar.a(ajwoVar);
                    }
                    if (!ajacVar.d) {
                        List<Pair> list = this.i;
                        if (!list.isEmpty()) {
                            Uri.Builder builderBuildUpon = url.buildUpon();
                            Set<String> queryParameterNames = url.getQueryParameterNames();
                            for (Pair pair : list) {
                                if (!queryParameterNames.contains(pair.first)) {
                                    builderBuildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
                                    z = true;
                                }
                            }
                            if (z) {
                                url = builderBuildUpon.build();
                            }
                        }
                    }
                    int iAV = a.aV(ajacVar.c);
                    if (iAV == 0 || iAV != 4) {
                        aeho.g(url, this.d);
                    } else {
                        this.e.a(this.d, url);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ long a(long j) {
        return j;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ ajwo c(ajwo ajwoVar) {
        return ajwoVar;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void g(String str) {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void t(aihf aihfVar) {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void j(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void k(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void u(ahub ahubVar, WebSettings webSettings) {
    }
}
