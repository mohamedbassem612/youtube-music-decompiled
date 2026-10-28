package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alwf extends aihn implements aiis {
    public static final alwf a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int f;
    public int i;
    private byte j = 2;
    public String d = "";
    public aiie e = emptyProtobufList();
    public aihv g = emptyIntList();
    public String h = "";

    static {
        alwf alwfVar = new alwf();
        a = alwfVar;
        aihn.registerDefaultInstance(alwf.class, alwfVar);
    }

    private alwf() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0005\u001a\u0006င\u0003\u0007'\bဈ\u0004\tင\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new alwf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwf.class);
            default:
                return null;
        }
    }
}
