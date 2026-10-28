package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asjs extends aihn implements aiis {
    public static final asjs a;
    private int b;
    private apve c;
    private byte d = 2;

    static {
        asjs asjsVar = new asjs();
        a = asjsVar;
        aihn.registerDefaultInstance(asjs.class, asjsVar);
    }

    private asjs() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007ᐉ\u0002", new Object[]{"b", "c"});
            case 3:
                return new asjs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asjs.class);
            default:
                return null;
        }
    }
}
