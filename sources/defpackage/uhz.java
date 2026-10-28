package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uhz implements Comparable {
    public int a;
    public float b;
    public float c;

    public uhz(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final float a() {
        return this.c - this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        float fA = a() - ((uhz) obj).a();
        if (Math.abs(fA) < 0.001f) {
            return 0;
        }
        return fA > 0.0f ? 1 : -1;
    }
}
