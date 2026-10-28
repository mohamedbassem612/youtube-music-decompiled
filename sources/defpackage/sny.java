package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.time.Duration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sny {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/ads/ping/AdsPolicyPingSender");
    private static final Pattern b = Pattern.compile("^NO_MATCH_REGEX$");
    private final Pattern c;
    private final zxj d;
    private final zxj e;
    private final mbc f;
    private final ahey g;

    public sny(zxj zxjVar, zxj zxjVar2, mbc mbcVar, ahey aheyVar) {
        zxjVar.getClass();
        this.d = zxjVar;
        zxjVar2.getClass();
        this.e = zxjVar2;
        this.c = b;
        mbcVar.getClass();
        this.f = mbcVar;
        aheyVar.getClass();
        this.g = aheyVar;
    }

    public static /* synthetic */ void b(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/ads/ping/AdsPolicyPingSender", "scheduleAndSendPing", (char) 154, "AdsPolicyPingSender.java")).t("Failed to send smeared ad ping.");
    }

    public final void a(zxi zxiVar, tng tngVar, Duration duration) {
        if (!a.y(duration)) {
            c(zxiVar, tngVar);
            return;
        }
        ahcx ahcxVarC = afwl.c(new gmf(this, zxiVar, tngVar, 13, (char[]) null));
        long millis = duration.toMillis();
        ahey aheyVar = this.g;
        taf.h(ahng.p(ahcxVarC, millis, TimeUnit.MILLISECONDS, aheyVar), aheyVar, new iul(17));
    }

    public final void c(zxi zxiVar, tng tngVar) {
        Uri uriBuild;
        if (zxiVar.k.a(amum.VISITOR_ID)) {
            zxiVar.a(tok.HTTP_PING_ADS_POLICY_PING_SENDER);
            this.d.b(null, zxiVar, tngVar);
            return;
        }
        Uri uri = zxiVar.b;
        if (uri.getHost() != null && ((uri.getHost().endsWith(".doubleclick.net") || TextUtils.equals(uri.getHost(), "doubleclick.net")) && zxiVar.d)) {
            Uri uri2 = zxiVar.b;
            String strValueOf = String.valueOf(this.f.f().getEpochSecond());
            String encodedQuery = uri2.getEncodedQuery();
            if (encodedQuery == null || encodedQuery.length() == 0) {
                uriBuild = uri2.buildUpon().appendQueryParameter("ts", strValueOf).build();
            } else {
                uriBuild = uri2.buildUpon().encodedQuery(a.cl(encodedQuery, (byte) 38, "ts=" + Uri.encode(strValueOf, null))).build();
            }
            zxiVar.b(uriBuild);
        }
        zxiVar.a(tok.HTTP_PING_ADS_POLICY_PING_SENDER);
        this.e.b(null, zxiVar, tngVar);
    }

    public final zxi d(Uri uri, zwa zwaVar) {
        zxi zxiVar = this.c.matcher(uri.toString()).find() ? new zxi(1, "vastad") : new zxi(1, "vastad");
        zxiVar.b(uri);
        zxiVar.g = zwaVar;
        return zxiVar;
    }
}
