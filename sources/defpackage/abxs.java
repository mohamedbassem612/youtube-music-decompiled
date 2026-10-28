package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abxs {
    public final abxc a;
    public final acip b;

    public abxs(abxc abxcVar, acip acipVar) {
        this.a = abxcVar;
        this.b = acipVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abxs) {
            abxs abxsVar = (abxs) obj;
            if (awrc.c(this.a, abxsVar.a) && awrc.c(this.b, abxsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PlayerSettingControlEventWithActiveComponent(playerSettingControlEvent=" + this.a + ", activeComponent=" + this.b + ')';
    }
}
