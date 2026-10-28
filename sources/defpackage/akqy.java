package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akqy extends aihn implements aiis {
    public static final akqy a;
    public int b;
    public akqv c;
    public akrd d;
    public float f;
    public float h;
    public float i;
    public aiie j;
    public akpj k;
    public aiie e = emptyProtobufList();
    public aiie g = emptyProtobufList();

    static {
        akqy akqyVar = new akqy();
        a = akqyVar;
        aihn.registerDefaultInstance(akqy.class, akqyVar);
    }

    private akqy() {
        emptyProtobufList();
        this.j = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ခ\u0002\u0005\u001b\u0006ခ\u0003\u0007ခ\u0004\t\u001b\nဉ\u0005", new Object[]{"b", "c", "d", "e", akqx.class, "f", "g", akqw.class, "h", "i", "j", aqpj.class, "k"});
        }
        if (iOrdinal == 3) {
            return new akqy();
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
        return aihn.getParserForClass(akqy.class);
    }
}
