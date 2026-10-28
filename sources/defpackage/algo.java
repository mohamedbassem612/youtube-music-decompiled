package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class algo extends aihn implements aiis {
    public static final algo a;
    public static final aihl b;
    public algu c;
    private int d;
    private byte e = 2;

    static {
        algo algoVar = new algo();
        a = algoVar;
        aihn.registerDefaultInstance(algo.class, algoVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, algoVar, algoVar, null, 327679188, aika.MESSAGE, algo.class);
    }

    private algo() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"d", "c"});
            case 3:
                return new algo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(algo.class);
            default:
                return null;
        }
    }
}
