package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adur extends WebView {
    public Account a;
    private final Activity b;
    private final Executor c;
    private String d;
    private zvx e;

    public adur(Activity activity, Executor executor) {
        super(activity);
        this.b = activity;
        this.c = executor;
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setJavaScriptEnabled(true);
        }
    }

    public final /* synthetic */ void a(String str) {
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        typ.f(str);
        this.d = str;
        if (this.a == null) {
            super.loadUrl(str);
            return;
        }
        typ.f(str);
        zvx zvxVar = new zvx(this.b, this.a, this.d, new twi() { // from class: aduq
            @Override // defpackage.twi
            public final void a(Object obj) {
                this.a.a((String) obj);
            }
        });
        this.e = zvxVar;
        this.c.execute(zvxVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zvx zvxVar = this.e;
        if (zvxVar == null || zvxVar.c) {
            return;
        }
        zvxVar.c = true;
    }
}
