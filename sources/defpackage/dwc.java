package defpackage;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dwc implements dwb {
    final WebViewProviderFactoryBoundaryInterface a;

    public dwc(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // defpackage.dwb
    public final ProfileStoreBoundaryInterface a() {
        return (ProfileStoreBoundaryInterface) axsn.a(ProfileStoreBoundaryInterface.class, this.a.getProfileStore());
    }

    @Override // defpackage.dwb
    public final StaticsBoundaryInterface b() {
        return (StaticsBoundaryInterface) axsn.a(StaticsBoundaryInterface.class, this.a.getStatics());
    }

    @Override // defpackage.dwb
    public final WebViewProviderBoundaryInterface c(WebView webView) {
        return (WebViewProviderBoundaryInterface) axsn.a(WebViewProviderBoundaryInterface.class, this.a.createWebView(webView));
    }

    @Override // defpackage.dwb
    public final WebkitToCompatConverterBoundaryInterface d() {
        return (WebkitToCompatConverterBoundaryInterface) axsn.a(WebkitToCompatConverterBoundaryInterface.class, this.a.getWebkitToCompatConverter());
    }

    @Override // defpackage.dwb
    public final String[] e() {
        return this.a.getSupportedFeatures();
    }
}
