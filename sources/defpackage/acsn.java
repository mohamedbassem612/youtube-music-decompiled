package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsn extends ept implements acsu {
    public final ajwo a;
    public final alqc b;
    public final boolean c;

    public acsn(ajwo ajwoVar, alqc alqcVar, boolean z) {
        this.a = ajwoVar;
        this.b = alqcVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acsn)) {
            return false;
        }
        acsn acsnVar = (acsn) obj;
        return this.c == acsnVar.c && Objects.equals(this.a, acsnVar.a) && Objects.equals(this.b, acsnVar.b);
    }

    public final int hashCode() {
        return (((a.aj(this.c) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        return aawr.E(new Object[]{this.a, this.b, Boolean.valueOf(this.c)}, acsn.class);
    }
}
