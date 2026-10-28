package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aiwv extends aihn implements aiis {
    public static final aiwv a;
    public int b;
    public ajnf c;
    private aiwt d;
    private angd e;
    private byte f = 2;

    static {
        aiwv aiwvVar = new aiwv();
        a = aiwvVar;
        aihn.registerDefaultInstance(aiwv.class, aiwvVar);
    }

    private aiwv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ueb11ἑ\uf543㭚\u0003\u0000\u0000\u0003\ueb11ἑᐉ\u0000\ue97d✹ᐉ\u0002\uf543㭚ᐉ\u0001", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new aiwv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiwv.class);
            default:
                return null;
        }
    }
}
