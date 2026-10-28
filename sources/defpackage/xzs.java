package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.CommonApis;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xzs {
    static final /* synthetic */ awsj[] a = {new awrf(xzs.class, "mdxSessionManager", "getMdxSessionManager()Lcom/google/android/libraries/youtube/mdx/remote/MdxSessionManager;"), new awrf(xzs.class, "eventLogger", "getEventLogger()Lcom/google/android/libraries/youtube/logging/event/EventLogger;")};
    public static final awqg b;
    private final xpi c;
    private final awut d;
    private final mbc e;
    private final aunn f;
    private final aunn g;

    static {
        int i = awrn.a;
        twu.b(new awqv(xzs.class).c()).getClass();
        b = new xzn(0);
    }

    public xzs(xpi xpiVar, awut awutVar, mbc mbcVar, aunn aunnVar, aunn aunnVar2) {
        awutVar.getClass();
        mbcVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        this.c = xpiVar;
        this.d = awutVar;
        this.e = mbcVar;
        this.f = aunnVar;
        this.g = aunnVar2;
    }

    public static /* synthetic */ ListenableFuture d(xzs xzsVar, aihf aihfVar, int i, xzt xztVar, int i2) {
        if ((i2 & 4) != 0) {
            xztVar = xzt.a;
        }
        xzt xztVar2 = xztVar;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        int i3 = i;
        awut awutVar = xzsVar.d;
        awqg awqgVar = b;
        xztVar2.getClass();
        awqgVar.getClass();
        return awrc.ag(awutVar, awov.a, new xzr(xzsVar, aihfVar, i3, xztVar2, awqgVar, null));
    }

    private final xeu g() {
        return (xeu) taq.i(this.g, a[1]);
    }

    private final void h(String str) {
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            if (g().b) {
                xff xffVarA = g().a(new xzo(str, 0), alot.REMOTE_CONTROL_COMPLETED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            }
            xeu xeuVarG = g();
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.getClass();
            aihf aihfVarCreateBuilder = amxw.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            amxw amxwVar = (amxw) aihfVarCreateBuilder.instance;
            amxwVar.b |= 1;
            amxwVar.c = str;
            aihfVarCreateBuilder.copyOnWrite();
            amxw amxwVar2 = (amxw) aihfVarCreateBuilder.instance;
            amxwVar2.d = 2;
            amxwVar2.b |= 2;
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            alouVar.d = (amxw) aihnVarBuild;
            alouVar.c = 544;
            xeuVarG.b(afxw.at(alosVar));
        }
    }

    public final alwt a(apic apicVar, String str, String str2, xzt xztVar) {
        long jBetween = ChronoUnit.MICROS.between(Instant.EPOCH, this.e.f());
        aihf aihfVarCreateBuilder = alwt.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihf aihfVarCreateBuilder2 = aklk.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihf aihfVarCreateBuilder3 = apiu.a.createBuilder();
        aihfVarCreateBuilder3.getClass();
        aihfVarCreateBuilder3.copyOnWrite();
        apiu apiuVar = (apiu) aihfVarCreateBuilder3.instance;
        apiuVar.e = apicVar;
        apiuVar.b |= 8;
        aihfVarCreateBuilder3.copyOnWrite();
        apiu apiuVar2 = (apiu) aihfVarCreateBuilder3.instance;
        apiuVar2.b |= 2;
        apiuVar2.c = jBetween;
        int i = xztVar.d;
        if (i != 1) {
            aihfVarCreateBuilder3.copyOnWrite();
            apiu apiuVar3 = (apiu) aihfVarCreateBuilder3.instance;
            apiuVar3.d = i - 1;
            apiuVar3.b |= 4;
        }
        afxw.ae(acfz.bl(aihfVarCreateBuilder3), aihfVarCreateBuilder2);
        aihf aihfVarCreateBuilder4 = airu.a.createBuilder();
        aihfVarCreateBuilder4.getClass();
        aihf aihfVarCreateBuilder5 = aisn.a.createBuilder();
        aihfVarCreateBuilder5.getClass();
        aihf aihfVarCreateBuilder6 = aiso.a.createBuilder();
        aihfVarCreateBuilder6.getClass();
        aihfVarCreateBuilder6.copyOnWrite();
        aiso aisoVar = (aiso) aihfVarCreateBuilder6.instance;
        aisoVar.b |= 4;
        aisoVar.d = str;
        aihfVarCreateBuilder6.copyOnWrite();
        aiso aisoVar2 = (aiso) aihfVarCreateBuilder6.instance;
        aisoVar2.b |= 2;
        aisoVar2.c = str2;
        aihn aihnVarBuild = aihfVarCreateBuilder6.build();
        aihnVarBuild.getClass();
        aihfVarCreateBuilder5.copyOnWrite();
        aisn aisnVar = (aisn) aihfVarCreateBuilder5.instance;
        aisnVar.c = (aiso) aihnVarBuild;
        aisnVar.b = 1;
        aihn aihnVarBuild2 = aihfVarCreateBuilder5.build();
        aihnVarBuild2.getClass();
        aihfVarCreateBuilder4.copyOnWrite();
        airu airuVar = (airu) aihfVarCreateBuilder4.instance;
        airuVar.c = (aisn) aihnVarBuild2;
        airuVar.b |= 1;
        boolean z = xztVar.b;
        aihfVarCreateBuilder4.copyOnWrite();
        airu airuVar2 = (airu) aihfVarCreateBuilder4.instance;
        airuVar2.b |= 2;
        airuVar2.d = z;
        aihn aihnVarBuild3 = aihfVarCreateBuilder4.build();
        aihnVarBuild3.getClass();
        aihfVarCreateBuilder2.copyOnWrite();
        aklk aklkVar = (aklk) aihfVarCreateBuilder2.instance;
        aklkVar.c = (airu) aihnVarBuild3;
        aklkVar.b |= 1;
        acfz.bk(afxw.ac(aihfVarCreateBuilder2), aihfVarCreateBuilder);
        return acfz.bj(aihfVarCreateBuilder);
    }

    public final alwt b(int i, apih apihVar, String str, String str2, xzt xztVar) {
        str2.getClass();
        int i2 = xztVar.d;
        if (i2 == 1) {
            if (apihVar != null) {
                i2 = 3;
            } else if (i != 0) {
                i2 = 2;
            } else {
                i = 0;
                i2 = 1;
            }
        }
        aihf aihfVarCreateBuilder = apic.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihf aihfVarCreateBuilder2 = apik.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        if (i != 0) {
            aihfVarCreateBuilder2.copyOnWrite();
            apik apikVar = (apik) aihfVarCreateBuilder2.instance;
            apikVar.c = i - 1;
            apikVar.b |= 1;
        }
        aihn aihnVarBuild = aihfVarCreateBuilder2.build();
        aihnVarBuild.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        apic apicVar = (apic) aihfVarCreateBuilder.instance;
        apicVar.c = (apik) aihnVarBuild;
        apicVar.b = 1;
        if (apihVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            apic apicVar2 = (apic) aihfVarCreateBuilder.instance;
            apicVar2.c = apihVar;
            apicVar2.b = 2;
        }
        return a(acfz.bm(aihfVarCreateBuilder), str, str2, xzt.a(xztVar, i2));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f6 A[PHI: r2
      0x01f6: PHI (r2v2 int) = (r2v1 int), (r2v36 int) binds: [B:102:0x01d9, B:110:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ae  */
    public final Object c(aihf aihfVar, int i, xzt xztVar, awqg awqgVar, awoq awoqVar) throws Throwable {
        xzq xzqVar;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        awqg awqgVar2;
        awrm awrmVar;
        Object objInvoke;
        if (awoqVar instanceof xzq) {
            xzqVar = (xzq) awoqVar;
            int i4 = xzqVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                xzqVar.c = i4 - Integer.MIN_VALUE;
            } else {
                xzqVar = new xzq(this, awoqVar);
            }
        } else {
            xzqVar = new xzq(this, awoqVar);
        }
        Object objAd = xzqVar.a;
        awox awoxVar = awox.a;
        int i5 = xzqVar.c;
        if (i5 == 0) {
            atqp.j(objAd);
            aklk aklkVar = ((alwt) aihfVar.instance).e;
            if (aklkVar == null) {
                aklkVar = aklk.a;
            }
            apiu apiuVar = aklkVar.e;
            if (apiuVar == null) {
                apiuVar = apiu.a;
            }
            apic apicVar = apiuVar.e;
            if (apicVar == null) {
                apicVar = apic.a;
            }
            apicVar.getClass();
            switch (apicVar.b) {
                case 0:
                    i2 = 23;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 5;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 7;
                    break;
                case 8:
                    i2 = 8;
                    break;
                case 9:
                    i2 = 9;
                    break;
                case 10:
                    i2 = 10;
                    break;
                case 11:
                    i2 = 11;
                    break;
                case 12:
                    i2 = 12;
                    break;
                case 13:
                    i2 = 13;
                    break;
                case 14:
                    i2 = 14;
                    break;
                case 15:
                    i2 = 15;
                    break;
                case 16:
                    i2 = 16;
                    break;
                case 17:
                    i2 = 17;
                    break;
                case 18:
                    i2 = 18;
                    break;
                case 19:
                    i2 = 19;
                    break;
                case 20:
                    i2 = 20;
                    break;
                case 21:
                    i2 = 21;
                    break;
                case 22:
                    i2 = 22;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == 0) {
                throw null;
            }
            int i6 = i2 - 1;
            boolean z3 = (i6 == 18 || i6 == 20) ? false : true;
            awrm awrmVar2 = new awrm();
            aklk aklkVar2 = ((alwt) aihfVar.instance).e;
            if (aklkVar2 == null) {
                aklkVar2 = aklk.a;
            }
            apiu apiuVar2 = aklkVar2.e;
            if (apiuVar2 == null) {
                apiuVar2 = apiu.a;
            }
            String str = apiuVar2.f;
            str.getClass();
            awrmVar2.a = str;
            Object obj = awrmVar2.a;
            if (z3) {
                if (((CharSequence) obj).length() == 0) {
                    String string = UUID.randomUUID().toString();
                    string.getClass();
                    awrmVar2.a = string;
                    aklk aklkVar3 = ((alwt) aihfVar.instance).e;
                    if (aklkVar3 == null) {
                        aklkVar3 = aklk.a;
                    }
                    aklkVar3.getClass();
                    aihf builder = aklkVar3.toBuilder();
                    builder.getClass();
                    aihf builder2 = afxw.ad(builder).toBuilder();
                    builder2.getClass();
                    String str2 = (String) awrmVar2.a;
                    str2.getClass();
                    builder2.copyOnWrite();
                    apiu apiuVar3 = (apiu) builder2.instance;
                    apiuVar3.b |= 16;
                    apiuVar3.f = str2;
                    afxw.ae(acfz.bl(builder2), builder);
                    aklk aklkVarAc = afxw.ac(builder);
                    aihfVar.copyOnWrite();
                    alwt alwtVar = (alwt) aihfVar.instance;
                    alwtVar.e = aklkVarAc;
                    alwtVar.b |= 16;
                }
            } else if (((CharSequence) obj).length() > 0) {
                aklk aklkVar4 = ((alwt) aihfVar.instance).e;
                if (aklkVar4 == null) {
                    aklkVar4 = aklk.a;
                }
                aklkVar4.getClass();
                aihf builder3 = aklkVar4.toBuilder();
                builder3.getClass();
                aihf builder4 = afxw.ad(builder3).toBuilder();
                builder4.getClass();
                builder4.copyOnWrite();
                apiu apiuVar4 = (apiu) builder4.instance;
                apiuVar4.b &= -17;
                apiuVar4.f = apiu.a.f;
                afxw.ae(acfz.bl(builder4), builder3);
                aklk aklkVarAc2 = afxw.ac(builder3);
                aihfVar.copyOnWrite();
                alwt alwtVar2 = (alwt) aihfVar.instance;
                alwtVar2.e = aklkVarAc2;
                alwtVar2.b |= 16;
                awrmVar2.a = "";
            }
            if (xztVar.b) {
                z = true;
            } else {
                aklk aklkVar5 = ((alwt) aihfVar.instance).e;
                if (aklkVar5 == null) {
                    aklkVar5 = aklk.a;
                }
                airu airuVar = aklkVar5.c;
                if (airuVar == null) {
                    airuVar = airu.a;
                }
                if (airuVar.d) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (xztVar.c) {
                z2 = true;
            } else {
                yco ycoVar = ((ycp) taq.i(this.f, a[0])).e;
                if (awrc.c(ycoVar != null ? ycoVar.y() : null, "DOES_NOT_MATCH_RECEIVER")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            int iD = xztVar.d;
            if (iD != 1) {
                i3 = iD;
            } else {
                aklk aklkVar6 = ((alwt) aihfVar.instance).e;
                if (aklkVar6 == null) {
                    aklkVar6 = aklk.a;
                }
                apiu apiuVar5 = aklkVar6.e;
                if (apiuVar5 == null) {
                    apiuVar5 = apiu.a;
                }
                iD = CommonApis.d(apiuVar5.d);
                if (iD == 0) {
                    i3 = 1;
                } else {
                    i3 = iD;
                }
            }
            String str3 = (String) awrmVar2.a;
            String str4 = str3.length() <= 0 ? null : str3;
            if (str4 != null) {
                if (g().b) {
                    xff xffVarA = g().a(new xzp(str4, i, i3, z, z2), alot.REMOTE_CONTROL_STARTED);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    int i7 = i3;
                    boolean z4 = z;
                    boolean z5 = z2;
                    xeu xeuVarG = g();
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.getClass();
                    aihf aihfVarCreateBuilder = amxx.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    aihfVarCreateBuilder.copyOnWrite();
                    amxx amxxVar = (amxx) aihfVarCreateBuilder.instance;
                    amxxVar.b |= 1;
                    amxxVar.c = str4;
                    if (i == 0) {
                        throw null;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    amxx amxxVar2 = (amxx) aihfVarCreateBuilder.instance;
                    amxxVar2.d = i - 1;
                    amxxVar2.b |= 2;
                    if (i7 != 1) {
                        aihfVarCreateBuilder.copyOnWrite();
                        amxx amxxVar3 = (amxx) aihfVarCreateBuilder.instance;
                        amxxVar3.e = i7 - 1;
                        amxxVar3.b |= 4;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    amxx amxxVar4 = (amxx) aihfVarCreateBuilder.instance;
                    amxxVar4.b |= 8;
                    amxxVar4.f = z4;
                    aihfVarCreateBuilder.copyOnWrite();
                    amxx amxxVar5 = (amxx) aihfVarCreateBuilder.instance;
                    amxxVar5.b |= 16;
                    amxxVar5.g = z5;
                    aihn aihnVarBuild = aihfVarCreateBuilder.build();
                    aihnVarBuild.getClass();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    alouVar.d = (amxx) aihnVarBuild;
                    alouVar.c = 543;
                    xeuVarG.b(afxw.at(alosVar));
                }
            }
            try {
                xpi xpiVar = this.c;
                aihfVar.getClass();
                amyf amyfVar = xpiVar.e.l;
                if (amyfVar != null) {
                    aihfVar.copyOnWrite();
                    alwt alwtVar3 = (alwt) aihfVar.instance;
                    alwtVar3.d = amyfVar;
                    alwtVar3.b |= 2;
                }
                abxv abxvVar = xpiVar.b;
                zwa zwaVarE = xpiVar.d.e();
                zwaVarE.getClass();
                ListenableFuture listenableFutureB = xpiVar.f.b(new xph(abxvVar, zwaVarE, aihfVar), xpiVar.c, null);
                xzqVar.d = (xzn) awqgVar;
                xzqVar.e = awrmVar2;
                xzqVar.c = 1;
                objAd = awrc.ad(listenableFutureB, xzqVar);
                if (objAd == awoxVar) {
                    return awoxVar;
                }
                awqgVar2 = awqgVar;
                awrmVar = awrmVar2;
            } catch (toe e) {
                e = e;
                awqgVar2 = awqgVar;
                awrmVar = awrmVar2;
                h((String) awrmVar.a);
                objInvoke = awqgVar2.invoke(new xpg(e));
                return objInvoke;
            } catch (xpg e2) {
                e = e2;
                awqgVar2 = awqgVar;
                awrmVar = awrmVar2;
                h((String) awrmVar.a);
                objInvoke = awqgVar2.invoke(e);
                return objInvoke;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awrmVar = xzqVar.e;
            awqgVar2 = xzqVar.d;
            try {
                atqp.j(objAd);
            } catch (toe e3) {
                e = e3;
                h((String) awrmVar.a);
                objInvoke = awqgVar2.invoke(new xpg(e));
                return objInvoke;
            } catch (xpg e4) {
                e = e4;
                h((String) awrmVar.a);
                objInvoke = awqgVar2.invoke(e);
                return objInvoke;
            }
        }
        alwu alwuVar = (alwu) objAd;
        int i8 = alwuVar.b;
        return alwuVar;
    }

    public final ListenableFuture e(aihf aihfVar) {
        aihfVar.getClass();
        return d(this, aihfVar, 4, null, 28);
    }

    public final ListenableFuture f(aihf aihfVar, xzt xztVar) {
        aihfVar.getClass();
        return d(this, aihfVar, 3, xztVar, 24);
    }
}
