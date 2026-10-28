package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajmi extends aihn implements aiis {
    public static final ajmi a;
    public Object c;
    public int b = 0;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        ajmi ajmiVar = new ajmi();
        a = ajmiVar;
        aihn.registerDefaultInstance(ajmi.class, ajmiVar);
    }

    private ajmi() {
    }

    public final void a() {
        aiie aiieVar = this.e;
        if (aiieVar.c()) {
            return;
        }
        this.e = aihn.mutableCopy(aiieVar);
    }

    public final void b() {
        aiie aiieVar = this.d;
        if (aiieVar.c()) {
            return;
        }
        this.d = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0001\u0000\u0001\ue2d7４\u0007\f\u0000\u0002\u0000\u0001\u001a\u0002\u001a\u0003<\u0000\u0007<\u0000\b<\u0000\t<\u0000\ue8c6鈳<\u0000\uf646鲵<\u0000\ueacc뮸<\u0000ﯛ튃<\u0000\uf40d힇<\u0000\ue2d7４\u0007<\u0000", new Object[]{"c", "b", "d", "e", apuw.class, akhr.class, amkf.class, ajsu.class, ardt.class, arnx.class, aqjp.class, apck.class, aowd.class, ajmx.class});
        }
        if (iOrdinal == 3) {
            return new ajmi();
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
        return aihn.getParserForClass(ajmi.class);
    }
}
