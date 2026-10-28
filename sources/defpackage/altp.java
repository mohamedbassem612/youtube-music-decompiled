package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class altp extends aihn implements aiis {
    public static final altp a;
    public int b;
    public long d;
    public boolean f;
    public long g;
    public long h;
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        altp altpVar = new altp();
        a = altpVar;
        aihn.registerDefaultInstance(altp.class, altpVar);
    }

    private altp() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003\u001a\u0004ဇ\u0002\u0005ဂ\u0003\u0006ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new altp();
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
        return aihn.getParserForClass(altp.class);
    }
}
