package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zng {
    private final zne a;
    private final brf b;
    private final dff c;

    public zng(zne zneVar, brf brfVar) {
        zneVar.getClass();
        this.a = zneVar;
        this.b = brfVar;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zng) {
            zng zngVar = (zng) obj;
            if (awrc.c(this.a, zngVar.a) && awrc.c(this.b, zngVar.b)) {
                dff dffVar = zngVar.c;
                if (awrc.c(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        brf brfVar = this.b;
        return (iHashCode + (brfVar == null ? 0 : brfVar.hashCode())) * 31;
    }

    public final String toString() {
        return "NotificationTarget(mediaClientName=" + this.a + ", remoteUserInfo=" + this.b + ", controllerInfo=null)";
    }
}
