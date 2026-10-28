package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dym {
    public final Uri a;
    public final boolean b;

    public dym(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (awrc.c(getClass(), obj != null ? obj.getClass() : null)) {
            obj.getClass();
            dym dymVar = (dym) obj;
            if (awrc.c(this.a, dymVar.a) && this.b == dymVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.aj(this.b);
    }
}
