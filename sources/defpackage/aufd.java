package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufd extends aihn implements aiis {
    public static final aufd a;
    public int b;
    public Object d;
    public Object f;
    public apsr g;
    public aufh h;
    public long i;
    public int c = 0;
    public int e = 0;
    private byte j = 2;

    static {
        aufd aufdVar = new aufd();
        a = aufdVar;
        aihn.registerDefaultInstance(aufd.class, aufdVar);
    }

    private aufd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0002\u0001\u0001ϩ\b\u0000\u0000\u0002\u0001ဉ\u0000\u0002м\u0000\u0003<\u0000\u0004ဉ\u0001\u0005<\u0000\u0006ဂ\u0002Ϩм\u0001ϩ<\u0001", new Object[]{"d", "c", "f", "e", "b", "g", aufe.class, aufi.class, "h", aufg.class, "i", auff.class, aufl.class});
            case 3:
                return new aufd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aufd.class);
            default:
                return null;
        }
    }
}
