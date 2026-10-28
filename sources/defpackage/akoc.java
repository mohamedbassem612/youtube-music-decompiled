package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class akoc extends aihn implements aiis {
    public static final akoc a;
    public akob b;
    private int c;
    private byte d = 2;

    static {
        akoc akocVar = new akoc();
        a = akocVar;
        aihn.registerDefaultInstance(akoc.class, akocVar);
    }

    private akoc() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uee5d⇧\uee5d⇧\u0001\u0000\u0000\u0001\uee5d⇧ᐉ\u0000", new Object[]{"c", "b"});
            case 3:
                return new akoc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akoc.class);
            default:
                return null;
        }
    }
}
