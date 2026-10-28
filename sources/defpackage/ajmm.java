package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajmm extends aihn implements aiis {
    public static final ajmm a;
    public Object c;
    public int b = 0;
    private byte f = 2;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        ajmm ajmmVar = new ajmm();
        a = ajmmVar;
        aihn.registerDefaultInstance(ajmm.class, ajmmVar);
    }

    private ajmm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\"\u0001\u0000\u0001\ue2d7４\u0007\"\u0000\u0002\u0001\u0001\u001a\u0002\u001a\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\uec71㻕м\u0000ﻷ籜<\u0000\uf239缚<\u0000\ue779輆<\u0000\ue17a鄭<\u0000\ue8c6鈳<\u0000\uf646鲵<\u0000\ue62aꗧ<\u0000\ueacc뮸<\u0000\uf126퇣<\u0000\uefc8퉉<\u0000\ue950휥<\u0000\uf40d힇<\u0000塚ퟪ<\u0000\uf369\ue1e4\u0007<\u0000ײַ\uea4c\u0007<\u0000\ue270\uef8b\u0007<\u0000\ue2d7４\u0007<\u0000", new Object[]{"c", "b", "d", "e", akih.class, ajfn.class, akig.class, apuw.class, akhr.class, aqeu.class, amkf.class, ards.class, ajsu.class, aotq.class, aqdi.class, ajau.class, aplg.class, akdm.class, aqug.class, aiqu.class, ajqg.class, aipx.class, ajzq.class, ardt.class, arnx.class, akyw.class, aqjp.class, apck.class, ajmr.class, aotn.class, aowd.class, aoxs.class, aqbf.class, alke.class, ajat.class, ajmx.class});
            case 3:
                return new ajmm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajmm.class);
            default:
                return null;
        }
    }
}
