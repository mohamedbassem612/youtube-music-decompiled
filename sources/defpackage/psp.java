package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class psp {
    public static final bdx a = new pso();

    public static final bgx a(SharedPreferences sharedPreferences) {
        return new bgx(new ebk(sharedPreferences, 12), atqq.aS(new String[]{"last_successful_registration_request_hash_code", "last_successful_registration_environment_url", "last_successful_registration_time_ms", "is_registered_to_unified_fcm_registration", "last_successful_registration_account_type", "last_successful_registration_pseudonymous_cookie", "last_successful_fcm_registration_token", "last_used_registration_api", "internal_target_id", "fetch_only_id"}), new bgv(null, 0), new psn(null, 0), null, null);
    }
}
