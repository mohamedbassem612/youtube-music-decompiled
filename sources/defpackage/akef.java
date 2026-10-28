package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akef extends aihn implements aiis {
    public static final akef a;
    public int b;
    public int c;
    public boolean d;
    public ajom e;
    private byte f = 2;

    static {
        akef akefVar = new akef();
        a = akefVar;
        aihn.registerDefaultInstance(akef.class, akefVar);
    }

    private akef() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002ဇ\u0001\u0004ᐉ\u0003", new Object[]{"b", "c", ajhk.s, "d", "e"});
            case 3:
                return new akef();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akef.class);
            default:
                return null;
        }
    }
}
