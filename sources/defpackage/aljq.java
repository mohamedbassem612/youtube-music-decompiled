package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aljq extends aihn implements aiis {
    public static final aljq a;
    private int c;
    private apji d;
    private apji e;
    private ajwo f;
    private alzx g;
    private ajwo h;
    private apji i;
    private byte j = 2;
    public aiie b = emptyProtobufList();

    static {
        aljq aljqVar = new aljq();
        a = aljqVar;
        aihn.registerDefaultInstance(aljq.class, aljqVar);
    }

    private aljq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0007\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"c", "b", apji.class, "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aljq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aljq.class);
            default:
                return null;
        }
    }
}
