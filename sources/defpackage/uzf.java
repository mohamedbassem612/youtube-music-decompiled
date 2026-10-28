package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzf {
    public final agke a;
    public final agke b;
    public final apji c;
    public final apji d;

    public uzf(agke agkeVar, agke agkeVar2, apji apjiVar, apji apjiVar2) {
        this.a = agkeVar;
        this.b = agkeVar2;
        this.c = apjiVar;
        this.d = apjiVar2;
    }

    public static uze a() {
        uze uzeVar = new uze();
        agke agkeVar = agpi.a;
        uzeVar.b(agkeVar);
        uzeVar.c(agkeVar);
        return uzeVar;
    }

    public final boolean equals(Object obj) {
        apji apjiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uzf) {
            uzf uzfVar = (uzf) obj;
            if (aguu.v(this.a, uzfVar.a) && aguu.v(this.b, uzfVar.b) && ((apjiVar = this.c) != null ? apjiVar.equals(uzfVar.c) : uzfVar.c == null)) {
                apji apjiVar2 = this.d;
                if (apjiVar2 == null) {
                    if (uzfVar.d == null) {
                        return true;
                    }
                } else if (apjiVar2.equals(uzfVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        apji apjiVar = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (apjiVar == null ? 0 : apjiVar.hashCode())) * 1000003;
        apji apjiVar2 = this.d;
        return iHashCode2 ^ (apjiVar2 != null ? apjiVar2.hashCode() : 0);
    }

    public final String toString() {
        apji apjiVar = this.d;
        apji apjiVar2 = this.c;
        agke agkeVar = this.b;
        return "ShortsCreationXenoEffectsStateHolder{cameraToolbeltButtonRenderers=" + String.valueOf(this.a) + ", editorToolbeltButtonRenderers=" + String.valueOf(agkeVar) + ", cameraSwipeAssetActionsRenderer=" + String.valueOf(apjiVar2) + ", editorSwipeAssetActionsRenderer=" + String.valueOf(apjiVar) + '}';
    }

    public uzf() {
        throw null;
    }
}
