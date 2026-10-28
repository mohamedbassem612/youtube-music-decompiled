package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alft extends aihn implements aiis {
    public static final alft a;
    public int b;
    public aobx c;
    private byte d = 2;

    static {
        alft alftVar = new alft();
        a = alftVar;
        aihn.registerDefaultInstance(alft.class, alftVar);
    }

    private alft() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ueee9ᣑ\ueee9ᣑ\u0001\u0000\u0000\u0001\ueee9ᣑᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new alft();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alft.class);
            default:
                return null;
        }
    }
}
