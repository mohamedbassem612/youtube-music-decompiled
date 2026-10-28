package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apcm extends aihn implements aiis {
    public static final apcm a;
    public static final aihl b;
    public apji c;
    private int d;
    private byte e = 2;

    static {
        apcm apcmVar = new apcm();
        a = apcmVar;
        aihn.registerDefaultInstance(apcm.class, apcmVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apcmVar, apcmVar, null, 1835, aika.MESSAGE, apcm.class);
    }

    private apcm() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "c"});
            case 3:
                return new apcm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apcm.class);
            default:
                return null;
        }
    }
}
