package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammz extends aihn implements aiis {
    public static final ammz a;
    public static final aihl b;
    private int c;
    private apji d;
    private byte e = 2;

    static {
        ammz ammzVar = new ammz();
        a = ammzVar;
        aihn.registerDefaultInstance(ammz.class, ammzVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammzVar, ammzVar, null, 171299322, aika.MESSAGE, ammz.class);
    }

    private ammz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new ammz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ammz.class);
            default:
                return null;
        }
    }
}
