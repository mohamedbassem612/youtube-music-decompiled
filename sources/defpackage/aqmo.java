package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqmo extends aihn implements aiis {
    public static final aqmo a;
    private int b;
    private ajwo c;
    private ajwo d;
    private byte e = 2;

    static {
        aqmo aqmoVar = new aqmo();
        a = aqmoVar;
        aihn.registerDefaultInstance(aqmo.class, aqmoVar);
    }

    private aqmo() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\n\u0002\u0000\u0000\u0002\u0004ᐉ\n\nᐉ\t", new Object[]{"b", "d", "c"});
            case 3:
                return new aqmo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqmo.class);
            default:
                return null;
        }
    }
}
