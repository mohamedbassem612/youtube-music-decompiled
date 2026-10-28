package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajae extends aihn implements aiis {
    public static final ajae a;
    public static final aihl b;
    public ajwo d;
    private int e;
    private byte f = 2;
    public String c = "";

    static {
        ajae ajaeVar = new ajae();
        a = ajaeVar;
        aihn.registerDefaultInstance(ajae.class, ajaeVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajaeVar, ajaeVar, null, 322638812, aika.MESSAGE, ajae.class);
    }

    private ajae() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"e", "c", "d"});
            case 3:
                return new ajae();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajae.class);
            default:
                return null;
        }
    }
}
