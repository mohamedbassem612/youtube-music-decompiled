package defpackage;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface dwb {
    ProfileStoreBoundaryInterface a();

    StaticsBoundaryInterface b();

    WebViewProviderBoundaryInterface c(WebView webView);

    WebkitToCompatConverterBoundaryInterface d();

    String[] e();
}
