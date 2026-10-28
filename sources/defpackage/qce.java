package defpackage;

import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class qce extends WebViewClient {
    final /* synthetic */ qcf a;

    public qce(qcf qcfVar) {
        this.a = qcfVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final boolean a(Uri uri) {
        int i;
        Uri uri2 = Uri.parse(this.a.c);
        if (!uri.getScheme().equals(uri2.getScheme()) || !uri.getHost().equals(uri2.getHost()) || !uri.getPath().equals(uri2.getPath())) {
            return false;
        }
        aai aaiVarA = qcg.a();
        for (String str : uri.getQueryParameterNames()) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1814207253) {
                if (iHashCode == -1407569357 && str.equals("EXIT_STATUS")) {
                    try {
                        String queryParameter = uri.getQueryParameter(str);
                        switch (queryParameter.hashCode()) {
                            case -1848781195:
                                if (!queryParameter.equals("PARENT_TOOLS_EXIT_STATUS_NOT_ONBOARDED")) {
                                    throw new IllegalArgumentException();
                                }
                                i = 2;
                                break;
                                break;
                            case -1791999388:
                                if (!queryParameter.equals("PARENT_TOOLS_EXIT_STATUS_REDIRECT_TO_CHILD_ONBOARDING")) {
                                    throw new IllegalArgumentException();
                                }
                                i = 4;
                                break;
                                break;
                            case -1715644859:
                                if (!queryParameter.equals("PARENT_TOOLS_EXIT_STATUS_UNKNOWN")) {
                                    throw new IllegalArgumentException();
                                }
                                i = 1;
                                break;
                                break;
                            case -889497983:
                                if (!queryParameter.equals("PARENT_TOOLS_EXIT_STATUS_ONBOARDED")) {
                                    throw new IllegalArgumentException();
                                }
                                i = 3;
                                break;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        aaiVarA.b(i);
                    } catch (IllegalArgumentException e) {
                        Log.e("ParentToolsFragment", "EXIT_STATUS parameter value was not a valid enum name!", e);
                        aaiVarA.b(1);
                    }
                }
            } else if (str.equals("PARENT_LINK_ID")) {
                aaiVarA.b = uri.getQueryParameter(str);
            }
        }
        this.a.f(aaiVarA.a(), 1);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        qcf qcfVar = this.a;
        if (qcfVar.e) {
            return;
        }
        qcfVar.d();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Log.e("ParentToolsFragment", String.format("Error reported from web, error code=%d, description=%s, url=%s", Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription(), webResourceRequest.getUrl()));
        if (!webResourceRequest.isForMainFrame() || webResourceError.getErrorCode() == -1) {
            return;
        }
        this.a.c("");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Log.e("ParentToolsFragment", String.format("HTTP error reported from web, status code=%d, url=%s", Integer.valueOf(webResourceResponse.getStatusCode()), webResourceRequest.getUrl()));
        qcf qcfVar = this.a;
        if (qcfVar.d) {
            String path = webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().getPath() : null;
            if (path != null && path.endsWith("/favicon.ico")) {
                return;
            }
        }
        qcfVar.c(String.valueOf(webResourceResponse.getStatusCode()));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Log.e("ParentToolsFragment", String.format("SSL error reported from web, url=%s", sslError.getUrl()));
        this.a.c("");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(Uri.parse(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Log.e("ParentToolsFragment", String.format("Error reported from web, error code=%d, description=%s, url=%s", Integer.valueOf(i), str, str2));
        if (i != -1) {
            this.a.c("");
        }
    }
}
