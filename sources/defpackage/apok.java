package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apok extends aihn implements aiis {
    public static final apok a;
    public int b;
    public apou d;
    private byte e = 2;
    public aiie c = emptyProtobufList();

    static {
        apok apokVar = new apok();
        a = apokVar;
        aihn.registerDefaultInstance(apok.class, apokVar);
    }

    private apok() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"b", "c", apoj.class, "d"});
            case 3:
                return new apok();
            case 4:
                return new aihf((boolean[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apok.class);
            default:
                return null;
        }
    }
}
