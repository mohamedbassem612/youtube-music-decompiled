package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acwy extends aihn implements aiis {
    public static final acwy a;
    public int b;
    public boolean e;
    public ajnf f;
    public ajnf g;
    public ajwo h;
    private byte j = 2;
    public String c = "";
    public aiie d = emptyProtobufList();
    public aiie i = emptyProtobufList();

    static {
        acwy acwyVar = new acwy();
        a = acwyVar;
        aihn.registerDefaultInstance(acwy.class, acwyVar);
    }

    private acwy() {
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
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0005\u0001ဈ\u0000\u0003ဇ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006Л\u0007ᐉ\u0004\bЛ", new Object[]{"b", "c", "e", "f", "g", "d", alay.class, "h", "i", ajwo.class});
            case 3:
                return new acwy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(acwy.class);
            default:
                return null;
        }
    }
}
