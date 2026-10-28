package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojw extends aihn implements aiis {
    public static final aojw a;
    public static final aihl b;
    private int d;
    private ajwo e;
    private ajwo f;
    private byte g = 2;
    public String c = "";

    static {
        aojw aojwVar = new aojw();
        a = aojwVar;
        aihn.registerDefaultInstance(aojw.class, aojwVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aojwVar, aojwVar, null, 428788994, aika.MESSAGE, aojw.class);
    }

    private aojw() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003", new Object[]{"d", "c", "e", "f"});
            case 3:
                return new aojw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aojw.class);
            default:
                return null;
        }
    }
}
