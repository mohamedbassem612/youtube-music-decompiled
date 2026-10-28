package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ascj extends aihn implements aiis {
    public static final ascj a;
    public int b;
    public akdw c;
    public int d;
    public amjy f;
    public float g;
    private byte h = 2;
    public String e = "";

    static {
        ascj ascjVar = new ascj();
        a = ascjVar;
        aihn.registerDefaultInstance(ascj.class, ascjVar);
    }

    private ascj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0006ခ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new ascj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ascj.class);
            default:
                return null;
        }
    }
}
