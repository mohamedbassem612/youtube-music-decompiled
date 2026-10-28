package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aatb implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ aatc a;

    public aatb(aatc aatcVar) {
        this.a = aatcVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (TextUtils.equals(str, "offline_policy_string") || TextUtils.equals(str, "offline_network_preference")) {
            this.a.j();
        }
    }
}
