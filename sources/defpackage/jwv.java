package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwv {
    public static final AtomicReference a = new AtomicReference();
    private static final AtomicReference b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static jwu a() {
        return (jwu) b.get();
    }
}
