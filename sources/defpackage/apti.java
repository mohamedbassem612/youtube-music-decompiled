package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apti extends aihn implements aiis {
    public static final apti a;
    public static final aihl b;
    private int c;
    private ajwo d;
    private byte e = 2;

    static {
        apti aptiVar = new apti();
        a = aptiVar;
        aihn.registerDefaultInstance(apti.class, aptiVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aptiVar, aptiVar, null, 117735229, aika.MESSAGE, apti.class);
    }

    private apti() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
            case 3:
                return new apti();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apti.class);
            default:
                return null;
        }
    }
}
