package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aitm extends aihn implements aiis {
    public static final aitm a;
    public int b;
    public ajwo d;
    public boolean f;
    private byte g = 2;
    public aiie c = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        aitm aitmVar = new aitm();
        a = aitmVar;
        aihn.registerDefaultInstance(aitm.class, aitmVar);
    }

    private aitm() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0002\u0001Л\u0002ᐉ\u0000\u0003\u001b\u0004ဇ\u0002", new Object[]{"b", "c", akuf.class, "d", "e", akud.class, "f"});
            case 3:
                return new aitm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aitm.class);
            default:
                return null;
        }
    }
}
