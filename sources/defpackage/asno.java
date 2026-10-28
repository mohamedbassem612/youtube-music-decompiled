package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asno extends aihn implements aiis {
    public static final asno a;
    public int b;
    public Object d;
    public int e;
    public int f;
    public int c = 0;
    private byte g = 2;

    static {
        asno asnoVar = new asno();
        a = asnoVar;
        aihn.registerDefaultInstance(asno.class, asnoVar);
    }

    private asno() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001;\u0000\u0002=\u0000\u0003<\u0000\u0004ဋ\u0000\u0005ဋ\u0001\u0006м\u0000", new Object[]{"d", "c", "b", asnk.class, "e", "f", asnl.class});
            case 3:
                return new asno();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asno.class);
            default:
                return null;
        }
    }
}
