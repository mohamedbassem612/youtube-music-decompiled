package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class qlu extends qlz {
    private volatile double d;

    public qlu(String str, String str2, qmj qmjVar) {
        super(str, str2, qmjVar);
    }

    @Override // defpackage.qlj
    protected final /* synthetic */ Object b(Object obj) {
        return (Double) obj;
    }

    @Override // defpackage.qlj
    protected final /* bridge */ /* synthetic */ Object c(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // defpackage.qlm
    public final /* bridge */ /* synthetic */ Object d() {
        return Double.valueOf(this.d);
    }

    @Override // defpackage.qlm
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Double) obj).doubleValue();
    }
}
