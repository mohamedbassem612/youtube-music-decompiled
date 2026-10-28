package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammu extends aihn implements aiis {
    public static final ammu a;
    public static final aihl b;
    public amow d;
    private int e;
    private byte f = 2;
    public String c = "";

    static {
        ammu ammuVar = new ammu();
        a = ammuVar;
        aihn.registerDefaultInstance(ammu.class, ammuVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammuVar, ammuVar, null, 149968475, aika.MESSAGE, ammu.class);
    }

    private ammu() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"e", "c", "d"});
            case 3:
                return new ammu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ammu.class);
            default:
                return null;
        }
    }
}
