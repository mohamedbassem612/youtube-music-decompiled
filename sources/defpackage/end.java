package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class end implements ehp {
    private static final Set a = new HashSet();

    @Override // defpackage.ehp
    public final void a(String str, Throwable th) {
        Set set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }
}
