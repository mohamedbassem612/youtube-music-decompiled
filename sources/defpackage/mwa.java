package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mwa extends mff implements neh {
    private final zh a;

    public mwa(zh zhVar) {
        this.a = zhVar;
    }

    @Override // defpackage.neh
    public final float cf() {
        zh zhVar = this.a;
        return ((ByteBuffer) zhVar.b).getFloat(zhVar.a);
    }

    @Override // defpackage.neh
    public final boolean cm() {
        return true;
    }

    @Override // defpackage.neh
    public final float g() {
        zh zhVar = this.a;
        return ((ByteBuffer) zhVar.b).getFloat(zhVar.a + 4);
    }

    @Override // defpackage.neh
    public final boolean h() {
        return true;
    }
}
