package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lip extends aihn implements aiis {
    public static final lip a;
    public int b;
    public long e;
    public float f;
    public double g;
    public String c = "";
    public String d = "";
    public aiie h = emptyProtobufList();

    static {
        lip lipVar = new lip();
        a = lipVar;
        aihn.registerDefaultInstance(lip.class, lipVar);
    }

    private lip() {
    }

    public final void a() {
        aiie aiieVar = this.h;
        if (aiieVar.c()) {
            return;
        }
        this.h = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", lip.class});
        }
        if (iOrdinal == 3) {
            return new lip();
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
        return aihn.getParserForClass(lip.class);
    }
}
