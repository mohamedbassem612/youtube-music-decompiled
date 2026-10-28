package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arei extends aihn implements aiis {
    public static final arei a;
    private int b;
    private ajnf c;
    private byte d = 2;

    static {
        arei areiVar = new arei();
        a = areiVar;
        aihn.registerDefaultInstance(arei.class, areiVar);
    }

    private arei() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ueb11ἑ\ueb11ἑ\u0001\u0000\u0000\u0001\ueb11ἑᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new arei();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arei.class);
            default:
                return null;
        }
    }
}
