package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qkl {
    public final Context a;
    public final agfr b;

    public qkl(Context context, agfr agfrVar) {
        this.a = context;
        this.b = agfrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qkl) {
            qkl qklVar = (qkl) obj;
            if (this.a.equals(qklVar.a)) {
                agfr agfrVar = this.b;
                if (agfrVar == null) {
                    if (qklVar.b == null) {
                        return true;
                    }
                } else if (agfrVar.equals(qklVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        agfr agfrVar = this.b;
        return (iHashCode * 1000003) ^ (agfrVar == null ? 0 : agfrVar.hashCode());
    }

    public final String toString() {
        agfr agfrVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + String.valueOf(agfrVar) + '}';
    }

    public qkl() {
        throw null;
    }
}
