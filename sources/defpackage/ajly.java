package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajly extends aihn implements aiis {
    public static final ajly a;
    public int b;
    public alay c;
    public boolean d;
    public ajwo e;
    public ajwo f;
    public ajwo g;
    public ajwo h;
    private alay i;
    private byte j = 2;

    static {
        ajly ajlyVar = new ajly();
        a = ajlyVar;
        aihn.registerDefaultInstance(ajly.class, ajlyVar);
    }

    private ajly() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ဇ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b", new Object[]{"b", "c", "d", "i", "e", "f", "g", "h"});
            case 3:
                return new ajly();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajly.class);
            default:
                return null;
        }
    }
}
