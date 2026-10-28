package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agpf implements Serializable, agex {
    public static final agpf a = new agpf(agio.a, agim.a);
    private static final long serialVersionUID = 0;
    final agiq b;
    final agiq c;

    private agpf(agiq agiqVar, agiq agiqVar2) {
        this.b = agiqVar;
        this.c = agiqVar2;
        if (agiqVar.compareTo(agiqVar2) > 0 || agiqVar == agim.a || agiqVar2 == agio.a) {
            throw new IllegalArgumentException("Invalid range: ".concat(j(agiqVar, agiqVar2)));
        }
    }

    public static agpf b(Comparable comparable, Comparable comparable2) {
        return new agpf(new agip(comparable), new agin(comparable2));
    }

    private static String j(agiq agiqVar, agiq agiqVar2) {
        StringBuilder sb = new StringBuilder(16);
        agiqVar.c(sb);
        sb.append("..");
        agiqVar2.d(sb);
        return sb.toString();
    }

    public final agpf c(agpf agpfVar) {
        agiq agiqVar = this.b;
        agiq agiqVar2 = agpfVar.b;
        int iA = agiqVar.compareTo(agiqVar2);
        agiq agiqVar3 = this.c;
        agiq agiqVar4 = agpfVar.c;
        int iA2 = agiqVar3.compareTo(agiqVar4);
        if (iA >= 0 && iA2 <= 0) {
            return this;
        }
        if (iA <= 0 && iA2 >= 0) {
            return agpfVar;
        }
        if (iA < 0) {
            agiqVar = agiqVar2;
        }
        if (iA2 > 0) {
            agiqVar3 = agiqVar4;
        }
        ahno.M(agiqVar.compareTo(agiqVar3) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, agpfVar);
        return new agpf(agiqVar, agiqVar3);
    }

    public final agpf d(agpf agpfVar) {
        agiq agiqVar = this.b;
        agiq agiqVar2 = agpfVar.b;
        int iA = agiqVar.compareTo(agiqVar2);
        agiq agiqVar3 = this.c;
        agiq agiqVar4 = agpfVar.c;
        int iA2 = agiqVar3.compareTo(agiqVar4);
        if (iA <= 0 && iA2 >= 0) {
            return this;
        }
        if (iA >= 0 && iA2 <= 0) {
            return agpfVar;
        }
        if (iA > 0) {
            agiqVar = agiqVar2;
        }
        if (iA2 < 0) {
            agiqVar3 = agiqVar4;
        }
        return new agpf(agiqVar, agiqVar3);
    }

    public final Comparable e() {
        return this.b.b();
    }

    @Override // defpackage.agex
    public final boolean equals(Object obj) {
        if (!(obj instanceof agpf)) {
            return false;
        }
        agpf agpfVar = (agpf) obj;
        return this.b.equals(agpfVar.b) && this.c.equals(agpfVar.c);
    }

    public final Comparable f() {
        return this.c.b();
    }

    @Override // defpackage.agex
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean a(Comparable comparable) {
        comparable.getClass();
        return this.b.e(comparable) && !this.c.e(comparable);
    }

    public final boolean h(agpf agpfVar) {
        return this.b.compareTo(agpfVar.c) <= 0 && agpfVar.b.compareTo(this.c) <= 0;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final boolean i() {
        return this.b.equals(this.c);
    }

    Object readResolve() {
        agpf agpfVar = a;
        return equals(agpfVar) ? agpfVar : this;
    }

    public final String toString() {
        return j(this.b, this.c);
    }
}
