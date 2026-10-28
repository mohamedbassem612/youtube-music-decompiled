package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class angd extends aihn implements aiis {
    public static final angd a;
    public int b;
    public alay c;
    private alay d;
    private apji e;
    private byte f = 2;

    static {
        angd angdVar = new angd();
        a = angdVar;
        aihn.registerDefaultInstance(angd.class, angdVar);
    }

    private angd() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0001", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new angd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(angd.class);
            default:
                return null;
        }
    }
}
