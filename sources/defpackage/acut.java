package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acut {
    public final abun a;
    public final abnl b;

    public acut(abun abunVar, abnl abnlVar) {
        this.a = abunVar;
        this.b = abnlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acut) {
            acut acutVar = (acut) obj;
            if (awrc.c(this.a, acutVar.a) && awrc.c(this.b, acutVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        abun abunVar = this.a;
        int iHashCode = abunVar == null ? 0 : abunVar.hashCode();
        abnl abnlVar = this.b;
        return (iHashCode * 31) + (abnlVar != null ? abnlVar.hashCode() : 0);
    }

    public final String toString() {
        return "CreateSequenceItemResult(sequenceItem=" + this.a + ", playbackStartDescriptorUsed=" + this.b + ')';
    }
}
