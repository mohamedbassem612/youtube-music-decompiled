package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aect {
    public final apkx a;

    public aect(apkx apkxVar) {
        if (apkxVar == null) {
            throw new NullPointerException("Null responsiveGridsReflowConfiguration");
        }
        this.a = apkxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aect) {
            return this.a.equals(((aect) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ResponsiveFeedAuxiliaryEventData{responsiveGridsReflowConfiguration=" + this.a.toString() + '}';
    }

    public aect() {
        throw null;
    }
}
