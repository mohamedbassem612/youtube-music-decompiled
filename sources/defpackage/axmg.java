package defpackage;

import android.net.http.UrlRequest$StatusListener;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axmg implements UrlRequest$StatusListener {
    private final UrlRequest.StatusListener a;

    public axmg(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
