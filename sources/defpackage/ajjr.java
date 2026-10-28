package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajjr extends aihn implements aiis {
    public static final ajjr a;
    private int b;
    private ajnf c;
    private byte d = 2;

    static {
        ajjr ajjrVar = new ajjr();
        a = ajjrVar;
        aihn.registerDefaultInstance(ajjr.class, ajjrVar);
    }

    private ajjr() {
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
                return new ajjr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajjr.class);
            default:
                return null;
        }
    }
}
