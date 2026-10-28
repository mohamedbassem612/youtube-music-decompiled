package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zvh {
    public final String a;
    public final boolean b;
    protected final Pair c;

    public zvh(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = new Pair(str, Boolean.valueOf(z));
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass() == getClass() && ((zvh) obj).c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
