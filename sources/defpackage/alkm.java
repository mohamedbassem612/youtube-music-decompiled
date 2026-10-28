package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alkm extends aihn implements aiis {
    public static final alkm a;
    public static final aihl b;
    public int c;
    public ajwo d;
    private byte e = 2;

    static {
        alkm alkmVar = new alkm();
        a = alkmVar;
        aihn.registerDefaultInstance(alkm.class, alkmVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, alkmVar, alkmVar, null, 200453700, aika.MESSAGE, alkm.class);
    }

    private alkm() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new alkm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkm.class);
            default:
                return null;
        }
    }
}
