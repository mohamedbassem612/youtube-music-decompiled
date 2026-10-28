package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lde extends lfo {
    public final void a(lbd lbdVar, Map map, ldb ldbVar) {
        lde ldeVar;
        o();
        w();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) lcl.f.b(null)).encodedAuthority((String) lcl.g.b(null)).path("config/app/".concat(String.valueOf(lbdVar.B()))).appendQueryParameter("platform", "android");
        this.l.h.G();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", "192008").appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            ldeVar = this;
            try {
                aU().i(new ldd(ldeVar, lbdVar.w(), url, null, map, ldbVar));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                ldeVar.aT().c.c("Failed to parse config URL. Not fetching. appId", lcz.a(lbdVar.w()), string);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            ldeVar = this;
        }
    }

    public final boolean c() {
        w();
        ConnectivityManager connectivityManager = (ConnectivityManager) aS().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void d(String str, sdo sdoVar, liq liqVar, ldb ldbVar) {
        lde ldeVar;
        String str2;
        o();
        w();
        try {
            URL url = new URI((String) sdoVar.a).toURL();
            u();
            byte[] byteArray = liqVar.toByteArray();
            ldeVar = this;
            str2 = str;
            try {
                aU().i(new ldd(ldeVar, str2, url, byteArray, sdoVar.o(), ldbVar));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                ldeVar.aT().c.c("Failed to parse URL. Not uploading MeasurementBatch. appId", lcz.a(str2), sdoVar.a);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            ldeVar = this;
            str2 = str;
        }
    }

    @Override // defpackage.lfo
    protected final void b() {
    }
}
