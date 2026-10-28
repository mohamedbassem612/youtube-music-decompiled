package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeds {
    public final Optional a;
    public final aeda b;
    public final boolean c;
    public final aciz d;

    public aeds(aciz acizVar, Optional optional, aeda aedaVar, boolean z) {
        if (acizVar == null) {
            throw new NullPointerException("Null youTubeTypographyStyleResolver");
        }
        this.d = acizVar;
        if (optional == null) {
            throw new NullPointerException("Null optionalGradientDrawable");
        }
        this.a = optional;
        if (aedaVar == null) {
            throw new NullPointerException("Null experimentStateHelper");
        }
        this.b = aedaVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeds) {
            aeds aedsVar = (aeds) obj;
            if (this.d.equals(aedsVar.d) && this.a.equals(aedsVar.a) && this.b.equals(aedsVar.b) && this.c == aedsVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        aeda aedaVar = this.b;
        Optional optional = this.a;
        return "HeightDependentAttributesDependencies{youTubeTypographyStyleResolver=" + this.d.toString() + ", optionalGradientDrawable=" + optional.toString() + ", experimentStateHelper=" + aedaVar.toString() + ", shouldRoundButtonBackground=" + this.c + '}';
    }

    public aeds() {
        throw null;
    }
}
