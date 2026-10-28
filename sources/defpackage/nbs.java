package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nbs implements meu {
    private final /* synthetic */ int $cid;

    public /* synthetic */ nbs(int i) {
        this.$cid = i;
    }

    @Override // defpackage.meu
    public final met a(ByteBuffer byteBuffer) {
        int i = this.$cid;
        if (i == 0) {
            ahuj ahujVar = new ahuj();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            ahujVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
            return new mvb(ahujVar);
        }
        if (i == 1) {
            ahuj ahujVar2 = new ahuj();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            ahujVar2.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
            return new mva(ahujVar2);
        }
        if (i == 2) {
            ahuj ahujVar3 = new ahuj();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            ahujVar3.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
            return new mvc(ahujVar3);
        }
        if (i != 3) {
            ahuj ahujVar4 = new ahuj();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            ahujVar4.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
            return new mwk(ahujVar4);
        }
        ahuj ahujVar5 = new ahuj();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        ahujVar5.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return new mvd(ahujVar5);
    }
}
