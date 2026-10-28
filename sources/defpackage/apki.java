package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apki extends aihn implements aiis {
    public static final apki a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private byte k = 2;

    static {
        apki apkiVar = new apki();
        a = apkiVar;
        aihn.registerDefaultInstance(apki.class, apkiVar);
    }

    private apki() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\b\nᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new apki();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apki.class);
            default:
                return null;
        }
    }
}
