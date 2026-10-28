package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmi {
    public final boolean a;
    public final boolean b;
    public final agke c;
    public final apev d;
    public final akrn e;
    public final akrn f;
    public final aqpq g;
    public final Optional h;
    public final boolean i;

    public acmi(boolean z, boolean z2, agke agkeVar, apev apevVar, akrn akrnVar, akrn akrnVar2, aqpq aqpqVar, Optional optional, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = agkeVar;
        this.d = apevVar;
        this.e = akrnVar;
        this.f = akrnVar2;
        this.g = aqpqVar;
        this.h = optional;
        this.i = z3;
    }

    public static acmh a() {
        acmh acmhVar = new acmh();
        acmhVar.c(false);
        acmhVar.d(false);
        acmhVar.f(agpi.a);
        return acmhVar;
    }

    @Deprecated
    public static acmi b(boolean z, agke agkeVar, apev apevVar, boolean z2, Optional optional) {
        acmh acmhVarA = a();
        acmhVarA.e(z);
        acmhVarA.f(agkeVar);
        acmhVarA.a = apevVar;
        acmhVarA.d(z2);
        acmhVarA.b(optional);
        return acmhVarA.a();
    }

    public static acmi c(boolean z, boolean z2, akrn akrnVar, akrn akrnVar2, aqpq aqpqVar, Optional optional) {
        acmh acmhVarA = a();
        acmhVarA.e(z);
        acmhVarA.c(z2);
        acmhVarA.b = akrnVar;
        acmhVarA.c = akrnVar2;
        acmhVarA.d = aqpqVar;
        acmhVarA.b(optional);
        return acmhVarA.a();
    }

    public final boolean equals(Object obj) {
        apev apevVar;
        akrn akrnVar;
        akrn akrnVar2;
        aqpq aqpqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof acmi) {
            acmi acmiVar = (acmi) obj;
            if (this.a == acmiVar.a && this.b == acmiVar.b && aguu.v(this.c, acmiVar.c) && ((apevVar = this.d) != null ? apevVar.equals(acmiVar.d) : acmiVar.d == null) && ((akrnVar = this.e) != null ? akrnVar.equals(acmiVar.e) : acmiVar.e == null) && ((akrnVar2 = this.f) != null ? akrnVar2.equals(acmiVar.f) : acmiVar.f == null) && ((aqpqVar = this.g) != null ? aqpqVar.equals(acmiVar.g) : acmiVar.g == null) && this.h.equals(acmiVar.h) && this.i == acmiVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        apev apevVar = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (apevVar == null ? 0 : apevVar.hashCode())) * 1000003;
        akrn akrnVar = this.e;
        int iHashCode3 = (iHashCode2 ^ (akrnVar == null ? 0 : akrnVar.hashCode())) * 1000003;
        akrn akrnVar2 = this.f;
        int iHashCode4 = (iHashCode3 ^ (akrnVar2 == null ? 0 : akrnVar2.hashCode())) * 1000003;
        aqpq aqpqVar = this.g;
        return ((((iHashCode4 ^ (aqpqVar != null ? aqpqVar.hashCode() : 0)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true == this.i ? 1231 : 1237);
    }

    public final String toString() {
        Optional optional = this.h;
        aqpq aqpqVar = this.g;
        akrn akrnVar = this.f;
        akrn akrnVar2 = this.e;
        apev apevVar = this.d;
        return "ReelsTopBarModel{shouldShowTopBar=" + this.a + ", logInteractions=" + this.b + ", topBarButtons=" + String.valueOf(this.c) + ", contextualHeaderRenderer=" + String.valueOf(apevVar) + ", headerRenderer=" + String.valueOf(akrnVar2) + ", accessoryRenderer=" + String.valueOf(akrnVar) + ", accessoryRendererTriggerConditions=" + String.valueOf(aqpqVar) + ", blockRegistry=" + String.valueOf(optional) + ", shouldShowSendToTvButton=" + this.i + '}';
    }

    public acmi() {
        throw null;
    }
}
