package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoqt extends aihn implements aiis {
    public static final aoqt a;
    public int b;
    public apji c;
    public int e;
    private byte f = 2;
    public String d = "";

    static {
        aoqt aoqtVar = new aoqt();
        a = aoqtVar;
        aihn.registerDefaultInstance(aoqt.class, aoqtVar);
    }

    private aoqt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", apjs.b});
            case 3:
                return new aoqt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoqt.class);
            default:
                return null;
        }
    }
}
