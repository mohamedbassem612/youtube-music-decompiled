package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wbi {
    public abstract int a();

    public abstract Object b();

    public final Object c() {
        if (a() == 3) {
            return b();
        }
        throw new IllegalStateException("Retrieved changedValue on Result.unchanged");
    }

    public final boolean d() {
        return a() != 1;
    }

    public final boolean e() {
        return a() == 2;
    }
}
