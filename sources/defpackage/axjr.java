package defpackage;

import android.os.MessageQueue;
import android.os.SystemClock;
import internal.J.N;
import java.util.ArrayList;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axjr implements MessageQueue.IdleHandler {
    public static axjr a;
    private long b;

    public static void a() {
        PostTask.b(new aeia(13));
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        if (j != 0 && jElapsedRealtime - j <= 1000) {
            return true;
        }
        this.b = jElapsedRealtime;
        if (!TraceEvent.a || !N.MnfJQqTB()) {
            return true;
        }
        TraceEvent.a("instantAndroidViewHierarchy", null);
        ApplicationStatus.b();
        ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            TraceEvent.b(0L);
            return true;
        }
        long jHashCode = arrayList.hashCode();
        PostTask.a(0, new acgm(jHashCode, arrayList, 2));
        TraceEvent.b(jHashCode);
        return true;
    }
}
