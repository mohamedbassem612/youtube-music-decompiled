package defpackage;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwg implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Object a = new Object();
    public SharedPreferences b = null;

    public jwg() {
        new JSONObject();
    }

    public static final void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                new JSONObject((String) kro.E(new cbq(sharedPreferences, 15)));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            a(sharedPreferences);
        }
    }
}
