package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aipr extends aihn implements aiis {
    public static final aipr a;
    public static final aihl b;
    public int c;
    public apji d;
    private int e;
    private byte f = 2;

    static {
        aipr aiprVar = new aipr();
        a = aiprVar;
        aihn.registerDefaultInstance(aipr.class, aiprVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aiprVar, aiprVar, null, 366527935, aika.MESSAGE, aipr.class);
    }

    private aipr() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0001\u0004᠌\u0001\u0005ᐉ\u0002", new Object[]{"e", "c", aiod.j, "d"});
            case 3:
                return new aipr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aipr.class);
            default:
                return null;
        }
    }
}
