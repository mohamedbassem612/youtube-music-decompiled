package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oeu implements oel, obi {
    public final Context a;
    public NetworkCapabilities b = null;
    public Network c = null;
    private final ExecutorService d;

    public oeu(Context context, ExecutorService executorService) {
        this.a = context;
        this.d = executorService;
    }

    @Override // defpackage.obi
    public final ListenableFuture a() {
        ahfo ahfoVar = new ahfo(Executors.callable(new mbo(this, 3), null));
        this.d.execute(ahfoVar);
        return ahfoVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033 A[Catch: all -> 0x0042, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:13:0x0019, B:15:0x0022, B:17:0x0026, B:19:0x002f, B:21:0x0033), top: B:33:0x000a }] */
    @Override // defpackage.oel
    public final void c(Map map) {
        NetworkCapabilities networkCapabilities;
        long j;
        synchronized (this) {
            networkCapabilities = this.b;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            NetworkCapabilities networkCapabilities2 = this.b;
            if (networkCapabilities2 != null) {
                if (networkCapabilities2.hasTransport(4)) {
                    j = 2;
                } else if (this.b.hasTransport(1)) {
                    j = 1;
                } else {
                    j = this.b.hasTransport(0) ? 0L : -1L;
                }
            }
        }
        map.put("nt", Long.valueOf(j));
    }

    @Override // defpackage.oel
    public final void b(Map map) {
    }

    @Override // defpackage.oel
    public final void d(Map map, Context context) {
    }
}
