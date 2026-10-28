package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahwn extends aihn implements aiis {
    public static final ahwn a;
    public int b;
    public long c;
    public aihy d;
    public aiie e;

    static {
        ahwn ahwnVar = new ahwn();
        a = ahwnVar;
        aihn.registerDefaultInstance(ahwn.class, ahwnVar);
    }

    private ahwn() {
        emptyProtobufList();
        this.d = emptyLongList();
        this.e = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"b", "e", ahwm.class, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ahwn();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(ahwn.class);
    }
}
