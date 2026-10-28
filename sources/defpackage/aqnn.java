package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqnn extends aihn implements aiis {
    public static final aqnn a;
    public static final aihl b;
    public int c;
    public Object e;
    public apxq f;
    public ajwo g;
    public int d = 0;
    private byte h = 2;

    static {
        aqnn aqnnVar = new aqnn();
        a = aqnnVar;
        aihn.registerDefaultInstance(aqnn.class, aqnnVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqnnVar, aqnnVar, null, 369951587, aika.MESSAGE, aqnn.class);
    }

    private aqnn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001;\u0000\u0002<\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"e", "d", "c", akud.class, "f", "g"});
            case 3:
                return new aqnn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqnn.class);
            default:
                return null;
        }
    }
}
