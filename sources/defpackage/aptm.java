package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aptm extends aihn implements aiis {
    public static final aptm a;
    public static final aihl b;
    public int c;
    public boolean e;
    public ajwo f;
    public ajwo g;
    private byte i = 2;
    public String d = "";
    public String h = "";

    static {
        aptm aptmVar = new aptm();
        a = aptmVar;
        aihn.registerDefaultInstance(aptm.class, aptmVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aptmVar, aptmVar, null, 377332428, aika.MESSAGE, aptm.class);
    }

    private aptm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new aptm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aptm.class);
            default:
                return null;
        }
    }
}
