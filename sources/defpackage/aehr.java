package defpackage;

import android.net.Uri;
import android.util.Base64;
import android.webkit.PermissionRequest;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehr implements aehi {
    public final aunn a;
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final aunn e;
    public final arkm f;
    public final zwa g;
    public final xir h;
    public boolean i;
    public final vxz k;
    private final aunn l;
    private final vxe m;
    private final aunn n;
    private final xgn o;
    private awwd q;
    private final AtomicBoolean p = new AtomicBoolean(false);
    private final awmi r = new awmp(new acoo(this, 11));
    public final awmi j = new awmp(new acoo(this, 12));
    private final awmi s = new awmp(new acoo(this, 13));
    private final awmi t = new awmp(new acoo(this, 14));

    public aehr(aunn aunnVar, aunn aunnVar2, vxe vxeVar, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, vxz vxzVar, arkm arkmVar, zwa zwaVar, xgn xgnVar, xir xirVar) {
        this.l = aunnVar;
        this.a = aunnVar2;
        this.m = vxeVar;
        this.b = aunnVar3;
        this.c = aunnVar4;
        this.d = aunnVar5;
        this.e = aunnVar6;
        this.n = aunnVar7;
        this.k = vxzVar;
        this.f = arkmVar;
        this.g = zwaVar;
        this.o = xgnVar;
        this.h = xirVar;
    }

    private final void z() {
        if (this.i) {
            y(39);
            this.h.n("gw_arnnaf");
        } else {
            y(34);
            this.h.n("gw_aier");
        }
    }

    @Override // defpackage.aehi
    public final /* synthetic */ agkz b() {
        return agpr.a;
    }

    @Override // defpackage.aehi
    public final void e() {
        awwd awwdVar = this.q;
        if (awwdVar != null) {
            awwdVar.p(null);
        }
        this.q = null;
        this.p.set(false);
        this.i = false;
    }

    @Override // defpackage.aehi
    public final void g(String str) {
        try {
            arjt arjtVar = (arjt) aihn.parseFrom(arjt.a, Base64.decode(str, 2), ExtensionRegistryLite.getGeneratedRegistry());
            arjtVar.getClass();
            arkm arkmVar = this.f;
            ajwo ajwoVar = (ajwo) DesugarCollections.unmodifiableMap((arkmVar.f == 57 ? (aipv) arkmVar.g : aipv.a).b).get(arjtVar.d);
            if (ajwoVar != null) {
                this.m.a(ajwoVar);
            }
        } catch (aiik | IllegalArgumentException unused) {
        }
    }

    @Override // defpackage.aehi
    public final void h(String str) {
        str.getClass();
        aehd aehdVarX = x();
        if (aehdVarX != null) {
            aehdVarX.c();
        }
        if (this.i) {
            Uri uri = Uri.parse(str);
            uri.getClass();
            String queryParameter = uri.getQueryParameter("error_type");
            if (awrc.c(queryParameter, "6")) {
                y(38);
                this.h.n("gw_arnaf");
            } else if (awrc.c(uri.getHost(), ((Uri) this.t.a()).getHost()) && queryParameter == null) {
                y(41);
                this.h.n("gw_arnsu");
            } else {
                y(39);
                this.h.n("gw_arnnaf");
            }
            this.i = false;
        }
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void i(PermissionRequest permissionRequest, agke agkeVar, agke agkeVar2) {
        permissionRequest.deny();
    }

    @Override // defpackage.aehi
    public final void j(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webResourceRequest.getClass();
        webResourceError.getClass();
        if (webResourceRequest.isForMainFrame()) {
            aehd aehdVarX = x();
            if (aehdVarX != null) {
                aehdVarX.c();
            }
            z();
            this.i = false;
        }
    }

    @Override // defpackage.aehi
    public final void k(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        if (webResourceRequest.isForMainFrame()) {
            aehd aehdVarX = x();
            if (aehdVarX != null) {
                aehdVarX.c();
            }
            z();
            this.i = false;
        }
    }

    @Override // defpackage.aehi
    public final void l() {
        aehd aehdVarX = x();
        if (aehdVarX != null) {
            aehdVarX.c();
        }
        z();
        this.i = false;
    }

    @Override // defpackage.aehi
    public final boolean n(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        int iAV = a.aV(this.f.j);
        if (iAV == 0 || iAV != 4 || !webResourceRequest.isForMainFrame() || x() == null || !awrc.c(webResourceRequest.getUrl().getQueryParameter("error_type"), "6") || this.p.getAndSet(true)) {
            return false;
        }
        y(34);
        xir xirVar = this.h;
        xirVar.n("gw_aier");
        aehd aehdVarX = x();
        if (aehdVarX != null) {
            y(36);
            xirVar.n("gw_ars");
            Object objIo = this.l.io();
            objIo.getClass();
            this.q = awro.t((awut) objIo, null, 0, new aehq(this, aehdVarX, null), 3);
        }
        return true;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // defpackage.aehi
    public final void u(ahub ahubVar, WebSettings webSettings) {
        webSettings.getClass();
        if (this.g.h()) {
            return;
        }
        ahubVar.f("signed_in", "t");
    }

    public final Object v(awoq awoqVar) throws Throwable {
        Object objIo = this.a.io();
        objIo.getClass();
        Object objP = awro.p((awou) objIo, new hqx(this, (awoq) null, 12), awoqVar);
        return objP != awox.a ? awmy.a : objP;
    }

    public final String w() {
        return (String) this.s.a();
    }

    public final aehd x() {
        return (aehd) this.r.a();
    }

    public final void y(int i) {
        if (((vxz) this.n.io()).l(64, 45763769L, true)) {
            aeho.h(this.o, this.f, i, null);
        }
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void f() {
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
    public final /* synthetic */ void t(aihf aihfVar) {
    }
}
