package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqg {
    public final UUID a;
    public final zrg b;

    public zqg(UUID uuid, zrg zrgVar) {
        uuid.getClass();
        this.a = uuid;
        this.b = zrgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zqg) {
            zqg zqgVar = (zqg) obj;
            if (awrc.c(this.a, zqgVar.a) && awrc.c(this.b, zqgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zrg zrgVar = this.b;
        return iHashCode + (zrgVar == null ? 0 : zrgVar.hashCode());
    }

    public final String toString() {
        return "Address(context=" + zqr.a(this.a) + ", route=" + this.b + ')';
    }
}
