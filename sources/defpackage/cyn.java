package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyn extends cyh {
    public final String a;
    public final String b;

    public cyn(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyn cynVar = (cyn) obj;
            if (this.f.equals(cynVar.f) && Objects.equals(this.a, cynVar.a) && Objects.equals(this.b, cynVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() + 527;
        String str = this.a;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    @Override // defpackage.cyh
    public final String toString() {
        return this.f + ": url=" + this.b;
    }
}
