package defpackage;

import com.google.protos.youtube.api.innertube.AutocropConfigOuterClass$AutocropConfig;
import com.google.protos.youtube.api.innertube.LivePlayerConfigOuterClass$LivePlayerConfig;
import com.google.protos.youtube.api.innertube.ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$MediaCommonConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoqd extends aihn implements aiis {
    public static final aoqd a;
    public ajcm A;
    public apld B;
    public aose C;
    public LivePlayerConfigOuterClass$LivePlayerConfig D;
    public ajvo E;
    public akjl F;
    public ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig G;
    public aqjo H;
    public akcu I;
    public ales J;
    public AutocropConfigOuterClass$AutocropConfig K;
    public ajui L;
    public aptb M;
    private arjo N;
    private byte O = 2;
    public int b;
    public int c;
    public int d;
    public MediaCommonConfigOuterClass$MediaCommonConfig e;
    public akwm f;
    public ajhg g;
    public aopd h;
    public aoor i;
    public aivp j;
    public ajbx k;
    public ajci l;
    public aobg m;
    public aoqe n;
    public amkq o;
    public aivy p;
    public aivq q;
    public amyz r;
    public arbm s;
    public akkf t;
    public argy u;
    public ajar v;
    public apby w;
    public akjx x;
    public ajcn y;
    public aqdd z;

    static {
        aoqd aoqdVar = new aoqd();
        a = aoqdVar;
        aihn.registerDefaultInstance(aoqd.class, aoqdVar);
    }

    private aoqd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.O);
            case 1:
                this.O = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001$\u0000\u0003\u0001\uf40a\ue07e\u0007$\u0000\u0000\u0002\u0001ဉ>\u0002ဉ?\u0003ဉ@\u0004ဉA\uecf6ᩫဉ\u0005\uf6f3ᮒဉ\u0001\uf5b9Შဉ\u0006\ue901₱ဉ\u000b\uf166₴ဉ\u000e\ue0e9™ဉ\r\uf5f4⎗ဉ\u0013ﱡ┤ဉ\u0014\uef6c▦ဉ\f\uf53f⪙ဉ\u0017鬒Ⳮဉ\u0010\uf29e⺷ᐉ\u001d\ue173⼗ဉ\u001c﵃らဉ\u001e\ue1abㄞဉ\u001f\ue2cc㓖ဉ\"\ueef5㠘ဉ%﹊㡎ဉ$\ue912㤁ဉ&\ue5b5㥳ဉ'\ue9ae㮀ဉ)\ue2d6㹳ဉ-\uf66d䉪ဉ.\ue4e9䉴ဉ*\uf463䧻ဉ/\uea9b䪟ဉ\u0007\ue708圭ဉ1\ue9c0曣ဉ\u0000\uf010癝ဉ6珞皍ᐉ5\ue8c4삣ဉ:\uf40a\ue07e\u0007ဉ<", new Object[]{"b", "c", "d", "J", "K", "L", "M", "g", "f", "h", "j", "m", "l", "o", "p", "k", "q", "n", "s", "r", "t", "u", "v", "x", "w", "y", "z", "A", "C", "D", "B", "E", "i", "F", "e", "G", "N", "H", "I"});
            case 3:
                return new aoqd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoqd.class);
            default:
                return null;
        }
    }
}
