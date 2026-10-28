package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oog implements qqn {
    public final oit a;
    private final Context b;
    private final onc c;
    private final AtomicLong d = new AtomicLong();
    private final AtomicLong e = new AtomicLong();

    public oog(Context context, onc oncVar, oit oitVar) {
        this.b = context;
        this.c = oncVar;
        this.a = oitVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    @Override // defpackage.qqn
    public final void a(long j) {
        ConnectivityManager connectivityManager;
        oiw oiwVar;
        try {
            connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
        } catch (SecurityException unused) {
            onb.c("%s: Couldn't retrieve ConnectivityManager.", "NetworkUsageMonitor");
            connectivityManager = null;
        }
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 17) {
                this.e.getAndAdd(j);
            }
            oiwVar = this.a.c;
            if (oiwVar == null) {
                oiwVar = oiw.a;
            }
            String str = oiwVar.c;
            this.d.get();
            this.e.get();
            int i = onb.a;
        }
        onb.c("%s: Fail to get network type ", "NetworkUsageMonitor");
        this.d.getAndAdd(j);
        oiwVar = this.a.c;
        if (oiwVar == null) {
            oiwVar = oiw.a;
        }
        String str2 = oiwVar.c;
        this.d.get();
        this.e.get();
        int i2 = onb.a;
    }

    @Override // defpackage.qqn
    public final void b() {
        try {
            afuu afuuVarD = afwt.d(204, "MDD Network Usage Flush", afux.a, false);
            try {
                onc oncVar = this.c;
                aihf builder = this.a.toBuilder();
                long andSet = this.e.getAndSet(0L);
                builder.copyOnWrite();
                oit oitVar = (oit) builder.instance;
                oitVar.b |= 16;
                oitVar.g = andSet;
                long andSet2 = this.d.getAndSet(0L);
                builder.copyOnWrite();
                oit oitVar2 = (oit) builder.instance;
                oitVar2.b |= 32;
                oitVar2.h = andSet2;
                ahno.at(oncVar.e((oit) builder.build()), new hfb(this, 20), MoreExecutors.directExecutor());
                afuuVarD.close();
            } catch (Throwable th) {
                try {
                    afuuVarD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            onb.g(e, "%s: Failed to flush counters", "NetworkUsageMonitor");
        }
    }
}
