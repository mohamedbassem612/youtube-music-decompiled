package defpackage;

import android.webkit.WebView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vsi {
    public final /* synthetic */ vsj a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ vsh c;

    public /* synthetic */ vsi(vsj vsjVar, WebView webView, vsh vshVar) {
        this.a = vsjVar;
        this.b = webView;
        this.c = vshVar;
    }

    public final void a() {
        this.b.post(new uqd(this.a, this.c, 10, null));
    }
}
