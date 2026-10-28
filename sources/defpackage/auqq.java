package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auqq implements auqp {
    private static final qmm a = new qmm(auqn.b, 18);

    @Override // defpackage.auqp
    public final boolean a() {
        return ((Boolean) a.d(1, "CollectionBasisVerifierFeatures__enable_cbv_v2", false).io()).booleanValue();
    }

    @Override // defpackage.auqp
    public final boolean b() {
        return ((Boolean) a.d(2, "CollectionBasisVerifierFeatures__enable_google_signature_check", false).io()).booleanValue();
    }

    @Override // defpackage.auqp
    public final void c() {
        ((Boolean) a.d(11, "CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false).io()).booleanValue();
    }
}
