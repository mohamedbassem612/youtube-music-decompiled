package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amfp extends aihn implements aiis {
    public static final amfp a;
    public static final aihl b;
    public int c;
    public ajwo e;
    public ajwo f;
    private byte g = 2;
    public String d = "";

    static {
        amfp amfpVar = new amfp();
        a = amfpVar;
        aihn.registerDefaultInstance(amfp.class, amfpVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amfpVar, amfpVar, null, 1262, aika.MESSAGE, amfp.class);
    }

    private amfp() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new amfp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amfp.class);
            default:
                return null;
        }
    }
}
