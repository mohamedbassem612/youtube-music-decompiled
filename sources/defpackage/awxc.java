package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awxc {
    public static final boolean a;
    public static final StackTraceElement b;
    public static final StackTraceElement c;
    public static final StackTraceElement d;
    public static final StackTraceElement e;

    static {
        boolean z = axcn.a;
        boolean z2 = true;
        if (!axcn.a && awuv.b) {
            z2 = false;
        }
        a = z2;
        b = new StackTraceElement("kotlinx.coroutines.BuildersKt", "launch", null, -1);
        c = new StackTraceElement("kotlinx.coroutines.BuildersKt", "async", null, -1);
        d = new StackTraceElement("kotlinx.coroutines.guava.ListenableFutureKt", "future", null, -1);
        e = new StackTraceElement("kotlinx.coroutines.BuildersKt", "runBlocking", null, -1);
    }
}
