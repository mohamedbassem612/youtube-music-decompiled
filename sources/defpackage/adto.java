package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adto {
    public final acjx a;
    public final agev b;
    public final twi c;
    public final agev d;
    public final agke e;
    public final boolean f;
    public final adtl g;
    public final boolean h;
    public final amdd i;
    public final boolean j;

    public adto(acjx acjxVar, agev agevVar, twi twiVar, agev agevVar2, agke agkeVar, boolean z, adtl adtlVar, boolean z2, amdd amddVar, boolean z3) {
        this.a = acjxVar;
        this.b = agevVar;
        this.c = twiVar;
        this.d = agevVar2;
        this.e = agkeVar;
        this.f = z;
        this.g = adtlVar;
        this.h = z2;
        this.i = amddVar;
        this.j = z3;
    }

    public static adtn a(acjx acjxVar) {
        adtn adtnVar = new adtn();
        if (acjxVar == null) {
            throw new NullPointerException("Null continuation");
        }
        adtnVar.a = acjxVar;
        agdf agdfVar = agdf.a;
        adtnVar.d = agdfVar;
        agke agkeVar = agpi.a;
        if (agkeVar == null) {
            throw new NullPointerException("Null additionalContinuationResponseListeners");
        }
        adtnVar.e = agkeVar;
        adtnVar.d(false);
        adtnVar.b = agdfVar;
        adtnVar.c = new gek(4);
        adtnVar.f = new adtl(false);
        adtnVar.c(false);
        amdd amddVar = amdd.a;
        if (amddVar == null) {
            throw new NullPointerException("Null clientData");
        }
        adtnVar.g = amddVar;
        adtnVar.b(false);
        return adtnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adto) {
            adto adtoVar = (adto) obj;
            if (this.a.equals(adtoVar.a) && this.b.equals(adtoVar.b) && this.c.equals(adtoVar.c) && this.d.equals(adtoVar.d) && aguu.v(this.e, adtoVar.e) && this.f == adtoVar.f && this.g.equals(adtoVar.g) && this.h == adtoVar.h && this.i.equals(adtoVar.i) && this.j == adtoVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true == this.j ? 1231 : 1237);
    }

    public final String toString() {
        amdd amddVar = this.i;
        adtl adtlVar = this.g;
        agke agkeVar = this.e;
        agev agevVar = this.d;
        twi twiVar = this.c;
        agev agevVar2 = this.b;
        return "ContinuationRequestInfo{continuation=" + String.valueOf(this.a) + ", parentCommand=" + String.valueOf(agevVar2) + ", requestMutator=" + String.valueOf(twiVar) + ", additionalContinuationListener=" + String.valueOf(agevVar) + ", additionalContinuationResponseListeners=" + String.valueOf(agkeVar) + ", skipDefaultContinuationListener=" + this.f + ", continuationContext=" + String.valueOf(adtlVar) + ", isRequestInfoCachable=" + this.h + ", clientData=" + String.valueOf(amddVar) + ", isRefresh=" + this.j + '}';
    }

    public adto() {
        throw null;
    }
}
