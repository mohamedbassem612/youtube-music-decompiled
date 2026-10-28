package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aktd extends aihn implements aiis {
    public static final aktd a;
    private int b;
    private alay c;
    private akte d;
    private akte e;
    private angb f;
    private byte g = 2;

    static {
        aktd aktdVar = new aktd();
        a = aktdVar;
        aihn.registerDefaultInstance(aktd.class, aktdVar);
    }

    private aktd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aktd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aktd.class);
            default:
                return null;
        }
    }
}
