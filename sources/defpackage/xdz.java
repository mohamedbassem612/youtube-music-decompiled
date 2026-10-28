package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xdz implements zwg {
    private final SharedPreferences a;

    public xdz(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    static final String c(String str) {
        return "client_event_id_manager_client_count_identity_".concat(String.valueOf(str));
    }

    static final String d(String str) {
        return "client_event_id_manager_event_id_for_identity_".concat(String.valueOf(str));
    }

    private final synchronized long f(String str) {
        SharedPreferences sharedPreferences = this.a;
        String strC = c(str);
        long j = sharedPreferences.getLong(strC, -1L);
        if (j == -1) {
            return -1L;
        }
        sharedPreferences.edit().putLong(strC, j < 65535 ? 1 + j : 1L).apply();
        return j;
    }

    private final synchronized void g(zwa zwaVar) {
        if (zwaVar != null) {
            String strC = c(zwaVar.k());
            SharedPreferences sharedPreferences = this.a;
            if (sharedPreferences.contains(strC)) {
                sharedPreferences.edit().remove(strC).apply();
            }
            String strD = d(zwaVar.k());
            if (sharedPreferences.contains(strD)) {
                sharedPreferences.edit().remove(strD).apply();
            }
        }
    }

    private final synchronized void h(String str) {
        SharedPreferences sharedPreferences = this.a;
        String strC = c(str);
        if (!sharedPreferences.contains(strC)) {
            sharedPreferences.edit().putLong(strC, 1L).apply();
        }
    }

    @Override // defpackage.zwg
    public final void a(zwa zwaVar) {
        g(zwaVar);
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        h(str2);
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.edit().putString(d(str2), str).apply();
    }

    public final axmq e(String str) {
        String string = this.a.getString(d(str), "no_event_id_found");
        long jF = f(str);
        if (string.equals("no_event_id_found") || jF == -1) {
            return null;
        }
        return new axmq(string, jF);
    }
}
