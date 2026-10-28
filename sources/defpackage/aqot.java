package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqot extends aihn implements aiis {
    public static final aqot a;
    public int b;
    public aiie d;
    private byte e = 2;
    public String c = "";

    static {
        aqot aqotVar = new aqot();
        a = aqotVar;
        aihn.registerDefaultInstance(aqot.class, aqotVar);
    }

    private aqot() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    public final void a() {
        aiie aiieVar = this.d;
        if (aiieVar.c()) {
            return;
        }
        this.d = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0007Л", new Object[]{"b", "c", "d", appb.class});
            case 3:
                return new aqot();
            case 4:
                return new aihf((int[]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqot.class);
            default:
                return null;
        }
    }
}
