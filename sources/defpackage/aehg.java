package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import j$.util.Objects;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aehg extends aega {
    public static final agrf e = agrf.h("com/google/android/libraries/youtube/rendering/ui/webview/WebViewControllerV2WebChromeClient");
    public boolean f;
    private final arkf g;
    private final Set h;
    private final arko i;
    private final Supplier j;
    private final Supplier k;
    private final Supplier l;
    private final Context m;
    private aehj n;
    private final vxz o;
    private final abte p;

    public aehg(wby wbyVar, String str, int i, acwd acwdVar, Context context, abte abteVar, vxz vxzVar, arkf arkfVar, Set set, Set set2, arko arkoVar, Supplier supplier, Supplier supplier2, Supplier supplier3) {
        super(wbyVar, str, i, acwdVar, context, set2);
        this.f = false;
        this.m = context;
        this.p = abteVar;
        this.o = vxzVar;
        this.g = arkfVar;
        this.h = set;
        this.i = arkoVar;
        this.j = supplier;
        this.k = supplier2;
        this.l = supplier3;
    }

    final void a() {
        aehj aehjVar = this.n;
        if (aehjVar != null) {
            aehjVar.a(null);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        aehi aehiVar = (aehi) this.k.get();
        if (aehiVar != null) {
            aehiVar.d();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Supplier supplier = this.k;
        boolean zF = aeho.f(str, this.h);
        aeho.m(this.p, 36, this.g, str, zF, true);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:79:0x007c A[SYNTHETIC] */
    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        int i;
        int i2;
        if (permissionRequest == null) {
            ((agrc) ((agrc) e.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/WebViewControllerV2WebChromeClient", "onPermissionRequest", 143, "WebViewControllerV2WebChromeClient.java")).t("onPermissionRequest: request is null");
            return;
        }
        if (permissionRequest.getOrigin() == null || permissionRequest.getResources() == null) {
            ((agrc) ((agrc) e.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/WebViewControllerV2WebChromeClient", "onPermissionRequest", 147, "WebViewControllerV2WebChromeClient.java")).t("onPermissionRequest: Origin or resources are null. Denying request.");
            permissionRequest.deny();
            return;
        }
        Uri origin = permissionRequest.getOrigin();
        permissionRequest.getResources();
        for (String str : permissionRequest.getResources()) {
            if (Objects.equals(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                i2 = 38;
            } else {
                if (Objects.equals(str, "android.webkit.resource.AUDIO_CAPTURE")) {
                    i2 = 57;
                } else {
                    i = 1;
                }
                if (i != 1) {
                    abte abteVar = this.p;
                    arkf arkfVar = this.g;
                    String string = origin.toString();
                    boolean zF = aeho.f(origin.toString(), this.h);
                    aeho.m(abteVar, i, arkfVar, string, zF, true);
                }
            }
            i = i2;
            if (i != 1) {
                abte abteVar2 = this.p;
                arkf arkfVar2 = this.g;
                String string2 = origin.toString();
                boolean zF2 = aeho.f(origin.toString(), this.h);
                aeho.m(abteVar2, i, arkfVar2, string2, zF2, true);
            }
        }
        List listAsList = Arrays.asList(permissionRequest.getResources());
        agkx agkxVar = new agkx();
        for (arkj arkjVar : this.i.e) {
            if (aeho.e(origin, arkjVar.d)) {
                for (arki arkiVar : new aihx(arkjVar.c, arkj.a)) {
                    Object obj = arkiVar == arki.WEB_VIEW_PERMISSION_AUDIO_CAPTURE ? "android.webkit.resource.AUDIO_CAPTURE" : arkiVar == arki.WEB_VIEW_PERMISSION_VIDEO_CAPTURE ? "android.webkit.resource.VIDEO_CAPTURE" : null;
                    if (obj != null && listAsList.contains(obj)) {
                        agkxVar.c(obj);
                    }
                }
            }
        }
        agkz agkzVarG = agkxVar.g();
        if (agkzVarG.isEmpty()) {
            ((agrc) ((agrc) e.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/WebViewControllerV2WebChromeClient", "onPermissionRequest", 161, "WebViewControllerV2WebChromeClient.java")).t("onPermissionRequest: No allowed resources for origin. Denying request.");
            permissionRequest.deny();
            return;
        }
        agkx agkxVar2 = new agkx();
        agqr it = agkzVarG.iterator();
        while (true) {
            String str2 = "android.permission.CAMERA";
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            if (Objects.equals(str3, "android.webkit.resource.AUDIO_CAPTURE")) {
                str2 = "android.permission.RECORD_AUDIO";
            } else if (!Objects.equals(str3, "android.webkit.resource.VIDEO_CAPTURE")) {
                str2 = null;
            }
            if (str2 != null && avg.c(this.m, str2) != 0) {
                agkxVar2.c(str2);
            }
        }
        agkz agkzVarG2 = agkxVar2.g();
        agkzVarG2.isEmpty();
        aehi aehiVar = (aehi) this.k.get();
        if (agkzVarG2.isEmpty()) {
            permissionRequest.grant((String[]) agkzVarG.toArray(new String[0]));
            return;
        }
        if (aehiVar != null) {
            aehiVar.i(new aehf(permissionRequest, agkzVarG), agke.n(agkzVarG), agke.n(agkzVarG2));
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(agkzVarG);
        if (agkzVarG2.contains("android.permission.CAMERA")) {
            linkedHashSet.remove("android.webkit.resource.VIDEO_CAPTURE");
        }
        if (agkzVarG2.contains("android.permission.RECORD_AUDIO")) {
            linkedHashSet.remove("android.webkit.resource.AUDIO_CAPTURE");
        }
        if (!linkedHashSet.isEmpty()) {
            permissionRequest.grant((String[]) linkedHashSet.toArray(new String[0]));
        } else {
            ((agrc) ((agrc) e.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/WebViewControllerV2WebChromeClient", "handlePermissionDecision", 280, "WebViewControllerV2WebChromeClient.java")).t("onPermissionRequest: No grantable resources. Denying.");
            permissionRequest.deny();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        if (webView != null) {
            if (this.f || i < 70 || !this.o.m(4, 45774356L)) {
                return;
            }
            String url = webView.getUrl();
            if (ahno.aa(url)) {
                return;
            }
            this.f = true;
            aeho.m(this.p, 22, this.g, url, aeho.f(url, this.h), ((Boolean) this.j.get()).booleanValue());
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Supplier supplier = this.l;
        String strZ = ahno.Z((String) supplier.get());
        boolean zF = aeho.f((String) supplier.get(), this.h);
        abte abteVar = this.p;
        arkf arkfVar = this.g;
        aeho.m(abteVar, 39, arkfVar, strZ, zF, true);
        if (arkfVar == arkf.WEB_VIEW_USE_CASE_IDENTITY_VERIFICATION) {
            aehj aehjVar = this.n;
            if (aehjVar == null) {
                Context context = this.m;
                context.getClass();
                Object objF = tym.M(context).f();
                qe qeVar = objF instanceof qe ? (qe) objF : null;
                aehjVar = qeVar == null ? null : new aehj(qeVar);
                if (aehjVar == null) {
                    ((agrc) ((agrc) e.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/WebViewControllerV2WebChromeClient", "getOrCreateFileChooserRequester", 321, "WebViewControllerV2WebChromeClient.java")).t("onShowFileChooser: context does not wrap a ComponentActivity; file chooser unavailable.");
                    aehjVar = null;
                } else {
                    this.n = aehjVar;
                }
            }
            if (aehjVar != null) {
                aehjVar.b(valueCallback, fileChooserParams);
                return true;
            }
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }
}
