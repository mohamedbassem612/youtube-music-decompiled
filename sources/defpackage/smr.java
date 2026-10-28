package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class smr {
    public final String a;
    public final smq b;
    public final int c;
    public final agke d;
    public final agke e;
    public final agke f;
    public final shh g;
    public final Optional h;
    public final Optional i;
    public final boolean j;
    public final Optional k;
    public final agke l;

    public smr(String str, smq smqVar, int i, agke agkeVar, agke agkeVar2, agke agkeVar3, shh shhVar, Optional optional, Optional optional2, boolean z, Optional optional3, agke agkeVar4) {
        if (str == null) {
            throw new NullPointerException("Null slotId");
        }
        this.a = str;
        this.b = smqVar;
        this.c = i;
        if (agkeVar == null) {
            throw new NullPointerException("Null slotEntryTriggers");
        }
        this.d = agkeVar;
        if (agkeVar2 == null) {
            throw new NullPointerException("Null slotFulfillmentTriggers");
        }
        this.e = agkeVar2;
        if (agkeVar3 == null) {
            throw new NullPointerException("Null slotExpirationTriggers");
        }
        this.f = agkeVar3;
        if (shhVar == null) {
            throw new NullPointerException("Null clientMetadata");
        }
        this.g = shhVar;
        this.h = optional;
        this.i = optional2;
        this.j = z;
        this.k = optional3;
        if (agkeVar4 == null) {
            throw new NullPointerException("Null slotExpirationServerTriggers");
        }
        this.l = agkeVar4;
    }

    public static smr b(String str, aixo aixoVar, int i, int i2, agke agkeVar, agke agkeVar2, agke agkeVar3, shh shhVar, Optional optional) {
        return new smr(str, smq.a(aixoVar, i), i2, agkeVar, agkeVar2, agkeVar3, shhVar, optional, Optional.empty(), false, Optional.empty(), agpi.a);
    }

    public static smr h(String str, aixo aixoVar, int i, agke agkeVar, agke agkeVar2, agke agkeVar3, shh shhVar, Optional optional, Optional optional2) {
        return new smr(str, smq.a(aixoVar, i), 1, agkeVar, agkeVar2, agkeVar3, shhVar, optional, optional2, false, Optional.empty(), agpi.a);
    }

    public static smr i(String str, aixo aixoVar, agke agkeVar, agke agkeVar2, agke agkeVar3, shh shhVar) {
        return new smr(str, smq.a(aixoVar, 1), 1, agkeVar, agkeVar2, agkeVar3, shhVar, Optional.empty(), Optional.empty(), false, Optional.empty(), agpi.a);
    }

    public final int a() {
        return this.b.b;
    }

    public final aixo c() {
        return this.b.a;
    }

    public final Object d(Class cls) {
        return this.g.d(cls);
    }

    public final boolean e(Class cls) {
        return this.g.e(cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smr) {
            smr smrVar = (smr) obj;
            if (this.a.equals(smrVar.a) && this.b.equals(smrVar.b) && this.c == smrVar.c && aguu.v(this.d, smrVar.d) && aguu.v(this.e, smrVar.e) && aguu.v(this.f, smrVar.f) && this.g.equals(smrVar.g) && this.h.equals(smrVar.h) && this.i.equals(smrVar.i) && this.j == smrVar.j && this.k.equals(smrVar.k) && aguu.v(this.l, smrVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(Class... clsArr) {
        return Collection.EL.stream(Arrays.asList(clsArr)).allMatch(new sco(this, 9));
    }

    public final boolean g(aixo aixoVar, Class... clsArr) {
        return aixoVar == c() && Collection.EL.stream(Arrays.asList(clsArr)).allMatch(new sco(this, 9));
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        return "Slot[slotType=" + c().name() + ", slotPhysicalPosition=" + a() + ", managerLayer=" + this.c + ", slotEntryTriggers=" + this.d + ", slotEntryServerTrigger=" + this.k + ", slotFulfillmentTriggers=" + this.e + ", slotExpirationTriggers=" + this.f + ", slotExpirationServerTriggers=" + this.l + ", clientMetadata=" + this.g + ", fulfilledLayout=" + this.i + ", isV2Enabled=" + this.j + ", adSlotLoggingData=" + this.h + ']';
    }

    public smr() {
        throw null;
    }
}
