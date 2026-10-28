package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import org.chromium.base.JniAndroid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axjd {
    public static SharedPreferences a;

    static {
        axjn axjnVarB = axjn.b();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(JniAndroid.a);
            axjnVarB.close();
            a = defaultSharedPreferences;
        } catch (Throwable th) {
            try {
                axjnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
