package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cfz {
    public final bse a;

    @Deprecated
    public final int b = 0;
    public final ahbo c;
    public final btn d;
    public final cnm e;

    public cfz(cfy cfyVar) {
        this.a = cfyVar.a;
        this.c = cfyVar.b;
        this.d = cfyVar.c;
        this.e = cfyVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cfz) {
            cfz cfzVar = (cfz) obj;
            int i = cfzVar.b;
            if (this.a.equals(cfzVar.a) && Objects.equals(this.c, cfzVar.c) && this.d.equals(cfzVar.d) && Objects.equals(this.e, cfzVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        ahbo ahboVar = this.c;
        int iHashCode2 = (((iHashCode * 961) + (ahboVar == null ? 0 : ahboVar.hashCode())) * 31) + this.d.hashCode();
        cnm cnmVar = this.e;
        return (iHashCode2 * 31) + (cnmVar != null ? cnmVar.hashCode() : 0);
    }
}
