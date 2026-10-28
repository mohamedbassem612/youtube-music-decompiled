package defpackage;

import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tkl extends tmn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkl(String str) {
        super(1, str, null);
        str.getClass();
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        tnmVar.getClass();
        try {
            ByteBuffer byteBufferPut = ByteBuffer.allocateDirect(tnmVar.e().length).put(tnmVar.e());
            byteBufferPut.getClass();
            byteBufferPut.flip();
            return tnx.e(byteBufferPut);
        } catch (Exception e) {
            return tnx.d(new tnp(e));
        }
    }

    @Override // defpackage.tns
    public final Class ab() {
        return ByteBuffer.class;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final String ac() {
        return "application/octet-stream";
    }

    @Override // defpackage.tns
    public final /* synthetic */ void ad(Object obj) {
        ((ByteBuffer) obj).getClass();
    }

    @Override // defpackage.tmn, defpackage.tns
    public final byte[] ae() {
        return null;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final Map e() {
        return awnp.a;
    }
}
