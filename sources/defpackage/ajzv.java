package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajzv extends aihn implements aiis {
    public static final ajzv a;
    public static final aihl b;
    public int c;
    public ajzw d;
    public int e;
    public int g;
    public boolean h;
    private byte i = 2;
    public String f = "";

    static {
        ajzv ajzvVar = new ajzv();
        a = ajzvVar;
        aihn.registerDefaultInstance(ajzv.class, ajzvVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajzvVar, ajzvVar, null, 137332281, aika.MESSAGE, ajzv.class);
    }

    private ajzv() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"c", "d", "e", ajzp.d, "f", "g", "h"});
            case 3:
                return new ajzv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajzv.class);
            default:
                return null;
        }
    }
}
