package defpackage;

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
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeht implements aehi {
    private final arkm a;
    private final xgn b;
    private final acwd c;
    private final boolean d;
    private final agkz e;
    private final List f = new ArrayList();
    private boolean g = false;

    public aeht(arkm arkmVar, xgn xgnVar, acwd acwdVar) {
        this.a = arkmVar;
        this.b = xgnVar;
        this.c = acwdVar;
        this.d = (arkmVar.f == 48 ? (ajab) arkmVar.g : ajab.a).b;
        agkz agkzVar = agpr.a;
        this.e = agkzVar.isEmpty() ? agkz.r("gclid", "wbraid", "gad_campaignid") : agkzVar;
    }

    private final void v(int i) {
        aedi.p(this.b, this.a, i, null);
    }

    private final void w(Integer num) {
        aedi.p(this.b, this.a, 12, num);
    }

    @Override // defpackage.aehi
    public final /* synthetic */ agkz b() {
        return agpr.a;
    }

    @Override // defpackage.aehi
    public final void f() {
        if (this.d) {
            v(10);
        }
    }

    @Override // defpackage.aehi
    public final void h(String str) {
        if (!this.d || str == null) {
            return;
        }
        v(15);
        if (this.g) {
            return;
        }
        agkz agkzVar = this.e;
        Uri uri = Uri.parse(str);
        agqr it = agkzVar.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String queryParameter = uri.getQueryParameter(str2);
            if (queryParameter != null) {
                this.f.add(new Pair(str2, queryParameter));
            }
        }
        this.g = true;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void i(PermissionRequest permissionRequest, agke agkeVar, agke agkeVar2) {
        permissionRequest.deny();
    }

    @Override // defpackage.aehi
    public final void j(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.d && webResourceRequest.isForMainFrame()) {
            w(Integer.valueOf(webResourceError.getErrorCode()));
        }
    }

    @Override // defpackage.aehi
    public final void k(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (this.d && webResourceRequest.isForMainFrame()) {
            w(Integer.valueOf(webResourceResponse.getStatusCode()));
        }
    }

    @Override // defpackage.aehi
    public final boolean n(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (!this.d || !webResourceRequest.isForMainFrame() || (url = webResourceRequest.getUrl()) == 0) {
            return false;
        }
        String scheme = url.getScheme();
        if (!Objects.equals(scheme, "http") && !Objects.equals(scheme, "https")) {
            return true;
        }
        Uri.Builder builderBuildUpon = url.buildUpon();
        Set<String> queryParameterNames = url.getQueryParameterNames();
        boolean z = false;
        for (Pair pair : this.f) {
            if (!queryParameterNames.contains(pair.first)) {
                builderBuildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
                z = true;
            }
        }
        Uri uriBuild = z ? builderBuildUpon.build() : url;
        if (url.equals(uriBuild)) {
            return false;
        }
        v(50);
        return this.c.a(webView.getContext(), uriBuild);
    }

    @Override // defpackage.aehi
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // defpackage.aehi
    public final void q() {
        if (this.d) {
            v(7);
        }
    }

    @Override // defpackage.aehi
    public final void r() {
        if (this.d) {
            v(5);
        }
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void e() {
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
    public final /* synthetic */ void u(ahub ahubVar, WebSettings webSettings) {
    }
}
