package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajzg extends aihn implements aiis {
    public static final ajzg a;
    private aiip b = aiip.a;

    static {
        ajzg ajzgVar = new ajzg();
        a = ajzgVar;
        aihn.registerDefaultInstance(ajzg.class, ajzgVar);
    }

    private ajzg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, apcx.a)});
        }
        if (iOrdinal == 3) {
            return new ajzg();
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
        return aihn.getParserForClass(ajzg.class);
    }
}
