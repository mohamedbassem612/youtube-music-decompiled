package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehj {
    public final qe a;
    public ValueCallback b;
    private final String c = "WebViewFileChooserRequester";
    private rc d;

    public aehj(qe qeVar) {
        this.a = qeVar;
    }

    public final void a(Uri[] uriArr) {
        rc rcVar = this.d;
        if (rcVar != null) {
            rcVar.a();
        }
        this.d = null;
        ValueCallback valueCallback = this.b;
        if (valueCallback != null) {
            this.b = null;
            valueCallback.onReceiveValue(uriArr);
        }
    }

    public final void b(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        valueCallback.getClass();
        fileChooserParams.getClass();
        qe qeVar = this.a;
        if (qeVar.isFinishing() || qeVar.isDestroyed() || this.b != null) {
            valueCallback.onReceiveValue(null);
            return;
        }
        Intent intentCreateIntent = fileChooserParams.createIntent();
        if (intentCreateIntent == null) {
            valueCallback.onReceiveValue(null);
            return;
        }
        rc rcVarA = qeVar.getActivityResultRegistry().a(this.c, new rr(), new eon(this, 9));
        this.d = rcVarA;
        this.b = valueCallback;
        try {
            rcVarA.b(intentCreateIntent, null);
        } catch (ActivityNotFoundException unused) {
            a(null);
        }
    }
}
