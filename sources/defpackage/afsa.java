package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afsa {
    public final afsw a;
    public final afre b;
    public final affd c;

    public afsa(afsw afswVar) {
        this.a = afswVar;
        afsv afsvVar = afswVar.c;
        this.b = new afre(afsvVar == null ? afsv.a : afsvVar);
        this.c = (afswVar.b & 2) != 0 ? affd.a(afswVar.d) : null;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afsa)) {
            return false;
        }
        afsa afsaVar = (afsa) obj;
        if (!this.b.equals(afsaVar.b)) {
            return false;
        }
        affd affdVar = this.c;
        if (affdVar == null) {
            if (afsaVar.c != null) {
                return false;
            }
        } else if (!affdVar.equals(afsaVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }
}
