package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aorf extends aihn implements aiis {
    public static final aorf a;
    public aigu c;
    private int d;
    private byte e = 2;
    public aiie b = emptyProtobufList();

    static {
        aorf aorfVar = new aorf();
        a = aorfVar;
        aihn.registerDefaultInstance(aorf.class, aorfVar);
    }

    private aorf() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0001\u0001Л\u0004ဉ\u0002", new Object[]{"d", "b", apji.class, "c"});
            case 3:
                return new aorf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aorf.class);
            default:
                return null;
        }
    }
}
