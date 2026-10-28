package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiws extends aihn implements aiis {
    public static final aiws a;
    public static final aihl b;
    private int c;
    private apji d;
    private byte e = 2;

    static {
        aiws aiwsVar = new aiws();
        a = aiwsVar;
        aihn.registerDefaultInstance(aiws.class, aiwsVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aiwsVar, aiwsVar, null, 392792774, aika.MESSAGE, aiws.class);
    }

    private aiws() {
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
                return new aiws();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiws.class);
            default:
                return null;
        }
    }
}
