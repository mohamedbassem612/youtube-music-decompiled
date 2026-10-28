package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammj extends aihn implements aiis {
    public static final ammj a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ammj ammjVar = new ammj();
        a = ammjVar;
        aihn.registerDefaultInstance(ammj.class, ammjVar);
    }

    private ammj() {
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
                return newMessageInfo(a, "\u0004\u0001\u0001\u0000ﴸ㟮ﴸ㟮\u0001\u0000\u0000\u0001ﴸ㟮м\u0000", new Object[]{"c", "b", ampd.class});
            case 3:
                return new ammj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ammj.class);
            default:
                return null;
        }
    }
}
