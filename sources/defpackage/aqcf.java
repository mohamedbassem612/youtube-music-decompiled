package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqcf extends aihn implements aiis {
    public static final aqcf a;
    private int c;
    private apji d;
    private ajwo e;
    private apji f;
    private alzx g;
    private byte h = 2;
    public aiie b = emptyProtobufList();

    static {
        aqcf aqcfVar = new aqcf();
        a = aqcfVar;
        aihn.registerDefaultInstance(aqcf.class, aqcfVar);
    }

    private aqcf() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006Л\u000bᐉ\u0005", new Object[]{"c", "d", "e", "f", "b", apji.class, "g"});
            case 3:
                return new aqcf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqcf.class);
            default:
                return null;
        }
    }
}
