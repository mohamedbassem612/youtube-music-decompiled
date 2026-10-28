package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aaiv implements aaiz {
    public abstract aamh a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaiv) {
            return a().a.equals(((aaiv) obj).a().a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(a().a);
    }
}
