package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class akls extends aihn implements aiis {
    public static final akls a;
    public static final aihl b;
    public int c;
    public asmv d;
    public CommandOuterClass$Command i;
    public CommandOuterClass$Command j;
    public boolean k;
    public akrl l;
    private byte m = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        akls aklsVar = new akls();
        a = aklsVar;
        aihn.registerDefaultInstance(akls.class, aklsVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), aklsVar, aklsVar, null, 183321338, aika.MESSAGE, akls.class);
    }

    private akls() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0004\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဈ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\u0000\tဇ\b\nᐉ\t", new Object[]{"c", "e", "f", "g", "h", "i", "j", "d", "k", "l"});
            case 3:
                return new akls();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akls.class);
            default:
                return null;
        }
    }
}
