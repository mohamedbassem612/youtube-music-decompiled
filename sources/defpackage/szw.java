package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class szw implements ThreadFactory {
    public final int a;
    public final String b;
    private final ThreadFactory c = Executors.defaultThreadFactory();

    public szw(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.c.newThread(new lph(this, runnable, 16));
    }
}
