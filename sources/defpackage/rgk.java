package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgk extends rgo {
    public int a;
    public boolean c;
    public int b = 0;
    public qua d = qua.a();
    public rgl e = new rgj();

    public final rgm a() {
        ahno.G(this.a > 0, "maxQueuedTextures must be greater than 0.");
        rgy rgyVar = new rgy();
        this.f.add(0, rgyVar);
        return new rgm(this, rgyVar);
    }
}
