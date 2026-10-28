package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class askx extends aihn implements aiis {
    public static final askx a;
    public static final aihl b;
    public int c;
    private aspe d;
    private String e;
    private byte f = 2;

    static {
        askx askxVar = new askx();
        a = askxVar;
        aihn.registerDefaultInstance(askx.class, askxVar);
        b = aihn.newSingularGeneratedExtension(asmf.a, askxVar, askxVar, null, 512985100, aika.MESSAGE, askx.class);
    }

    private askx() {
        emptyProtobufList();
        this.e = "";
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ለ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new askx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(askx.class);
            default:
                return null;
        }
    }
}
