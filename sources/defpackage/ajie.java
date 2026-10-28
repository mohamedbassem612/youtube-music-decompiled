package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajie extends aihn implements aiis {
    public static final ajie a;
    private int b;
    private alay c;
    private apji d;
    private ajwo e;
    private ajwo f;
    private byte g = 2;

    static {
        ajie ajieVar = new ajie();
        a = ajieVar;
        aihn.registerDefaultInstance(ajie.class, ajieVar);
    }

    private ajie() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajie();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajie.class);
            default:
                return null;
        }
    }
}
