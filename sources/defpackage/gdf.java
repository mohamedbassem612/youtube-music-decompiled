package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gdf implements ThreadFactory {
    private final String a = "CsiReporter";
    private int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.b;
        this.b = i + 1;
        return new Thread(runnable, this.a + '-' + i);
    }
}
