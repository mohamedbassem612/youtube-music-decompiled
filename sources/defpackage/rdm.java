package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdm {
    public final boolean a;
    public final int b;

    public rdm(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    public final boolean a() {
        return this.a && this.b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rdm) {
            rdm rdmVar = (rdm) obj;
            if (this.b == rdmVar.b && this.a == rdmVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231);
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i == 1) {
            str = "IDLE";
        } else if (i != 2) {
            str = i != 3 ? "ENDED" : "BUFFERING";
        } else {
            str = "READY";
        }
        return "CompositeState{state=" + str + ", playWhenReady=" + this.a + '}';
    }

    public rdm() {
        throw null;
    }
}
