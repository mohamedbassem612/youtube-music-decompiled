package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ahtz implements ahqp {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int f;

    ahtz(int i) {
        this.f = i;
    }

    @Override // defpackage.ahqp
    public final int a() {
        return this.f;
    }
}
