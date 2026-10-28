package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aivd extends aihn implements aiis {
    public static final aivd a;
    public aiie b;
    public aiie c;
    private byte d = 2;

    static {
        aivd aivdVar = new aivd();
        a = aivdVar;
        aihn.registerDefaultInstance(aivd.class, aivdVar);
    }

    private aivd() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0005\u0006\u0002\u0000\u0002\u0002\u0005Л\u0006Л", new Object[]{"b", ajwo.class, "c", ajwo.class});
            case 3:
                return new aivd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aivd.class);
            default:
                return null;
        }
    }
}
