package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anha extends aihi implements aihj {
    public static final anha a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        anha anhaVar = new anha();
        a = anhaVar;
        aihn.registerDefaultInstance(anha.class, anhaVar);
    }

    private anha() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", angz.class, ajid.class});
            case 3:
                return new anha();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anha.class);
            default:
                return null;
        }
    }
}
