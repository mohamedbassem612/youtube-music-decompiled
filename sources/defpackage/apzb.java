package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apzb extends aihn implements aiis {
    public static final apzb a;
    public static final aihl b;
    public int c;
    public String d = "";
    public aiie e = emptyProtobufList();

    static {
        apzb apzbVar = new apzb();
        a = apzbVar;
        aihn.registerDefaultInstance(apzb.class, apzbVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apzbVar, apzbVar, null, 218924094, aika.MESSAGE, apzb.class);
    }

    private apzb() {
    }

    public final void a() {
        aiie aiieVar = this.e;
        if (aiieVar.c()) {
            return;
        }
        this.e = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"c", "d", "e", apyx.class});
        }
        if (iOrdinal == 3) {
            return new apzb();
        }
        if (iOrdinal == 4) {
            return new aihf((byte[][][]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apzb.class);
        }
        return null;
    }
}
