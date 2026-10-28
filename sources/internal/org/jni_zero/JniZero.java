package internal.org.jni_zero;

import defpackage.atqp;
import defpackage.atqq;
import defpackage.avkz;
import defpackage.avlh;
import defpackage.avlr;
import defpackage.avlu;
import defpackage.avlw;
import defpackage.avmb;
import defpackage.avnn;
import defpackage.avns;
import defpackage.avwl;
import defpackage.aweo;
import defpackage.awep;
import defpackage.awjx;
import defpackage.awjy;
import defpackage.awoq;
import defpackage.awos;
import defpackage.awot;
import defpackage.awou;
import defpackage.awov;
import defpackage.awoy;
import defpackage.awoz;
import defpackage.awpa;
import defpackage.awpb;
import defpackage.awpc;
import defpackage.awpd;
import defpackage.awpe;
import defpackage.awpg;
import defpackage.awpl;
import defpackage.awpm;
import defpackage.awps;
import defpackage.awpt;
import defpackage.awpu;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.awqu;
import defpackage.awqv;
import defpackage.awrc;
import defpackage.awrn;
import defpackage.awro;
import defpackage.awsd;
import defpackage.axso;
import defpackage.axsp;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class JniZero {
    public static volatile avnn a;
    private static volatile avnn b;

    public static void a(avmb avmbVar) {
        if (avmbVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        avnn avnnVar = b;
    }

    public static avlr b(Object obj, avnn avnnVar) {
        awep awepVar = new awep(obj, avnnVar);
        avnn avnnVar2 = atqp.l;
        return awepVar;
    }

    public static boolean c(avlu avluVar, avlw avlwVar, avnn avnnVar) {
        if (!(avluVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) avluVar).call();
            if (objCall == null) {
                avlwVar.d(avns.a);
                avlwVar.kn();
                return true;
            }
            try {
                avlu avluVar2 = (avlu) avnnVar.a(objCall);
                avluVar2.getClass();
                if (!(avluVar2 instanceof Callable)) {
                    avluVar2.ak(avlwVar);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) avluVar2).call();
                    if (objCall2 == null) {
                        avlwVar.d(avns.a);
                        avlwVar.kn();
                        return true;
                    }
                    aweo aweoVar = new aweo(avlwVar, objCall2);
                    avlwVar.d(aweoVar);
                    aweoVar.run();
                    return true;
                } catch (Throwable th) {
                    avkz.a(th);
                    avns.g(th, avlwVar);
                    return true;
                }
            } catch (Throwable th2) {
                avkz.a(th2);
                avns.g(th2, avlwVar);
                return true;
            }
        } catch (Throwable th3) {
            avkz.a(th3);
            avns.g(th3, avlwVar);
            return true;
        }
    }

    private static void crashIfMultiplexingMisaligned(long j, long j2) {
        try {
            long j3 = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j4 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j3 == j || j3 == j2 || j4 == j) {
                return;
            }
            throw new RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + j + " or " + j2 + " Java: " + j3 + " or " + j4);
        } catch (ReflectiveOperationException unused) {
        }
    }

    public static avlh d(Object obj, avnn avnnVar) {
        avwl avwlVar = new avwl(obj, avnnVar);
        avnn avnnVar2 = atqp.j;
        return avwlVar;
    }

    public static boolean e(axso axsoVar, axsp axspVar, avnn avnnVar) {
        if (!(axsoVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) axsoVar).call();
            if (objCall == null) {
                axspVar.e(awjx.INSTANCE);
                axspVar.kn();
                return true;
            }
            try {
                axso axsoVar2 = (axso) avnnVar.a(objCall);
                axsoVar2.getClass();
                if (!(axsoVar2 instanceof Callable)) {
                    axsoVar2.aq(axspVar);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) axsoVar2).call();
                    if (objCall2 != null) {
                        axspVar.e(new awjy(axspVar, objCall2));
                        return true;
                    }
                    axspVar.e(awjx.INSTANCE);
                    axspVar.kn();
                    return true;
                } catch (Throwable th) {
                    avkz.a(th);
                    awjx.f(th, axspVar);
                    return true;
                }
            } catch (Throwable th2) {
                avkz.a(th2);
                awjx.f(th2, axspVar);
                return true;
            }
        } catch (Throwable th3) {
            avkz.a(th3);
            awjx.f(th3, axspVar);
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:218:0x0262 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x028e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x02d0 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x02de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:96:0x0104
     case -1811142715: goto B:92:0x00f9
     case -1811142714: goto B:88:0x00ee
     case -1811142713: goto B:84:0x00e3
     case -1811142712: goto B:80:0x00d8
     case -1811142711: goto B:76:0x00cd
     case -1811142710: goto B:72:0x00c2
     case -1811142709: goto B:68:0x00b7
     case -1811142708: goto B:64:0x00ac
     case -1811142707: goto B:60:0x00a1
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:56:0x0096
     case -1811142684: goto B:52:0x008b
     case -1811142683: goto B:48:0x0080
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:44:0x0075
     case 80123372: goto B:40:0x006a
     case 80123373: goto B:36:0x005f
     case 80123374: goto B:32:0x0054
     case 80123375: goto B:28:0x0049
     case 80123376: goto B:24:0x003e
     case 80123377: goto B:20:0x0033
     case 80123378: goto B:16:0x0028
     case 80123379: goto B:12:0x001d
     case 80123380: goto B:8:0x0012
     default: goto B:252:0x02de A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String f(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:210:0x025a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0284 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02c6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02d1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x02d4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:96:0x0104
     case -1811142715: goto B:92:0x00f9
     case -1811142714: goto B:88:0x00ee
     case -1811142713: goto B:84:0x00e3
     case -1811142712: goto B:80:0x00d8
     case -1811142711: goto B:76:0x00cd
     case -1811142710: goto B:72:0x00c2
     case -1811142709: goto B:68:0x00b7
     case -1811142708: goto B:64:0x00ac
     case -1811142707: goto B:60:0x00a1
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:56:0x0096
     case -1811142684: goto B:52:0x008b
     case -1811142683: goto B:48:0x0080
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:44:0x0075
     case 80123372: goto B:40:0x006a
     case 80123373: goto B:36:0x005f
     case 80123374: goto B:32:0x0054
     case 80123375: goto B:28:0x0049
     case 80123376: goto B:24:0x003e
     case 80123377: goto B:20:0x0033
     case 80123378: goto B:16:0x0028
     case 80123379: goto B:12:0x001d
     case 80123380: goto B:8:0x0012
     default: goto B:244:0x02d4 A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String g(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    private static long getNativePtr(JniPtrInner jniPtrInner) {
        if (jniPtrInner == null) {
            return 0L;
        }
        return jniPtrInner.a();
    }

    public static final Class h(awsd awsdVar) {
        String name;
        awsdVar.getClass();
        Class clsA = ((awqu) awsdVar).a();
        if (!clsA.isPrimitive() || (name = clsA.getName()) == null) {
            return clsA;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : clsA;
            case 104431:
                return name.equals("int") ? Integer.class : clsA;
            case 3039496:
                return name.equals("byte") ? Byte.class : clsA;
            case 3052374:
                return name.equals("char") ? Character.class : clsA;
            case 3327612:
                return name.equals("long") ? Long.class : clsA;
            case 3625364:
                return name.equals("void") ? Void.class : clsA;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : clsA;
            case 97526364:
                return name.equals("float") ? Float.class : clsA;
            case 109413500:
                return name.equals("short") ? Short.class : clsA;
            default:
                return clsA;
        }
    }

    public static final awsd i(Class cls) {
        cls.getClass();
        int i = awrn.a;
        return new awqv(cls);
    }

    private static Object[] init(boolean z) {
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP, JniZero.class.getClassLoader()};
    }

    public static final void j(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                avkz.d(th, th2);
            }
        }
    }

    public static void k(File file, File file2) throws awpt {
        if (!file.exists()) {
            throw new awpu(file);
        }
        if (file2.exists() && !file2.delete()) {
            throw new awps(file, file2);
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new awpt(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                avkz.c(fileInputStream, fileOutputStream);
                l(fileOutputStream, null);
                l(fileInputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    l(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                l(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static final void l(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                avkz.d(th, th2);
            }
        }
    }

    public static final awpl m(Enum[] enumArr) {
        enumArr.getClass();
        return new awpm(enumArr);
    }

    public static final Object n(awqk awqkVar, Object obj, awoq awoqVar) {
        awqkVar.getClass();
        awou context = awoqVar.getContext();
        Object awpcVar = context == awov.a ? new awpc(awoqVar) : new awpd(awoqVar, context);
        awro.c(awqkVar, 2);
        return awqkVar.invoke(obj, awpcVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final awoq o(awqg awqgVar, awoq awoqVar) {
        if (awqgVar instanceof awpe) {
            return ((awpe) awqgVar).create(awoqVar);
        }
        awou context = awoqVar.getContext();
        return context == awov.a ? new awoy(awoqVar, awqgVar) : new awoz(awoqVar, context, awqgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final awoq p(awqk awqkVar, Object obj, awoq awoqVar) {
        if (awqkVar instanceof awpe) {
            return ((awpe) awqkVar).create(obj, awoqVar);
        }
        awou context = awoqVar.getContext();
        return context == awov.a ? new awpa(awoqVar, awqkVar, obj) : new awpb(awoqVar, context, awqkVar, obj);
    }

    public static final awoq q(awoq awoqVar) {
        awoqVar.getClass();
        awpg awpgVar = awoqVar instanceof awpg ? (awpg) awoqVar : null;
        return awpgVar != null ? awpgVar.intercepted() : awoqVar;
    }

    public static Object r(awos awosVar, Object obj, awqk awqkVar) {
        awqkVar.getClass();
        return awqkVar.invoke(obj, awosVar);
    }

    public static awos s(awos awosVar, awot awotVar) {
        awotVar.getClass();
        if (awrc.c(awosVar.getKey(), awotVar)) {
            return awosVar;
        }
        return null;
    }

    public static awou t(awos awosVar, awot awotVar) {
        awotVar.getClass();
        return awrc.c(awosVar.getKey(), awotVar) ? awov.a : awosVar;
    }

    public static awou u(awos awosVar, awou awouVar) {
        awouVar.getClass();
        return atqq.e(awosVar, awouVar);
    }
}
