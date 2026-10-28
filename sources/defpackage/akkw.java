package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akkw extends aihn implements aiis {
    public static final akkw a;
    public static final aihl b;
    public int c;
    public int e;
    public ajwo f;
    private byte g = 2;
    public String d = "";

    static {
        akkw akkwVar = new akkw();
        a = akkwVar;
        aihn.registerDefaultInstance(akkw.class, akkwVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akkwVar, akkwVar, null, 64091098, aika.MESSAGE, akkw.class);
    }

    private akkw() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002᠌\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", akkx.a, "f"});
            case 3:
                return new akkw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akkw.class);
            default:
                return null;
        }
    }
}
