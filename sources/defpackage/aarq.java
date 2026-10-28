package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aarq {
    public static final long a;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 3600000L;
    }

    public static aamg a(aamb aambVar) {
        return aamg.a(aambVar.b("running_media_status", aamg.ACTIVE.p));
    }

    public static aodp b(aamb aambVar) {
        return aodp.a(aambVar.b(gzj.OFFLINE_AUDIO_QUALITY, 0));
    }

    public static aofb c(aamb aambVar) {
        return aofb.a(aambVar.b("offline_mode_type", 0));
    }

    public static String d(aamb aambVar) {
        String strF = aambVar.f("playlist_id");
        return TextUtils.isEmpty(strF) ? aambVar.f("video_list_id") : strF;
    }

    public static String e(aamb aambVar) {
        return ahno.Z(aambVar.f("video_id"));
    }

    public static void f(aamb aambVar, long j) {
        long jD = aambVar.d("back_off_total_millis", 0L);
        long jD2 = aambVar.d("back_off_start_millis", -1L);
        if (jD2 >= 0) {
            aambVar.k("back_off_start_millis", -1L);
            aambVar.k("back_off_total_millis", jD + (j - jD2));
        }
    }

    public static void g(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(tym.x("offline_active_transfers_%s", str), z).apply();
    }

    public static void h(aamb aambVar, aodp aodpVar) {
        aambVar.j(gzj.OFFLINE_AUDIO_QUALITY, aodpVar.e);
    }

    public static void i(aamb aambVar, aofb aofbVar) {
        aambVar.j("offline_mode_type", aofbVar.i);
    }

    public static boolean j(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(tym.x("offline_active_transfers_%s", str), true);
    }

    public static boolean k(int i) {
        return i == 1 || i == 4 || i == 7 || i == 6;
    }

    public static boolean l(aamw aamwVar) {
        return k(aamwVar.f.b("transfer_type", 0));
    }
}
