package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqjs extends aihn implements aiis {
    public static final aqjs a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aqjs aqjsVar = new aqjs();
        a = aqjsVar;
        aihn.registerDefaultInstance(aqjs.class, aqjsVar);
    }

    private aqjs() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ueeb9㣉\ueeb9㣉\u0001\u0000\u0000\u0001\ueeb9㣉м\u0000", new Object[]{"c", "b", aqju.class});
            case 3:
                return new aqjs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqjs.class);
            default:
                return null;
        }
    }
}
