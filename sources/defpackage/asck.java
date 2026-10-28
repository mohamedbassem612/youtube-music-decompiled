package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asck extends aihn implements aiis {
    public static final asck a;
    public int b;
    public akdw c;
    public int d;
    public amjy e;
    public float f;
    private byte g = 2;

    static {
        asck asckVar = new asck();
        a = asckVar;
        aihn.registerDefaultInstance(asck.class, asckVar);
    }

    private asck() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002င\u0001\u0003ᐉ\u0002\u0005ခ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asck();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asck.class);
            default:
                return null;
        }
    }
}
