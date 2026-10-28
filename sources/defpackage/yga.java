package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yga extends Exception implements zjs {
    private final String a;

    public yga() {
        super("c.crcMismatch");
        this.a = "file";
    }

    @Override // defpackage.zjs
    public final String a(boolean z) {
        return this.a;
    }

    @Override // defpackage.zjs
    public final String b() {
        return "m.".concat(String.valueOf(getMessage()));
    }
}
