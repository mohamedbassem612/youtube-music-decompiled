package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aguu {
    public aguu() {
    }

    public static Object A(Iterator it, agex agexVar) {
        it.getClass();
        agexVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (agexVar.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object B(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object C(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object D(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static void E(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean F(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static int G(Iterable iterable, agex agexVar) {
        return x(iterable.iterator(), agexVar);
    }

    public static agev H(Iterable iterable, agex agexVar) {
        Iterator it = iterable.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (agexVar.a(next)) {
                return agev.i(next);
            }
        }
        return agdf.a;
    }

    public static Iterable I(Iterable iterable, agex agexVar) {
        iterable.getClass();
        return new agln(iterable, agexVar);
    }

    public static Object J(Iterable iterable, Object obj) {
        return B(iterable.iterator(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object K(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            if (iterable.isEmpty()) {
                throw new NoSuchElementException();
            }
            return iterable.get(iterable.size() - 1);
        }
        if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object L(Iterable iterable, Object obj) {
        return !iterable.isEmpty() ? iterable.get(iterable.size() - 1) : obj;
    }

    public static Object M(Iterable iterable) {
        return C(iterable.iterator());
    }

    public static String N(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static Collection O(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        Iterator it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        F(arrayList, it);
        return arrayList;
    }

    public static boolean P(Collection collection, Iterable iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : F(collection, iterable.iterator());
    }

    public static boolean Q(Iterable iterable, agex agexVar) {
        return x(iterable.iterator(), agexVar) != -1;
    }

    public static Object R(Iterable iterable) {
        Iterator it = iterable.iterator();
        int iW = w(it, 1);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException(a.ci((byte) 41, iW, "position (1) must be less than the number of elements that remained ("));
    }

    public static void S(List list, agex agexVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!agexVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        aI(list, agexVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        aI(list, agexVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public static /* synthetic */ agke T(Collection collection) {
        collection.getClass();
        agke agkeVarN = agke.n(collection);
        agkeVarN.getClass();
        return agkeVarN;
    }

    public static /* synthetic */ agkj U(Map map) {
        map.getClass();
        agkj agkjVarH = agkj.h(map);
        agkjVarH.getClass();
        return agkjVarH;
    }

    public static /* synthetic */ agkz V(Collection collection) {
        agkz agkzVarN = agkz.n(collection);
        agkzVarN.getClass();
        return agkzVarN;
    }

    public static int W(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int X(Object obj) {
        return W(obj == null ? 0 : obj.hashCode());
    }

    public static int Y(int i) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= iHighestOneBit) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit << 1;
        if (i2 <= 0) {
            return 1073741824;
        }
        return i2;
    }

    public static int Z(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iX = X(obj);
        int i2 = iX & i;
        int iAa = aa(obj3, i2);
        if (iAa == 0) {
            return -1;
        }
        int i3 = ~i;
        int i4 = iX & i3;
        int i5 = -1;
        while (true) {
            int i6 = iAa - 1;
            int i7 = iArr[i6];
            int i8 = i7 & i;
            if ((i7 & i3) == i4 && Objects.equals(obj, objArr[i6]) && (objArr2 == null || Objects.equals(obj2, objArr2[i6]))) {
                if (i5 == -1) {
                    ad(obj3, i2, i8);
                } else {
                    iArr[i5] = (iArr[i5] & i3) | (i8 & i);
                }
                return i6;
            }
            if (i8 == 0) {
                return -1;
            }
            i5 = i6;
            iAa = i8;
        }
    }

    public static egp aA(Context context) {
        try {
            ebm ebmVarJ = ebm.j(context);
            if (ebmVarJ.i == null) {
                synchronized (ebm.a) {
                    try {
                        if (ebmVarJ.i == null) {
                            try {
                                ebmVarJ.i = (egp) Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, ebm.class).newInstance(ebmVarJ.b, ebmVarJ);
                            } catch (Throwable unused) {
                                dzf.b();
                            }
                            if (ebmVarJ.i == null && !TextUtils.isEmpty(ebmVarJ.c.g)) {
                                throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            egp egpVar = ebmVarJ.i;
            if (egpVar != null) {
                return egpVar;
            }
            throw new IllegalStateException("Unable to initialize RemoteWorkManager");
        } catch (IllegalStateException e) {
            throw new IllegalStateException("RemoteWorkManager instantiation failed. You might be missing a dependency on\n\"//third_party/java/androidx/work:multiprocess\",", e);
        }
    }

    public static ListenableFuture aB(ListenableFuture listenableFuture) {
        abzy abzyVar = new abzy(14);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), abzyVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFuture, afwiVar);
        listenableFuture.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    public static afki aC(cc ccVar) {
        ccVar.getClass();
        return new afkl(new glj(ccVar, 16), ccVar, ccVar.getLifecycle());
    }

    public static ListenableFuture aD(ListenableFuture listenableFuture, Callable callable, Executor executor) {
        ahev ahevVar = new ahev(callable);
        listenableFuture.addListener(ahevVar, executor);
        ahevVar.addListener(new afii(ahevVar, listenableFuture, 4, null), MoreExecutors.directExecutor());
        return ahevVar;
    }

    public static ListenableFuture aE(ListenableFuture listenableFuture, ahcx ahcxVar, Executor executor) {
        afwh afwhVar = new afwh(ahcxVar, listenableFuture, 1);
        afik afikVar = new afik(listenableFuture, executor, 2);
        ahfo ahfoVar = new ahfo(afwhVar);
        afikVar.execute(ahfoVar);
        ahfoVar.addListener(new afii(ahfoVar, listenableFuture, 4, null), MoreExecutors.directExecutor());
        return ahfoVar;
    }

    public static ListenableFuture aF(List list, agex agexVar, Executor executor) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ListenableFuture listenableFutureA = ((ahcx) it.next()).a();
                if (listenableFutureA.isDone()) {
                    try {
                        ahno.R(listenableFutureA.isDone(), "Future was expected to be done: %s", listenableFutureA);
                        Object objI = a.i(listenableFutureA);
                        if (listenableFutureA.isCancelled() || agexVar.a(objI)) {
                            if (!arrayList.isEmpty()) {
                                arrayList.add(listenableFutureA);
                                break;
                            }
                            return listenableFutureA;
                        }
                    } catch (ExecutionException unused) {
                        if (arrayList.isEmpty()) {
                            return listenableFutureA;
                        }
                        arrayList.add(listenableFutureA);
                    }
                } else {
                    arrayList.add(listenableFutureA);
                }
            } catch (Exception e) {
                ListenableFuture listenableFutureM = ahng.m(e);
                if (arrayList.isEmpty()) {
                    return listenableFutureM;
                }
                arrayList.add(listenableFutureM);
            }
        }
        afhi afhiVar = new afhi(arrayList, agexVar, executor);
        if (afhiVar.d != -1) {
            throw new IllegalStateException();
        }
        ListenableFuture listenableFutureB = afhiVar.b();
        listenableFutureB.addListener(new acem(afhiVar, 9), afhiVar.c);
        return listenableFutureB;
    }

    public static ListenableFuture aG(aflp aflpVar, String str, int i, ayq ayqVar) {
        return aflpVar.c(str, i, Collections.singletonList(ayqVar));
    }

    public static afln aH(awmd awmdVar, jij jijVar) {
        return new aflv(new aenp(awmdVar, 2), jijVar);
    }

    private static void aI(List list, agex agexVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (agexVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    public static int aa(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object ab(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(a.bR(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static void ac(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static void ad(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static boolean ae(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static void af(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        }
        if (obj2 == null) {
            throw new NullPointerException(a.cs(obj, "null value in entry: ", "=null"));
        }
    }

    public static void ag(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void ah(boolean z) {
        if (!z) {
            throw new agfz();
        }
    }

    public static void ai(boolean z, String str, Object obj) {
        if (!z) {
            throw new agfz(ahno.E(str, obj));
        }
    }

    public static void aj(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new agfz(ahno.E(str, objArr));
        }
    }

    public static void ak(Object obj) {
        Object[] objArr = new Object[0];
        if (obj == null) {
            throw new agfz(ahno.E("expected a non-null reference", objArr));
        }
    }

    public static agfr al(agfr agfrVar) {
        if ((agfrVar instanceof agft) || (agfrVar instanceof agfs)) {
            return agfrVar;
        }
        return agfrVar instanceof Serializable ? new agfs(agfrVar) : new agft(agfrVar);
    }

    public static void am(afvl afvlVar) {
        afty.s(afvlVar.d());
    }

    public static void an(afvl afvlVar) {
        if (ap(afvlVar) || afvlVar.b() == null) {
            afvlVar.e();
            am(afvlVar);
        } else {
            an(afvlVar.b());
            am(afvlVar);
        }
    }

    public static void ao(afvl afvlVar) {
        if (ap(afvlVar) || afvlVar.b() == null) {
            return;
        }
        ao(afvlVar.b());
    }

    public static boolean ap(afvl afvlVar) {
        return afvlVar.f() != Thread.currentThread();
    }

    public static afpa aq(agev agevVar, afpa afpaVar) {
        if (agevVar.g()) {
            return new afpa((cf) agevVar.c());
        }
        afpaVar.getClass();
        return afpaVar;
    }

    public static cf ar(Activity activity) {
        try {
            return (cf) activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), e);
        }
    }

    public static Object as(aupi aupiVar, Class cls) {
        try {
            auph auphVarComponentManager = aupiVar.componentManager();
            if (auphVarComponentManager instanceof auof) {
                auof auofVar = (auof) auphVarComponentManager;
                if (!(aupiVar instanceof cc)) {
                    return cls.cast(auofVar.f());
                }
            }
            return cls.cast(auphVarComponentManager.generatedComponent());
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        }
    }

    public static void at(Intent intent, Context context) {
        Context applicationContext = context.getApplicationContext();
        if (intent.getPackage() == null || !intent.getPackage().equals(applicationContext.getPackageName())) {
            return;
        }
        afwl.l(intent);
    }

    public static Locale au(cc ccVar) {
        Bundle arguments = ccVar.getArguments();
        if (arguments == null) {
            return null;
        }
        return (Locale) arguments.getSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE");
    }

    public static Object av(Context context, Class cls) {
        context.getClass();
        ComponentCallbacks2 componentCallbacks2AJ = a.aJ(context.getApplicationContext());
        componentCallbacks2AJ.getClass();
        if (!(componentCallbacks2AJ instanceof auph)) {
            Class<?> cls2 = componentCallbacks2AJ.getClass();
            java.util.Objects.toString(cls2);
            throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls2)));
        }
        try {
            Object objCast = cls.cast(((auph) componentCallbacks2AJ).generatedComponent());
            objCast.getClass();
            return objCast;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
        }
    }

    public static Object aw(Context context, Class cls, affd affdVar) {
        context.getClass();
        cls.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        try {
            Object objCast = cls.cast(((afnd) av(applicationContext, afnd.class)).gg().j(affdVar));
            objCast.getClass();
            return objCast;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", e);
        }
    }

    public static afnv ax(affd affdVar, cc ccVar) {
        afnv afnvVarA;
        afnv afnvVar;
        cc parentFragment = ccVar;
        while (true) {
            if (parentFragment == null) {
                afnvVarA = null;
                break;
            }
            if (parentFragment instanceof aupi) {
                auph auphVarComponentManager = ((aupi) parentFragment).componentManager();
                if (auphVarComponentManager instanceof afnw) {
                    afnvVarA = ((afnw) auphVarComponentManager).a();
                    break;
                }
            }
            parentFragment = parentFragment.getParentFragment();
        }
        if (afnvVarA != null) {
            return afnvVarA;
        }
        afny afnyVarI = ((afnc) atqp.a(ay(ccVar), afnc.class)).i();
        synchronized (afnyVarI.b) {
            Map map = afnyVarI.c;
            if (!map.containsKey(affdVar)) {
                map.put(affdVar, afnyVarI.a(affdVar));
            }
            afnvVar = (afnv) map.get(affdVar);
        }
        return afnvVar;
    }

    public static gkd ay(cc ccVar) {
        for (cc parentFragment = ccVar; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof aupi) {
                auph auphVarComponentManager = ((aupi) parentFragment).componentManager();
                if (auphVarComponentManager instanceof auof) {
                    return ((auof) auphVarComponentManager).f();
                }
            }
        }
        ahno.R(ccVar.getHost() instanceof aupi, "TikTok Fragments must be attached to a TikTok Activity. Found: %s", ccVar.getHost().getClass());
        auph auphVarComponentManager2 = ((aupi) ccVar.getHost()).componentManager();
        ahno.R(auphVarComponentManager2 instanceof auof, "TikTok Fragments must be attached to a TikTok Activity. Found: %s", ccVar.getHost().getClass());
        return ((auof) auphVarComponentManager2).f();
    }

    public static String az(PackageInfo packageInfo) {
        String str = packageInfo.versionName;
        str.getClass();
        return str;
    }

    public static int d(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static String e(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        return "".concat(String.valueOf(str));
    }

    public static void f(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean g(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static Object[] h(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    public static void i(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException(a.bR(i, "at index "));
        }
    }

    public static void j(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            i(objArr[i2], i2);
        }
    }

    public static int k(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Alert.DURATION_SHOW_INDEFINITELY;
        }
        ag(i, "expectedSize");
        return i + 1;
    }

    public static agek l(agof agofVar) {
        agofVar.getClass();
        return new aeqk(agofVar, 18);
    }

    public static Object m(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static String n(Map map) {
        int size = map.size();
        ag(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static HashMap o(int i) {
        return new HashMap(k(i));
    }

    public static Map p(Map map, agek agekVar) {
        return new agoj(map, new agor(agekVar, 1));
    }

    public static boolean q(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ArrayList r(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        F(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList s(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(ahng.P(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List t(List list) {
        if (list instanceof agke) {
            return ((agke) list).a();
        }
        if (list instanceof agmd) {
            return ((agmd) list).a;
        }
        return list instanceof RandomAccess ? new agmb(list) : new agmd(list);
    }

    public static List u(List list, agek agekVar) {
        return list instanceof RandomAccess ? new agmf(list, agekVar) : new agmh(list, agekVar);
    }

    public static boolean v(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (obj instanceof List) {
            List list2 = (List) obj;
            int size = list.size();
            if (size == list2.size()) {
                if (list2 instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(list.get(i), list2.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                Iterator it2 = list2.iterator();
                while (it.hasNext()) {
                    if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static int w(Iterator it, int i) {
        it.getClass();
        ahno.G((i ^ (-1)) >>> 31, "numberToAdvance must be nonnegative");
        int i2 = 0;
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static int x(Iterator it, agex agexVar) {
        agexVar.getClass();
        int i = 0;
        while (it.hasNext()) {
            if (agexVar.a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int y(Iterator it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return ahng.P(j);
    }

    public static agqr z(Iterator it) {
        it.getClass();
        return it instanceof agqr ? (agqr) it : new aglr(it);
    }

    public agta a() {
        return agsz.a;
    }

    public agva b() {
        return agva.b;
    }

    public aguu(char[] cArr) {
    }

    public void c(String str, Level level, boolean z) {
    }
}
