package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atpi extends aihn implements aiis {
    public static final atpi a;
    public int b;
    public long c;
    public long d;
    public long g;
    public aihv e = emptyIntList();
    public aihv f = emptyIntList();
    public aiie h = emptyProtobufList();
    public aiie i = emptyProtobufList();
    public aiie j = emptyProtobufList();

    static {
        atpi atpiVar = new atpi();
        a = atpiVar;
        aihn.registerDefaultInstance(atpi.class, atpiVar);
    }

    private atpi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u0016\u0004\u0016\u0005ဂ\u0002\u0006\u001b\u0007\u001b\b\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", atpf.class, "i", atpg.class, "j", atph.class});
        }
        if (iOrdinal == 3) {
            return new atpi();
        }
        if (iOrdinal == 4) {
            return new aihf((int[][][]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atpi.class);
        }
        return null;
    }
}
