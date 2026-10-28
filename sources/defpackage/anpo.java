package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpo extends aihn implements aiis {
    public static final anpo a;
    public int b;
    public Object d;
    public aiqe e;
    public int f;
    public int c = 0;
    private byte g = 2;

    static {
        anpo anpoVar = new anpo();
        a = anpoVar;
        aihn.registerDefaultInstance(anpo.class, anpoVar);
    }

    private anpo() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0003\u0007\u0004\u0000\u0000\u0001\u0003м\u0000\u0004ဉ\u0002\u0006<\u0000\u0007ဋ\u0004", new Object[]{"d", "c", "b", alja.class, "e", ajds.class, "f"});
            case 3:
                return new anpo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anpo.class);
            default:
                return null;
        }
    }
}
