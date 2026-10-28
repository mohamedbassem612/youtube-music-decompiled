package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqte extends aihn implements aiis {
    public static final aqte a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aqte aqteVar = new aqte();
        a = aqteVar;
        aihn.registerDefaultInstance(aqte.class, aqteVar);
    }

    private aqte() {
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
                return new aqte();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqte.class);
            default:
                return null;
        }
    }
}
