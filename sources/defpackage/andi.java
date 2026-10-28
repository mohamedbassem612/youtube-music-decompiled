package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class andi extends aihn implements aiis {
    public static final andi a;
    public int b;
    public ancq c;
    public andm d;
    public int e;
    public long f;
    public long g;
    public andk h;
    public andl i;
    public anea j;
    public andb k;
    public aiie l = emptyProtobufList();
    public aiie m = emptyProtobufList();

    static {
        andi andiVar = new andi();
        a = andiVar;
        aihn.registerDefaultInstance(andi.class, andiVar);
    }

    private andi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0000\u0001ဉ\u0001\u0002᠌\u0002\u0003ဃ\u0003\u0004ဃ\u0004\u0005ဉ\u0005\u0007ဉ\u0000\bဉ\u0006\tဉ\u0007\nဉ\b\u000b\u001b\f\u001b", new Object[]{"b", "d", "e", anbz.g, "f", "g", "h", "c", "i", "j", "k", "l", andz.class, "m", anda.class});
        }
        if (iOrdinal == 3) {
            return new andi();
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
        return aihn.getParserForClass(andi.class);
    }
}
