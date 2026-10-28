package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aldo extends aihn implements aiis {
    public static final aldo a;
    public static final aihl b;
    public int c;
    public int g;
    public ajwo h;
    private ajwo i;
    private byte j = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        aldo aldoVar = new aldo();
        a = aldoVar;
        aihn.registerDefaultInstance(aldo.class, aldoVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aldoVar, aldoVar, null, 371825303, aika.MESSAGE, aldo.class);
    }

    private aldo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"c", "d", "e", "f", "g", akux.o, "h", "i"});
            case 3:
                return new aldo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aldo.class);
            default:
                return null;
        }
    }
}
