package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uqm {
    public final int a;
    private final akgs b;

    public uqm(akgs akgsVar, int i) {
        this.b = akgsVar;
        this.a = i;
    }

    public static /* synthetic */ Object a(Object obj) {
        uqn uqnVar = (uqn) obj;
        auak auakVar = uqnVar.a;
        if (!auakVar.g) {
            return uqnVar;
        }
        aihf builder = auakVar.toBuilder();
        builder.copyOnWrite();
        auak auakVar2 = (auak) builder.instance;
        auakVar2.b |= 8;
        auakVar2.f = 0.0f;
        return new uqn((auak) builder.build(), 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqm) {
            uqm uqmVar = (uqm) obj;
            if (this.b.equals(uqmVar.b) && this.a == uqmVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        return "GhostOverlayRenderer{renderer=" + this.b.toString() + ", fadeInThresholdPixel=" + this.a + '}';
    }

    public uqm() {
        throw null;
    }
}
