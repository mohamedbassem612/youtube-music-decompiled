package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class qlw extends qlz {
    private volatile long d;

    public qlw(String str, String str2, qmj qmjVar) {
        super(str, str2, qmjVar);
    }

    @Override // defpackage.qlj
    protected final /* synthetic */ Object b(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.qlj
    protected final /* bridge */ /* synthetic */ Object c(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.qlm
    public final /* bridge */ /* synthetic */ Object d() {
        return Long.valueOf(this.d);
    }

    @Override // defpackage.qlm
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Long) obj).longValue();
    }
}
