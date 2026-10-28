package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ahjj implements aihr {
    SLH_DSA_SIGNATURE_TYPE_UNSPECIFIED(0),
    FAST_SIGNING(1),
    SMALL_SIGNATURE(2),
    UNRECOGNIZED(-1);

    private final int f;

    ahjj(int i) {
        this.f = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
