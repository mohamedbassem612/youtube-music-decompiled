package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akjg extends aihn implements aiis {
    public static final akjg a;
    public int b;
    public int c;
    private byte e = 2;
    public aiie d = emptyProtobufList();

    static {
        akjg akjgVar = new akjg();
        a = akjgVar;
        aihn.registerDefaultInstance(akjg.class, akjgVar);
    }

    private akjg() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001᠌\u0000\u0002Л", new Object[]{"b", "c", ajhk.q, "d", akjf.class});
            case 3:
                return new akjg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akjg.class);
            default:
                return null;
        }
    }
}
