package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ohr {
    public final ohz a;
    private final agev b;
    private final agev c;

    public ohr(ohz ohzVar, agev agevVar, agev agevVar2) {
        this.a = ohzVar;
        this.b = agevVar;
        this.c = agevVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohr) {
            ohr ohrVar = (ohr) obj;
            if (this.a.equals(ohrVar.a) && this.b.equals(ohrVar.b) && this.c.equals(ohrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        agev agevVar = this.c;
        agev agevVar2 = this.b;
        return "AddFileGroupRequest{dataFileGroup=" + String.valueOf(this.a) + ", accountOptional=" + String.valueOf(agevVar2) + ", variantIdOptional=" + String.valueOf(agevVar) + '}';
    }

    public ohr() {
        throw null;
    }
}
