package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apoy extends aihn implements aiis {
    public static final apoy a;
    public static final aihl b;
    public Object d;
    private int f;
    public int c = 0;
    private byte g = 2;
    public String e = "";

    static {
        apoy apoyVar = new apoy();
        a = apoyVar;
        aihn.registerDefaultInstance(apoy.class, apoyVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apoyVar, apoyVar, null, 354135686, aika.MESSAGE, apoy.class);
    }

    private apoy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001м\u0000\u0002ဈ\u0000\u0003;\u0000", new Object[]{"d", "c", "f", akeh.class, "e"});
            case 3:
                return new apoy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apoy.class);
            default:
                return null;
        }
    }
}
