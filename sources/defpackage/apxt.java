package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxt extends aihn implements aiis {
    public static final apxt a;
    public static final aihl b;
    public int c;
    public boolean e;
    private alkl f;
    private byte g = 2;
    public String d = "";

    static {
        apxt apxtVar = new apxt();
        a = apxtVar;
        aihn.registerDefaultInstance(apxt.class, apxtVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apxtVar, apxtVar, null, 163501208, aika.MESSAGE, apxt.class);
    }

    private apxt() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new apxt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxt.class);
            default:
                return null;
        }
    }
}
