package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ahtx implements ahqp {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int e;

    ahtx(int i) {
        this.e = i;
    }

    @Override // defpackage.ahqp
    public final int a() {
        return this.e;
    }
}
