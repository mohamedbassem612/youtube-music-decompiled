package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anxw extends aihn implements aiis {
    public static final anxw a;
    public int b;
    public int c;
    public int d;
    public ajwo e;
    public aiqe f;
    private ajwo g;
    private byte h = 2;

    static {
        anxw anxwVar = new anxw();
        a = anxwVar;
        aihn.registerDefaultInstance(anxw.class, anxwVar);
    }

    private anxw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001᠌\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0007ᐉ\u0006", new Object[]{"b", "c", anvw.o, "d", anvw.p, "e", "f", "g"});
            case 3:
                return new anxw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anxw.class);
            default:
                return null;
        }
    }
}
