package defpackage;

import android.content.Context;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aerk extends qjs {
    private final tqj a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final Context e;
    private final aess f;

    public aerk(tqj tqjVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, Context context, aess aessVar) {
        this.a = tqjVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = context;
        this.f = aessVar;
    }

    private final aihf d(aihf aihfVar, axhz axhzVar) {
        int i;
        aihf aihfVarCreateBuilder = ajej.a.createBuilder();
        axhq axhqVar = axhzVar.h;
        if (axhqVar == null) {
            axhqVar = axhq.a;
        }
        int iBt = a.bt(axhqVar.g);
        if (iBt == 0) {
            iBt = 1;
        }
        int i2 = iBt - 1;
        if (i2 == 0) {
            i = 1;
        } else if (i2 == 1) {
            i = 13;
        } else if (i2 == 2) {
            i = 14;
        } else if (i2 != 3) {
            i = i2 != 4 ? 11 : 16;
        } else {
            i = 15;
        }
        aihfVarCreateBuilder.copyOnWrite();
        ajej ajejVar = (ajej) aihfVarCreateBuilder.instance;
        ajejVar.c = i - 1;
        ajejVar.b |= 1;
        String strB = txz.b(this.e);
        aihfVarCreateBuilder.copyOnWrite();
        ajej ajejVar2 = (ajej) aihfVarCreateBuilder.instance;
        strB.getClass();
        ajejVar2.b |= 2;
        ajejVar2.d = strB;
        aihfVarCreateBuilder.copyOnWrite();
        ajej ajejVar3 = (ajej) aihfVarCreateBuilder.instance;
        aqih aqihVar = (aqih) aihfVar.build();
        aqihVar.getClass();
        ajejVar3.e = aqihVar;
        ajejVar3.b |= 16;
        return aihfVarCreateBuilder;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x02cc  */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, mbc] */
    @Override // defpackage.qjs
    protected final ListenableFuture c(axhz axhzVar) {
        String str;
        axhz axhzVar2;
        int i;
        int i2 = tqr.a;
        tqj tqjVar = this.a;
        if ((!tqjVar.k(1073808360) || !tqjVar.k(1073808361) || !tqjVar.k(1073808362)) && !tqjVar.k(1073808373)) {
            return aher.a;
        }
        axgt axgtVar = axhzVar.g;
        if (axgtVar == null) {
            axgtVar = axgt.a;
        }
        if (axgtVar.b.size() > 0) {
            axgt axgtVar2 = axhzVar.g;
            if (axgtVar2 == null) {
                axgtVar2 = axgt.a;
            }
            Iterator it = axgtVar2.b.iterator();
            while (it.hasNext()) {
                ((axgs) it.next()).getSerializedSize();
            }
        }
        aihf aihfVarCreateBuilder = aqih.a.createBuilder();
        axhq axhqVar = axhzVar.h;
        if (axhqVar == null) {
            axhqVar = axhq.a;
        }
        boolean z = axhqVar.c;
        Pair pairCreate = null;
        if (tqjVar.k(1073815150) && !z) {
            if ((axhzVar.b & SemanticState.LiveRegion) != 0) {
                aihf builder = axhzVar.toBuilder();
                axht axhtVar = axhzVar.k;
                if (axhtVar == null) {
                    axhtVar = axht.a;
                }
                aiie<axhs> aiieVar = axhtVar.l;
                if (!aiieVar.isEmpty()) {
                    jrr jrrVar = (jrr) axhw.a.createBuilder();
                    axhs axhsVar = null;
                    for (axhs axhsVar2 : aiieVar) {
                        if (axhsVar != null && (i = axhsVar.e + 1) != axhsVar2.d) {
                            jrrVar.e(0);
                            jrrVar.d(i);
                        }
                        jrrVar.e(axhsVar2.c);
                        jrrVar.d(axhsVar2.d);
                        axhsVar = axhsVar2;
                    }
                    if (axhsVar != null && (axhsVar.b & 4) != 0) {
                        int i3 = axhsVar.e + 1;
                        jrrVar.e(0);
                        jrrVar.d(i3);
                    }
                    aihh aihhVar = (aihh) axhtVar.toBuilder();
                    aihhVar.copyOnWrite();
                    ((axht) aihhVar.instance).l = axht.emptyProtobufList();
                    aihhVar.copyOnWrite();
                    axht axhtVar2 = (axht) aihhVar.instance;
                    axhw axhwVar = (axhw) jrrVar.build();
                    axhwVar.getClass();
                    axhtVar2.k = axhwVar;
                    axhtVar2.b |= SemanticState.Focused;
                    axhtVar = (axht) aihhVar.build();
                }
                builder.copyOnWrite();
                axhz axhzVar3 = (axhz) builder.instance;
                axhtVar.getClass();
                axhzVar3.k = axhtVar;
                axhzVar3.b |= SemanticState.LiveRegion;
                axhzVar2 = (axhz) builder.build();
            } else {
                axhzVar2 = null;
            }
            if (axhzVar2 != null) {
                axhzVar = axhzVar2;
            }
        }
        aigj byteString = axhzVar.toByteString();
        aihfVarCreateBuilder.copyOnWrite();
        aqih aqihVar = (aqih) aihfVarCreateBuilder.instance;
        aqihVar.b |= 8;
        aqihVar.f = byteString;
        if (!tqjVar.k(1073808371) || (axhzVar.b & SemanticState.LiveRegion) == 0) {
            awmd awmdVar = this.c;
            ((aepv) awmdVar.io()).g(aihfVarCreateBuilder);
            ((aepv) awmdVar.io()).f(aihfVarCreateBuilder);
        }
        if (z) {
            aihf aihfVarCreateBuilder2 = aqib.a.createBuilder();
            aess aessVar = this.f;
            ?? r6 = aessVar.d;
            long epochMilli = r6.f().toEpochMilli();
            aihfVarCreateBuilder2.copyOnWrite();
            aqib aqibVar = (aqib) aihfVarCreateBuilder2.instance;
            aqibVar.b |= 8;
            aqibVar.e = epochMilli;
            axhq axhqVar2 = axhzVar.h;
            if (axhqVar2 == null) {
                axhqVar2 = axhq.a;
            }
            int iBt = a.bt(axhqVar2.g);
            if ((iBt == 0 || iBt != 6) && (str = ((aeta) this.d.io()).a) != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                aqib aqibVar2 = (aqib) aihfVarCreateBuilder2.instance;
                aqibVar2.b |= 1;
                aqibVar2.c = str;
            }
            aihfVarCreateBuilder.copyOnWrite();
            aqih aqihVar2 = (aqih) aihfVarCreateBuilder.instance;
            aqib aqibVar3 = (aqib) aihfVarCreateBuilder2.build();
            aqibVar3.getClass();
            aqihVar2.g = aqibVar3;
            aqihVar2.b |= 64;
            if (!tqjVar.k(1073808367) && !tqjVar.k(1073808373)) {
                xeu xeuVar = (xeu) this.b.io();
                if (tqjVar.k(1073808369)) {
                    aihf aihfVarD = d(aihfVarCreateBuilder, axhzVar);
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(aihfVarD, alot.APP_CRASHED);
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.l(xffVarA);
                    } else {
                        alos alosVar = (alos) alou.a.createBuilder();
                        alosVar.copyOnWrite();
                        alou alouVar = (alou) alosVar.instance;
                        ajej ajejVar = (ajej) aihfVarD.build();
                        ajejVar.getClass();
                        alouVar.d = ajejVar;
                        alouVar.c = 20;
                        xeuVar.e((alou) alosVar.build());
                    }
                } else {
                    aihf aihfVarCreateBuilder3 = aqig.a.createBuilder();
                    aihfVarCreateBuilder3.copyOnWrite();
                    aqig aqigVar = (aqig) aihfVarCreateBuilder3.instance;
                    aqih aqihVar3 = (aqih) aihfVarCreateBuilder.build();
                    aqihVar3.getClass();
                    aqigVar.c = aqihVar3;
                    aqigVar.b |= 1;
                    if (xeuVar.b) {
                        xff xffVarA2 = xeuVar.a(aihfVarCreateBuilder3, alot.SYSTEM_HEALTH_CAPTURED);
                        ztf ztfVar2 = xffVarA2.k.e;
                        xffVarA2.l = ztfVar2.a();
                        ztfVar2.l(xffVarA2);
                    } else {
                        alos alosVar2 = (alos) alou.a.createBuilder();
                        alosVar2.copyOnWrite();
                        alou alouVar2 = (alou) alosVar2.instance;
                        aqig aqigVar2 = (aqig) aihfVarCreateBuilder3.build();
                        aqigVar2.getClass();
                        alouVar2.d = aqigVar2;
                        alouVar2.c = 3;
                        xeuVar.e((alou) alosVar2.build());
                    }
                }
            } else if (tqjVar.k(1073808374)) {
                afba.V((ajej) d(aihfVarCreateBuilder, axhzVar).build(), afba.Q(aessVar, aesv.JAVA_CRASH, r6.f().toEpochMilli()));
            } else if (tqjVar.k(1073808375)) {
                axhq axhqVar3 = axhzVar.h;
                if (axhqVar3 == null) {
                    axhqVar3 = axhq.a;
                }
                int iBt2 = a.bt(axhqVar3.g);
                if (iBt2 == 0 || iBt2 != 6) {
                    afba.U(aessVar, (ajej) d(aihfVarCreateBuilder, axhzVar).build(), aesv.JAVA_CRASH);
                } else {
                    afba.U(aessVar, (ajej) d(aihfVarCreateBuilder, axhzVar).build(), aesv.NATIVE_CRASH);
                }
            } else {
                afba.U(aessVar, (ajej) d(aihfVarCreateBuilder, axhzVar).build(), aesv.JAVA_CRASH);
            }
        } else {
            int i4 = axhzVar.b;
            if ((i4 & SemanticState.LiveRegion) != 0 || (i4 & 8) != 0) {
                axgh axghVar = axhzVar.t;
                if (axghVar == null) {
                    axghVar = axgh.a;
                }
                aihl aihlVar = axgl.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                axghVar.c(aihlVarCheckIsLite);
                if (axghVar.j.n(aihlVarCheckIsLite.d)) {
                    axgh axghVar2 = axhzVar.t;
                    if (axghVar2 == null) {
                        axghVar2 = axgh.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    axghVar2.c(aihlVarCheckIsLite2);
                    Object objK = axghVar2.j.k(aihlVarCheckIsLite2.d);
                    axgl axglVar = (axgl) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    if ((axglVar.c & 1) != 0) {
                        axgi axgiVar = axglVar.d;
                        if (axgiVar == null) {
                            axgiVar = axgi.a;
                        }
                        if ((axgiVar.b & 16777216) != 0) {
                            axgi axgiVar2 = axglVar.d;
                            if (axgiVar2 == null) {
                                axgiVar2 = axgi.a;
                            }
                            String str2 = axgiVar2.C;
                            aijp aijpVar = axglVar.f;
                            if (aijpVar == null) {
                                aijpVar = aijp.a;
                            }
                            pairCreate = Pair.create(str2, Long.valueOf(aijpVar.b));
                        }
                    }
                }
            }
            xeu xeuVar2 = (xeu) this.b.io();
            aihf aihfVarCreateBuilder4 = aqig.a.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            aqig aqigVar3 = (aqig) aihfVarCreateBuilder4.instance;
            aqih aqihVar4 = (aqih) aihfVarCreateBuilder.build();
            aqihVar4.getClass();
            aqigVar3.c = aqihVar4;
            aqigVar3.b |= 1;
            if (pairCreate == null || ((Long) pairCreate.second).longValue() <= 0) {
                if (tqjVar.k(1073815129) && (axhzVar.b & SemanticState.Obscured) != 0) {
                    axha axhaVar = axhzVar.m;
                    if (axhaVar == null) {
                        axhaVar = axha.a;
                    }
                    if (axhaVar.c.size() < 3) {
                        return aher.a;
                    }
                }
                if (xeuVar2.b) {
                    xff xffVarA3 = xeuVar2.a(aihfVarCreateBuilder4, alot.SYSTEM_HEALTH_CAPTURED);
                    ztf ztfVar3 = xffVarA3.k.e;
                    xffVarA3.l = ztfVar3.a();
                    ztfVar3.k(xffVarA3);
                } else {
                    alos alosVar3 = (alos) alou.a.createBuilder();
                    alosVar3.copyOnWrite();
                    alou alouVar3 = (alou) alosVar3.instance;
                    aqig aqigVar4 = (aqig) aihfVarCreateBuilder4.build();
                    aqigVar4.getClass();
                    alouVar3.d = aqigVar4;
                    alouVar3.c = 3;
                    xeuVar2.b((alou) alosVar3.build());
                }
            } else {
                if (!((String) pairCreate.first).isEmpty()) {
                    String str3 = (String) pairCreate.first;
                    aihfVarCreateBuilder4.copyOnWrite();
                    aqig aqigVar5 = (aqig) aihfVarCreateBuilder4.instance;
                    str3.getClass();
                    aqigVar5.b |= 2;
                    aqigVar5.d = str3;
                }
                if (xeuVar2.b) {
                    xff xffVarA4 = xeuVar2.a(aihfVarCreateBuilder4, alot.SYSTEM_HEALTH_CAPTURED);
                    xffVarA4.h = ((Long) pairCreate.second).longValue();
                    ztf ztfVar4 = xffVarA4.k.e;
                    xffVarA4.l = ztfVar4.a();
                    ztfVar4.k(xffVarA4);
                } else {
                    alos alosVar4 = (alos) alou.a.createBuilder();
                    alosVar4.copyOnWrite();
                    alou alouVar4 = (alou) alosVar4.instance;
                    aqig aqigVar6 = (aqig) aihfVarCreateBuilder4.build();
                    aqigVar6.getClass();
                    alouVar4.d = aqigVar6;
                    alouVar4.c = 3;
                    xeuVar2.d((alou) alosVar4.build(), xel.c(((Long) pairCreate.second).longValue()));
                }
            }
        }
        return aher.a;
    }
}
