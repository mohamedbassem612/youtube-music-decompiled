package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alno extends aihn implements aiis {
    public static final alno a;
    private int b;
    private askp c;
    private byte d = 2;

    static {
        alno alnoVar = new alno();
        a = alnoVar;
        aihn.registerDefaultInstance(alno.class, alnoVar);
    }

    private alno() {
        emptyIntList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u000144\u0001\u0000\u0000\u00014ᐉ\u0007", new Object[]{"b", "c"});
            case 3:
                return new alno();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alno.class);
            default:
                return null;
        }
    }
}
