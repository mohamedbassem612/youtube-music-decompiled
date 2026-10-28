package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class ahcw extends ahcg {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ahcw.class, Set.class, "seenExceptionsField");
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ahcw.class, "remainingField");
    volatile int remainingField;
    volatile Set seenExceptionsField = null;

    public ahcw(int i) {
        this.remainingField = i;
    }

    public abstract void c(Set set);
}
