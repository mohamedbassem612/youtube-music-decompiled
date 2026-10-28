package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ahty implements ahqp {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int f;

    ahty(int i) {
        this.f = i;
    }

    @Override // defpackage.ahqp
    public final int a() {
        return this.f;
    }
}
