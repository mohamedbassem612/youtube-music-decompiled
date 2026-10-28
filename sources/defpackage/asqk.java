package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asqk extends aihn implements aiis {
    public static final asqk a;
    private int b;
    private arqr c;
    private arqs d;
    private arqt e;
    private arqp f;
    private arqq g;
    private byte h = 2;

    static {
        asqk asqkVar = new asqk();
        a = asqkVar;
        aihn.registerDefaultInstance(asqk.class, asqkVar);
    }

    private asqk() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0007\f\u0005\u0000\u0000\u0000\u0007ဉ\u0002\tဉ\u0003\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new asqk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asqk.class);
            default:
                return null;
        }
    }
}
