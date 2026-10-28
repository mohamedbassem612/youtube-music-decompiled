package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asby extends aihi implements aihj {
    public static final asby a;
    public static final aihl b;
    public static final aihl c;
    public static final aihl d;
    public int e;
    public int f;
    private byte g = 2;

    static {
        asby asbyVar = new asby();
        a = asbyVar;
        aihn.registerDefaultInstance(asby.class, asbyVar);
        b = aihn.newSingularGeneratedExtension(asbx.a, asbyVar, asbyVar, null, 504396738, aika.MESSAGE, asby.class);
        c = aihn.newSingularGeneratedExtension(asca.a, asbyVar, asbyVar, null, 504396739, aika.MESSAGE, asby.class);
        d = aihn.newSingularGeneratedExtension(asbn.a, asbyVar, asbyVar, null, 504396740, aika.MESSAGE, asby.class);
    }

    private asby() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"e", "f"});
            case 3:
                return new asby();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asby.class);
            default:
                return null;
        }
    }
}
