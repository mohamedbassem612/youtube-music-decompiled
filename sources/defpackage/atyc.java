package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atyc extends aihn implements aiis {
    public static final atyc a;
    public static final aihl b;
    public int c;
    public boolean e;
    private byte f = 2;
    public aigj d = aigj.d;

    static {
        atyc atycVar = new atyc();
        a = atycVar;
        aihn.registerDefaultInstance(atyc.class, atycVar);
        b = aihn.newSingularGeneratedExtension(atxv.a, atycVar, atycVar, null, 28599812, aika.MESSAGE, atyc.class);
    }

    private atyc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new atyc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atyc.class);
            default:
                return null;
        }
    }
}
