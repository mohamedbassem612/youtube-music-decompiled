package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mup extends mff implements nal {
    private final zh a;

    public mup(zh zhVar) {
        this.a = zhVar;
    }

    @Override // defpackage.nal
    public final float co() {
        zh zhVar = this.a;
        return ((ByteBuffer) zhVar.b).getFloat(zhVar.a);
    }

    @Override // defpackage.nal
    public final boolean g() {
        return true;
    }

    @Override // defpackage.nal
    public final boolean h() {
        return true;
    }

    @Override // defpackage.nal
    public final int i() {
        zh zhVar = this.a;
        int iAS = a.aS(((ByteBuffer) zhVar.b).getInt(zhVar.a + 4));
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }
}
