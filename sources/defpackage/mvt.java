package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mvt extends mff implements ndq {
    private final zh a;

    public mvt(zh zhVar) {
        this.a = zhVar;
    }

    @Override // defpackage.ndq
    public final float ap() {
        zh zhVar = this.a;
        return ((ByteBuffer) zhVar.b).getFloat(zhVar.a);
    }

    @Override // defpackage.ndq
    public final float aq() {
        zh zhVar = this.a;
        return ((ByteBuffer) zhVar.b).getFloat(zhVar.a + 4);
    }

    @Override // defpackage.ndq
    public final boolean ar() {
        return true;
    }

    @Override // defpackage.ndq
    public final boolean as() {
        return true;
    }
}
