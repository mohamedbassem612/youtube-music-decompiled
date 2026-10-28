package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avbr {
    public final avcf a;
    public final auyo b;
    public final avbp c;

    public avbr(avcf avcfVar, auyo auyoVar, avbp avbpVar) {
        this.a = avcfVar;
        auyoVar.getClass();
        this.b = auyoVar;
        this.c = avbpVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avbr)) {
            return false;
        }
        avbr avbrVar = (avbr) obj;
        return Objects.equals(this.a, avbrVar.a) && Objects.equals(this.b, avbrVar.b) && Objects.equals(this.c, avbrVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("addressesOrError", this.a.toString());
        ageuVarAc.b("attributes", this.b);
        ageuVarAc.b("serviceConfigOrError", this.c);
        return ageuVarAc.toString();
    }
}
