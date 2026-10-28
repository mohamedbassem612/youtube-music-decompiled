package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqei extends aihn implements aiis {
    public static final aqei a;
    public static final aihl b;
    public int c;
    public ajwo d;
    public ajwo e;
    private byte h = 2;
    public String f = "";
    public String g = "";

    static {
        aqei aqeiVar = new aqei();
        a = aqeiVar;
        aihn.registerDefaultInstance(aqei.class, aqeiVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqeiVar, aqeiVar, null, 22693, aika.MESSAGE, aqei.class);
    }

    private aqei() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new aqei();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqei.class);
            default:
                return null;
        }
    }
}
