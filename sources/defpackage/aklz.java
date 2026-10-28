package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aklz extends aihn implements aiis {
    public static final aklz a;
    public static final aihl b;
    public int c;
    public ajwo e;
    private byte f = 2;
    public String d = "";

    static {
        aklz aklzVar = new aklz();
        a = aklzVar;
        aihn.registerDefaultInstance(aklz.class, aklzVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aklzVar, aklzVar, null, 330811011, aika.MESSAGE, aklz.class);
    }

    private aklz() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new aklz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aklz.class);
            default:
                return null;
        }
    }
}
