package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbi extends aihn implements aiis {
    public static final akbi a;
    private int b;
    private alay c;
    private alay d;
    private ajkc e;
    private alay f;
    private byte g = 2;

    static {
        akbi akbiVar = new akbi();
        a = akbiVar;
        aihn.registerDefaultInstance(akbi.class, akbiVar);
    }

    private akbi() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\nᐉ\u0003\u000bᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new akbi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbi.class);
            default:
                return null;
        }
    }
}
