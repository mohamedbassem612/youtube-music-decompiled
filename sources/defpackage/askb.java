package defpackage;

import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class askb extends aihn implements aiis {
    public static final askb a;
    public int b;
    public int c = 0;
    public Object d;
    public aijp e;
    public apst f;

    static {
        askb askbVar = new askb();
        a = askbVar;
        aihn.registerDefaultInstance(askb.class, askbVar);
    }

    private askb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0012\u0001\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000eဉ\u0000\u000f<\u0000\u0011ဉ\u0001\u0012<\u0000\u0013<\u0000", new Object[]{"d", "c", "b", apsx.class, apsu.class, apsm.class, apss.class, apsn.class, apsl.class, apsk.class, apsq.class, apsp.class, apso.class, apsw.class, andy.class, andh.class, "e", apsy.class, "f", ClientErrorOuterClass$ClientError.class, apsj.class});
        }
        if (iOrdinal == 3) {
            return new askb();
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
        return aihn.getParserForClass(askb.class);
    }
}
