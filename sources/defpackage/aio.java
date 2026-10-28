package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aio extends akd {
    public Object a;

    public aio(long j, Object obj) {
        super(j);
        this.a = obj;
    }

    @Override // defpackage.akd
    public final /* bridge */ /* synthetic */ akd a() {
        return new aio(Long.MAX_VALUE, this.a);
    }
}
