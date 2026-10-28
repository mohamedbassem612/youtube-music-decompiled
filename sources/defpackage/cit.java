package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cit {
    public final long a;
    public final boolean b;
    public final int c;
    public final String d;
    public final long e;
    public final long f;
    public final cjh g;

    public cit(long j, boolean z, int i, String str, long j2, long j3, cjh cjhVar) {
        this.a = j;
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = j2;
        this.f = j3;
        this.g = cjhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cit) {
            cit citVar = (cit) obj;
            if (this.a == citVar.a && this.b == citVar.b && this.c == citVar.c && this.e == citVar.e && this.f == citVar.f && Objects.equals(this.d, citVar.d) && Objects.equals(this.g, citVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Long.valueOf(this.e), Long.valueOf(this.f), this.g);
    }
}
