package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anrs extends aihn implements aiis {
    public static final anrs a;
    public int b;
    public alay d;
    public alay e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        anrs anrsVar = new anrs();
        a = anrsVar;
        aihn.registerDefaultInstance(anrs.class, anrsVar);
    }

    private anrs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"b", "c", apji.class, "d", "e"});
            case 3:
                return new anrs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anrs.class);
            default:
                return null;
        }
    }
}
