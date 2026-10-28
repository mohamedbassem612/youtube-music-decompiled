package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arny extends aihn implements aiis {
    public static final arny a;
    public static final aihl b;
    public arqc e;
    private int g;
    private ajwn h;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public aigj f = aigj.d;

    static {
        arny arnyVar = new arny();
        a = arnyVar;
        aihn.registerDefaultInstance(arny.class, arnyVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arnyVar, arnyVar, null, 88642421, aika.MESSAGE, arny.class);
    }

    private arny() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0002\u0003ည\u0003\u0004ဈ\u0001\u0005ᐉ\u0004", new Object[]{"g", "c", "e", "f", "d", "h"});
            case 3:
                return new arny();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arny.class);
            default:
                return null;
        }
    }
}
