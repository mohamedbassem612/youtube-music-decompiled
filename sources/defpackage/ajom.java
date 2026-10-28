package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajom extends aihn implements aiis {
    public static final ajom a;
    public aopz b;
    private int c;
    private aopv d;
    private byte e = 2;

    static {
        ajom ajomVar = new ajom();
        a = ajomVar;
        aihn.registerDefaultInstance(ajom.class, ajomVar);
    }

    private ajom() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ufdd2ត\uee01ᢝ\u0002\u0000\u0000\u0002\ufdd2តᐉ\u0000\uee01ᢝᐉ\u0001", new Object[]{"c", "d", "b"});
            case 3:
                return new ajom();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajom.class);
            default:
                return null;
        }
    }
}
