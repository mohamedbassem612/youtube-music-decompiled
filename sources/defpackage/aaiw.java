package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aaiw implements aaiz {
    public abstract aamo a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaiw) {
            return a().d().equals(((aaiw) obj).a().d());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(a().d());
    }
}
