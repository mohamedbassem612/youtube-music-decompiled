package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abic {
    public final wjf a;
    public final String b;

    public abic(wjf wjfVar, String str) {
        str.getClass();
        this.a = wjfVar;
        this.b = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abic) {
            abic abicVar = (abic) obj;
            if (awrc.c(this.a, abicVar.a) && awrc.c(this.b, abicVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        wjf wjfVar = this.a;
        return ((wjfVar == null ? 0 : wjfVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PlayerResponseModelWrapper(playerResponse=" + this.a + ", cpn=" + this.b + ')';
    }
}
