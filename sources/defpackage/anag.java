package defpackage;

import com.google.protos.youtube.api.innertube.MediaFetchColdConfigOuterClass$MediaFetchColdConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anag extends aihn implements aiis {
    public static final anag a;
    public ajbu b;
    public MediaFetchColdConfigOuterClass$MediaFetchColdConfig c;
    private int d;

    static {
        anag anagVar = new anag();
        a = anagVar;
        aihn.registerDefaultInstance(anag.class, anagVar);
    }

    private anag() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new anag();
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
        return aihn.getParserForClass(anag.class);
    }
}
