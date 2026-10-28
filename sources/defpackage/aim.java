package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aim extends akd {
    public int a;

    public aim(long j, int i) {
        super(j);
        this.a = i;
    }

    @Override // defpackage.akd
    public final akd a() {
        return new aim(Long.MAX_VALUE, this.a);
    }
}
