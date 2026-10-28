package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aozz extends aihn implements aiis {
    public static final aozz a;
    private int b;
    private apji c;
    private apji d;
    private ajwo e;
    private ajwo f;
    private alay g;
    private byte h = 2;

    static {
        aozz aozzVar = new aozz();
        a = aozzVar;
        aihn.registerDefaultInstance(aozz.class, aozzVar);
    }

    private aozz() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aozz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aozz.class);
            default:
                return null;
        }
    }
}
