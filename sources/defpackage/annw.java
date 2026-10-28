package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class annw extends aihn implements aiis {
    public static final annw a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public aiie i = emptyProtobufList();
    public aiie j = emptyProtobufList();
    public aiie k = emptyProtobufList();

    static {
        annw annwVar = new annw();
        a = annwVar;
        aihn.registerDefaultInstance(annw.class, annwVar);
    }

    private annw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\b\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001a\u0006\u001a\u0007\u001a\b\u001a\t\u001a", new Object[]{"b", "c", "d", "g", "h", "i", "j", "f", "e", "k"});
        }
        if (iOrdinal == 3) {
            return new annw();
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
        return aihn.getParserForClass(annw.class);
    }
}
