package defpackage;

import app.rive.semantics.SemanticState;
import internal.org.jni_zero.CommonApis;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aawr {
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public static apft A(apfp apfpVar, apfu apfuVar) {
        apft apftVarA;
        if (apfuVar != null && (apfuVar.b & 2) != 0) {
            apftVarA = apft.a(apfuVar.c);
            if (apftVarA != null) {
                return apftVarA;
            }
        } else if (apfpVar != null && (apfpVar.d & 32768) != 0) {
            apfu apfuVar2 = apfpVar.R;
            if (apfuVar2 == null) {
                apfuVar2 = apfu.a;
            }
            if ((apfuVar2.b & 2) != 0) {
                apfuVar = apfpVar.R;
                if (apfuVar == null) {
                    apfuVar = apfu.a;
                }
                apftVarA = apft.a(apfuVar.c);
                if (apftVarA != null) {
                    return apftVarA;
                }
            }
        }
        return apft.REEL_WATCH_EXPERIENCE_TYPE_UNKNOWN;
    }

    public static int B(apfp apfpVar) {
        if ((apfpVar.c & 1) == 0) {
            if (aecm.ag(apfpVar)) {
                return 4;
            }
            return aecm.ax(apfpVar) ? 3 : 2;
        }
        int iF = CommonApis.f(apfpVar.l);
        if (iF != 0) {
            return iF;
        }
        return 1;
    }

    public static aihf C(int i) {
        aihf aihfVarCreateBuilder = amiw.a.createBuilder();
        switch (i) {
            case 1:
                amjr amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                aihfVarCreateBuilder.copyOnWrite();
                amiw amiwVar = (amiw) aihfVarCreateBuilder.instance;
                amiwVar.e = amjrVar.o;
                amiwVar.b |= 8;
                return aihfVarCreateBuilder;
            case 2:
                amjr amjrVar2 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                aihfVarCreateBuilder.copyOnWrite();
                amiw amiwVar2 = (amiw) aihfVarCreateBuilder.instance;
                amiwVar2.e = amjrVar2.o;
                amiwVar2.b |= 8;
                return aihfVarCreateBuilder;
            case 3:
                amjr amjrVar3 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_SWIPE_PREVIOUS;
                aihfVarCreateBuilder.copyOnWrite();
                amiw amiwVar3 = (amiw) aihfVarCreateBuilder.instance;
                amiwVar3.e = amjrVar3.o;
                amiwVar3.b |= 8;
                return aihfVarCreateBuilder;
            case 4:
                amjr amjrVar4 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_SWIPE_NEXT;
                aihfVarCreateBuilder.copyOnWrite();
                amiw amiwVar4 = (amiw) aihfVarCreateBuilder.instance;
                amiwVar4.e = amjrVar4.o;
                amiwVar4.b |= 8;
                return aihfVarCreateBuilder;
            case 5:
                amjr amjrVar5 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                aihfVarCreateBuilder.copyOnWrite();
                amiw amiwVar5 = (amiw) aihfVarCreateBuilder.instance;
                amiwVar5.e = amjrVar5.o;
                amiwVar5.b |= 8;
                return aihfVarCreateBuilder;
            case 6:
                amjr amjrVar6 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                aihfVarCreateBuilder.copyOnWrite();
                amiw amiwVar6 = (amiw) aihfVarCreateBuilder.instance;
                amiwVar6.e = amjrVar6.o;
                amiwVar6.b |= 8;
                return aihfVarCreateBuilder;
            default:
                amjr amjrVar7 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                aihfVarCreateBuilder.copyOnWrite();
                amiw amiwVar7 = (amiw) aihfVarCreateBuilder.instance;
                amiwVar7.e = amjrVar7.o;
                amiwVar7.b |= 8;
                return aihfVarCreateBuilder;
        }
    }

    public static void D(apfp apfpVar, apfu apfuVar, aihf aihfVar) {
        amjf amjfVar = ((amiu) aihfVar.instance).S;
        if (amjfVar == null) {
            amjfVar = amjf.a;
        }
        aihf builder = amjfVar.toBuilder();
        if (apfpVar != null) {
            int iB = B(apfpVar);
            builder.copyOnWrite();
            amjf amjfVar2 = (amjf) builder.instance;
            amjfVar2.f = iB - 1;
            amjfVar2.b |= 8;
            int iAV = a.aV(apfpVar.n);
            if (iAV == 0) {
                iAV = 1;
            }
            builder.copyOnWrite();
            amjf amjfVar3 = (amjf) builder.instance;
            amjfVar3.g = iAV - 1;
            amjfVar3.b |= 16;
            if ((apfpVar.d & 4) != 0) {
                int iH = atqp.H(apfpVar.L);
                if (iH == 0) {
                    iH = 1;
                }
                builder.copyOnWrite();
                amjf amjfVar4 = (amjf) builder.instance;
                amjfVar4.h = iH - 1;
                amjfVar4.b |= 32;
            }
            if ((apfpVar.d & 32) != 0) {
                aihf aihfVarCreateBuilder = amje.a.createBuilder();
                String str = apfpVar.O;
                aihfVarCreateBuilder.copyOnWrite();
                amje amjeVar = (amje) aihfVarCreateBuilder.instance;
                str.getClass();
                amjeVar.b |= 1;
                amjeVar.c = str;
                aihfVar.copyOnWrite();
                amiu amiuVar = (amiu) aihfVar.instance;
                amje amjeVar2 = (amje) aihfVarCreateBuilder.build();
                amjeVar2.getClass();
                amiuVar.W = amjeVar2;
                amiuVar.d |= 67108864;
            }
        }
        apft apftVarA = A(apfpVar, apfuVar);
        builder.copyOnWrite();
        amjf amjfVar5 = (amjf) builder.instance;
        amjfVar5.l = apftVarA.g;
        amjfVar5.b |= SemanticState.Modal;
        aihfVar.copyOnWrite();
        amiu amiuVar2 = (amiu) aihfVar.instance;
        amjf amjfVar6 = (amjf) builder.build();
        amjfVar6.getClass();
        amiuVar2.S = amjfVar6;
        amiuVar2.d |= 131072;
    }

    public static /* synthetic */ String E(Object[] objArr, Class cls) {
        String[] strArrSplit = "requestEndpoint;response;fromCache".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getSimpleName());
        sb.append('[');
        int i = 0;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    public static final void a(awqk awqkVar, acgt acgtVar) {
        arev arevVar;
        wiu wiuVarF;
        wjf wjfVar = acgtVar.b;
        if (wjfVar == null || (wiuVarF = wjfVar.f()) == null) {
            arevVar = null;
        } else {
            aopd aopdVar = wiuVarF.d.h;
            if (aopdVar == null) {
                aopdVar = aopd.a;
            }
            if (aopdVar != null) {
                arevVar = aopdVar.c;
                if (arevVar == null) {
                    arevVar = arev.a;
                }
            } else {
                arevVar = null;
            }
        }
        StringBuilder sb = new StringBuilder("cp.");
        areu areuVar = acgtVar.a;
        if (areuVar != null) {
            areu areuVar2 = (areuVar.c & 4) == 0 ? null : areuVar;
            if (areuVar2 != null) {
                sb.append((int) areuVar2.f);
            }
        }
        sb.append(";cpu.");
        if (areuVar != null) {
            if ((areuVar.c & 8) == 0) {
                areuVar = null;
            }
            if (areuVar != null) {
                sb.append(areuVar.g);
            }
        }
        sb.append(";sp.");
        if (arevVar != null) {
            arev arevVar2 = 1 != (arevVar.b & 1) ? null : arevVar;
            if (arevVar2 != null) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                sb.append(arevVar2.c / 1000);
            }
        }
        sb.append(";spf.");
        if (arevVar != null) {
            arev arevVar3 = (arevVar.b & 4) == 0 ? null : arevVar;
            if (arevVar3 != null) {
                sb.append(arevVar3.e);
            }
        }
        sb.append(";spu.");
        if (arevVar != null) {
            if (((arevVar.b & 4) != 0 ? arevVar : null) != null) {
                ahbw ahbwVar = acgtVar.d;
                aopd aopdVar2 = wjfVar.f().d.h;
                if (aopdVar2 == null) {
                    aopdVar2 = aopd.a;
                }
                arev arevVar4 = aopdVar2.c;
                if (arevVar4 == null) {
                    arevVar4 = arev.a;
                }
                arevVar4.getClass();
                Instant instantY = wjfVar.y();
                if (instantY == null) {
                    instantY = ahbwVar.a();
                }
                sb.append(instantY.minusSeconds(arevVar4.e).toEpochMilli());
            }
        }
        sb.append(";lp.");
        acgv acgvVar = acgtVar.c;
        if (acgvVar != null) {
            sb.append(acgvVar.b);
        }
        sb.append(";lpu.");
        if (acgvVar != null) {
            sb.append(acgvVar.c);
        }
        sb.append(";ss.");
        sb.append(acgtVar.e - 1);
        awqkVar.invoke("ctch", sb.toString());
    }

    public static int b(acip acipVar) {
        return acipVar.w().l;
    }

    public static long c(long j, abmt abmtVar) {
        return j <= 0 ? abmtVar.j() : j;
    }

    public static long d(acip acipVar) {
        return acipVar.w().g;
    }

    public static long e(acip acipVar) {
        return acipVar.w().i;
    }

    public static long f(acip acipVar) {
        return acipVar.w().h;
    }

    public static long g(acip acipVar) {
        return acipVar.w().f;
    }

    public static long h(ytv ytvVar, String str) {
        return Math.max(ytvVar.h(str).b, 0L);
    }

    public static ytt i(ytv ytvVar, wjf wjfVar) {
        return (wjfVar == null || wjfVar.g() == null || wjfVar.f() == null) ? ytv.b : ytvVar.g(wjfVar.g(), wjfVar.f());
    }

    public static void j(acip acipVar, long j) {
        acipVar.w().i = j;
    }

    public static void k(acip acipVar, long j) {
        acipVar.w().f = j;
    }

    public static void l(acip acipVar, int i) {
        acipVar.w().l = i;
    }

    public static boolean m(acip acipVar) {
        aciq aciqVarW = acipVar.w();
        return aciqVarW.f == aciqVarW.a.j();
    }

    public static boolean n(acip acipVar) {
        wjf wjfVarF = acipVar.f();
        return wjfVarF != null && wjfVarF.f().av();
    }

    public static boolean o(acip acipVar) {
        wjf wjfVarF = acipVar.f();
        wja wjaVarG = wjfVarF == null ? null : wjfVarF.g();
        return wjaVarG != null && wjaVarG.B();
    }

    public static boolean p(acip acipVar) {
        return acipVar.w().l == 9;
    }

    public static boolean q(abnc abncVar, wjf wjfVar) {
        return abncVar.h && !aajg.h(wjfVar);
    }

    public static boolean r(acip acipVar) {
        abnl abnlVarN = acipVar.n();
        wjf wjfVarF = acipVar.f();
        wja wjaVarG = wjfVarF != null ? wjfVarF.g() : null;
        return (abnlVarN == null || !abnlVarN.J() || wjaVarG == null || wjaVarG.w()) ? false : true;
    }

    public static String s(int i) {
        if (i == 1) {
            return "m";
        }
        if (i == 2) {
            return "s";
        }
        if (i != 3) {
            return i != 4 ? "t" : "h";
        }
        return "g";
    }

    public static final int t(int i, int i2, int i3, List list, Map map) {
        accj accjVar = new accj(i, i2, i3);
        Integer num = (Integer) map.get(accjVar);
        if (num != null) {
            return num.intValue();
        }
        int size = map.size();
        list.add(Integer.valueOf(i));
        list.add(Integer.valueOf(i2));
        list.add(Integer.valueOf(i3));
        map.put(accjVar, Integer.valueOf(size));
        return size;
    }

    public static final int u(String str, StringBuilder sb, Map map) {
        Integer num = (Integer) map.get(str);
        if (num != null) {
            return num.intValue();
        }
        int length = sb.length();
        sb.append(str);
        map.put(str, Integer.valueOf(length));
        return length;
    }

    public static final void v(zvn zvnVar, zvm zvmVar, String str) {
        zvp.b(zvnVar, zvmVar, str, new Exception());
    }

    public static final boolean w(ajwo ajwoVar) {
        int iAU;
        ajwoVar.getClass();
        apfp apfpVarAa = aecm.aa(ajwoVar);
        return apfpVarAa != null && aecm.aD(ajwoVar) && (iAU = a.aU(apfpVarAa.M)) != 0 && iAU == 2;
    }

    public static boolean x(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        return (apfpVar.X || apfpVar.o.isEmpty()) ? false : true;
    }

    public static boolean y(abvk abvkVar) {
        if (abvkVar.i() == null) {
            return false;
        }
        Optional optionalOfNullable = Optional.ofNullable(abvkVar.i());
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((acfw) optionalOfNullable.get()).c());
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((wjf) optionalOfNullable.get()).W()));
        }
        return ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue();
    }

    public static abnp z(xir xirVar, boolean z, boolean z2, zkj zkjVar, boolean z3, int i, arfb arfbVar, boolean z4, boolean z5) {
        abno abnoVarA = abnp.a();
        abnoVarA.a = xirVar;
        abnoVarA.i(z);
        abnoVarA.h(z2);
        if (z5) {
            abnoVarA.c(z4);
        }
        if (zkjVar != null) {
            abnoVarA.b = zkjVar;
        }
        if (z3) {
            if (i != -1) {
                abnoVarA.e(i);
            }
            if (arfbVar != arfb.VIDEO_QUALITY_SETTING_UNKNOWN) {
                abnoVarA.d(arfbVar);
            }
        }
        return abnoVarA.a();
    }
}
