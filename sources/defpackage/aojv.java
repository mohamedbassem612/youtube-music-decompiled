package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojv extends aihn implements aiis {
    public static final aojv a;
    public int b;
    public aojs c;
    public aojt d;

    static {
        aojv aojvVar = new aojv();
        a = aojvVar;
        aihn.registerDefaultInstance(aojv.class, aojvVar);
    }

    private aojv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001ﯟ☇\ue627☔\u0002\u0000\u0000\u0000ﯟ☇ဉ\u0001\ue627☔ဉ\u0000", new Object[]{"b", "d", "c"});
        }
        if (iOrdinal == 3) {
            return new aojv();
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
        return aihn.getParserForClass(aojv.class);
    }
}
