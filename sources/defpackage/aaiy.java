package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aaiy implements aaiz {
    public abstract String a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaiy) {
            return a().equals(((aaiy) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(a());
    }
}
