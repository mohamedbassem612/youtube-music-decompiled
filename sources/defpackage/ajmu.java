package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajmu extends aihn implements aiis {
    public static final ajmu a;
    public static final aihl b;
    public int c;
    public ajmv d;
    public boolean f;
    public int g;
    public alme h;
    private byte i = 2;
    public String e = "";

    static {
        ajmu ajmuVar = new ajmu();
        a = ajmuVar;
        aihn.registerDefaultInstance(ajmu.class, ajmuVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajmuVar, ajmuVar, null, 120837120, aika.MESSAGE, ajmu.class);
    }

    private ajmu() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ᐉ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new ajmu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajmu.class);
            default:
                return null;
        }
    }
}
