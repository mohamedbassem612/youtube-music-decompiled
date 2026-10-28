package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoaw extends aihn implements aiis {
    public static final aoaw a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        aoaw aoawVar = new aoaw();
        a = aoawVar;
        aihn.registerDefaultInstance(aoaw.class, aoawVar);
    }

    private aoaw() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aoaw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoaw.class);
            default:
                return null;
        }
    }
}
