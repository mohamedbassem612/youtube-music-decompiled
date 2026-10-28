package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class qlq extends qlz {
    private volatile boolean d;

    public qlq(String str, String str2, qmj qmjVar) {
        super(str, str2, qmjVar);
    }

    @Override // defpackage.qlj
    protected final /* synthetic */ Object b(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.qlj
    protected final /* bridge */ /* synthetic */ Object c(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.qlm
    public final /* bridge */ /* synthetic */ Object d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.qlm
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Boolean) obj).booleanValue();
    }
}
