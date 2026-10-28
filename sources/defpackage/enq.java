package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enq {
    public float a;
    public float b;

    public enq(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append('x');
        sb.append(f2);
        return sb.toString();
    }

    public enq() {
        throw null;
    }
}
