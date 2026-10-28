package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahnl extends aihn implements aiis {
    public static final ahnl a;
    public aiie c;
    public aiie d;
    public aiie e;
    private byte f = 2;
    public aiie b = emptyProtobufList();

    static {
        ahnl ahnlVar = new ahnl();
        a = ahnlVar;
        aihn.registerDefaultInstance(ahnl.class, ahnlVar);
    }

    private ahnl() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    public final void a() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0010\u0004\u0000\u0004\u0001\u0001Л\nȚ\u000fȚ\u0010Ț", new Object[]{"b", ahnk.class, "c", "d", "e"});
            case 3:
                return new ahnl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ahnl.class);
            default:
                return null;
        }
    }
}
