package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqch extends aihn implements aiis {
    public static final aqch a;
    public static final aihl b;
    public int c;
    public ajue d;
    public ajwo g;
    public boolean h;
    public boolean i;
    public ajwo j;
    private byte k = 2;
    public String e = "";
    public String f = "";

    static {
        aqch aqchVar = new aqch();
        a = aqchVar;
        aihn.registerDefaultInstance(aqch.class, aqchVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqchVar, aqchVar, null, 301098174, aika.MESSAGE, aqch.class);
    }

    private aqch() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new aqch();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqch.class);
            default:
                return null;
        }
    }
}
