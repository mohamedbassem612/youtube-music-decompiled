package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alba extends aihi implements aihj {
    public static final alba a;
    public int b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int k;
    public ajwo l;
    private byte m = 2;
    public String c = "";

    static {
        alba albaVar = new alba();
        a = albaVar;
        aihn.registerDefaultInstance(alba.class, albaVar);
    }

    private alba() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ᐉ\u000b\u0006ဇ\u0004\bဋ\b\t᠌\n\nဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "l", "g", "i", "k", akvb.p, "h"});
            case 3:
                return new alba();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alba.class);
            default:
                return null;
        }
    }
}
