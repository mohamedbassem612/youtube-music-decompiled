package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajth extends aihn implements aiis {
    public static final ajth a;
    public static final aihl b;
    public int c;
    public Object e;
    public ajwo f;
    public int d = 0;
    private byte g = 2;

    static {
        ajth ajthVar = new ajth();
        a = ajthVar;
        aihn.registerDefaultInstance(ajth.class, ajthVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajthVar, ajthVar, null, 166864056, aika.MESSAGE, ajth.class);
    }

    private ajth() {
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
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001;\u0000\u0002:\u0000\u0003ᐉ\u0000\u0004:\u0000\u0005:\u0000", new Object[]{"e", "d", "c", "f"});
            case 3:
                return new ajth();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajth.class);
            default:
                return null;
        }
    }
}
