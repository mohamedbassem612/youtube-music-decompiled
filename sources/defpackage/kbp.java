package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kbp {
    public int a;
    public int b;

    public kbp() {
        this.a = 0;
        this.b = -1;
    }

    public final amp a() {
        if (this.a == 0) {
            this.a = kbk.a(this.b);
        }
        return new amp(this.b);
    }

    public kbp(byte[] bArr) {
    }
}
