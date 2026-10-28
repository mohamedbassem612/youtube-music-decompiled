package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahxt extends aihn implements aiis {
    public static final ahxt a;
    public static final aihl b;
    private byte c = 2;

    static {
        ahxt ahxtVar = new ahxt();
        a = ahxtVar;
        aihn.registerDefaultInstance(ahxt.class, ahxtVar);
        b = aihn.newSingularGeneratedExtension(asow.a, ahxtVar, ahxtVar, null, 525000030, aika.MESSAGE, ahxt.class);
    }

    private ahxt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new ahxt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ahxt.class);
            default:
                return null;
        }
    }
}
