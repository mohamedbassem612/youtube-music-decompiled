package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqpz extends aihn implements aiis {
    public static final aqpz a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private aqqb f;
    private aqqa g;
    private alay h;
    private byte i = 2;

    static {
        aqpz aqpzVar = new aqpz();
        a = aqpzVar;
        aihn.registerDefaultInstance(aqpz.class, aqpzVar);
    }

    private aqpz() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\u000b\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0005ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\u0005\nᐉ\u000b\u000bᐉ\u0007", new Object[]{"b", "c", "e", "g", "d", "h", "f"});
            case 3:
                return new aqpz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqpz.class);
            default:
                return null;
        }
    }
}
