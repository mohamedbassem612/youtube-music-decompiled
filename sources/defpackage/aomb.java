package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aomb extends aihn implements aiis {
    public static final aomb a;
    public static final aihl b;
    public int c;
    public apji d;
    public alay e;
    public boolean f;
    private byte g = 2;

    static {
        aomb aombVar = new aomb();
        a = aombVar;
        aihn.registerDefaultInstance(aomb.class, aombVar);
        b = aihn.newSingularGeneratedExtension(apji.a, aombVar, aombVar, null, 310393920, aika.MESSAGE, aomb.class);
    }

    private aomb() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aomb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aomb.class);
            default:
                return null;
        }
    }
}
