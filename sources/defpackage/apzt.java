package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apzt extends aihn implements aiis {
    public static final apzt a;
    public int b;
    public aivw c;
    private aivf f;
    private byte g = 2;
    public aigj d = aigj.d;
    public aiie e = emptyProtobufList();

    static {
        apzt apztVar = new apzt();
        a = apztVar;
        aihn.registerDefaultInstance(apzt.class, apztVar);
    }

    private apzt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0003ည\u0003\u0005ᐉ\u0004\tЛ", new Object[]{"b", "c", "d", "f", "e", apzs.class});
            case 3:
                return new apzt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apzt.class);
            default:
                return null;
        }
    }
}
