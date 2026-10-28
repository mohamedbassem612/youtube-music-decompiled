package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiaz extends aihn implements aiis {
    public static final aiaz a;
    public int b;
    public aiby d;
    public int e;
    public aiaj g;
    public String c = "";
    public aiie f = emptyProtobufList();
    public String h = "";

    static {
        aiaz aiazVar = new aiaz();
        a = aiazVar;
        aihn.registerDefaultInstance(aiaz.class, aiazVar);
    }

    private aiaz() {
    }

    public final void a() {
        aiie aiieVar = this.f;
        if (aiieVar.c()) {
            return;
        }
        this.f = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0005᠌\u0002\u0006ဉ\u0003\u0007ဈ\u0004", new Object[]{"b", "c", "d", "f", aiay.class, "e", aibu.d, "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aiaz();
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
        return aihn.getParserForClass(aiaz.class);
    }
}
