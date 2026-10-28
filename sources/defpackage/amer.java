package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amer extends aihn implements aiis {
    public static final amer a;
    public static final aihl b;
    public int c;
    public int d;
    public amep f;
    public int g;
    public int h;
    public int j;
    public int k;
    public apji m;
    public ajwo n;
    private ajwo o;
    private byte p = 2;
    public String e = "";
    public String i = "";
    public aiie l = emptyProtobufList();

    static {
        amer amerVar = new amer();
        a = amerVar;
        aihn.registerDefaultInstance(amer.class, amerVar);
        b = aihn.newSingularGeneratedExtension(apji.a, amerVar, amerVar, null, 1146, aika.MESSAGE, amer.class);
    }

    private amer() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aiht aihtVar = amed.k;
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0001\u0004\u0001ဈ\u0001\u0002ဉ\u0002\u0003င\u0003\u0004᠌\u0006\u0005᠌\u0007\u0006ᐉ\b\u0007Л\b᠌\u0000\tᐉ\t\nᐉ\n\u000bဈ\u0005\fင\u0004", new Object[]{"c", "e", "f", "g", "j", aihtVar, "k", aihtVar, "m", "l", ameq.class, "d", amed.m, "o", "n", "i", "h"});
            case 3:
                return new amer();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amer.class);
            default:
                return null;
        }
    }
}
