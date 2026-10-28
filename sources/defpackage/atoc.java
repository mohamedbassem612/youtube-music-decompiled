package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atoc extends mew implements mes {
    public boolean d;

    public atoc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(nor.a);
        this.d = false;
    }

    public final void aR(mep mepVar, mew mewVar) {
        mewVar.getClass();
        if (this.d) {
            this.d = false;
            bG();
        }
        bM(mepVar, mewVar);
    }

    public final void aS(mep mepVar, mew mewVar) {
        if (this.d) {
            this.d = false;
            bG();
        }
        bM(mepVar, mewVar);
    }

    public final mew aT() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        return new mew(this.b, (char[][]) null);
    }

    public final void aU(mep mepVar, mew mewVar) {
        mewVar.getClass();
        if (this.d) {
            this.d = false;
            bG();
        }
        bM(mepVar, mewVar);
    }

    public final mew aV() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        return new mew(this.b, (float[]) null);
    }

    public final void aW() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    public atoc(char[] cArr, byte[] bArr) {
        super((char[][]) null);
        this.d = false;
    }

    public atoc(char[] cArr) {
        super((byte[]) null);
        this.d = false;
    }

    public atoc(byte[] bArr, byte[] bArr2) {
        super((int[]) null);
        this.d = false;
    }

    public atoc(byte[] bArr) {
        super((short[]) null);
        this.d = false;
    }

    public atoc() {
        super((boolean[]) null);
        this.d = false;
    }
}
