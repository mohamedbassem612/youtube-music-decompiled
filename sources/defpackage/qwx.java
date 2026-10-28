package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qwx {
    public final Context b;
    public final String c;
    public Uri d;
    public static final rbm e = new rbm("qwx");
    public static final Duration a = Duration.of(33333, ChronoUnit.MICROS);

    public qwx(qwx qwxVar) {
        this.d = qwxVar.d;
        this.b = qwxVar.b;
        this.c = qwxVar.c;
    }

    public final /* synthetic */ Object clone() {
        return new qwx(this);
    }

    public final String toString() {
        return String.format(Locale.US, "SkottieSource{uri: %s, assetName: %s}", this.d, this.c);
    }

    public qwx(Uri uri, Context context) {
        this.d = uri;
        this.b = context;
        this.c = "";
    }
}
