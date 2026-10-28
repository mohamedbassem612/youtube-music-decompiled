package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aegc extends WebViewClient {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/ui/webview/GenericWebViewClient");
    private static final String b = "aegc";
    private final List c = new ArrayList();
    private final wby d;
    private final xir e;
    private final xgn f;
    private final arkm g;
    private final String h;
    private final String i;
    private final arkf j;
    private final arjz k;
    private final List l;
    private final ajwo m;
    private final ajwo n;
    private final Set o;
    private final Set p;
    private final acwd q;
    private final boolean r;
    private final aehi s;
    private final vxe t;
    private boolean u;
    private boolean v;
    private final AtomicReference w;
    private final int x;
    private final abte y;

    public aegc(wby wbyVar, xir xirVar, abte abteVar, xgn xgnVar, arkm arkmVar, Set set, Set set2, vxe vxeVar, acwd acwdVar, boolean z, aehi aehiVar) {
        String str;
        this.d = wbyVar;
        this.e = xirVar;
        this.y = abteVar;
        this.g = arkmVar;
        this.f = xgnVar;
        int i = arkmVar.d;
        if (i == 1) {
            str = agvp.f((agya) arkmVar.e).a;
        } else {
            str = i == 14 ? (String) arkmVar.e : "";
        }
        this.h = str;
        this.i = arkmVar.i;
        arkf arkfVarA = arkf.a(arkmVar.v);
        this.j = arkfVarA == null ? arkf.WEB_VIEW_USE_CASE_UNSPECIFIED : arkfVarA;
        int iBt = a.bt(arkmVar.k);
        this.x = iBt != 0 ? iBt : 1;
        arjz arjzVar = arkmVar.C;
        this.k = arjzVar == null ? arjz.a : arjzVar;
        this.l = arkmVar.L;
        ajwo ajwoVar = arkmVar.r;
        this.m = ajwoVar == null ? ajwo.a : ajwoVar;
        ajwo ajwoVar2 = arkmVar.q;
        this.n = ajwoVar2 == null ? ajwo.a : ajwoVar2;
        this.o = set;
        this.p = set2;
        this.t = vxeVar;
        this.q = acwdVar;
        this.r = z;
        this.s = aehiVar;
        this.u = false;
        this.v = false;
        AtomicReference atomicReference = new AtomicReference();
        this.w = atomicReference;
        atomicReference.set(Boolean.FALSE);
    }

    private final boolean b(Uri uri, Context context, boolean z) {
        arjz arjzVar;
        int iAU;
        String str;
        Boolean bool;
        String str2 = aehh.a;
        String scheme = uri.getScheme();
        if (scheme != null && (arjzVar = this.k) != null && !scheme.equals("https") && !scheme.equals("http") && (iAU = a.aU(arjzVar.b)) != 0 && iAU == 2) {
            abte abteVar = this.y;
            arkf arkfVar = this.j;
            aehm aehmVarA = aehh.a(uri, abteVar, arkfVar, arjzVar);
            if (aehmVarA == null) {
                return true;
            }
            if (arjzVar.c.isEmpty() || (str = aehmVarA.c) == null || !arjzVar.c.contains(str)) {
                bool = Boolean.FALSE;
            } else {
                String strValueOf = String.valueOf(String.valueOf(aehmVarA.a));
                zvp.a(zvn.a, zvm.z, "GenericWebView::" + aehh.a + " Intent is blocked: ".concat(strValueOf));
                aehh.c(str, abteVar, 19, arkfVar);
                bool = Boolean.TRUE;
            }
            if (bool.booleanValue()) {
                return true;
            }
            aehh.b(aehmVarA, context, abteVar, arkfVar);
            return true;
        }
        if (z) {
            Set set = this.p;
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                do {
                    if (!it.hasNext()) {
                        ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/GenericWebViewClient", "shouldOverrideUrlLoading", 205, "GenericWebViewClient.java")).t("Navigation blocked by origin allowlist");
                        return true;
                    }
                } while (!aeho.e(uri, (String) it.next()));
            }
        }
        String string = uri.toString();
        Iterator it2 = this.l.iterator();
        while (it2.hasNext()) {
            if (string.startsWith((String) it2.next())) {
                return aeho.g(uri, context);
            }
        }
        String strZ = ahno.Z(uri.getScheme());
        if (!strZ.equals("http") && !strZ.equals("https")) {
            return aeho.g(uri, context);
        }
        if (!this.v) {
            return false;
        }
        int i = this.x;
        if (i == 3) {
            return aeho.g(uri, context);
        }
        if (i == 4) {
            return this.q.a(context, uri);
        }
        return false;
    }

    private static final void c(String str) {
        zvp.a(zvn.a, zvm.z, "GenericWebView::" + b + str);
    }

    private final void d(int i, WebResourceResponse webResourceResponse) {
        aeho.i(this.f, this.g, i, webResourceResponse, this.r);
    }

    public final void a(aegb aegbVar) {
        this.c.add(aegbVar);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        boolean zCanGoBack = webView.canGoBack();
        boolean zCanGoForward = webView.canGoForward();
        agkz agkzVar = aeho.a;
        String str2 = this.i;
        if (str2.isEmpty()) {
            return;
        }
        wby wbyVar = this.d;
        arka arkaVarE = arkc.e(str2);
        Boolean boolValueOf = Boolean.valueOf(zCanGoBack);
        aihf aihfVar = arkaVarE.a;
        boolValueOf.getClass();
        aihfVar.copyOnWrite();
        arkd arkdVar = (arkd) aihfVar.instance;
        arkd arkdVar2 = arkd.a;
        arkdVar.b |= SemanticState.Focused;
        arkdVar.j = zCanGoBack;
        Boolean.valueOf(zCanGoForward).getClass();
        aihfVar.copyOnWrite();
        arkd arkdVar3 = (arkd) aihfVar.instance;
        arkdVar3.b |= SemanticState.Hidden;
        arkdVar3.k = zCanGoForward;
        byte[] bArrC = arkaVarE.an().c();
        aihf aihfVarCreateBuilder = akvd.a.createBuilder();
        aikh aikhVar = aikh.a;
        aikg aikgVar = new aikg();
        aikgVar.d(8, 9);
        affc affcVarA = aikgVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        akvd akvdVar = (akvd) aihfVarCreateBuilder.instance;
        affcVarA.getClass();
        akvdVar.d = affcVarA;
        akvdVar.b |= 2;
        akvd akvdVar2 = (akvd) aihfVarCreateBuilder.build();
        wer werVarE = wbyVar.e();
        werVarE.k(str2, akvdVar2, bArrC);
        werVarE.b();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        aeho.c(this.d, this.i, ahno.Z(webView.getTitle()));
        if (((Boolean) this.w.get()).booleanValue()) {
            this.e.n("gw_fv");
            d(15, null);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aegb) it.next()).a(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        boolean zF = aeho.f(str, this.o);
        boolean z = URLUtil.isHttpsUrl(str) && !this.u;
        String str2 = this.i;
        wby wbyVar = this.d;
        aeho.d(wbyVar, str2, str, true, z, !zF);
        aeho.c(wbyVar, str2, ahno.Z(webView.getTitle()));
        AtomicReference atomicReference = this.w;
        if (((Boolean) atomicReference.get()).booleanValue()) {
            this.e.n("gw_ld");
            atomicReference.set(Boolean.FALSE);
            this.v = true;
            aeho.m(this.y, 3, this.j, str, zF, true);
            d(7, null);
        } else if (this.v) {
            aeho.m(this.y, 5, this.j, str, zF, true);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aegb) it.next()).e();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.u = false;
        if (str.contains(this.h)) {
            this.e.n("gw_ls");
            d(5, null);
            this.w.set(Boolean.TRUE);
        } else {
            this.w.set(Boolean.FALSE);
        }
        aeho.d(this.d, this.i, str, false, URLUtil.isHttpsUrl(str) && !this.u, !aeho.f(str, this.o));
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aegb) it.next()).b(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i;
        if (webResourceRequest.isForMainFrame()) {
            ajwo ajwoVar = this.m;
            if (ajwoVar != null && aeho.a.contains(Integer.valueOf(webResourceError.getErrorCode()))) {
                this.t.a(ajwoVar);
            }
            String strZ = ahno.Z(webResourceRequest.getUrl().toString());
            boolean zF = aeho.f(strZ, this.o);
            int errorCode = webResourceError.getErrorCode();
            if (errorCode == -8) {
                i = 54;
            } else if (errorCode != -6) {
                i = errorCode != -2 ? 49 : 52;
            } else {
                i = 53;
            }
            aeho.m(this.y, i, this.j, strZ, zF, this.v);
            c(" WebView failed due to main frame error: " + webResourceError.getErrorCode());
        } else {
            c(" WebView failed due to non-main frame error: " + webResourceError.getErrorCode() + " from " + String.valueOf(webResourceRequest.getUrl()));
        }
        aehi aehiVar = this.s;
        if (aehiVar != null) {
            aehiVar.j(webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String strZ = ahno.Z(webResourceRequest.getUrl().toString());
        boolean zF = aeho.f(strZ, this.o);
        if (webResourceRequest.isForMainFrame()) {
            int statusCode = webResourceResponse.getStatusCode();
            if (statusCode >= 500 && statusCode < 600) {
                aeho.m(this.y, 13, this.j, strZ, zF, this.v);
                d(12, webResourceResponse);
                ajwo ajwoVar = this.n;
                if (ajwoVar != null) {
                    this.t.a(ajwoVar);
                }
            } else if (statusCode >= 400 && statusCode < 500) {
                aeho.m(this.y, 50, this.j, strZ, zF, this.v);
            }
            c(" WebView failed due to main frame HTTP error: " + webResourceResponse.getStatusCode());
        } else {
            c(" WebView failed due to non-main frame HTTP error: " + webResourceResponse.getStatusCode() + " from " + String.valueOf(webResourceRequest.getUrl()));
        }
        aehi aehiVar = this.s;
        if (aehiVar != null) {
            aehiVar.k(webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.u = true;
        agkz agkzVar = aeho.a;
        String str = this.i;
        if (!str.isEmpty()) {
            wby wbyVar = this.d;
            arka arkaVarE = arkc.e(str);
            arkaVarE.am(Boolean.FALSE);
            byte[] bArrC = arkaVarE.an().c();
            aihf aihfVarCreateBuilder = akvd.a.createBuilder();
            aikh aikhVar = aikh.a;
            aikg aikgVar = new aikg();
            aikgVar.d(10);
            affc affcVarA = aikgVar.a();
            aihfVarCreateBuilder.copyOnWrite();
            akvd akvdVar = (akvd) aihfVarCreateBuilder.instance;
            affcVarA.getClass();
            akvdVar.d = affcVarA;
            akvdVar.b |= 2;
            akvd akvdVar2 = (akvd) aihfVarCreateBuilder.build();
            wer werVarE = wbyVar.e();
            werVarE.k(str, akvdVar2, bArrC);
            werVarE.b();
        }
        String strZ = ahno.Z(webView.getUrl());
        Set set = this.o;
        abte abteVar = this.y;
        arkf arkfVar = this.j;
        boolean zF = aeho.f(strZ, set);
        boolean z = this.v;
        aehi aehiVar = this.s;
        aeho.m(abteVar, 48, arkfVar, strZ, zF, z);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aegb) it.next()).c();
        }
        if (aehiVar != null) {
            aehiVar.l();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String strZ = ahno.Z(webView.getUrl());
        boolean zF = aeho.f(strZ, this.o);
        boolean zDidCrash = renderProcessGoneDetail.didCrash();
        abte abteVar = this.y;
        if (zDidCrash) {
            aeho.m(abteVar, 6, this.j, strZ, zF, this.v);
            c(" WebView crashed due to internal error.");
        } else {
            aeho.m(abteVar, 11, this.j, strZ, zF, this.v);
            c(" WebView crashed due to out of memory on URL: ".concat(String.valueOf(webView.getUrl())));
        }
        ajwo ajwoVar = this.n;
        if (ajwoVar != null) {
            this.t.a(ajwoVar);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aegb) it.next()).d();
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        aehi aehiVar = this.s;
        if (aehiVar == null || !aehiVar.n(webView, webResourceRequest)) {
            return b(webResourceRequest.getUrl(), webView.getContext(), webResourceRequest.isForMainFrame());
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return b(Uri.parse(str), webView.getContext(), true);
    }
}
