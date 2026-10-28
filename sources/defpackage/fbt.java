package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fbt implements euj {
    private final ByteBuffer a;

    public fbt(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.euj
    public final /* bridge */ /* synthetic */ Object a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.euj
    public final void b() {
    }
}
