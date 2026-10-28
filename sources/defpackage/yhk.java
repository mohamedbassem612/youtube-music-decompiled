package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class yhk {
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public yhk(int i, boolean z) {
        this.a = i;
        this.b = z;
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = this.b ? new byte[32768] : new byte[0];
        }
        this.c = bArr;
        int i3 = this.a;
        AtomicBoolean[] atomicBooleanArr = new AtomicBoolean[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            atomicBooleanArr[i4] = new AtomicBoolean(false);
        }
        this.d = atomicBooleanArr;
        this.e = new AtomicInteger(0);
    }

    public yhk(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        ahno.F((i == 0) ^ (bArr2 == null));
        this.b = z;
        this.d = str;
        this.a = i;
        this.c = bArr2;
        this.e = new cwi(rpi.F(str), bArr, i2, i3);
    }

    public yhk(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2, byte[] bArr3) {
        ahno.F((i == 0) ^ (bArr2 == null));
        this.b = z;
        this.d = str;
        this.a = i;
        this.c = bArr2;
        this.e = new cwi(rpi.F(str), bArr, i2, i3);
    }
}
