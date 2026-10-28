package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajlh extends aihn implements aiis {
    public static final ajlh a;
    public aiuc b;
    public apji c;
    private int e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        ajlh ajlhVar = new ajlh();
        a = ajlhVar;
        aihn.registerDefaultInstance(ajlh.class, ajlhVar);
    }

    private ajlh() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001b", new Object[]{"e", "b", "c", "d", aizs.class});
            case 3:
                return new ajlh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajlh.class);
            default:
                return null;
        }
    }
}
