package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahsd {
    public static final long a;
    public static final Pattern b;
    private static ahsd c;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 3600L;
        b = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    public static ahsd c() {
        ahsd ahsdVar = c;
        if (ahsdVar != null) {
            return ahsdVar;
        }
        ahsd ahsdVar2 = new ahsd();
        c = ahsdVar2;
        return ahsdVar2;
    }

    public final long a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return System.currentTimeMillis() / 1000;
    }

    public final boolean b(ahsg ahsgVar) {
        if (TextUtils.isEmpty(ahsgVar.b)) {
            return true;
        }
        return ahsgVar.e + ahsgVar.d < a() + a;
    }
}
