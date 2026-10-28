package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amod extends aihn implements aiis {
    public static final amod a;
    public static final aihl b;
    public amqj c;
    private int d;
    private byte e = 2;

    static {
        amod amodVar = new amod();
        a = amodVar;
        aihn.registerDefaultInstance(amod.class, amodVar);
        b = aihn.newSingularGeneratedExtension(apji.a, amodVar, amodVar, null, 1341, aika.MESSAGE, amod.class);
    }

    private amod() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "c"});
            case 3:
                return new amod();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amod.class);
            default:
                return null;
        }
    }
}
