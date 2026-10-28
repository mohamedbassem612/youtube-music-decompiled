package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class soo {
    public final int a;
    public final boolean b;
    public final sgn c;

    public soo(int i, boolean z, sgn sgnVar) {
        this.a = i;
        this.b = z;
        this.c = sgnVar;
    }

    public static son b() {
        son sonVar = new son();
        sonVar.d(-1);
        sonVar.c(false);
        sonVar.b(sgn.a);
        return sonVar;
    }

    public final son a() {
        son sonVarB = b();
        sonVarB.d(this.a);
        sonVarB.c(this.b);
        sonVarB.b(this.c);
        return sonVarB;
    }

    public final apzt c() {
        sgn sgnVar = this.c;
        if (sgnVar != null) {
            agev agevVar = sgnVar.e;
            if (agevVar.g()) {
                return (apzt) agevVar.c();
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof soo) {
            soo sooVar = (soo) obj;
            if (this.a == sooVar.a && this.b == sooVar.b && this.c.equals(sooVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AdProgressTextState{timeRemainingMillis=" + this.a + ", showAdChoices=" + this.b + ", adCountMetadata=" + String.valueOf(this.c) + '}';
    }

    public soo() {
        throw null;
    }
}
