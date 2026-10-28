package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class albw extends aihn implements aiis {
    public static final albw a;
    private int b;
    private alay c;
    private ajwo d;
    private ajng e;
    private ajng f;
    private byte g = 2;

    static {
        albw albwVar = new albw();
        a = albwVar;
        aihn.registerDefaultInstance(albw.class, albwVar);
    }

    private albw() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new albw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albw.class);
            default:
                return null;
        }
    }
}
