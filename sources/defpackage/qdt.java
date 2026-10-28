package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class qdt implements qds {
    public abstract Object a();

    public abstract String b();

    public final boolean equals(Object obj) {
        if (obj instanceof qdt) {
            return Objects.equals(a(), ((qdt) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return b();
    }
}
