package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajdd extends aihn implements aiis {
    public static final ajdd a;
    public static final aihl b;
    public int c;
    private int e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        ajdd ajddVar = new ajdd();
        a = ajddVar;
        aihn.registerDefaultInstance(ajdd.class, ajddVar);
        b = aihn.newSingularGeneratedExtension(apji.a, ajddVar, ajddVar, null, 195330824, aika.MESSAGE, ajdd.class);
    }

    private ajdd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001᠌\u0000\u0002Л", new Object[]{"e", "c", aobf.g, "d", apji.class});
            case 3:
                return new ajdd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajdd.class);
            default:
                return null;
        }
    }
}
