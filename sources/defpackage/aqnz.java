package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqnz extends aihn implements aiis {
    public static final aqnz a;
    public static final aihl b;
    public int c;
    public alhq d;
    private byte e = 2;

    static {
        aqnz aqnzVar = new aqnz();
        a = aqnzVar;
        aihn.registerDefaultInstance(aqnz.class, aqnzVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), aqnzVar, aqnzVar, null, 249145766, aika.MESSAGE, aqnz.class);
    }

    private aqnz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aqnz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqnz.class);
            default:
                return null;
        }
    }
}
