package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iru implements zrg {
    private final boolean a = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iru)) {
            return false;
        }
        boolean z = ((iru) obj).a;
        return true;
    }

    @Override // defpackage.zrg
    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "RadioBuilderRoute(unused=false)";
    }
}
