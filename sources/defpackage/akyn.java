package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akyn extends aihn implements aiis {
    public static final akyn a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private ajwo f;
    private ajng g;
    private byte h = 2;

    static {
        akyn akynVar = new akyn();
        a = akynVar;
        aihn.registerDefaultInstance(akyn.class, akynVar);
    }

    private akyn() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0005\u0001ᐉ\u0001\u0004ᐉ\u0000\u0007ᐉ\u0007\bᐉ\u0002\nᐉ\u0005", new Object[]{"b", "d", "c", "g", "e", "f"});
            case 3:
                return new akyn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akyn.class);
            default:
                return null;
        }
    }
}
