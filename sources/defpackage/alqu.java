package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alqu extends aihn implements aiis {
    public static final alqu a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public apvn f;
    public int g;
    public apww i;
    private byte j = 2;
    public String d = "";
    public String e = "";
    public aiie h = emptyProtobufList();

    static {
        alqu alquVar = new alqu();
        a = alquVar;
        aihn.registerDefaultInstance(alqu.class, alquVar);
    }

    private alqu() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005᠌\u0004\u0006\u001b\bဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", apsb.m, "h", alqt.class, "i"});
            case 3:
                return new alqu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alqu.class);
            default:
                return null;
        }
    }
}
