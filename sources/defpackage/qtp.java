package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qtp implements eyw {
    private final /* synthetic */ int $cid;
    final /* synthetic */ omj a;
    final /* synthetic */ ci b;

    public qtp(omj omjVar, ci ciVar, int i) {
        this.$cid = i;
        this.a = omjVar;
        this.b = ciVar;
    }

    @Override // defpackage.eyw
    public final eyv b(eza ezaVar) {
        return this.$cid != 0 ? new ezd(new oae(ezaVar.a(eyl.class, InputStream.class), this.a, this.b, InputStream.class), 3) : new ezd(new oae(ezaVar.a(eyl.class, ByteBuffer.class), this.a, this.b, ByteBuffer.class), 3);
    }

    @Override // defpackage.eyw
    public final void c() {
    }
}
