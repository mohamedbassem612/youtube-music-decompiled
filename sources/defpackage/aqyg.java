package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqyg extends aihn implements aiis {
    public static final aqyg a;
    private byte b = 2;

    static {
        aqyg aqygVar = new aqyg();
        a = aqygVar;
        aihn.registerDefaultInstance(aqyg.class, aqygVar);
    }

    private aqyg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new aqyg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqyg.class);
            default:
                return null;
        }
    }
}
