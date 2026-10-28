package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apxz extends aihn implements aiis {
    public static final apxz a;
    public static final aihl b;
    private int c;
    private amow d;
    private byte e = 2;

    static {
        apxz apxzVar = new apxz();
        a = apxzVar;
        aihn.registerDefaultInstance(apxz.class, apxzVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apxzVar, apxzVar, null, 135843030, aika.MESSAGE, apxz.class);
    }

    private apxz() {
        aigj aigjVar = aigj.d;
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
                return new apxz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxz.class);
            default:
                return null;
        }
    }
}
