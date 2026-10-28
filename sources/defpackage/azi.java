package defpackage;

import android.view.VelocityTracker;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class azi {
    public static final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static azj a(VelocityTracker velocityTracker) {
        return (azj) a.get(velocityTracker);
    }
}
