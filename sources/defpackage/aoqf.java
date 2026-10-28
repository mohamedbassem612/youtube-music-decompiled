package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoqf extends aihn implements aiis {
    public static final aoqf a;
    private int b;
    private aoqj c;
    private aoqj d;
    private aoqh e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        aoqf aoqfVar = new aoqf();
        a = aoqfVar;
        aihn.registerDefaultInstance(aoqf.class, aoqfVar);
    }

    private aoqf() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0005\bᐉ\u0001", new Object[]{"b", "c", "e", "f", "g", "d"});
            case 3:
                return new aoqf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoqf.class);
            default:
                return null;
        }
    }
}
