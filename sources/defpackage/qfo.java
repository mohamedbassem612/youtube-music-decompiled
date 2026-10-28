package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qfo {
    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
    }

    public qfo(Context context) throws Throwable {
        qel.a();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
