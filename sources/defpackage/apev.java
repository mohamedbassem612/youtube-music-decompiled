package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apev extends aihn implements aiis {
    public static final apev a;
    public int b;
    public alay c;
    public boolean d;
    private byte e = 2;

    static {
        apev apevVar = new apev();
        a = apevVar;
        aihn.registerDefaultInstance(apev.class, apevVar);
    }

    private apev() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0001\u0002ဇ\u0001\u0005ᐉ\u0000", new Object[]{"b", "d", "c"});
            case 3:
                return new apev();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apev.class);
            default:
                return null;
        }
    }
}
