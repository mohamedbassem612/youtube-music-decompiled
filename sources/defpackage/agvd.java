package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agvd {
    public final int a;
    public final agsr b;

    protected agvd(agsr agsrVar, int i) {
        if (agsrVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(a.bR(i, "invalid index: "));
        }
        this.a = i;
        this.b = agsrVar;
    }

    public abstract void a(agvh agvhVar, Object obj);
}
