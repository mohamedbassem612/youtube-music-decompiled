package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class zh {
    public int a;
    public Object b;

    public zh(imk imkVar) {
        this.b = Optional.empty();
        this.a = imkVar.b;
        this.b = imkVar.a;
    }

    public final long a(int i) {
        if (i >= 0 && i < this.a) {
            return ((long[]) this.b)[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
    }

    public final void b(long j) {
        int i = this.a;
        long[] jArr = (long[]) this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i << 1);
        }
        Object obj = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        ((long[]) obj)[i2] = j;
    }

    public final void c(long[] jArr) {
        int i = this.a;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = (long[]) this.b;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.b = Arrays.copyOf(jArr2, Math.max(length2 << 1, i2));
        }
        System.arraycopy(jArr, 0, this.b, this.a, length);
        this.a = i2;
    }

    public final imk d() {
        int i = this.a;
        if (i != 0) {
            return new imk(i, (Optional) this.b);
        }
        throw new IllegalStateException("Missing required properties: displaySurface");
    }

    public final void e(imj imjVar) {
        this.b = Optional.of(imjVar);
    }

    public final aroc f() {
        return (aroc) g().build();
    }

    public final aihf g() {
        aihf aihfVarCreateBuilder = aroc.a.createBuilder();
        Object obj = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        aroc arocVar = (aroc) aihfVarCreateBuilder.instance;
        obj.getClass();
        arocVar.b |= 1;
        arocVar.c = (aigj) obj;
        int i = this.a;
        int i2 = i != 0 ? i : 1;
        aihfVarCreateBuilder.copyOnWrite();
        aroc arocVar2 = (aroc) aihfVarCreateBuilder.instance;
        arocVar2.d = i2 - 1;
        arocVar2.b |= 2;
        return aihfVarCreateBuilder;
    }

    public final void h() {
        this.b = null;
        this.a = 0;
    }

    public final void i(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer == null) {
            i = 0;
        }
        this.a = i;
    }

    public final ahbp j() {
        if (this.a == 0) {
            return ahbp.a;
        }
        return new ahbp((long[]) this.b, this.a);
    }

    public final void k(long j) {
        int i = this.a;
        int i2 = i + 1;
        long[] jArr = (long[]) this.b;
        int length = jArr.length;
        if (i2 > length) {
            int iHighestOneBit = length + (length >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i) << 1;
            }
            if (iHighestOneBit < 0) {
                iHighestOneBit = Alert.DURATION_SHOW_INDEFINITELY;
            }
            this.b = Arrays.copyOf(jArr, iHighestOneBit);
        }
        Object obj = this.b;
        int i3 = this.a;
        ((long[]) obj)[i3] = j;
        this.a = i3 + 1;
    }

    public final zfe l() {
        return new zfe((String) this.b, this.a);
    }

    public final void m(String str) {
        this.b = str;
        this.a = str == null ? 1 : 2;
    }

    public final aroj n() {
        return (aroj) o().build();
    }

    public final aihf o() {
        aihf aihfVarCreateBuilder = aroj.a.createBuilder();
        Object obj = this.b;
        if (obj != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aroj arojVar = (aroj) aihfVarCreateBuilder.instance;
            arojVar.b |= 1;
            arojVar.c = (aigj) obj;
        }
        int i = this.a;
        if (i != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            aroj arojVar2 = (aroj) aihfVarCreateBuilder.instance;
            arojVar2.d = i - 1;
            arojVar2.b |= 2;
        }
        return aihfVarCreateBuilder;
    }

    public final arog p() {
        return (arog) q().build();
    }

    public final aihf q() {
        aihf aihfVarCreateBuilder = arog.a.createBuilder();
        Object obj = this.b;
        if (obj != null) {
            aihfVarCreateBuilder.copyOnWrite();
            arog arogVar = (arog) aihfVarCreateBuilder.instance;
            arogVar.b |= 1;
            arogVar.c = (aigj) obj;
        }
        int i = this.a;
        if (i != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            arog arogVar2 = (arog) aihfVarCreateBuilder.instance;
            arogVar2.d = i - 1;
            arogVar2.b |= 2;
        }
        return aihfVarCreateBuilder;
    }

    public zh(AutoCloseable autoCloseable) {
        this.b = autoCloseable;
    }

    public zh(byte[] bArr) {
    }

    public zh(byte[] bArr, byte[] bArr2) {
        this.a = 0;
    }

    public zh(byte[] bArr, char[] cArr) {
        this.a = 1;
    }

    public zh() {
        this.b = Optional.empty();
    }

    public zh(int i) {
        this.b = new long[i];
    }

    public zh(int i, byte[] bArr) {
        this.a = 0;
        this.b = new long[i];
    }
}
