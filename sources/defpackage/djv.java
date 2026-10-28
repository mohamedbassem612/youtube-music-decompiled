package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class djv {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    final /* synthetic */ djw j;

    public djv(djw djwVar, int i, int i2) {
        this.j = djwVar;
        this.a = i;
        this.b = i2;
        b();
    }

    public final int a() {
        return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
    }

    final void b() {
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = this.a; i8 <= this.b; i8++) {
            djw djwVar = this.j;
            int[] iArr = djwVar.a;
            int[] iArr2 = djwVar.b;
            int i9 = iArr[i8];
            i += iArr2[i9];
            int i10 = i9 >> 10;
            int i11 = i9 >> 5;
            int i12 = i9 & 31;
            int i13 = i10 & 31;
            if (i13 > i2) {
                i2 = i13;
            }
            if (i13 < i4) {
                i4 = i13;
            }
            int i14 = i11 & 31;
            if (i14 > i7) {
                i7 = i14;
            }
            if (i14 < i5) {
                i5 = i14;
            }
            if (i12 > i3) {
                i3 = i12;
            }
            if (i12 < i6) {
                i6 = i12;
            }
        }
        this.d = i4;
        this.e = i2;
        this.f = i5;
        this.g = i7;
        this.h = i6;
        this.i = i3;
        this.c = i;
    }

    final boolean c() {
        return (this.b + 1) - this.a > 1;
    }
}
