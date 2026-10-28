package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyd extends cyh {
    public final String a;
    public final String b;
    public final String c;

    public cyd(String str, String str2, String str3) {
        super("COMM");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyd cydVar = (cyd) obj;
            if (Objects.equals(this.b, cydVar.b) && Objects.equals(this.a, cydVar.a) && Objects.equals(this.c, cydVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
        String str = this.c;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.cyh
    public final String toString() {
        return this.f + ": language=" + this.a + ", description=" + this.b + ", text=" + this.c;
    }
}
