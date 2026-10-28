package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxr implements byc {
    private final byc a;
    private final byte[] b;
    private final byte[] c;
    private bxt d;

    public bxr(byte[] bArr, byc bycVar, byte[] bArr2) {
        this.a = bycVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.byc
    public final void a() {
        this.d = null;
        this.a.a();
    }

    @Override // defpackage.byc
    public final void b(byi byiVar) {
        this.a.b(byiVar);
        this.d = new bxt(1, this.b, byiVar.j, byiVar.h + byiVar.b);
    }

    @Override // defpackage.byc
    public final void c(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            byte[] bArr2 = this.c;
            int iMin = Math.min(i2 - i3, bArr2.length);
            bxt bxtVar = this.d;
            int i4 = bwp.a;
            byte[] bArr3 = bArr;
            bxtVar.a(bArr3, i + i3, iMin, bArr2, 0);
            this.a.c(bArr2, 0, iMin);
            i3 += iMin;
            bArr = bArr3;
        }
    }
}
