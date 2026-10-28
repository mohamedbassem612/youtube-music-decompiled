package defpackage;

import com.google.protos.youtube.api.innertube.ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asgn extends aihn implements aiis {
    public static final asgn a;
    public int b;
    public boolean c;
    public ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig d;
    public boolean e;
    public long f;

    static {
        asgn asgnVar = new asgn();
        a = asgnVar;
        aihn.registerDefaultInstance(asgn.class, asgnVar);
    }

    private asgn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဃ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new asgn();
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
        return aihn.getParserForClass(asgn.class);
    }
}
