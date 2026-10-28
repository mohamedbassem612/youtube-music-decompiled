package defpackage;

import android.os.StrictMode;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qow {
    public static final qox a;

    static {
        qox qovVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = ServiceLoader.load(qox.class, qox.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                qovVar = (qox) it.next();
                ahno.P(!it.hasNext(), "Expected at most one FlagsService");
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } else {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                qovVar = new qov();
            }
            a = qovVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
