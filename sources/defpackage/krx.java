package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krx implements kms {
    public static final krx a = new krx(null);
    public final String b;

    public krx(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof krx) {
            return Objects.equals(this.b, ((krx) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b);
    }
}
