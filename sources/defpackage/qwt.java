package defpackage;

import android.net.Uri;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qwt implements qwr {
    public static final rbm d = new rbm("qwt");
    public final Uri a;
    public final boolean b;
    public volatile qws c;

    public qwt(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final qok a() {
        return this.b ? qok.a : qok.b;
    }

    public final String toString() {
        return String.format(Locale.US, "ImageUriSource{uri: %s, isExternalUri: %b}", this.a, Boolean.valueOf(this.b));
    }
}
