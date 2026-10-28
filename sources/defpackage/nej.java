package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nej implements meu {
    private final /* synthetic */ int $cid;

    public /* synthetic */ nej(int i) {
        this.$cid = i;
    }

    @Override // defpackage.meu
    public final met a(ByteBuffer byteBuffer) {
        int i = this.$cid;
        if (i == 0) {
            aunl aunlVar = new aunl();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            aunlVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
            return new mwc(aunlVar);
        }
        if (i == 1) {
            ahuj ahujVar = new ahuj();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            ahujVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
            return new mvz(ahujVar);
        }
        if (i != 2) {
            aunm aunmVar = new aunm();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            aunmVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
            return new mwh(aunmVar);
        }
        ahuj ahujVar2 = new ahuj();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        ahujVar2.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return new mwe(ahujVar2);
    }
}
