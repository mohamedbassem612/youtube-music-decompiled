package defpackage;

import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ef {
    public static final Map a;
    public static final Set b;

    static {
        a = Build.VERSION.SDK_INT >= 36 ? new ConcurrentHashMap() : null;
        b = Build.VERSION.SDK_INT >= 36 ? new CopyOnWriteArraySet() : null;
    }
}
