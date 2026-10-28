package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxk extends aihn implements aiis {
    public static final apxk a;
    public static final aihl b;
    public int c;
    public asmv d;
    public alhq e;
    public boolean g;
    public boolean h;
    public boolean i;
    private byte j = 2;
    public String f = "";

    static {
        apxk apxkVar = new apxk();
        a = apxkVar;
        aihn.registerDefaultInstance(apxk.class, apxkVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), apxkVar, apxkVar, null, 427222820, aika.MESSAGE, apxk.class);
    }

    private apxk() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new apxk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxk.class);
            default:
                return null;
        }
    }
}
