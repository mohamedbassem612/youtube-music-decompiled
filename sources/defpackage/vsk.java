package defpackage;

import android.webkit.WebView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vsk implements vsp {
    public static final agkj a = agkj.k("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA", "android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
    public final cf b;
    public final awmd c;

    public vsk(cf cfVar, awmd awmdVar) {
        this.b = cfVar;
        this.c = awmdVar;
    }

    public final boolean a(dd ddVar) {
        return (ddVar == null || this.b.isFinishing() || ddVar.A || ddVar.ad()) ? false : true;
    }

    @Override // defpackage.vsp
    public final void b(WebView webView) {
        webView.setWebChromeClient(new vsj(this));
    }
}
