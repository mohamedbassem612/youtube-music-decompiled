package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahnk extends aihn implements aiis {
    public static final ahnk a;
    public int b;
    public ahnj g;
    private byte h = 2;
    public String c = "";
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();

    static {
        ahnk ahnkVar = new ahnk();
        a = ahnkVar;
        aihn.registerDefaultInstance(ahnk.class, ahnkVar);
    }

    private ahnk() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0003\u0001\u0002Ȉ\u0003Ț\u0004Ț\u0005Ț\u0007ᐉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new ahnk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ahnk.class);
            default:
                return null;
        }
    }
}
