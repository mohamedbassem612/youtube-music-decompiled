package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zja extends ziq {
    private final byte[] a;
    private int b;
    private int c;

    public zja(bye byeVar, int i) {
        super(byeVar);
        this.a = new byte[i];
    }

    @Override // defpackage.ziq, defpackage.brv
    public int a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        ahno.O(this.c <= this.b);
        int i4 = this.c;
        int iA = this.b;
        if (i4 == iA) {
            byte[] bArr2 = this.a;
            int length = bArr2.length;
            if (i2 >= length) {
                return super.a(bArr, i, i2);
            }
            iA = super.a(bArr2, 0, length);
            this.b = iA;
            if (iA < 0) {
                return -1;
            }
            this.c = 0;
        } else {
            i3 = i4;
        }
        byte[] bArr3 = this.a;
        int iMin = Math.min(i2, iA - i3);
        System.arraycopy(bArr3, this.c, bArr, i, iMin);
        this.c += iMin;
        return iMin;
    }

    @Override // defpackage.ziq, defpackage.bye
    public long b(byi byiVar) {
        this.b = 0;
        this.c = 0;
        return super.b(byiVar);
    }
}
