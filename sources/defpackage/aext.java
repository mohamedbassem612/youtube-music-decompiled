package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class aext {
    public aext(byte[] bArr) {
        Boolean.FALSE.booleanValue();
    }

    public static int A(aihi aihiVar) {
        aijl aijlVar = aihiVar.j.b;
        int size = aijlVar.size();
        if (size == 1) {
            return ((aiji) aijlVar.a(0)).c.b;
        }
        StringBuilder sb = new StringBuilder("Expected only one extension, saw ");
        sb.append(size);
        if (size != 0) {
            sb.append(": ");
            int iMin = Math.min(aijlVar.size(), 3);
            for (int i = 0; i < iMin; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(((aiji) aijlVar.a(i)).c.b);
            }
            if (size > 3) {
                sb.append("...");
            }
        }
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ aiff B(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aiff) aihnVarBuild;
    }

    public static void C(aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiff aiffVar = (aiff) aihfVar.instance;
        aiff aiffVar2 = aiff.a;
        aiffVar.e = 2;
        aiffVar.b |= 4;
    }

    public static void D(aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiff aiffVar = (aiff) aihfVar.instance;
        aiff aiffVar2 = aiff.a;
        aiffVar.g = 1;
        aiffVar.b |= 16;
    }

    public static void E(aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiff aiffVar = (aiff) aihfVar.instance;
        aiff aiffVar2 = aiff.a;
        aiffVar.f = 2;
        aiffVar.b |= 8;
    }

    public static void F(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiff aiffVar = (aiff) aihfVar.instance;
        aiff aiffVar2 = aiff.a;
        aiffVar.c = i - 1;
        aiffVar.b |= 1;
    }

    public static /* synthetic */ void G(aihf aihfVar) {
        new aikl(new aihx(((aife) aihfVar.instance).c, aife.a));
    }

    public static int H(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static int I(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public static int J(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static int K(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ aica L(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aica) aihnVarBuild;
    }

    public static /* synthetic */ aibt M(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aibt) aihnVarBuild;
    }

    public static void N(aibs aibsVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibt aibtVar = (aibt) aihfVar.instance;
        aibt aibtVar2 = aibt.a;
        aibtVar.d = aibsVar.d;
        aibtVar.b |= 2;
    }

    public static void O(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibt aibtVar = (aibt) aihfVar.instance;
        aibt aibtVar2 = aibt.a;
        aibtVar.b |= 1;
        aibtVar.c = str;
    }

    private static aihf P(Throwable th, boolean z) {
        StackTraceElement[] stackTrace;
        aihf aihfVarCreateBuilder = ahad.a.createBuilder();
        String name = th.getClass().getName();
        aihfVarCreateBuilder.copyOnWrite();
        ahad ahadVar = (ahad) aihfVarCreateBuilder.instance;
        name.getClass();
        ahadVar.b |= 1;
        ahadVar.c = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            aihfVarCreateBuilder.copyOnWrite();
            ahad ahadVar2 = (ahad) aihfVarCreateBuilder.instance;
            message.getClass();
            ahadVar2.b |= 2;
            ahadVar2.d = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                aihf aihfVarCreateBuilder2 = ahac.a.createBuilder();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahac ahacVar = (ahac) aihfVarCreateBuilder2.instance;
                    className.getClass();
                    ahacVar.b |= 1;
                    ahacVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahac ahacVar2 = (ahac) aihfVarCreateBuilder2.instance;
                    methodName.getClass();
                    ahacVar2.b |= 2;
                    ahacVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahac ahacVar3 = (ahac) aihfVarCreateBuilder2.instance;
                    ahacVar3.b |= 8;
                    ahacVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahac ahacVar4 = (ahac) aihfVarCreateBuilder2.instance;
                        fileName.getClass();
                        ahacVar4.b |= 4;
                        ahacVar4.e = fileName;
                    }
                }
                aihfVarCreateBuilder.copyOnWrite();
                ahad ahadVar3 = (ahad) aihfVarCreateBuilder.instance;
                ahac ahacVar5 = (ahac) aihfVarCreateBuilder2.build();
                ahacVar5.getClass();
                aiie aiieVar = ahadVar3.f;
                if (!aiieVar.c()) {
                    ahadVar3.f = aihn.mutableCopy(aiieVar);
                }
                ahadVar3.f.add(ahacVar5);
            }
        }
        return aihfVarCreateBuilder;
    }

    private static int Q(int i) {
        int iBinarySearch = Arrays.binarySearch(aijf.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public static float a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static aihf b(Throwable th, boolean z) {
        aihf aihfVarCreateBuilder = ahag.a.createBuilder();
        aihf aihfVarP = P(th, z);
        aihfVarCreateBuilder.copyOnWrite();
        ahag ahagVar = (ahag) aihfVarCreateBuilder.instance;
        ahad ahadVar = (ahad) aihfVarP.build();
        ahadVar.getClass();
        ahagVar.e = ahadVar;
        ahagVar.b |= 1;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return aihfVarCreateBuilder;
            }
            aihf aihfVarP2 = P(th, z);
            aihfVarCreateBuilder.copyOnWrite();
            ahag ahagVar2 = (ahag) aihfVarCreateBuilder.instance;
            ahad ahadVar2 = (ahad) aihfVarP2.build();
            ahadVar2.getClass();
            ahagVar2.a();
            ahagVar2.f.add(ahadVar2);
        }
    }

    public static aihf c(Throwable th, boolean z) {
        aihf aihfVarCreateBuilder = ahag.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ahad.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ahad ahadVar = (ahad) aihfVarCreateBuilder2.instance;
        ahadVar.b |= 1;
        ahadVar.c = "";
        aihfVarCreateBuilder.copyOnWrite();
        ahag ahagVar = (ahag) aihfVarCreateBuilder.instance;
        ahad ahadVar2 = (ahad) aihfVarCreateBuilder2.build();
        ahadVar2.getClass();
        ahagVar.e = ahadVar2;
        ahagVar.b |= 1;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(th);
        identityHashMap.put(th, 0);
        arrayList.add(d(th, z));
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.remove();
            Integer num = (Integer) identityHashMap.get(th2);
            num.getClass();
            int iIntValue = num.intValue();
            if (th2.getCause() != null) {
                Throwable cause = th2.getCause();
                if (!identityHashMap.containsKey(cause)) {
                    identityHashMap.put(cause, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(d(cause, z));
                    arrayDeque.add(cause);
                }
                aihf aihfVar = (aihf) arrayList.get(iIntValue);
                int iIntValue2 = ((Integer) identityHashMap.get(cause)).intValue();
                aihfVar.copyOnWrite();
                ahaf ahafVar = (ahaf) aihfVar.instance;
                ahaf ahafVar2 = ahaf.a;
                ahafVar.b |= 2;
                ahafVar.d = iIntValue2;
            }
            for (Throwable th3 : th2.getSuppressed()) {
                if (!identityHashMap.containsKey(th3)) {
                    identityHashMap.put(th3, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(d(th3, z));
                    arrayDeque.add(th3);
                }
                aihf aihfVar2 = (aihf) arrayList.get(iIntValue);
                int iIntValue3 = ((Integer) identityHashMap.get(th3)).intValue();
                aihfVar2.copyOnWrite();
                ahaf ahafVar3 = (ahaf) aihfVar2.instance;
                ahaf ahafVar4 = ahaf.a;
                aihv aihvVar = ahafVar3.e;
                if (!aihvVar.c()) {
                    ahafVar3.e = aihn.mutableCopy(aihvVar);
                }
                ahafVar3.e.h(iIntValue3);
            }
        }
        aihf aihfVarCreateBuilder3 = ahae.a.createBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aihf aihfVar3 = (aihf) arrayList.get(i);
            aihfVarCreateBuilder3.copyOnWrite();
            ahae ahaeVar = (ahae) aihfVarCreateBuilder3.instance;
            ahaf ahafVar5 = (ahaf) aihfVar3.build();
            ahafVar5.getClass();
            ahaeVar.a();
            ahaeVar.b.add(ahafVar5);
        }
        aihfVarCreateBuilder.copyOnWrite();
        ahag ahagVar2 = (ahag) aihfVarCreateBuilder.instance;
        ahae ahaeVar2 = (ahae) aihfVarCreateBuilder3.build();
        ahaeVar2.getClass();
        ahagVar2.d = ahaeVar2;
        ahagVar2.c = 4;
        return aihfVarCreateBuilder;
    }

    public static aihf d(Throwable th, boolean z) {
        aihf aihfVarCreateBuilder = ahaf.a.createBuilder();
        aihf aihfVarP = P(th, z);
        aihfVarCreateBuilder.copyOnWrite();
        ahaf ahafVar = (ahaf) aihfVarCreateBuilder.instance;
        ahad ahadVar = (ahad) aihfVarP.build();
        ahadVar.getClass();
        ahafVar.c = ahadVar;
        ahafVar.b |= 1;
        return aihfVarCreateBuilder;
    }

    public static int e(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        switch (i) {
            case 100:
                return 102;
            case 101:
                return 103;
            case 102:
                return 104;
            case 103:
                return 105;
            case 104:
                return 106;
            case 105:
                return 107;
            case 106:
                return 108;
            case 107:
                return 109;
            case 108:
                return 110;
            case 109:
                return 111;
            case 110:
                return 112;
            case 111:
                return 113;
            default:
                switch (i) {
                    case 200:
                        return 202;
                    case 300:
                        return 302;
                    case 301:
                        return 303;
                    case 302:
                        return 304;
                    case 303:
                        return 305;
                    case 304:
                        return 306;
                    case 305:
                        return 307;
                    case 306:
                        return 308;
                    case 307:
                        return 309;
                    case 308:
                        return 310;
                    case 309:
                        return 311;
                    case 310:
                        return 312;
                    case 311:
                        return 313;
                    case 312:
                        return 314;
                    case 313:
                        return 315;
                    case 314:
                        return 316;
                    case 315:
                        return 317;
                    case 316:
                        return 318;
                    case 317:
                        return 319;
                    case 318:
                        return 320;
                    case 319:
                        return 321;
                    case 320:
                        return 322;
                    case 321:
                        return 323;
                    case 322:
                        return 324;
                    case 323:
                        return 325;
                    case 324:
                        return 326;
                    case 325:
                        return 327;
                    case 326:
                        return 328;
                    case 327:
                        return 329;
                    case 328:
                        return 330;
                    case 329:
                        return 331;
                    case 330:
                        return 332;
                    case 331:
                        return 333;
                    case 350:
                        return 352;
                    default:
                        switch (i) {
                            case 400:
                                return 402;
                            case 401:
                                return 403;
                            case 402:
                                return 404;
                            case 403:
                                return 405;
                            case 404:
                                return 406;
                            default:
                                switch (i) {
                                    case 500:
                                        return 502;
                                    case 501:
                                        return 503;
                                    case 502:
                                        return 504;
                                    case 503:
                                        return 505;
                                    case 504:
                                        return 506;
                                    case 505:
                                        return 507;
                                    case 506:
                                        return 508;
                                    default:
                                        switch (i) {
                                            case 1000:
                                                return 1002;
                                            case 1001:
                                                return 1003;
                                            case 1002:
                                                return 1004;
                                            case 1003:
                                                return 1005;
                                            case 1004:
                                                return 1006;
                                            case 1005:
                                                return 1007;
                                            case 1006:
                                                return 1008;
                                            case 1007:
                                                return 1009;
                                            case 1008:
                                                return 1010;
                                            case 1009:
                                                return 1011;
                                            case 1010:
                                                return 1012;
                                            case 1011:
                                                return 1013;
                                            default:
                                                switch (i) {
                                                    case 2000:
                                                        return 2002;
                                                    case 2001:
                                                        return 2003;
                                                    case 2002:
                                                        return 2004;
                                                    case 2003:
                                                        return 2005;
                                                    case 2004:
                                                        return 2006;
                                                    case 2005:
                                                        return 2007;
                                                    case 2006:
                                                        return 2008;
                                                    case 2007:
                                                        return 2009;
                                                    case 2008:
                                                        return 2010;
                                                    case 2009:
                                                        return 2011;
                                                    case 2010:
                                                        return 2012;
                                                    case 2011:
                                                        return 2013;
                                                    case 2012:
                                                        return 2014;
                                                    case 2013:
                                                        return 2015;
                                                    case 2014:
                                                        return 2016;
                                                    default:
                                                        switch (i) {
                                                            case 3000:
                                                                return 3002;
                                                            case 3001:
                                                                return 3003;
                                                            case 3002:
                                                                return 3004;
                                                            case 3003:
                                                                return 3005;
                                                            case 3004:
                                                                return 3006;
                                                            default:
                                                                switch (i) {
                                                                    case 4000:
                                                                        return 4002;
                                                                    case 4001:
                                                                        return 4003;
                                                                    case 4002:
                                                                        return 4004;
                                                                    case 4003:
                                                                        return 4005;
                                                                    case 4004:
                                                                        return 4006;
                                                                    case 4005:
                                                                        return 4007;
                                                                    default:
                                                                        switch (i) {
                                                                            case 4100:
                                                                                return 4102;
                                                                            case 4101:
                                                                                return 4103;
                                                                            case 4102:
                                                                                return 4104;
                                                                            case 4103:
                                                                                return 4105;
                                                                            case 4104:
                                                                                return 4106;
                                                                            case 4105:
                                                                                return 4107;
                                                                            case 4106:
                                                                                return 4108;
                                                                            default:
                                                                                return 0;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static int f(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static /* synthetic */ int g(Object obj) {
        Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof agzd) {
            return 0;
        }
        return obj instanceof agzg ? 1 : -2;
    }

    public static Collector h(Function function) {
        return aghu.a(function, Function$CC.identity());
    }

    public static boolean i(Comparable comparable, Comparable comparable2) {
        return comparable2.compareTo(comparable) >= 0;
    }

    public static boolean j(Comparable comparable, Comparable comparable2) {
        return comparable2.compareTo(comparable) <= 0;
    }

    public static boolean k(Comparable comparable, Comparable comparable2) {
        return comparable2.compareTo(comparable) > 0;
    }

    public static boolean l(Comparable comparable, Comparable comparable2) {
        return comparable2.compareTo(comparable) < 0;
    }

    public static Optional m(boolean z, Object obj) {
        return z ? Optional.ofNullable(obj) : Optional.empty();
    }

    public static Optional n(boolean z, Supplier supplier) {
        return z ? Optional.ofNullable(supplier.get()) : Optional.empty();
    }

    public static /* synthetic */ int p(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int q(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int r(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int s(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            default:
                return 0;
        }
    }

    public static int t(int i) {
        if (i == 90) {
            return 91;
        }
        if (i == 91) {
            return 92;
        }
        if (i == 93) {
            return 94;
        }
        if (i == 94) {
            return 95;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case 100:
                        return 101;
                    case 101:
                        return 102;
                    case 102:
                        return 103;
                    case 103:
                        return 104;
                    case 104:
                        return 105;
                    case 105:
                        return 106;
                    case 106:
                        return 107;
                    case 107:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return 110;
                    case 110:
                        return 111;
                    case 111:
                        return 112;
                    case 112:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return 115;
                    case 115:
                        return 116;
                    case 116:
                        return 117;
                    case 117:
                        return 118;
                    case 118:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return 121;
                    case 121:
                        return 122;
                    case 122:
                        return 123;
                    case 123:
                        return R.styleable.AppCompatTheme_windowMinWidthMajor;
                    case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                        return R.styleable.AppCompatTheme_windowMinWidthMinor;
                    case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                        return R.styleable.AppCompatTheme_windowNoTitle;
                    case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                        return 127;
                    case 127:
                        return SemanticState.Focused;
                    case SemanticState.Focused /* 128 */:
                        return 129;
                    case 129:
                        return 130;
                    case 130:
                        return 131;
                    case 131:
                        return 132;
                    case 132:
                        return 133;
                    case 133:
                        return 134;
                    case 134:
                        return 135;
                    case 135:
                        return 136;
                    case 136:
                        return 137;
                    case 137:
                        return 138;
                    case 138:
                        return 139;
                    case 139:
                        return 140;
                    case 140:
                        return 141;
                    case 141:
                        return 142;
                    case 142:
                        return 143;
                    case 143:
                        return 144;
                    case 144:
                        return 145;
                    case 145:
                        return 146;
                    case 146:
                        return 147;
                    case 147:
                        return 148;
                    case 148:
                        return 149;
                    case 149:
                        return 150;
                    case 150:
                        return 151;
                    case 151:
                        return 152;
                    case 152:
                        return 153;
                    case 153:
                        return 154;
                    case 154:
                        return 155;
                    case 155:
                        return 156;
                    case 156:
                        return 157;
                    case 157:
                        return 158;
                    case 158:
                        return 159;
                    default:
                        return 0;
                }
        }
    }

    public static aigu u(Duration duration) {
        aigu aiguVarAu = ahng.au(duration);
        aiguVarAu.getClass();
        return aiguVarAu;
    }

    public static Duration v(aigu aiguVar) {
        Duration durationAw = ahng.aw(aiguVar);
        durationAw.getClass();
        return durationAw;
    }

    public static /* synthetic */ long w(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            long j3 = j * j2;
            if (j == 0 || j3 / j == j2) {
                return j3;
            }
        }
        throw new ArithmeticException();
    }

    public static Object x(aihj aihjVar, aigw aigwVar) {
        aihjVar.getClass();
        Object objB = aihjVar.b(aigwVar);
        objB.getClass();
        return objB;
    }

    public static boolean y(aigj aigjVar) {
        return !aigjVar.E();
    }

    public static void z(aigj aigjVar, ArrayDeque arrayDeque) {
        if (!aigjVar.r()) {
            if (!(aigjVar instanceof aijf)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(aigjVar.getClass()))));
            }
            aijf aijfVar = (aijf) aigjVar;
            int[] iArr = aijf.a;
            z(aijfVar.c, arrayDeque);
            z(aijfVar.e, arrayDeque);
            return;
        }
        int iQ = Q(aigjVar.d());
        int iO = aijf.o(iQ + 1);
        if (arrayDeque.isEmpty() || ((aigj) arrayDeque.peek()).d() >= iO) {
            arrayDeque.push(aigjVar);
            return;
        }
        int iO2 = aijf.o(iQ);
        aigj aijfVar2 = (aigj) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((aigj) arrayDeque.peek()).d() < iO2) {
            aijfVar2 = new aijf((aigj) arrayDeque.pop(), aijfVar2);
        }
        aijf aijfVar3 = new aijf(aijfVar2, aigjVar);
        while (!arrayDeque.isEmpty()) {
            if (((aigj) arrayDeque.peek()).d() >= aijf.o(Q(aijfVar3.b) + 1)) {
                break;
            } else {
                aijfVar3 = new aijf((aigj) arrayDeque.pop(), aijfVar3);
            }
        }
        arrayDeque.push(aijfVar3);
    }

    public aext(char[] cArr) {
    }

    public aext() {
    }
}
