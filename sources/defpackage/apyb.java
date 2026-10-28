package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apyb extends aihn implements aiis {
    public static final apyb a;
    public static final aihl b;
    public apyc c;
    private int d;
    private byte e = 2;

    static {
        apyb apybVar = new apyb();
        a = apybVar;
        aihn.registerDefaultInstance(apyb.class, apybVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apybVar, apybVar, null, 109865460, aika.MESSAGE, apyb.class);
    }

    private apyb() {
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
                return new apyb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apyb.class);
            default:
                return null;
        }
    }
}
