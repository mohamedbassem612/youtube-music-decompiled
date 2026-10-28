package defpackage;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aluw extends aihn implements aiis {
    public static final aluw a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public aiie i;

    static {
        aluw aluwVar = new aluw();
        a = aluwVar;
        aihn.registerDefaultInstance(aluw.class, aluwVar);
    }

    private aluw() {
        emptyProtobufList();
        this.i = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0005ဋ\u0003\u0006ဋ\u0004\bဇ\u0006\t\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", FormatIdOuterClass$FormatId.class});
        }
        if (iOrdinal == 3) {
            return new aluw();
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
        return aihn.getParserForClass(aluw.class);
    }
}
