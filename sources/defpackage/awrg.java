package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awrg extends awrh implements awsj, awqk {
    public awrg(Class cls) {
        super(NO_RECEIVER, cls, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
    }

    public final awsi a() {
        return ((awrg) getReflected()).a();
    }

    @Override // defpackage.awqt
    protected final awsc computeReflected() {
        int i = awrn.a;
        return this;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        return a().call(obj, obj2);
    }
}
