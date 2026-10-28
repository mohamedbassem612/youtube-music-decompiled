package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adhd {
    public final agkj a;

    public adhd(agkj agkjVar) {
        this.a = agkjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adhd) {
            return aguu.q(this.a, ((adhd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FlowControllerState{steps=" + String.valueOf(this.a) + '}';
    }

    public adhd() {
        throw null;
    }
}
