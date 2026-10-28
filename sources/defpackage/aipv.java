package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aipv extends aihn implements aiis {
    public static final aipv a;
    public aiip b = aiip.a;
    private byte c = 2;

    static {
        aipv aipvVar = new aipv();
        a = aipvVar;
        aihn.registerDefaultInstance(aipv.class, aipvVar);
    }

    private aipv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, ajwo.a)});
            case 3:
                return new aipv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aipv.class);
            default:
                return null;
        }
    }
}
