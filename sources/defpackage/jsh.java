package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jsh {
    private static volatile jsh a;
    private final Context b;

    private jsh(Context context) {
        this.b = context;
    }

    public static jsh a() {
        jsh jshVar = a;
        if (jshVar != null) {
            return jshVar;
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (a == null) {
            synchronized (jsh.class) {
                if (a == null) {
                    a = new jsh(context);
                }
            }
        }
    }

    public final jse c() {
        return new jsg(this.b);
    }
}
