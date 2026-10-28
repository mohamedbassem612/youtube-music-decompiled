package defpackage;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alty extends aihn implements aiis {
    public static final alty a;
    public int b;
    public long c;
    public long e;
    public boolean f;
    public boolean h;
    public int i;
    public int j;
    public String d = "";
    public aiie g = emptyProtobufList();

    static {
        alty altyVar = new alty();
        a = altyVar;
        aihn.registerDefaultInstance(alty.class, altyVar);
    }

    private alty() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005\u001b\u0006ဇ\u0004\u0007᠌\u0005\b᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", FormatIdOuterClass$FormatId.class, "h", "i", aqkp.q, "j", aqkp.t});
        }
        if (iOrdinal == 3) {
            return new alty();
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
        return aihn.getParserForClass(alty.class);
    }
}
