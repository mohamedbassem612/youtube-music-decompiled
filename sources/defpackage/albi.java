package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class albi extends aihn implements aiis {
    public static final albi a;
    public int b;
    public aiua c;
    private apji d;
    private byte e = 2;

    static {
        albi albiVar = new albi();
        a = albiVar;
        aihn.registerDefaultInstance(albi.class, albiVar);
    }

    private albi() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002", new Object[]{"b", "d", "c"});
            case 3:
                return new albi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albi.class);
            default:
                return null;
        }
    }
}
