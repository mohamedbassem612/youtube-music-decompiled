package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adbs extends adbo {
    private final adbp a;
    private final adbp b;

    public adbs(adbp adbpVar, adbp adbpVar2) {
        if (adbpVar == null) {
            throw new NullPointerException("Null currentState");
        }
        this.a = adbpVar;
        if (adbpVar2 == null) {
            throw new NullPointerException("Null toState");
        }
        this.b = adbpVar2;
    }

    @Override // defpackage.adbo
    public final adbp a() {
        return this.a;
    }

    @Override // defpackage.adbo
    public final adbp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adbo) {
            adbo adboVar = (adbo) obj;
            if (this.a.equals(adboVar.a()) && this.b.equals(adboVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        adbp adbpVar = this.b;
        return "ActiveStateChangedEvent{currentState=" + this.a.toString() + ", toState=" + adbpVar.toString() + '}';
    }
}
