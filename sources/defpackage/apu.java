package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class apu extends anx {
    private final awqg a;

    public apu(awqg awqgVar) {
        this.a = awqgVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof apu) && this.a == ((apu) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
