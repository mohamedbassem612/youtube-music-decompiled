package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqxt extends aihn implements aiis {
    public static final aqxt a;
    private int b;
    private aqxy c;
    private aoam d;
    private aqxy e;
    private aoam f;
    private aoam g;
    private aoam h;
    private byte i = 2;

    static {
        aqxt aqxtVar = new aqxt();
        a = aqxtVar;
        aihn.registerDefaultInstance(aqxt.class, aqxtVar);
    }

    private aqxt() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\nᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "h", "g"});
            case 3:
                return new aqxt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxt.class);
            default:
                return null;
        }
    }
}
