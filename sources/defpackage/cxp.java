package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cxp implements cxm {
    @Override // defpackage.cxm
    public final bsx a(cxn cxnVar) {
        ByteBuffer byteBuffer = cxnVar.data;
        byteBuffer.getClass();
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        ahno.F(z);
        return b(cxnVar, byteBuffer);
    }

    protected abstract bsx b(cxn cxnVar, ByteBuffer byteBuffer);
}
