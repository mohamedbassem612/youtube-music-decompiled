package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class almo extends aihn implements aiis {
    public static final almo a;
    public int b;
    public alop c;
    public ajwo d;
    public aisc e;
    public almn f;
    private albe h;
    private byte i = 2;
    public aiie g = emptyProtobufList();

    static {
        almo almoVar = new almo();
        a = almoVar;
        aihn.registerDefaultInstance(almo.class, almoVar);
    }

    private almo() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006Л̉ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", ajwo.class, "h"});
            case 3:
                return new almo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almo.class);
            default:
                return null;
        }
    }
}
