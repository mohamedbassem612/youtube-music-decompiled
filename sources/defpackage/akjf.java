package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akjf extends aihn implements aiis {
    public static final akjf a;
    public int b;
    public arew d;
    public aigu e;
    public boolean f;
    private byte i = 2;
    public String c = "";
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();

    static {
        akjf akjfVar = new akjf();
        a = akjfVar;
        aihn.registerDefaultInstance(akjf.class, akjfVar);
    }

    private akjf() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0002\u0002\u0002ဉ\u0003\u0005ဇ\u0005\u0006Л\u0007ဈ\u0000\bဉ\u0002\tЛ", new Object[]{"b", "e", "f", "g", akje.class, "c", "d", "h", akje.class});
            case 3:
                return new akjf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akjf.class);
            default:
                return null;
        }
    }
}
