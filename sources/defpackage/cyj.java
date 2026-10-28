package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyj extends cyh {
    public final String a;
    public final String b;
    public final String c;

    public cyj(String str, String str2, String str3) {
        super("----");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyj cyjVar = (cyj) obj;
            if (Objects.equals(this.b, cyjVar.b) && Objects.equals(this.a, cyjVar.a) && Objects.equals(this.c, cyjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @Override // defpackage.cyh
    public final String toString() {
        return this.f + ": domain=" + this.a + ", description=" + this.b;
    }
}
