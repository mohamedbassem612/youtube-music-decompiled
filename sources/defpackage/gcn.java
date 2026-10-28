package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcn extends gcr {
    private static volatile Long h;
    private static final Object i = new Object();

    public gcn(gbg gbgVar, fxg fxgVar, int i2) {
        super(gbgVar, "kF6Jd1sw3q3qw/+0TLn2ko4HVh3R2fnHDWtmvFKAaIlQ9hXvB4VlqN5VKdWvJw1j", "U78MFNuwn7os0/QAHloPzwNLvW28Sv2AVl9cZ/WB06U=", fxgVar, i2, 33);
    }

    @Override // defpackage.gcr
    protected final void a() {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (Long) this.e.invoke(null, null);
                }
            }
        }
        fxg fxgVar = this.d;
        synchronized (fxgVar) {
            long jLongValue = h.longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.b |= 134217728;
            fxlVar.x = jLongValue;
        }
    }
}
