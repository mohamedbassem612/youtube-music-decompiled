package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aopa extends aihn implements aiis {
    public static final aopa a;
    public static final aihl b;
    public int c;
    public askp d;
    public askp e;
    private askp h;
    private CommandOuterClass$Command i;
    private byte j = 2;
    public String f = "";
    public String g = "";

    static {
        aopa aopaVar = new aopa();
        a = aopaVar;
        aihn.registerDefaultInstance(aopa.class, aopaVar);
        b = aihn.newSingularGeneratedExtension(apji.a, aopaVar, aopaVar, null, 2093, aika.MESSAGE, aopa.class);
    }

    private aopa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aopa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aopa.class);
            default:
                return null;
        }
    }
}
