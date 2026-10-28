package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ahjf implements aihr {
    SLH_DSA_HASH_TYPE_UNSPECIFIED(0),
    SHA2(1),
    SHAKE(2),
    UNRECOGNIZED(-1);

    private final int f;

    ahjf(int i) {
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
