package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ogw {
    private static final ThreadLocal a = new ogs();

    public static ogw c() {
        return (ogw) a.get();
    }

    public abstract void a(ogu oguVar);

    public abstract void b(ogu oguVar);
}
