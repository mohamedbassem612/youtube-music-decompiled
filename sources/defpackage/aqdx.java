package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqdx extends aihn implements aiis {
    public static final aqdx a;
    private int b;
    private apji c;
    private byte d = 2;

    static {
        aqdx aqdxVar = new aqdx();
        a = aqdxVar;
        aihn.registerDefaultInstance(aqdx.class, aqdxVar);
    }

    private aqdx() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqdx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqdx.class);
            default:
                return null;
        }
    }
}
