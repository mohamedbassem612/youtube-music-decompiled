package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aaix implements aaiz {
    public abstract String a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaix) {
            return a().equals(((aaix) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(a());
    }
}
