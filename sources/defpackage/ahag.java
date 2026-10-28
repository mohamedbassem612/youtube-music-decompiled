package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahag extends aihn implements aiis {
    public static final ahag a;
    public int b;
    public Object d;
    public ahad e;
    public int c = 0;
    private byte g = 2;
    public aiie f = emptyProtobufList();

    static {
        ahag ahagVar = new ahag();
        a = ahagVar;
        aihn.registerDefaultInstance(ahag.class, ahagVar);
    }

    private ahag() {
    }

    public final void a() {
        aiie aiieVar = this.f;
        if (aiieVar.c()) {
            return;
        }
        this.f = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{"d", "c", "b", "e", "f", ahad.class, ahae.class});
            case 3:
                return new ahag();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ahag.class);
            default:
                return null;
        }
    }
}
