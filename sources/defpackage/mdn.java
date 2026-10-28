package defpackage;

import android.os.Process;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mdn implements mdm {
    private final Map b = new ConcurrentHashMap();
    private final mdh c;
    private final AtomicInteger d;
    private final AtomicInteger e;
    private volatile mdf f;

    public mdn(mdh mdhVar) {
        new ConcurrentHashMap();
        this.d = new AtomicInteger();
        this.e = new AtomicInteger();
        this.c = mdhVar;
        this.f = mdf.a;
    }

    @Override // defpackage.mdm
    public final void a() {
        this.e.getAndIncrement();
    }

    @Override // defpackage.mdm
    public final void b() {
        this.d.getAndIncrement();
    }

    @Override // defpackage.mdm
    public final void c(long j) {
        mdg mdgVar = (mdg) this.b.remove(Long.valueOf(j));
        if (mdgVar != null) {
            int i = mdgVar.a;
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                mdf mdfVarA = mde.a(new File(String.format(Locale.US, "/proc/self/task/%d/schedstat", Integer.valueOf(i))));
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (mdfVarA != mdf.a) {
                    mdf mdfVar = this.f;
                    this.f = new mdf(mdfVar.b + mdfVarA.b, mdfVar.c + mdfVarA.c, mdfVar.d + mdfVarA.d);
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
    }

    @Override // defpackage.mdm
    public final void d(long j) {
        Map map = this.b;
        Long lValueOf = Long.valueOf(j);
        if (map.containsKey(lValueOf)) {
            return;
        }
        map.put(lValueOf, new mdg(Process.myTid(), j, Thread.currentThread().getName(), this.c.a));
    }
}
