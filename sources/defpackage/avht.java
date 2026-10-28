package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avht {
    public int b;
    public final avjz f;
    public boolean g;
    public int h;
    public long j;
    public axst k;
    private final avhs l;
    public int a = -1;
    public auyz c = auyx.a;
    public final avhr d = new avhr(this);
    public final ByteBuffer e = ByteBuffer.allocate(5);
    public int i = -1;

    public avht(avhs avhsVar, avjz avjzVar) {
        this.l = avhsVar;
        this.f = avjzVar;
    }

    public final void a(boolean z, boolean z2) {
        axst axstVar = this.k;
        this.k = null;
        this.l.q(axstVar, z, z2);
        this.h = 0;
    }

    public final void b(avhq avhqVar, boolean z) {
        List list = avhqVar.a;
        Iterator it = list.iterator();
        int iG = 0;
        while (it.hasNext()) {
            iG += ((axst) it.next()).g();
        }
        int i = this.a;
        if (i >= 0 && iG > i) {
            throw new avcg(Status.h.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iG), Integer.valueOf(this.a))));
        }
        ByteBuffer byteBuffer = this.e;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iG);
        axst axstVarS = avjt.s(5);
        axstVarS.i(byteBuffer.array(), 0, byteBuffer.position());
        if (iG == 0) {
            this.k = axstVarS;
            return;
        }
        avhs avhsVar = this.l;
        avhsVar.q(axstVarS, false, false);
        this.h = 1;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            avhsVar.q((axst) list.get(i2), false, false);
        }
        this.k = (axst) list.get(list.size() - 1);
        this.j = iG;
    }

    public final void c(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            axst axstVar = this.k;
            if (axstVar != null && axstVar.h() == 0) {
                a(false, false);
            }
            if (this.k == null) {
                ahno.P(this.b > 0, "knownLengthPendingAllocation reached 0");
                axst axstVarS = avjt.s(this.b);
                this.k = axstVarS;
                int i3 = this.b;
                this.b = i3 - Math.min(i3, axstVarS.h());
            }
            int iMin = Math.min(i2, this.k.h());
            this.k.i(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }
}
