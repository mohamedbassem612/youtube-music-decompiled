package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qlr extends qls {
    private volatile boolean d;
    private Object e;

    public qlr(String str, String str2, qmj qmjVar, qln qlnVar, String str3) {
        super(str, str2, qmjVar, qlnVar);
        this.e = str3;
        this.d = true;
    }

    @Override // defpackage.qlj
    public final Object e() {
        if (this.d) {
            synchronized (this) {
                if (this.d) {
                    Object objIq = iq((String) this.e);
                    objIq.getClass();
                    this.e = objIq;
                    this.d = false;
                }
            }
        }
        return this.e;
    }
}
