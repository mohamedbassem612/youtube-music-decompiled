package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aplf extends aihn implements aiis {
    public static final aihw a = new apej(3);
    public static final aplf b;
    public int c;
    public aiie d = emptyProtobufList();
    public aihv e = emptyIntList();
    public akxc f;
    public int g;

    static {
        aplf aplfVar = new aplf();
        b = aplfVar;
        aihn.registerDefaultInstance(aplf.class, aplfVar);
    }

    private aplf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0004\u0000\u0001\u0001\n\u0004\u0000\u0002\u0000\u0001ࠞ\u0002ဉ\u0000\t\u001a\nင\u0007", new Object[]{"c", "e", aqkp.i, "f", "d", "g"});
        }
        if (iOrdinal == 3) {
            return new aplf();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aplf.class);
    }
}
