package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aorc extends aihn implements aiis {
    public static final aorc a;
    public aigu b;
    private int c;
    private alay d;
    private alay e;
    private byte f = 2;

    static {
        aorc aorcVar = new aorc();
        a = aorcVar;
        aihn.registerDefaultInstance(aorc.class, aorcVar);
    }

    private aorc() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0002\u0002ᐉ\u0001\u0005ဉ\u0000\u0006ᐉ\u0002", new Object[]{"c", "d", "b", "e"});
            case 3:
                return new aorc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aorc.class);
            default:
                return null;
        }
    }
}
