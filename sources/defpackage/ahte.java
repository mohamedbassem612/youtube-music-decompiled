package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahte implements Closeable {
    public final URL a;
    public volatile Future b;
    public lpa c;

    private ahte(URL url) {
        this.a = url;
    }

    public static ahte a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ahte(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: ".concat(String.valueOf(str)));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(true);
    }
}
