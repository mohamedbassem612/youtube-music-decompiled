package defpackage;

import android.util.SparseArray;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afjo {
    public static final SettableFuture a;
    public final AtomicLong b = new AtomicLong(0);
    public final Object c = new Object();
    public final ConcurrentHashMap d = new ConcurrentHashMap(10, 0.75f, 4);
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public final UUID g = UUID.randomUUID();

    static {
        SettableFuture settableFutureCreate = SettableFuture.create();
        a = settableFutureCreate;
        settableFutureCreate.set(new Object());
    }

    public static int a(long j) {
        return (int) (j & 4294967295L);
    }
}
