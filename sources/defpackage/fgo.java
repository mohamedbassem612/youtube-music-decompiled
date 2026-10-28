package defpackage;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgo {
    public static final boolean a = fna.d;

    public static boolean a(Context context) {
        if (fna.e) {
            return false;
        }
        return (fna.d && (context == null || Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f)) ? false : true;
    }
}
