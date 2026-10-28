package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awrf extends awrh implements awsj, awqg {
    public awrf(Class cls, String str, String str2) {
        super(NO_RECEIVER, cls, str, str2, 0);
    }

    public Object a(Object obj) {
        return b().call(obj);
    }

    public final awsh b() {
        return ((awrf) getReflected()).b();
    }

    @Override // defpackage.awqt
    protected final awsc computeReflected() {
        int i = awrn.a;
        return this;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        return a(obj);
    }
}
