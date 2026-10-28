package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mol {
    public int a = 0;
    public boolean b;
    public boolean c;
    public boolean d;

    public mol(byte[] bArr) {
    }

    public final void a() {
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
    }

    public final cfq b() {
        if (this.b || !(this.d || this.c)) {
            return new cfq(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
