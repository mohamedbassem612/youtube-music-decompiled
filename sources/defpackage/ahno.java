package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import app.rive.runtime.kotlin.fonts.Fonts;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ahno {
    private static ahno a;

    private ahno() {
    }

    public static agtz A() {
        agui aguiVar = aguk.c;
        String str = aguiVar.a;
        int i = aguiVar.f;
        return new agui(2, aguiVar.b, true, aguiVar.d, aguiVar.e);
    }

    public static ahok B(final String str, final ahug ahugVar) {
        ahoj ahojVar = new ahoj(ahue.class, new Class[0]);
        ahojVar.c();
        ahojVar.b(new ahos(Context.class, 1, 0));
        ahojVar.b = new ahom() { // from class: ahuf
            @Override // defpackage.ahom
            public final Object a(ahol aholVar) {
                return new ahue(str, ahugVar.a((Context) aholVar.e(Context.class)));
            }
        };
        return ahojVar.a();
    }

    public static SharedPreferences C(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static /* synthetic */ ahud D(aihf aihfVar) {
        aihfVar.getClass();
        return new ahud(aihfVar, (byte[]) null);
    }

    public static String E(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length << 4));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(aI(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(aI(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void F(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void G(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void H(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(E(str, Character.valueOf(c)));
        }
    }

    public static void I(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(E(str, Integer.valueOf(i)));
        }
    }

    public static void J(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(E(str, Long.valueOf(j)));
        }
    }

    public static void K(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(E(str, obj));
        }
    }

    public static void L(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(E(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void M(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(E(str, obj, obj2));
        }
    }

    public static void N(int i, int i2, int i3) {
        String strAJ;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strAJ = aJ(i, i3, "start index");
            } else {
                strAJ = (i2 < 0 || i2 > i3) ? aJ(i2, i3, "end index") : E("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strAJ);
        }
    }

    public static void O(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void P(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void Q(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(E(str, Integer.valueOf(i)));
        }
    }

    public static void R(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(E(str, obj));
        }
    }

    public static void S(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalStateException(E(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void T(boolean z, String str, Object obj, long j) {
        if (!z) {
            throw new IllegalStateException(E(str, obj, Long.valueOf(j)));
        }
    }

    public static void U(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(E(str, obj, obj2));
        }
    }

    public static void V(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(E(str, obj, obj2, obj3));
        }
    }

    public static void W(int i, int i2) {
        String strE;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strE = E("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.bR(i2, "negative size: "));
                }
                strE = E("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strE);
        }
    }

    public static void X(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(aJ(i, i2, "index"));
        }
    }

    public static String Y(String str) {
        if (aa(str)) {
            return null;
        }
        return str;
    }

    public static String Z(String str) {
        return str == null ? "" : str;
    }

    public static afxd aA(Iterable iterable) {
        return afxd.f(ahng.k(iterable));
    }

    public static afxd aB(Object obj) {
        return afxd.f(ahng.n(obj));
    }

    public static afvq aC(Context context) {
        return ((afvt) atqp.a(context, afvt.class)).as();
    }

    public static boolean aD() {
        afvl afvlVar = ((afvh) afty.d.get()).c;
        if (afvlVar == null || awrc.c(afvlVar, afur.a)) {
            return true;
        }
        if (!(afvlVar instanceof afvg) || !((afvg) afvlVar).a()) {
            return false;
        }
        if (!qpj.h(Thread.currentThread())) {
            return true;
        }
        qpj.c();
        return true;
    }

    public static ahub aE(Iterable iterable) {
        return new ahub(au(iterable));
    }

    @SafeVarargs
    public static ahub aF(ListenableFuture... listenableFutureArr) {
        return new ahub(av(listenableFutureArr));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public static afvq aG(afwd afwdVar, ahud ahudVar, Set set) {
        new HashSet();
        Set hashSet = new HashSet();
        new HashMap();
        new HashMap();
        afwdVar.getClass();
        ?? r3 = ahudVar.b;
        r3.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            afuy afuyVar = (afuy) it.next();
            afuyVar.getClass();
            hashSet = atqq.s(hashSet, afuyVar);
        }
        return new afvq(afwdVar, r3, hashSet);
    }

    private static boolean aH(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    private static String aI(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + '>';
        }
    }

    private static String aJ(int i, int i2, String str) {
        if (i < 0) {
            return E("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return E("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.bR(i2, "negative size: "));
    }

    public static boolean aa(String str) {
        return str == null || str.isEmpty();
    }

    public static ageu ab(Class cls) {
        return new ageu(cls.getSimpleName());
    }

    public static ageu ac(Object obj) {
        return new ageu(obj.getClass().getSimpleName());
    }

    public static Object ad(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static String ae(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (ai(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (ai(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String af(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (ah(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (ah(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean ag(CharSequence charSequence, CharSequence charSequence2) {
        char c;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = charSequence.charAt(i);
                char cCharAt2 = charSequence2.charAt(i);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean ah(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean ai(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static ListenableFuture aj(Runnable runnable, long j, long j2, TimeUnit timeUnit, mbc mbcVar, ahey aheyVar) {
        long jB = mbcVar.b() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        long jConvert = TimeUnit.MILLISECONDS.convert(j2, timeUnit);
        SettableFuture settableFutureCreate = SettableFuture.create();
        AtomicReference atomicReference = new AtomicReference(null);
        a.ap(atomicReference, aheyVar.schedule(new agde(settableFutureCreate, runnable, atomicReference, aheyVar, jB, jConvert, mbcVar), j, timeUnit));
        settableFutureCreate.addListener(new acem(atomicReference, 15), MoreExecutors.directExecutor());
        return settableFutureCreate;
    }

    public static void ak(Context context) {
    }

    public static void al(Context context) {
    }

    public static ListenableFuture am(ListenableFuture listenableFuture, Class cls, agek agekVar, Executor executor) {
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), agekVar);
        int i = ahbz.d;
        ahby ahbyVar = new ahby(listenableFuture, cls, afwiVar);
        listenableFuture.addListener(ahbyVar, MoreExecutors.c(executor, ahbyVar));
        return ahbyVar;
    }

    public static ListenableFuture an(ListenableFuture listenableFuture, Class cls, ahcy ahcyVar, Executor executor) {
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
        int i = ahbz.d;
        ahbx ahbxVar = new ahbx(listenableFuture, cls, ahdbVar);
        listenableFuture.addListener(ahbxVar, MoreExecutors.c(executor, ahbxVar));
        return ahbxVar;
    }

    public static ListenableFuture ao(Runnable runnable, Executor executor) {
        ahfo ahfoVar = new ahfo(Executors.callable(afwl.i(runnable), null));
        executor.execute(ahfoVar);
        return ahfoVar;
    }

    public static ListenableFuture ap(Callable callable, Executor executor) {
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), callable, 1));
        executor.execute(ahfoVar);
        return ahfoVar;
    }

    public static ListenableFuture aq(ahcx ahcxVar, Executor executor) {
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new afwh(afty.c(false), ahcxVar, 0));
        executor.execute(ahfoVar);
        return ahfoVar;
    }

    public static ListenableFuture ar(ListenableFuture listenableFuture, agek agekVar, Executor executor) {
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), agekVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFuture, afwiVar);
        listenableFuture.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return ahcrVar;
    }

    public static ListenableFuture as(ListenableFuture listenableFuture, ahcy ahcyVar, Executor executor) {
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFuture, ahdbVar);
        listenableFuture.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    public static void at(ListenableFuture listenableFuture, aheh ahehVar, Executor executor) {
        long j = afwl.a;
        ahehVar.getClass();
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), ahehVar, 0)), executor);
    }

    public static ahud au(Iterable iterable) {
        return new ahud(new ahek(false, agke.j(iterable)), (byte[]) null);
    }

    @SafeVarargs
    public static ahud av(ListenableFuture... listenableFutureArr) {
        return new ahud(new ahek(false, agke.p(listenableFutureArr)), (byte[]) null);
    }

    public static ahud aw(Iterable iterable) {
        return new ahud(ahng.i(iterable), (byte[]) null);
    }

    @SafeVarargs
    public static ahud ax(ListenableFuture... listenableFutureArr) {
        return new ahud(new ahek(true, agke.p(listenableFutureArr)), (byte[]) null);
    }

    public static ListenableFuture ay(ListenableFuture listenableFuture, Callable callable, Executor executor) {
        return aguu.aD(listenableFuture, afwl.j(callable), executor);
    }

    public static ListenableFuture az(ListenableFuture listenableFuture, ahcx ahcxVar, Executor executor) {
        long j = afwl.a;
        return aguu.aE(listenableFuture, new afwh(afty.c(false), ahcxVar, 0), executor);
    }

    public static Object b(ahol aholVar, ahpd ahpdVar) {
        ahrs ahrsVarA = aholVar.a(ahpdVar);
        if (ahrsVarA == null) {
            return null;
        }
        return ahrsVarA.a();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Set] */
    public static void c(List list) {
        Set<jij> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (jij jijVar : (Set) it2.next()) {
                        for (ahos ahosVar : ((ahok) jijVar.b).c) {
                            if (ahosVar.a() && (set = (Set) map.get(new ahor(ahosVar.a, ahosVar.b()))) != null) {
                                for (jij jijVar2 : set) {
                                    jijVar.c.add(jijVar2);
                                    jijVar2.a.add(jijVar);
                                }
                            }
                        }
                    }
                }
                HashSet<jij> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (jij jijVar3 : hashSet) {
                    if (jijVar3.D()) {
                        hashSet2.add(jijVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    jij jijVar4 = (jij) hashSet2.iterator().next();
                    hashSet2.remove(jijVar4);
                    i++;
                    for (jij jijVar5 : jijVar4.c) {
                        jijVar5.a.remove(jijVar4);
                        if (jijVar5.D()) {
                            hashSet2.add(jijVar5);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (jij jijVar6 : hashSet) {
                    if (!jijVar6.D() && !jijVar6.c.isEmpty()) {
                        arrayList.add(jijVar6.b);
                    }
                }
                throw new ahot(arrayList);
            }
            ahok ahokVar = (ahok) it.next();
            jij jijVar7 = new jij(ahokVar);
            for (ahpd ahpdVar : ahokVar.b) {
                ahor ahorVar = new ahor(ahpdVar, !ahokVar.b());
                if (!map.containsKey(ahorVar)) {
                    map.put(ahorVar, new HashSet());
                }
                Set set2 = (Set) map.get(ahorVar);
                if (!set2.isEmpty() && !ahorVar.a) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", ahpdVar));
                }
                set2.add(jijVar7);
            }
        }
    }

    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new ahow(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s was not found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new ahow(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new ahow(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new ahow(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new ahow(String.format("Could not instantiate %s", str), e4);
        }
    }

    public static void e(Context context) {
        ApplicationInfo applicationInfo;
        if (C(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        boolean z = true;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), SemanticState.Focused)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (a.aL()) {
            new hff(context, z, new kjc((byte[]) null, (byte[]) null, (byte[]) null), 9).run();
        } else {
            new lpf().t(null);
        }
    }

    public static boolean f(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static String g(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:111:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5 A[PHI: r5
      0x00d5: PHI (r5v14 java.lang.String) = (r5v13 java.lang.String), (r5v32 java.lang.String) binds: [B:43:0x00bf, B:46:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x013a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    /* JADX WARN: Code duplicated, block: B:93:0x017e  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    public static void i(Intent intent) {
        int iIntValue;
        int i;
        String string;
        ahty ahtyVar;
        String string2;
        char c;
        String strG;
        String strH;
        String string3;
        String string4;
        long j;
        String str;
        long j2;
        String str2;
        String str3;
        String str4;
        String[] strArrSplit;
        String str5;
        if (l(intent)) {
            j("_nr", intent.getExtras());
        }
        if (intent == null || aH(intent) || !k()) {
            return;
        }
        ahtx ahtxVar = ahtx.MESSAGE_DELIVERED;
        jse jseVar = (jse) FirebaseMessaging.a.a();
        if (jseVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        Object obj = extras.get("google.ttl");
        int i2 = 0;
        try {
            if (!(obj instanceof Integer)) {
                if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(String.valueOf(obj))));
                        i = 0;
                    }
                }
                i = 0;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        ahnr ahnrVarB = ahnr.b();
                        Object obj2 = ahrv.a;
                        string = (String) mda.n(((ahrv) ahnrVarB.f(ahrw.class)).a());
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
                String packageName = ahnr.b().a().getPackageName();
                ahtz ahtzVar = ahtz.ANDROID;
                if (extras == null && aewo.an(extras)) {
                    ahtyVar = ahty.DISPLAY_NOTIFICATION;
                } else {
                    ahtyVar = ahty.DATA_MESSAGE;
                }
                ahty ahtyVar2 = ahtyVar;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        c = 1;
                    } else if (Fonts.Font.STYLE_NORMAL.equals(string2)) {
                        c = 2;
                    } else {
                        c = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    c = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        c = 1;
                    } else if (Fonts.Font.STYLE_NORMAL.equals(string2)) {
                        c = 2;
                    } else {
                        c = 0;
                    }
                }
                if (c == 2) {
                    i2 = 5;
                } else if (c == 1) {
                    i2 = 10;
                }
                strG = g(extras);
                if (strG == null) {
                    strG = "";
                }
                strH = h(extras);
                if (strH == null) {
                    strH = "";
                }
                string3 = extras.getString("collapse_key");
                if (string3 == null) {
                    string3 = "";
                }
                string4 = extras.getString("google.c.a.m_l");
                if (string4 == null) {
                    string4 = "";
                }
                String string5 = extras.getString("google.c.a.c_l");
                String str6 = string5 != null ? string5 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        j = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e2) {
                        Log.w("FirebaseMessaging", "error parsing project number", e2);
                        ahnr ahnrVarB2 = ahnr.b();
                        str3 = ahnrVarB2.e().c;
                        if (str3 != null) {
                            try {
                                j = Long.parseLong(str3);
                            } catch (NumberFormatException e3) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                                str4 = ahnrVarB2.e().b;
                                if (!str4.startsWith("1:")) {
                                    str = string;
                                    strArrSplit = str4.split(":");
                                    str2 = strG;
                                    if (strArrSplit.length >= 2) {
                                        str5 = strArrSplit[1];
                                        if (str5.isEmpty()) {
                                            try {
                                                j2 = Long.parseLong(str5);
                                            } catch (NumberFormatException e4) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e4);
                                                j2 = 0;
                                            }
                                        }
                                    }
                                    jseVar.a("FCM_CLIENT_EVENT_LOGGING", new jsa(), new kcu(2)).r(new jsb(null, new ahub(new ahua(j2 > 0 ? j2 : 0L, str2, str, ahtyVar2, ahtzVar, packageName, string3, i2, i, strH, ahtxVar, string4, str6)), 1, new jsc(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
                                    return;
                                }
                                try {
                                    j = Long.parseLong(str4);
                                } catch (NumberFormatException e5) {
                                    Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                    str = string;
                                    str2 = strG;
                                    j2 = 0;
                                }
                                j2 = 0;
                                jseVar.a("FCM_CLIENT_EVENT_LOGGING", new jsa(), new kcu(2)).r(new jsb(null, new ahub(new ahua(j2 > 0 ? j2 : 0L, str2, str, ahtyVar2, ahtzVar, packageName, string3, i2, i, strH, ahtxVar, string4, str6)), 1, new jsc(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
                                return;
                            }
                        }
                        str4 = ahnrVarB2.e().b;
                        if (!str4.startsWith("1:")) {
                            str = string;
                            strArrSplit = str4.split(":");
                            str2 = strG;
                            if (strArrSplit.length >= 2) {
                                str5 = strArrSplit[1];
                                if (str5.isEmpty()) {
                                    j2 = Long.parseLong(str5);
                                }
                            }
                            jseVar.a("FCM_CLIENT_EVENT_LOGGING", new jsa(), new kcu(2)).r(new jsb(null, new ahub(new ahua(j2 > 0 ? j2 : 0L, str2, str, ahtyVar2, ahtzVar, packageName, string3, i2, i, strH, ahtxVar, string4, str6)), 1, new jsc(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
                            return;
                        }
                        j = Long.parseLong(str4);
                        j2 = 0;
                        jseVar.a("FCM_CLIENT_EVENT_LOGGING", new jsa(), new kcu(2)).r(new jsb(null, new ahub(new ahua(j2 > 0 ? j2 : 0L, str2, str, ahtyVar2, ahtzVar, packageName, string3, i2, i, strH, ahtxVar, string4, str6)), 1, new jsc(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
                        return;
                    }
                    str = string;
                    j2 = j;
                    str2 = strG;
                } else {
                    ahnr ahnrVarB3 = ahnr.b();
                    str3 = ahnrVarB3.e().c;
                    if (str3 != null) {
                        j = Long.parseLong(str3);
                        str = string;
                        j2 = j;
                        str2 = strG;
                    }
                    str4 = ahnrVarB3.e().b;
                    if (!str4.startsWith("1:")) {
                        j = Long.parseLong(str4);
                        str = string;
                        j2 = j;
                        str2 = strG;
                    } else {
                        str = string;
                        strArrSplit = str4.split(":");
                        str2 = strG;
                        if (strArrSplit.length >= 2) {
                            str5 = strArrSplit[1];
                            if (str5.isEmpty()) {
                                j2 = Long.parseLong(str5);
                            }
                        }
                    }
                    j2 = 0;
                }
                jseVar.a("FCM_CLIENT_EVENT_LOGGING", new jsa(), new kcu(2)).r(new jsb(null, new ahub(new ahua(j2 > 0 ? j2 : 0L, str2, str, ahtyVar2, ahtzVar, packageName, string3, i2, i, strH, ahtxVar, string4, str6)), 1, new jsc(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
                return;
            }
            iIntValue = ((Integer) obj).intValue();
            jseVar.a("FCM_CLIENT_EVENT_LOGGING", new jsa(), new kcu(2)).r(new jsb(null, new ahub(new ahua(j2 > 0 ? j2 : 0L, str2, str, ahtyVar2, ahtzVar, packageName, string3, i2, i, strH, ahtxVar, string4, str6)), 1, new jsc(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
            return;
        } catch (RuntimeException e6) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
            return;
        }
        i = iIntValue;
        string = extras.getString("google.to");
        if (TextUtils.isEmpty(string)) {
            ahnr ahnrVarB4 = ahnr.b();
            Object obj3 = ahrv.a;
            string = (String) mda.n(((ahrv) ahnrVarB4.f(ahrw.class)).a());
        }
        String packageName2 = ahnr.b().a().getPackageName();
        ahtz ahtzVar2 = ahtz.ANDROID;
        if (extras == null) {
            ahtyVar = ahty.DATA_MESSAGE;
        } else {
            ahtyVar = ahty.DATA_MESSAGE;
        }
        ahty ahtyVar3 = ahtyVar;
        string2 = extras.getString("google.delivered_priority");
        if (string2 != null) {
            if ("high".equals(string2)) {
                c = 1;
            } else if (Fonts.Font.STYLE_NORMAL.equals(string2)) {
                c = 2;
            } else {
                c = 0;
            }
        } else if ("1".equals(extras.getString("google.priority_reduced"))) {
            string2 = extras.getString("google.priority");
            if ("high".equals(string2)) {
                c = 1;
            } else if (Fonts.Font.STYLE_NORMAL.equals(string2)) {
                c = 2;
            } else {
                c = 0;
            }
        } else {
            c = 2;
        }
        if (c == 2) {
            i2 = 5;
        } else if (c == 1) {
            i2 = 10;
        }
        strG = g(extras);
        if (strG == null) {
            strG = "";
        }
        strH = h(extras);
        if (strH == null) {
            strH = "";
        }
        string3 = extras.getString("collapse_key");
        if (string3 == null) {
            string3 = "";
        }
        string4 = extras.getString("google.c.a.m_l");
        if (string4 == null) {
            string4 = "";
        }
        String string6 = extras.getString("google.c.a.c_l");
        if (string6 != null) {
        }
        if (extras.containsKey("google.c.sender.id")) {
            j = Long.parseLong(extras.getString("google.c.sender.id"));
            str = string;
            j2 = j;
            str2 = strG;
        } else {
            ahnr ahnrVarB5 = ahnr.b();
            str3 = ahnrVarB5.e().c;
            if (str3 != null) {
                j = Long.parseLong(str3);
                str = string;
                j2 = j;
                str2 = strG;
            }
            str4 = ahnrVarB5.e().b;
            if (!str4.startsWith("1:")) {
                j = Long.parseLong(str4);
                str = string;
                j2 = j;
                str2 = strG;
            } else {
                str = string;
                strArrSplit = str4.split(":");
                str2 = strG;
                if (strArrSplit.length >= 2) {
                    str5 = strArrSplit[1];
                    if (str5.isEmpty()) {
                        j2 = Long.parseLong(str5);
                    }
                }
            }
            j2 = 0;
        }
    }

    public static void j(String str, Bundle bundle) {
        try {
            ahnr.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String strH = h(bundle);
            if (strH != null) {
                bundle2.putString("_nt", strH);
            }
            String string5 = bundle.getString("google.c.a.ts");
            if (string5 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string5));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string6 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string6 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = true != aewo.an(bundle) ? "data" : "display";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            ahoa ahoaVar = (ahoa) ahnr.b().f(ahoa.class);
            if (ahoaVar != null) {
                ahoaVar.a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean k() {
        ApplicationInfo applicationInfo;
        try {
            ahnr.b();
            Context contextA = ahnr.b().a();
            SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            PackageManager packageManager = contextA.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), SemanticState.Focused)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
            return false;
        }
    }

    public static boolean l(Intent intent) {
        if (intent == null || aH(intent)) {
            return false;
        }
        return m(intent.getExtras());
    }

    public static boolean m(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static ExecutorService n() {
        return Executors.newSingleThreadExecutor(new ktb("Firebase-Messaging-Network-Io", 0));
    }

    public static ahno o() {
        ahno ahnoVar = a;
        if (ahnoVar != null) {
            return ahnoVar;
        }
        ahno ahnoVar2 = new ahno();
        a = ahnoVar2;
        return ahnoVar2;
    }

    public static void p(aibp aibpVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibr aibrVar = (aibr) aihfVar.instance;
        aibr aibrVar2 = aibr.a;
        aibrVar.f = aibpVar.d;
        aibrVar.b |= 8;
    }

    public static void q(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibr aibrVar = (aibr) aihfVar.instance;
        aibr aibrVar2 = aibr.a;
        aibrVar.b |= 1;
        aibrVar.c = str;
    }

    public static void r(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibr aibrVar = (aibr) aihfVar.instance;
        aibr aibrVar2 = aibr.a;
        aibrVar.b |= 2;
        aibrVar.d = str;
    }

    public static void s(aibq aibqVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibr aibrVar = (aibr) aihfVar.instance;
        aibr aibrVar2 = aibr.a;
        aibrVar.e = aibqVar.h;
        aibrVar.b |= 4;
    }

    public static /* synthetic */ aiao t(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aiao) aihnVarBuild;
    }

    public static void u(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiao aiaoVar = (aiao) aihfVar.instance;
        aiao aiaoVar2 = aiao.a;
        aiaoVar.b |= 4;
        aiaoVar.e = j;
    }

    public static void v(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiao aiaoVar = (aiao) aihfVar.instance;
        aiao aiaoVar2 = aiao.a;
        aiaoVar.b |= 8;
        aiaoVar.f = str;
    }

    public static void w(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiao aiaoVar = (aiao) aihfVar.instance;
        aiao aiaoVar2 = aiao.a;
        aiaoVar.b |= 16;
        aiaoVar.g = j;
    }

    public static void x(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiao aiaoVar = (aiao) aihfVar.instance;
        aiao aiaoVar2 = aiao.a;
        aiaoVar.b |= 1;
        aiaoVar.c = str;
    }

    public static /* synthetic */ aiah y(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aiah) aihnVarBuild;
    }

    public static void z(aiao aiaoVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiah aiahVar = (aiah) aihfVar.instance;
        aiah aiahVar2 = aiah.a;
        aiahVar.c = aiaoVar;
        aiahVar.b = 1;
    }

    public agev a(agsu agsuVar) {
        agrx agrxVar = ahvj.a;
        ahvg ahvgVar = ahvh.a;
        String str = (String) agsuVar.m().d(agrxVar);
        return str == null ? agdf.a : new agfa(new aher(str));
    }

    public ahno(byte[] bArr) {
    }
}
