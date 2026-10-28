package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class exx implements exv {
    private final /* synthetic */ int $cid;

    public exx(int i) {
        this.$cid = i;
    }

    @Override // defpackage.exv
    public final Class a() {
        return this.$cid != 0 ? ByteBuffer.class : InputStream.class;
    }

    @Override // defpackage.exv
    public final /* synthetic */ Object b(byte[] bArr) {
        return this.$cid != 0 ? ByteBuffer.wrap(bArr) : new ByteArrayInputStream(bArr);
    }
}
