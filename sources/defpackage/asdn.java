package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asdn extends aihn implements aiis {
    public static final asdn a;
    private byte c = 2;
    public aiie b = emptyProtobufList();

    static {
        asdn asdnVar = new asdn();
        a = asdnVar;
        aihn.registerDefaultInstance(asdn.class, asdnVar);
    }

    private asdn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", aneh.class});
            case 3:
                return new asdn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asdn.class);
            default:
                return null;
        }
    }
}
