package defpackage;

import android.webkit.PermissionRequest;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehv implements aehi {
    private final vxe a;
    private final akwg b;

    public aehv(arkm arkmVar, vxe vxeVar) {
        this.a = vxeVar;
        int i = arkmVar.f;
        if (i != 54) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        akwg akwgVar = i == 54 ? (akwg) arkmVar.g : akwg.a;
        akwgVar.getClass();
        this.b = akwgVar;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ agkz b() {
        return agpr.a;
    }

    @Override // defpackage.aehi
    public final void g(String str) {
        ajwo ajwoVar = this.b.b;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        this.a.a(ajwoVar);
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void i(PermissionRequest permissionRequest, agke agkeVar, agke agkeVar2) {
        permissionRequest.deny();
    }

    @Override // defpackage.aehi
    public final /* synthetic */ boolean n(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void d() {
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
    public final /* synthetic */ void h(String str) {
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
