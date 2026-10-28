package defpackage;

import android.text.TextUtils;
import com.google.protobuf.MessageLite;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xdy {
    static final agkz a;
    public static final /* synthetic */ int j = 0;
    public final awmd b;
    public final vyo c;
    public final awmd d;
    public final vxz h;
    public final abxu i;
    private final awmd k;
    private final awmd l;
    private final Map m;
    private final awmd n;
    private final tqj o;
    private volatile Optional p = Optional.empty();
    public volatile agkj e = agpn.b;
    public volatile agkz f = agpr.a;
    private boolean q = false;
    public final Queue g = new agqn(new agit(20));

    static {
        new agqj("YOUTUBE_METALOG");
        a = new agqj("YOUTUBE_METALOG");
    }

    public xdy(vyo vyoVar, awmd awmdVar, Map map, awmd awmdVar2, abxu abxuVar, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, vxz vxzVar, tqj tqjVar) {
        this.c = vyoVar;
        this.b = awmdVar;
        this.m = map;
        this.k = awmdVar2;
        this.d = awmdVar3;
        this.l = awmdVar4;
        this.n = awmdVar5;
        this.h = vxzVar;
        this.o = tqjVar;
        this.i = abxuVar;
    }

    private final void e(String str) {
        zvl zvlVar = (zvl) this.k.io();
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
        zvjVarA.j = 13;
        zvjVarA.i = 189;
        zvjVarA.d(str);
        zvlVar.a(zvjVarA.a());
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [awmd, java.lang.Object] */
    public final kih a(kih kihVar, ajtk ajtkVar) {
        Optional optionalOf;
        int iOrdinal = ajtkVar.ordinal();
        if (iOrdinal == 0) {
            xeu xeuVar = (xeu) this.b.io();
            aihf aihfVarCreateBuilder = aqli.a.createBuilder();
            ajtk ajtkVar2 = ajtk.CLEARCUT_LOG_ACTION_UNKNOWN;
            aihfVarCreateBuilder.copyOnWrite();
            aqli aqliVar = (aqli) aihfVarCreateBuilder.instance;
            aqliVar.d = ajtkVar2.e;
            aqliVar.b |= 2;
            aihf aihfVarCreateBuilder2 = aqlh.a.createBuilder();
            String str = kihVar.h;
            aihfVarCreateBuilder2.copyOnWrite();
            aqlh aqlhVar = (aqlh) aihfVarCreateBuilder2.instance;
            str.getClass();
            aqlhVar.b |= 4;
            aqlhVar.d = str;
            int iA = kihVar.a();
            aihfVarCreateBuilder2.copyOnWrite();
            aqlh aqlhVar2 = (aqlh) aihfVarCreateBuilder2.instance;
            aqlhVar2.b |= 1;
            aqlhVar2.c = iA;
            aihfVarCreateBuilder.copyOnWrite();
            aqli aqliVar2 = (aqli) aihfVarCreateBuilder.instance;
            aqlh aqlhVar3 = (aqlh) aihfVarCreateBuilder2.build();
            aqlhVar3.getClass();
            aqliVar2.c = aqlhVar3;
            aqliVar2.b |= 1;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.THIRD_PARTY_LOG_MONITORING_EVENT);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                aqli aqliVar3 = (aqli) aihfVarCreateBuilder.build();
                aqliVar3.getClass();
                alouVar.d = aqliVar3;
                alouVar.c = 336;
                xeuVar.b((alou) alosVar.build());
            }
        } else {
            if (iOrdinal == 1) {
                return kihVar;
            }
            if (iOrdinal == 2) {
                xeu xeuVar2 = (xeu) this.b.io();
                aihf aihfVarCreateBuilder3 = aqli.a.createBuilder();
                ajtk ajtkVar3 = ajtk.CLEARCUT_LOG_ACTION_BLOCK;
                aihfVarCreateBuilder3.copyOnWrite();
                aqli aqliVar4 = (aqli) aihfVarCreateBuilder3.instance;
                aqliVar4.d = ajtkVar3.e;
                aqliVar4.b |= 2;
                aihf aihfVarCreateBuilder4 = aqlh.a.createBuilder();
                String str2 = kihVar.h;
                aihfVarCreateBuilder4.copyOnWrite();
                aqlh aqlhVar4 = (aqlh) aihfVarCreateBuilder4.instance;
                str2.getClass();
                aqlhVar4.b |= 4;
                aqlhVar4.d = str2;
                int iA2 = kihVar.a();
                aihfVarCreateBuilder4.copyOnWrite();
                aqlh aqlhVar5 = (aqlh) aihfVarCreateBuilder4.instance;
                aqlhVar5.b |= 1;
                aqlhVar5.c = iA2;
                aihfVarCreateBuilder3.copyOnWrite();
                aqli aqliVar5 = (aqli) aihfVarCreateBuilder3.instance;
                aqlh aqlhVar6 = (aqlh) aihfVarCreateBuilder4.build();
                aqlhVar6.getClass();
                aqliVar5.c = aqlhVar6;
                aqliVar5.b |= 1;
                if (xeuVar2.b) {
                    xff xffVarA2 = xeuVar2.a(aihfVarCreateBuilder3, alot.THIRD_PARTY_LOG_MONITORING_EVENT);
                    ztf ztfVar2 = xffVarA2.k.e;
                    xffVarA2.l = ztfVar2.a();
                    ztfVar2.k(xffVarA2);
                } else {
                    alos alosVar2 = (alos) alou.a.createBuilder();
                    alosVar2.copyOnWrite();
                    alou alouVar2 = (alou) alosVar2.instance;
                    aqli aqliVar6 = (aqli) aihfVarCreateBuilder3.build();
                    aqliVar6.getClass();
                    alouVar2.d = aqliVar6;
                    alouVar2.c = 336;
                    xeuVar2.b((alou) alosVar2.build());
                }
            } else {
                if (iOrdinal != 3) {
                    throw new RuntimeException(null, null);
                }
                aihf aihfVarCreateBuilder5 = arnp.a.createBuilder();
                String str3 = kihVar.h;
                aihfVarCreateBuilder5.copyOnWrite();
                arnp arnpVar = (arnp) aihfVarCreateBuilder5.instance;
                str3.getClass();
                arnpVar.b |= 4;
                arnpVar.d = str3;
                MessageLite messageLite = kihVar.n;
                aigj byteString = messageLite.toByteString();
                aihfVarCreateBuilder5.copyOnWrite();
                arnp arnpVar2 = (arnp) aihfVarCreateBuilder5.instance;
                byteString.getClass();
                arnpVar2.b |= 1;
                arnpVar2.c = byteString;
                if (kihVar.g == null) {
                    xeu xeuVar3 = (xeu) this.b.io();
                    if (xeuVar3.b) {
                        xff xffVarA3 = xeuVar3.a(aihfVarCreateBuilder5, alot.YOUTUBE_CLEARCUT_EVENT);
                        xffVarA3.n = "";
                        ztf ztfVar3 = xffVarA3.k.e;
                        xffVarA3.l = ztfVar3.a();
                        ztfVar3.k(xffVarA3);
                    } else {
                        alos alosVar3 = (alos) alou.a.createBuilder();
                        alosVar3.copyOnWrite();
                        alou alouVar3 = (alou) alosVar3.instance;
                        arnp arnpVar3 = (arnp) aihfVarCreateBuilder5.build();
                        arnpVar3.getClass();
                        alouVar3.d = arnpVar3;
                        alouVar3.c = 461;
                        alou alouVar4 = (alou) alosVar3.build();
                        zwa zwaVar = zvz.a;
                        xek xekVarA = xel.a();
                        xekVarA.b(zwaVar);
                        xeuVar3.d(alouVar4, xekVarA.a());
                    }
                } else {
                    ci ciVar = (ci) this.m.get(kihVar.h);
                    if (ciVar == null) {
                        e("Null extractor for log source ".concat(String.valueOf(kihVar.h)));
                    } else {
                        if (messageLite instanceof ahyk) {
                            ahyk ahykVar = (ahyk) messageLite;
                            ahyj ahyjVar = ahykVar.c;
                            if (ahyjVar == null) {
                                ahyjVar = ahyj.a;
                            }
                            ahyh ahyhVar = ahyjVar.e;
                            if (ahyhVar == null) {
                                ahyhVar = ahyh.a;
                            }
                            String str4 = ahyhVar.e;
                            if (TextUtils.isEmpty(str4)) {
                                zvl zvlVar = (zvl) ciVar.a.io();
                                zvj zvjVarA = zvk.a();
                                zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                                zvjVarA.j = 13;
                                zvjVarA.i = 189;
                                zvjVarA.d("obfuscatedGaiaId is empty");
                                zvlVar.a(zvjVarA.a());
                                optionalOf = Optional.empty();
                            } else {
                                Optional optionalEmpty = Optional.empty();
                                if (str4 == null) {
                                    throw new NullPointerException("Null obfuscatedGaiaId");
                                }
                                ahyj ahyjVar2 = ahykVar.c;
                                if (ahyjVar2 == null) {
                                    ahyjVar2 = ahyj.a;
                                }
                                ahyh ahyhVar2 = ahyjVar2.e;
                                if (ahyhVar2 == null) {
                                    ahyhVar2 = ahyh.a;
                                }
                                String str5 = ahyhVar2.f;
                                if (!TextUtils.isEmpty(str5)) {
                                    optionalEmpty = Optional.of(str5);
                                }
                                optionalOf = Optional.of(new xdt(str4, optionalEmpty));
                            }
                        } else {
                            zvl zvlVar2 = (zvl) ciVar.a.io();
                            zvj zvjVarA2 = zvk.a();
                            zvjVarA2.c(ajtv.ERROR_LEVEL_WARNING);
                            zvjVarA2.j = 13;
                            zvjVarA2.i = 189;
                            zvjVarA2.d("logEventBuilder.getSourceExtension() is not ChimeFrontendLog");
                            zvlVar2.a(zvjVarA2.a());
                            optionalOf = Optional.empty();
                        }
                        if (optionalOf.isEmpty()) {
                            e("No clearcutIdentityInfo present for logSource ".concat(String.valueOf(kihVar.h)));
                        } else {
                            Object obj = optionalOf.get();
                            String str6 = ((xdt) optionalOf.get()).a;
                            String str7 = (String) ((xdt) obj).b.orElse("");
                            if (str6.isEmpty()) {
                                e("UploadAccountName is present but Gaia is not for log source ".concat(String.valueOf(kihVar.h)));
                            } else {
                                zwa zwaVarY = ((zwe) this.l.io()).y(str7.isEmpty() ? yno.ac(str6, "") : yno.ac(str7, str6));
                                if (zwaVarY == null) {
                                    e("Null ID returned for getIdentityByDataSyncId for log source " + kihVar.h + ", madisonAccountId empty? " + str7.isEmpty());
                                } else {
                                    xeu xeuVar4 = (xeu) this.b.io();
                                    if (xeuVar4.b) {
                                        xff xffVarA4 = xeuVar4.a(aihfVarCreateBuilder5, alot.YOUTUBE_CLEARCUT_EVENT);
                                        xffVarA4.n = zwaVarY.k();
                                        xffVarA4.h = kihVar.b();
                                        ztf ztfVar4 = xffVarA4.k.e;
                                        xffVarA4.l = ztfVar4.a();
                                        ztfVar4.k(xffVarA4);
                                    } else {
                                        alos alosVar4 = (alos) alou.a.createBuilder();
                                        alosVar4.copyOnWrite();
                                        alou alouVar5 = (alou) alosVar4.instance;
                                        arnp arnpVar4 = (arnp) aihfVarCreateBuilder5.build();
                                        arnpVar4.getClass();
                                        alouVar5.d = arnpVar4;
                                        alouVar5.c = 461;
                                        alou alouVar6 = (alou) alosVar4.build();
                                        xek xekVarA2 = xel.a();
                                        xekVarA2.b(zwaVarY);
                                        xekVarA2.d(kihVar.b());
                                        xeuVar4.d(alouVar6, xekVarA2.a());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kig] */
    public final void b(kig kigVar) {
        Optional optional = this.p;
        if (true == optional.isPresent()) {
            kii.m.remove(optional.get());
        }
        this.p = Optional.of(kigVar);
        Optional optional2 = this.p;
        if (true == optional2.isPresent()) {
            kii.i(optional2.get());
        }
    }

    public final void c(ajtl ajtlVar) {
        if (ajtlVar.b) {
            b(new xdu());
            this.e = agpn.b;
            return;
        }
        if (ajtlVar.e.size() > 0) {
            this.f = (agkz) Collection.EL.stream(ajtlVar.e).map(new vmw(16)).collect(aghu.b);
        }
        this.e = (agkj) Collection.EL.stream(ajtlVar.d).collect(aghu.a(new rmm(12), new rmm(13)));
        final boolean z = ajtlVar.c;
        if (z || !this.e.isEmpty()) {
            b(new kig() { // from class: xdw
                @Override // defpackage.kig
                public final kih a(kih kihVar) {
                    if (kihVar == null) {
                        return null;
                    }
                    xdy xdyVar = this.a;
                    xdyVar.d();
                    ajtk ajtkVar = (ajtk) xdyVar.e.get(kihVar.h);
                    if (ajtkVar != null) {
                        return xdyVar.a(kihVar, ajtkVar);
                    }
                    if (z) {
                        xeu xeuVar = (xeu) xdyVar.b.io();
                        aihf aihfVarCreateBuilder = aqli.a.createBuilder();
                        aihf aihfVarCreateBuilder2 = aqlh.a.createBuilder();
                        String str = kihVar.h;
                        aihfVarCreateBuilder2.copyOnWrite();
                        aqlh aqlhVar = (aqlh) aihfVarCreateBuilder2.instance;
                        str.getClass();
                        aqlhVar.b |= 4;
                        aqlhVar.d = str;
                        int iA = kihVar.a();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aqlh aqlhVar2 = (aqlh) aihfVarCreateBuilder2.instance;
                        aqlhVar2.b |= 1;
                        aqlhVar2.c = iA;
                        aihfVarCreateBuilder.copyOnWrite();
                        aqli aqliVar = (aqli) aihfVarCreateBuilder.instance;
                        aqlh aqlhVar3 = (aqlh) aihfVarCreateBuilder2.build();
                        aqlhVar3.getClass();
                        aqliVar.c = aqlhVar3;
                        aqliVar.b |= 1;
                        if (xeuVar.b) {
                            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.THIRD_PARTY_LOG_MONITORING_EVENT);
                            ztf ztfVar = xffVarA.k.e;
                            xffVarA.l = ztfVar.a();
                            ztfVar.k(xffVarA);
                        } else {
                            alos alosVar = (alos) alou.a.createBuilder();
                            alosVar.copyOnWrite();
                            alou alouVar = (alou) alosVar.instance;
                            aqli aqliVar2 = (aqli) aihfVarCreateBuilder.build();
                            aqliVar2.getClass();
                            alouVar.d = aqliVar2;
                            alouVar.c = 336;
                            xeuVar.b((alou) alosVar.build());
                        }
                    }
                    return kihVar;
                }
            });
        } else {
            d();
            Optional optional = this.p;
            if (true == optional.isPresent()) {
                kii.m.remove(optional.get());
            }
            this.p = Optional.empty();
        }
        if (this.q) {
            return;
        }
        tqj tqjVar = this.o;
        int i = tqr.a;
        if (tqjVar.k(1073814375)) {
            Queue<kih> queue = this.g;
            synchronized (queue) {
                for (kih kihVar : queue) {
                    ajtk ajtkVar = (ajtk) this.e.get(kihVar.h);
                    if (ajtkVar == null) {
                        ajtkVar = ajtk.CLEARCUT_LOG_ACTION_UNKNOWN;
                    }
                    a(kihVar, ajtkVar);
                }
                queue.clear();
            }
            this.q = true;
        }
    }

    public final void d() {
        if (this.h.m(54, 45429419L)) {
        }
    }
}
