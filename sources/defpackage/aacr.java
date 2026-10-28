package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aacr {
    static final int a;
    public static final syj b;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 600;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        b = new syj(0, 600);
    }

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("identityId", str);
        return bundle;
    }
}
