package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ydn {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/tvsignin/PermissionsControllerImpl");
    protected View c;
    protected WebView d;
    public final xgn e;
    public final ahex f;
    public final cc g;
    public final abvk h;
    public final vxe i;
    public final Context j;
    public xvz k;
    public xvg l;
    public final xyk o;
    public final ycp p;
    public final vxz r;
    public kyr s;
    private final zwb t;
    private final boolean u;
    private final ydm v;
    public boolean b = false;
    public int m = -1;
    int q = 1;
    public apzk n = null;

    public ydn(xyk xykVar, xgn xgnVar, cc ccVar, ahex ahexVar, zwb zwbVar, xla xlaVar, Context context, abvk abvkVar, ycp ycpVar, vxz vxzVar, vxe vxeVar) {
        CookieManager.getInstance().setAcceptCookie(true);
        this.o = xykVar;
        this.e = xgnVar;
        this.g = ccVar;
        this.f = ahexVar;
        this.t = zwbVar;
        this.u = xlaVar.aH();
        this.v = new ydm(this);
        this.h = abvkVar;
        this.p = ycpVar;
        this.j = context;
        this.r = vxzVar;
        this.i = vxeVar;
    }

    protected final void a(int i, String str, ajwo ajwoVar) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyExitType", i);
        if (str != null && !TextUtils.isEmpty(str)) {
            intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyError", str);
        }
        if (ajwoVar != null) {
            ahng.aF(intent, "com.google.android.libraries.youtube.mdx.tvsignin.keyResultCommand", ajwoVar);
        }
        xvg xvgVar = this.l;
        if (xvgVar != null) {
            intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyLoungeDeviceId", xvgVar.b);
        }
        intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.requestType", this.m);
        int i2 = this.q;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        intent.putExtra("com.google.android.library.youtube.mdx.tvsignin.signInProtocol", i3);
        cf activity = this.g.getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public final void b(String str, String str2, int i) {
        String string;
        View view;
        ViewStub viewStub;
        if (this.d == null && (view = this.g.getView()) != null && (viewStub = (ViewStub) view.findViewById(R.id.webview_stub)) != null) {
            WebView webView = (WebView) viewStub.inflate();
            this.d = webView;
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            this.d.addJavascriptInterface(this.v, "approvalJsInterface");
            this.d.addOnAttachStateChangeListener(new jh(this, 5));
            this.d.setWebViewClient(new ydl(this));
        }
        if (this.d != null) {
            agkh agkhVar = new agkh(4);
            if (this.u) {
                agkhVar.e("pageId", this.t.e().l());
                string = "https://accounts.google.com/o/oauth2/device/usercode?";
            } else {
                string = "https://accounts.google.com/o/oauth2/device/usercode?pageId=none";
            }
            apzk apzkVar = this.n;
            boolean z = apzkVar == null || apzkVar.g;
            if (i != 3) {
                agkhVar.e("X-Identity-Oauth2-Device-Usercode", str);
            } else {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                builderBuildUpon.appendQueryParameter("user_code", str);
                if (z && !TextUtils.isEmpty(str2)) {
                    builderBuildUpon.appendQueryParameter("login_hint", str2);
                }
                string = builderBuildUpon.build().toString();
            }
            this.d.loadUrl(string, agkhVar.d(true));
        }
    }
}
