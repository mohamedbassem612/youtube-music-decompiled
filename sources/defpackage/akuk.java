package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akuk extends aihn implements aiis {
    public static final akuk a;
    private byte c = 2;
    public aiie b = emptyProtobufList();

    static {
        akuk akukVar = new akuk();
        a = akukVar;
        aihn.registerDefaultInstance(akuk.class, akukVar);
    }

    private akuk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", apji.class});
            case 3:
                return new akuk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akuk.class);
            default:
                return null;
        }
    }
}
