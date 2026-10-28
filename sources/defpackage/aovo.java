package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aovo extends aihn implements aiis {
    public static final aovo a;
    private int b;
    private apji c;
    private alay d;
    private alay e;
    private alay f;
    private apji g;
    private byte h = 2;

    static {
        aovo aovoVar = new aovo();
        a = aovoVar;
        aihn.registerDefaultInstance(aovo.class, aovoVar);
    }

    private aovo() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0004\u0005ᐉ\u0002\u0006ᐉ\u0003", new Object[]{"b", "c", "d", "g", "e", "f"});
            case 3:
                return new aovo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovo.class);
            default:
                return null;
        }
    }
}
