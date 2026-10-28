package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yvx {
    public static final yvx a = new yvx(null, null);
    public final String b;
    public final wjf c;

    public yvx(String str, wjf wjfVar) {
        this.b = str;
        this.c = wjfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yvx) {
            yvx yvxVar = (yvx) obj;
            if (awrc.c(this.b, yvxVar.b) && awrc.c(this.c, yvxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        wjf wjfVar = this.c;
        return (iHashCode * 31) + (wjfVar != null ? wjfVar.hashCode() : 0);
    }

    public final String toString() {
        return "StatefulVolumeInfo(cpn=" + this.b + ", playerResponse=" + this.c + ')';
    }
}
