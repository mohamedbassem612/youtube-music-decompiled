package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxu extends cxp {
    public static final cxt c(bwb bwbVar) {
        String strS = bwbVar.S();
        strS.getClass();
        String strS2 = bwbVar.S();
        strS2.getClass();
        return new cxt(strS, strS2, bwbVar.v(), bwbVar.v(), Arrays.copyOfRange(bwbVar.b, bwbVar.c, bwbVar.d));
    }

    @Override // defpackage.cxp
    protected final bsx b(cxn cxnVar, ByteBuffer byteBuffer) {
        return new bsx(-9223372036854775807L, c(new bwb(byteBuffer.array(), byteBuffer.limit())));
    }
}
