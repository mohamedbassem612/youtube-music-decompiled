package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afgp {
    public final Intent a;

    public afgp(Intent intent) {
        if (intent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afgp) {
            return this.a.equals(((afgp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SelectorContext{intent=" + this.a.toString() + '}';
    }

    public afgp() {
        throw null;
    }
}
