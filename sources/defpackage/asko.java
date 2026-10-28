package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asko extends aihi implements aihj {
    public static final asko a;
    public int b;
    public int c;
    public int d;
    public asmv e;
    public int f;
    private byte g = 2;

    static {
        asko askoVar = new asko();
        a = askoVar;
        aihn.registerDefaultInstance(asko.class, askoVar);
    }

    private asko() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဋ\u0000\u0002ဋ\u0001\u0003ᐉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", asel.k});
            case 3:
                return new asko();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asko.class);
            default:
                return null;
        }
    }
}
