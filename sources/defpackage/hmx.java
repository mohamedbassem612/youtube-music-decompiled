package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hmx implements aaiz {
    public abstract String a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hmx) {
            return a().equals(((hmx) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(a());
    }
}
