package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wkr {
    public volatile boolean a;

    public wkr() {
        this.a = true;
    }

    public final void a() {
        this.a = false;
    }

    public final void b() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }

    public wkr(byte[] bArr) {
    }
}
