package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aloj implements aihr {
    UNKNOWN_FORM_FACTOR(0),
    SMALL_FORM_FACTOR(1),
    LARGE_FORM_FACTOR(2),
    AUTOMOTIVE_FORM_FACTOR(3),
    WEARABLE_FORM_FACTOR(4);

    public final int f;

    aloj(int i) {
        this.f = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
