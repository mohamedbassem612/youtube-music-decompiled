package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alay extends aihi implements aihj {
    public static final alay a;
    public int b;
    public boolean e;
    public alaz f;
    private byte g = 2;
    public aiie c = emptyProtobufList();
    public String d = "";

    static {
        alay alayVar = new alay();
        a = alayVar;
        aihn.registerDefaultInstance(alay.class, alayVar);
    }

    private alay() {
    }

    public final void d() {
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
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဈ\u0000", new Object[]{"b", "c", alba.class, "e", "f", "d"});
            case 3:
                return new alay();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alay.class);
            default:
                return null;
        }
    }
}
