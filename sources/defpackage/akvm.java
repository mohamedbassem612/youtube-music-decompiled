package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akvm extends aihn implements aiis {
    public static final akvm a;
    public static final aihl b;
    public akuz c;
    private int d;
    private byte e = 2;

    static {
        akvm akvmVar = new akvm();
        a = akvmVar;
        aihn.registerDefaultInstance(akvm.class, akvmVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akvmVar, akvmVar, null, 300347778, aika.MESSAGE, akvm.class);
    }

    private akvm() {
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
                return new akvm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akvm.class);
            default:
                return null;
        }
    }
}
