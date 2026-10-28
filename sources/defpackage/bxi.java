package defpackage;

import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bxi {
    public int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public bxi(ap apVar) {
        this.e = new ArrayList();
        this.c = apVar.w;
        this.b = apVar.x;
        this.a = apVar.h();
        this.d = apVar.d();
        ArrayList arrayList = apVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ao aoVar = (ao) arrayList.get(i);
            ((ArrayList) this.e).add(new as(aoVar));
        }
    }

    private final void j() {
        int i;
        int i2 = this.c;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.a) || (i2 == i && this.d == 0))) {
            z = true;
        }
        ahno.O(z);
    }

    private final boolean k(int i) {
        int i2 = i - 2;
        if (this.b <= i2 && i < this.a) {
            byte[] bArr = (byte[]) this.e;
            if (bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final int a(int i) {
        int i2;
        this.d += i;
        int i3 = 0;
        while (true) {
            i2 = this.d;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.d = i5;
            Object obj = this.e;
            int i6 = this.c;
            i3 |= (((byte[]) obj)[i6] & 255) << i5;
            if (true != k(i6 + 1)) {
                i4 = 1;
            }
            this.c = i6 + i4;
        }
        Object obj2 = this.e;
        int i7 = this.c;
        int i8 = i3 | ((((byte[]) obj2)[i7] & 255) >> (8 - i2));
        int i9 = 32 - i;
        if (i2 == 8) {
            this.d = 0;
            this.c = i7 + (true != k(i7 + 1) ? 1 : 2);
        }
        int i10 = i8 & ((-1) >>> i9);
        j();
        return i10;
    }

    public final int b() {
        int i = 0;
        while (!g()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? a(i) : 0);
    }

    public final void c() {
        int i = this.d;
        if (i > 0) {
            e(8 - i);
        }
    }

    public final void d() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            int i2 = this.c;
            this.c = i2 + (true == k(i2 + 1) ? 2 : 1);
        }
        j();
    }

    public final void e(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 << 3));
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                j();
                return;
            } else if (k(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }

    public final boolean f(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 << 3);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.a) {
                break;
            }
            if (k(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.a;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public final boolean g() {
        int i = ((byte[]) this.e)[this.c] & (SemanticState.Focused >> this.d);
        d();
        return i != 0;
    }

    public final long h() {
        int i = this.a;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.e;
        int i2 = this.d;
        long j = ((long[]) obj)[i2];
        this.d = (i2 + 1) & this.b;
        this.a = i - 1;
        return j;
    }

    public final boolean i() {
        return this.a == 0;
    }

    public bxi() {
        this.d = 0;
        this.c = -1;
        this.a = 0;
        long[] jArr = new long[16];
        this.e = jArr;
        this.b = jArr.length - 1;
    }

    public bxi(byte[] bArr, int i, int i2) {
        this.e = bArr;
        this.b = i;
        this.c = i;
        this.a = i2;
        this.d = 0;
        j();
    }
}
