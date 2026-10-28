package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acso extends ept implements acsu {
    public final ajwo a;
    public final alqc b;
    public final boolean c;

    public acso(ajwo ajwoVar, alqc alqcVar, boolean z) {
        this.a = ajwoVar;
        this.b = alqcVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acso)) {
            return false;
        }
        acso acsoVar = (acso) obj;
        return this.c == acsoVar.c && Objects.equals(this.a, acsoVar.a) && Objects.equals(this.b, acsoVar.b);
    }

    public final int hashCode() {
        return (((a.aj(this.c) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        return aawr.E(new Object[]{this.a, this.b, Boolean.valueOf(this.c)}, acso.class);
    }
}
