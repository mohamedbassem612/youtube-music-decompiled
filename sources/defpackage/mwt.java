package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mwt implements meu {
    private final /* synthetic */ int $cid;

    public /* synthetic */ mwt(int i) {
        this.$cid = i;
    }

    @Override // defpackage.meu
    public final met a(ByteBuffer byteBuffer) {
        switch (this.$cid) {
            case 0:
                ahuj ahujVar = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mtc(ahujVar);
            case 1:
                aund aundVar = new aund();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aundVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new msz(aundVar);
            case 2:
                aune auneVar = new aune();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                auneVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mtv(auneVar);
            case 3:
                ahuj ahujVar2 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar2.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mtz(ahujVar2);
            case 4:
                ahuj ahujVar3 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar3.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mua(ahujVar3);
            case 5:
                aunf aunfVar = new aunf();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aunfVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new muc(aunfVar);
            case 6:
                ahuj ahujVar4 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar4.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mue(ahujVar4);
            case 7:
                aung aungVar = new aung();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aungVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new muj(aungVar);
            case 8:
                ahuj ahujVar5 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar5.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mul(ahujVar5);
            case 9:
                ahuj ahujVar6 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar6.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mum(ahujVar6);
            case 10:
                ahuj ahujVar7 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar7.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mur(ahujVar7);
            case 11:
                ahuj ahujVar8 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar8.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mut(ahujVar8);
            case 12:
                ahuj ahujVar9 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar9.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new muv(ahujVar9);
            case 13:
                aunh aunhVar = new aunh();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aunhVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new muw(aunhVar);
            case 14:
                ahuj ahujVar10 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar10.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mve(ahujVar10);
            case 15:
                ahuj ahujVar11 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar11.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mvk(ahujVar11);
            case 16:
                ahuj ahujVar12 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar12.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mvl(ahujVar12);
            case 17:
                ahuj ahujVar13 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar13.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mvm(ahujVar13);
            case 18:
                aunj aunjVar = new aunj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aunjVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mvq(aunjVar);
            case 19:
                ahuj ahujVar14 = new ahuj();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                ahujVar14.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mvr(ahujVar14);
            default:
                aunk aunkVar = new aunk();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aunkVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mvs(aunkVar);
        }
    }
}
