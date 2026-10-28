package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class mfg implements meq {
    private static final int[] a = new int[0];
    private final int b;
    private final int c;
    private final ByteBuffer d;
    private met e;

    public mfg(ahuj ahujVar) {
        this.b = ahujVar.k();
        this.c = ahujVar.l();
        this.d = ahujVar.g(6) == null ? ByteBuffer.allocate(0) : ahujVar.g(6).slice();
        this.e = null;
    }

    @Override // defpackage.meq
    public final int a() {
        return this.b;
    }

    @Override // defpackage.meq
    public final agke b(int i) {
        if (this.b != i) {
            return agpi.a;
        }
        if (this.e == null) {
            return agke.q(this.d);
        }
        throw new IllegalArgumentException(getClass().getSimpleName() + ": field number " + i + " is a previously retrieved extension.");
    }

    @Override // defpackage.meq
    public final int[] c() {
        int i = this.b;
        return i != 0 ? new int[]{i} : a;
    }

    @Override // defpackage.mes
    public final met d(mep mepVar) {
        if (!e(mepVar)) {
            return null;
        }
        met metVarA = this.e;
        if (metVarA == null) {
            metVarA = mepVar.b.a(this.d);
            this.e = metVarA;
        }
        return mepVar.b(metVarA);
    }

    @Override // defpackage.mes
    public final boolean e(mep mepVar) {
        return this.c == 1 && this.b == mepVar.a;
    }

    @Override // defpackage.met
    public final byte[] f() {
        if (this.c != 2) {
            throw new UnsupportedOperationException("Cannot serialize to proto bytes for ".concat(String.valueOf(getClass().getSimpleName())));
        }
        int i = this.b;
        if (i == 0) {
            return new byte[0];
        }
        ByteBuffer byteBuffer = this.d;
        int i2 = i << 3;
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2) * 9;
        int iCapacity = byteBuffer.capacity();
        byte[] bArr = new byte[((352 - iNumberOfLeadingZeros) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iCapacity) * 9)) >>> 6) + iCapacity];
        aigs aigsVarO = aigs.O(bArr);
        try {
            ((aigo) aigsVarO).y(i2 | 2);
            ((aigo) aigsVarO).y(byteBuffer.capacity());
            if (byteBuffer.hasArray()) {
                ((aigo) aigsVarO).g(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            } else {
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.clear();
                ((aigo) aigsVarO).f(byteBufferDuplicate);
            }
            aigsVarO.d();
            return bArr;
        } catch (IOException e) {
            throw new IllegalStateException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
