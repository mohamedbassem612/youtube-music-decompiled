package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afuk {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ExecutorService c;
    public final ReferenceQueue b = new ReferenceQueue();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public afuk(ExecutorService executorService) {
        this.c = executorService;
    }
}
