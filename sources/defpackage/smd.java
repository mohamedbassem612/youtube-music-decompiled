package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class smd {
    public final String a;
    public final String b;
    public final aaxa c;
    public final int d;

    public smd(String str, String str2, aaxa aaxaVar, int i) {
        if (str == null) {
            throw new NullPointerException("Null serviceId");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null adRequestId");
        }
        this.b = str2;
        this.c = aaxaVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smd) {
            smd smdVar = (smd) obj;
            if (this.a.equals(smdVar.a) && this.b.equals(smdVar.b) && this.c.equals(smdVar.c) && this.d == smdVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "PrefetchInstruction{serviceId=" + this.a + ", adRequestId=" + this.b + ", event=" + this.c.toString() + ", breakIndex=" + this.d + '}';
    }

    public smd() {
        throw null;
    }
}
