package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aoia extends aihn implements aiis {
    public static final aoia a;
    public int b;
    public boolean c;
    public aohy d;
    public int f;
    public aigj g;
    private aohz h;
    private byte i = 2;
    public aiie e = emptyProtobufList();

    static {
        aoia aoiaVar = new aoia();
        a = aoiaVar;
        aihn.registerDefaultInstance(aoia.class, aoiaVar);
    }

    private aoia() {
        emptyProtobufList();
        emptyProtobufList();
        this.g = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0001\u0003\u0001ဇ\u0000\u0002ᐉ\u0003\u0003Л\u0004ည\b\nᐉ\u0005\r᠌\u0006", new Object[]{"b", "c", "d", "e", aohw.class, "g", "h", "f", aobi.f});
            case 3:
                return new aoia();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoia.class);
            default:
                return null;
        }
    }
}
