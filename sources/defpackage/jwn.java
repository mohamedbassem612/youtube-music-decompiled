package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwn implements SharedPreferences.OnSharedPreferenceChangeListener {
    public Context g;
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    volatile boolean d = false;
    public SharedPreferences e = null;
    public Bundle f = new Bundle();
    public JSONObject h = new JSONObject();
    public boolean i = false;
    public boolean j = false;

    public final void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.h = new JSONObject((String) kro.E(new cbr(sharedPreferences, 14)));
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
