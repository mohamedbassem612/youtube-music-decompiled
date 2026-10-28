package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aigm {
    private static volatile int a = 100;
    public static final /* synthetic */ int l = 0;
    int g;
    int h;
    int i = a;
    public int j = Alert.DURATION_SHOW_INDEFINITELY;
    Object k;

    public static int L(int i, InputStream inputStream) throws IOException {
        if ((i & SemanticState.Focused) != 0) {
            i &= 127;
            int i2 = 7;
            while (i2 < 32) {
                int i3 = inputStream.read();
                if (i3 == -1) {
                    throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                i |= (i3 & 127) << i2;
                if ((i3 & SemanticState.Focused) != 0) {
                    i2 += 7;
                }
            }
            while (i2 < 64) {
                int i4 = inputStream.read();
                if (i4 == -1) {
                    throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if ((i4 & SemanticState.Focused) != 0) {
                    i2 += 7;
                }
            }
            throw new aiik("CodedInputStream encountered a malformed varint.");
        }
        return i;
    }

    public static aigm M(byte[] bArr) {
        return O(bArr, 0, bArr.length, false);
    }

    public static aigm N(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? O(aiif.a, 0, 0, false) : new aigl(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static aigm O(byte[] bArr, int i, int i2, boolean z) {
        aigk aigkVar = new aigk(bArr, i, i2, z);
        try {
            aigkVar.f(i2);
            return aigkVar;
        } catch (aiik e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static aigm T(Iterable iterable) {
        return new aigl(new aiil(iterable), SemanticState.Obscured);
    }

    public static aigm U(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return O(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return O(bArr, 0, iRemaining, true);
    }

    public abstract void A(int i);

    public abstract void C(int i);

    public abstract boolean D();

    public abstract boolean E();

    public abstract boolean F(int i);

    public abstract byte[] G();

    public abstract byte[] H(int i);

    public final int K() throws aiik {
        int iK = k();
        P();
        int iF = f(iK);
        this.g++;
        return iF;
    }

    public final void P() throws aiik {
        if (this.g + this.h >= this.i) {
            throw new aiik("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void Q() {
        if (this.h == 0) {
            z(0);
        }
    }

    public final void R(int i) throws aiik {
        z(0);
        this.g--;
        if (d() != 0) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        A(i);
    }

    public final void S() throws aiik {
        boolean zF;
        do {
            int iN = n();
            if (iN == 0) {
                return;
            }
            P();
            this.h++;
            zF = F(iN);
            this.h--;
        } while (zF);
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e();

    public abstract int f(int i);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract long q();

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract aigj w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
