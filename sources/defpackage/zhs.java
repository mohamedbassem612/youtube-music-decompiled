package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zhs extends chf {
    private long a;
    private byte[] b;
    private boolean c;
    private final zht d;

    public zhs(cgf cgfVar, zht zhtVar) {
        super(cgfVar);
        this.b = new byte[0];
        this.c = false;
        this.d = zhtVar;
    }

    @Override // defpackage.chf, defpackage.cgf
    public final boolean E(ByteBuffer byteBuffer, long j, int i) {
        if (this.c && this.a != j) {
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            int iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            byte[] bArr = this.b;
            if (bArr == null || bArr.length < iRemaining) {
                bArr = new byte[iRemaining];
                this.b = bArr;
            }
            byteBufferAsReadOnlyBuffer.get(bArr, 0, iRemaining);
            zht zhtVar = this.d;
            c(false);
            zhtVar.c();
            this.a = j;
        }
        return super.E(byteBuffer, j, i);
    }

    @Override // defpackage.chf, defpackage.cgf
    public final void g(cfz cfzVar) {
        this.c = this.d.b();
        super.g(cfzVar);
    }

    @Override // defpackage.chf, defpackage.cgf
    public final void i() {
        this.d.a();
        super.i();
    }

    @Override // defpackage.chf, defpackage.cgf
    public final void y(btb btbVar) {
        if (this.c) {
            zht zhtVar = this.d;
            float f = d().b;
            float f2 = btbVar.b;
            zhtVar.d();
        }
        super.y(btbVar);
    }
}
