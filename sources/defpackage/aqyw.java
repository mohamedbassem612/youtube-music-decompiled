package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqyw extends aihn implements aiis {
    public static final aqyw a;
    public static final aihl b;
    public int c;
    private aqyv g;
    private byte h = 2;
    public aiie d = emptyProtobufList();
    public String e = "";
    public String f = "";

    static {
        aqyw aqywVar = new aqyw();
        a = aqywVar;
        aihn.registerDefaultInstance(aqyw.class, aqywVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqywVar, aqywVar, null, 68997401, aika.MESSAGE, aqyw.class);
    }

    private aqyw() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001\u001a\u0002ဈ\u0000\u0004ဈ\u0001\u0005ᐉ\u0002", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new aqyw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqyw.class);
            default:
                return null;
        }
    }
}
