package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afee {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;

    public afee(float[] fArr, float[] fArr2, int i) {
        int length = fArr.length;
        ahno.F(length % 3 == 0);
        int length2 = fArr2.length;
        ahno.F(1 == ((length2 & 1) ^ 1));
        int i2 = length / 3;
        ahno.F(i2 == (length2 >> 1));
        this.b = i2;
        this.a = i;
        this.c = new abcb(fArr, 3);
        this.d = new abcb(fArr2, 2);
    }

    public final void a() {
        ((abcb) this.c).b();
        ((abcb) this.d).b();
    }

    public afee(afef afefVar, ahto ahtoVar) {
        this.c = new SparseArray();
        this.d = afefVar;
        int[] iArr = afen.a;
        this.a = ahtoVar.z(28, 0);
        this.b = ahtoVar.z(53, 0);
    }
}
