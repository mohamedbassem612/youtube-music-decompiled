package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abrj {
    public final avmn a;
    public final agkj b;

    public abrj(avmn avmnVar, agkj agkjVar) {
        this.a = avmnVar;
        this.b = agkjVar;
    }

    public static ahgr b() {
        ahgr ahgrVar = new ahgr();
        ahgrVar.g(new avmq(avoi.b));
        return ahgrVar;
    }

    public final avlr a(Class cls) {
        return (avlr) this.b.getOrDefault(cls, avlr.A(new IllegalArgumentException("Response stream unavailable for plugin:".concat(String.valueOf(cls.getSimpleName())))));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abrj) {
            abrj abrjVar = (abrj) obj;
            if (this.a.equals(abrjVar.a) && aguu.q(this.b, abrjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        agkj agkjVar = this.b;
        return "GetWatchResponseModel{connection=" + String.valueOf(this.a) + ", responseStreams=" + String.valueOf(agkjVar) + '}';
    }

    public abrj() {
        throw null;
    }
}
