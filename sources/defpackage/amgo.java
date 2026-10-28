package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amgo extends aihn implements aiis {
    public static final amgo a;
    public static final aihl b;
    public aijp e;
    private int f;
    private byte g = 2;
    public aiie c = emptyProtobufList();
    public String d = "";

    static {
        amgo amgoVar = new amgo();
        a = amgoVar;
        aihn.registerDefaultInstance(amgo.class, amgoVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amgoVar, amgoVar, null, 1371, aika.MESSAGE, amgo.class);
    }

    private amgo() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ဉ\u0001", new Object[]{"f", "c", ajwo.class, "d", "e"});
            case 3:
                return new amgo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amgo.class);
            default:
                return null;
        }
    }
}
