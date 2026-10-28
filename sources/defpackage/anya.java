package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anya extends aihn implements aiis {
    public static final anya a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        anya anyaVar = new anya();
        a = anyaVar;
        aihn.registerDefaultInstance(anya.class, anyaVar);
    }

    private anya() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ueb11ἑ\ueb11ἑ\u0001\u0000\u0000\u0001\ueb11ἑм\u0000", new Object[]{"c", "b", ajnf.class});
            case 3:
                return new anya();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anya.class);
            default:
                return null;
        }
    }
}
