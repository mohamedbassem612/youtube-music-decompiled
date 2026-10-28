package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sov {
    public final boolean a;
    private final agev b;
    private final agev c;
    private final agev d;

    public sov(boolean z, agev agevVar, agev agevVar2, agev agevVar3) {
        this.a = z;
        this.b = agevVar;
        this.c = agevVar2;
        this.d = agevVar3;
    }

    public static sou b() {
        sou souVar = new sou();
        souVar.d(false);
        agdf agdfVar = agdf.a;
        souVar.e(agdfVar);
        souVar.b(agdfVar);
        souVar.c(agdfVar);
        return souVar;
    }

    public final sou a() {
        sou souVarB = b();
        souVarB.d(this.a);
        souVarB.e(this.b);
        souVarB.b(this.c);
        souVarB.c(this.d);
        return souVarB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sov) {
            sov sovVar = (sov) obj;
            if (this.a == sovVar.a && this.b.equals(sovVar.b) && this.c.equals(sovVar.c) && this.d.equals(sovVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        agev agevVar = this.d;
        agev agevVar2 = this.c;
        return "InfoChipState{isFullscreen=" + this.a + ", titleText=" + String.valueOf(this.b) + ", actionText=" + String.valueOf(agevVar2) + ", icon=" + String.valueOf(agevVar) + '}';
    }

    public sov() {
        throw null;
    }
}
