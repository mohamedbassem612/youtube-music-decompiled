package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqeg extends aihn implements aiis {
    public static final aqeg a;
    public int b;
    public Object d;
    public alop e;
    public ajwo f;
    private albe g;
    public int c = 0;
    private byte h = 2;

    static {
        aqeg aqegVar = new aqeg();
        a = aqegVar;
        aihn.registerDefaultInstance(aqeg.class, aqegVar);
    }

    private aqeg() {
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
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001̉\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002м\u0000\u0003м\u0000\u0004ᐉ\u0001̉ᐉ\u0002", new Object[]{"d", "c", "b", "e", aqeh.class, aqee.class, "f", "g"});
            case 3:
                return new aqeg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqeg.class);
            default:
                return null;
        }
    }
}
