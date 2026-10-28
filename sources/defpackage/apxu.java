package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apxu extends aihn implements aiis {
    public static final apxu a;
    public static final aihl b;
    public apji c;
    private int d;
    private byte e = 2;

    static {
        apxu apxuVar = new apxu();
        a = apxuVar;
        aihn.registerDefaultInstance(apxu.class, apxuVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apxuVar, apxuVar, null, 1655, aika.MESSAGE, apxu.class);
    }

    private apxu() {
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
                return new apxu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxu.class);
            default:
                return null;
        }
    }
}
