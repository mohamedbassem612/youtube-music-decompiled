package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhs {
    public final affd a;
    private final afhq b;

    public afhs(affd affdVar, afhq afhqVar) {
        if (affdVar == null) {
            throw new NullPointerException("Null id");
        }
        this.a = affdVar;
        this.b = afhqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afhs) {
            afhs afhsVar = (afhs) obj;
            if (this.a.equals(afhsVar.a) && this.b.equals(afhsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        afhq afhqVar = this.b;
        return "AccountContext{id=" + this.a.toString() + ", info=" + afhqVar.toString() + '}';
    }

    public afhs() {
        throw null;
    }
}
