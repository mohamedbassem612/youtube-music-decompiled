package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aorn extends aihn implements aiis {
    public static final aorn a;
    public int b;
    public ajnf c;
    public amks d;
    private aorm e;
    private aorl f;
    private byte g = 2;

    static {
        aorn aornVar = new aorn();
        a = aornVar;
        aihn.registerDefaultInstance(aorn.class, aornVar);
    }

    private aorn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uea9eᲧ\uf830㷭\u0004\u0000\u0000\u0004\uea9eᲧᐉ\u0002\ueb11ἑᐉ\u0001\ue917►ᐉ\u0000\uf830㷭ᐉ\u0003", new Object[]{"b", "d", "c", "e", "f"});
            case 3:
                return new aorn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aorn.class);
            default:
                return null;
        }
    }
}
