package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apno extends aihn implements aiis {
    public static final apno a;
    private int b;
    private apnn c;
    private byte d = 2;

    static {
        apno apnoVar = new apno();
        a = apnoVar;
        aihn.registerDefaultInstance(apno.class, apnoVar);
    }

    private apno() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            case 3:
                return new apno();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apno.class);
            default:
                return null;
        }
    }
}
