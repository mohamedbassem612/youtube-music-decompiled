package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxr extends aihn implements aiis {
    public static final apxr a;
    public int b;
    public akuf c;
    public boolean e;
    public int f;
    private byte g = 2;
    public String d = "";

    static {
        apxr apxrVar = new apxr();
        a = apxrVar;
        aihn.registerDefaultInstance(apxr.class, apxrVar);
    }

    private apxr() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဈ\u0001\u0004ဇ\u0002\u0005᠌\u0003", new Object[]{"b", "c", "d", "e", "f", aqcj.c});
            case 3:
                return new apxr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxr.class);
            default:
                return null;
        }
    }
}
