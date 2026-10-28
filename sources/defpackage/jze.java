package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jze implements kms {
    public final Bundle a;

    static {
        new Bundle();
    }

    public jze(Bundle bundle) {
        this.a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jze) {
            return kro.n(this.a, ((jze) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
