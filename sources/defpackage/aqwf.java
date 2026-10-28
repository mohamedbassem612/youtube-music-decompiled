package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqwf extends aihn implements aiis {
    public static final aqwf a;
    private int b;
    private alay c;
    private apji d;
    private apji e;
    private apji f;
    private ajwo g;
    private byte h = 2;

    static {
        aqwf aqwfVar = new aqwf();
        a = aqwfVar;
        aihn.registerDefaultInstance(aqwf.class, aqwfVar);
    }

    private aqwf() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0005\f\u0005\u0000\u0000\u0005\u0005ᐉ\t\u0006ᐉ\n\tᐉ\u0002\nᐉ\u0003\fᐉ\u0007", new Object[]{"b", "f", "g", "c", "d", "e"});
            case 3:
                return new aqwf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwf.class);
            default:
                return null;
        }
    }
}
