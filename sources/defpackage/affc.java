package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class affc extends aihn implements aiis {
    public static final affc a;
    public aiie b = emptyProtobufList();
    public aihv c = emptyIntList();
    public boolean d;

    static {
        affc affcVar = new affc();
        a = affcVar;
        aihn.registerDefaultInstance(affc.class, affcVar);
    }

    private affc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002'\u0003\u0007", new Object[]{"b", affb.class, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new affc();
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
        return aihn.getParserForClass(affc.class);
    }
}
