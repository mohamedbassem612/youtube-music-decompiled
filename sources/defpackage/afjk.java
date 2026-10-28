package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class afjk extends Service {
    private ListenableFuture a = ahng.n(null);
    private int b = -1;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = ((afjj) atqp.a(a.aJ(getApplicationContext()), afjj.class)).bh().d.entrySet().iterator();
        while (it.hasNext()) {
            printWriter.println((String) ((Map.Entry) it.next()).getValue());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        long j;
        int iA;
        if (this.a.isDone()) {
            return;
        }
        afjo afjoVarBh = ((afjj) atqp.a(a.aJ(getApplicationContext()), afjj.class)).bh();
        int i = this.b;
        AtomicLong atomicLong = afjoVarBh.b;
        int iA2 = afjo.a(atomicLong.get());
        if (i == iA2) {
            do {
                j = atomicLong.get();
                iA = afjo.a(j);
                if (iA != iA2) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, afjo.a(iA + 1)));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ListenableFuture listenableFutureN;
        int i3 = 2;
        if ((i & 2) == 0 && intent != null) {
            afjo afjoVarBh = ((afjj) atqp.a(a.aJ(getApplicationContext()), afjj.class)).bh();
            ahno.K(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            ahno.K(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            ahno.K(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            UUID uuid = afjoVarBh.g;
            if (uuid.getMostSignificantBits() == longExtra && uuid.getLeastSignificantBits() == longExtra2) {
                int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                synchronized (afjoVarBh.c) {
                    SparseArray sparseArray = afjoVarBh.e;
                    listenableFutureN = (SettableFuture) sparseArray.get(intExtra);
                    listenableFutureN.getClass();
                    if (listenableFutureN != afjo.a) {
                        afjoVarBh.f.put(intExtra, listenableFutureN);
                    }
                    sparseArray.remove(intExtra);
                }
            } else {
                intent.getIntExtra("EXTRA_PROCESS_PID", -1);
                Process.myPid();
                listenableFutureN = ahng.n(null);
            }
            this.a = listenableFutureN;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.addListener(new aesl(this, i2, i3), MoreExecutors.directExecutor());
        return 2;
    }
}
