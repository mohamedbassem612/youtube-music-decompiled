package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxy implements nso {
    public static final nxy a = new nxy();

    @Override // defpackage.nso
    public final nay a(byte[] bArr, boolean z) {
        throw new UnsupportedOperationException("Flatbuffers are no longer supported");
    }

    @Override // defpackage.nso
    public final ByteBuffer b(nay nayVar) {
        nds ndsVarI = nayVar.m() ? nayVar.i() : null;
        if (ndsVarI == null) {
            return null;
        }
        agke agkeVarAF = ksy.aF(ndsVarI, 287553821);
        if (agkeVarAF.isEmpty()) {
            return null;
        }
        return (ByteBuffer) agkeVarAF.get(0);
    }

    @Override // defpackage.nso
    public final mxc c(mxc mxcVar) {
        throw new UnsupportedOperationException();
    }
}
