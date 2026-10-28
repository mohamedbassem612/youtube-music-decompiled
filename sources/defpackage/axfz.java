package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axfz extends aihn implements aiis {
    public static final axfz a;
    public int b;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public axfy e;

    static {
        axfz axfzVar = new axfz();
        a = axfzVar;
        aihn.registerDefaultInstance(axfz.class, axfzVar);
    }

    private axfz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", axgc.class, "d", axfx.class, "e"});
        }
        if (iOrdinal == 3) {
            return new axfz();
        }
        if (iOrdinal == 4) {
            return new fxg((byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(axfz.class);
        }
        return null;
    }
}
