package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class crx {
    public final String a;
    public final String b;
    public final cry c;

    public crx(String str, String str2, cry cryVar) {
        this.a = str;
        this.b = str2;
        this.c = cryVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof crx) {
            crx crxVar = (crx) obj;
            if (Objects.equals(this.a, crxVar.a) && Objects.equals(this.b, crxVar.b) && Objects.equals(this.c, crxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
