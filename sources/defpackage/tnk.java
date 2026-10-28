package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tnk implements tnj {
    private volatile agke a;
    private final boolean b;
    private final AtomicBoolean c;

    public tnk(Iterable iterable, boolean z, boolean z2) {
        this.a = agke.j(iterable);
        this.b = z;
        AtomicBoolean atomicBoolean = null;
        if (z && z2) {
            atomicBoolean = new AtomicBoolean(true);
        }
        this.c = atomicBoolean;
    }

    @Override // defpackage.tnj
    public final int a() {
        agke agkeVar = this.a;
        int size = agkeVar.size();
        int iRemaining = 0;
        for (int i = 0; i < size; i++) {
            iRemaining += ((ByteBuffer) agkeVar.get(i)).remaining();
        }
        return iRemaining;
    }

    @Override // defpackage.tnj
    public final aigm b() {
        boolean z = this.b;
        agke agkeVar = this.a;
        return z ? nsi.i(agkeVar) : aigm.T(agkeVar);
    }

    @Override // defpackage.tnj
    public final Iterable c() {
        return this.a;
    }

    @Override // defpackage.tnj
    public final boolean d() {
        AtomicBoolean atomicBoolean = this.c;
        return atomicBoolean != null && atomicBoolean.getAndSet(false);
    }

    @Override // defpackage.tnj
    public final byte[] e() {
        byte[] bArrArray;
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        agke<ByteBuffer> agkeVar = this.a;
        if (!this.b) {
            if (agkeVar.size() == 1) {
                ByteBuffer byteBuffer = (ByteBuffer) agkeVar.get(0);
                if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.limit()) {
                    return byteBuffer.array();
                }
            }
            try {
                byte[] bArrH = aigm.T(agkeVar).H(a());
                this.a = agke.q(ByteBuffer.wrap(bArrH));
                return bArrH;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        agkeVar.getClass();
        ByteBuffer byteBuffer2 = (ByteBuffer) atqq.ae(agkeVar);
        if (byteBuffer2 != null && byteBuffer2.hasArray() && byteBuffer2.arrayOffset() == 0 && byteBuffer2.position() == 0 && byteBuffer2.limit() == byteBuffer2.array().length) {
            bArrArray = byteBuffer2.array();
            bArrArray.getClass();
        } else {
            int iK = nsi.k(agkeVar);
            byte[] bArr = new byte[iK];
            int i = 0;
            for (ByteBuffer byteBuffer3 : agkeVar) {
                if (i == iK) {
                    break;
                }
                int iMin = Math.min(byteBuffer3.remaining(), iK - i);
                if (byteBuffer3.hasArray()) {
                    System.arraycopy(byteBuffer3.array(), byteBuffer3.arrayOffset() + byteBuffer3.position(), bArr, i, iMin);
                } else {
                    byteBuffer3.duplicate().get(bArr, i, iMin).getClass();
                }
                i += iMin;
            }
            if (i != iK) {
                throw new IllegalStateException("Check failed.");
            }
            bArrArray = bArr;
        }
        ByteBuffer byteBuffer4 = agkeVar.size() == 1 ? (ByteBuffer) agkeVar.get(0) : null;
        if (byteBuffer4 == null || !byteBuffer4.hasArray() || bArrArray != byteBuffer4.array()) {
            this.a = agke.q(ByteBuffer.wrap(bArrArray));
        }
        return bArrArray;
    }
}
