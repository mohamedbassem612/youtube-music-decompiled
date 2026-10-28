package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzv {
    public final String a;
    public final auzu b;
    public final long c;
    public final avae d;
    public final avae e;

    public auzv(String str, auzu auzuVar, long j, avae avaeVar) {
        this.a = str;
        auzuVar.getClass();
        this.b = auzuVar;
        this.c = j;
        this.d = null;
        this.e = avaeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof auzv)) {
            return false;
        }
        auzv auzvVar = (auzv) obj;
        if (!Objects.equals(this.a, auzvVar.a) || !Objects.equals(this.b, auzvVar.b) || this.c != auzvVar.c) {
            return false;
        }
        avae avaeVar = auzvVar.d;
        return Objects.equals(null, null) && Objects.equals(this.e, auzvVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c), null, this.e);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("description", this.a);
        ageuVarAc.b("severity", this.b);
        ageuVarAc.f("timestampNanos", this.c);
        ageuVarAc.b("channelRef", null);
        ageuVarAc.b("subchannelRef", this.e);
        return ageuVarAc.toString();
    }
}
