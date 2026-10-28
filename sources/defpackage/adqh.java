package defpackage;

import app.rive.RiveFile;
import app.rive.ViewModelInstance;
import app.rive.ViewModelInstanceSource;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import internal.org.jni_zero.JniZero;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqh {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/rendering/rive/RivePropertyCache");
    public volatile Function0 a;
    private final awut c;
    private final LinkedHashMap d = new LinkedHashMap();
    private final LinkedHashMap e = new LinkedHashMap();
    private final LinkedHashMap f = new LinkedHashMap();
    private final LinkedHashMap g = new LinkedHashMap();
    private volatile ViewModelInstance h;
    private volatile RiveFile i;

    public adqh(awut awutVar) {
        this.c = awutVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063 A[Catch: all -> 0x0183, TryCatch #0 {, blocks: (B:17:0x0056, B:20:0x005c, B:22:0x0060, B:23:0x0063, B:25:0x006f, B:27:0x0077, B:29:0x007f, B:31:0x0087, B:34:0x008b), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2 A[LOOP:3: B:43:0x00ec->B:45:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:55:0x014b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163 A[LOOP:1: B:59:0x015d->B:61:0x0163, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v9 */
    static /* synthetic */ Object a(adqh adqhVar, ViewModelInstance viewModelInstance, RiveFile riveFile, awoq awoqVar) throws Throwable {
        adqe adqeVar;
        awrm awrmVar;
        awmy awmyVar;
        LinkedHashMap linkedHashMap;
        adqh adqhVar2;
        adqh adqhVar3;
        ?? r9;
        String str;
        adox adoxVar;
        ViewModelInstance viewModelInstance2;
        RiveFile riveFile2;
        if (awoqVar instanceof adqe) {
            adqeVar = (adqe) awoqVar;
            int i = adqeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                adqeVar.d = i - Integer.MIN_VALUE;
            } else {
                adqeVar = new adqe(adqhVar, awoqVar);
            }
        } else {
            adqeVar = new adqe(adqhVar, awoqVar);
        }
        Object obj = adqeVar.b;
        awox awoxVar = awox.a;
        int i2 = adqeVar.d;
        if (i2 == 0) {
            atqp.j(obj);
            awrm awrmVar2 = new awrm();
            awrm awrmVar3 = new awrm();
            awrm awrmVar4 = new awrm();
            awrmVar = new awrm();
            synchronized (adqhVar) {
                if (viewModelInstance != null) {
                    if (adqhVar.h == viewModelInstance && (riveFile == null || adqhVar.i == riveFile)) {
                        awmyVar = awmy.a;
                    } else {
                        adqhVar.h = viewModelInstance;
                        adqhVar.i = riveFile;
                        linkedHashMap = adqhVar.e;
                        if (!linkedHashMap.isEmpty() && adqhVar.d.isEmpty() && adqhVar.f.isEmpty() && adqhVar.g.isEmpty()) {
                            awmyVar = awmy.a;
                        } else {
                            awrmVar2.a = new LinkedHashMap(linkedHashMap);
                            awrmVar3.a = new LinkedHashMap(adqhVar.d);
                            awrmVar4.a = new LinkedHashMap(adqhVar.g);
                            awrmVar.a = new LinkedHashMap(adqhVar.f);
                            for (Map.Entry entry : ((Map) awrmVar2.a).entrySet()) {
                                str = (String) entry.getKey();
                                adoxVar = (adox) entry.getValue();
                                if (!((Map) awrmVar3.a).containsKey(str)) {
                                    adqhVar.d(viewModelInstance, str, adoxVar);
                                }
                            }
                            for (Map.Entry entry2 : ((Map) awrmVar3.a).entrySet()) {
                                adqhVar.d(viewModelInstance, (String) entry2.getKey(), (adox) entry2.getValue());
                            }
                            if (viewModelInstance != null) {
                                Iterator it = ((Map) awrmVar4.a).entrySet().iterator();
                                adqhVar3 = adqhVar;
                                r9 = it;
                            } else {
                                adqhVar2 = adqhVar;
                            }
                        }
                    }
                    return awmyVar;
                }
                adqhVar.h = viewModelInstance;
                adqhVar.i = riveFile;
                linkedHashMap = adqhVar.e;
                if (!linkedHashMap.isEmpty()) {
                }
                awrmVar2.a = new LinkedHashMap(linkedHashMap);
                awrmVar3.a = new LinkedHashMap(adqhVar.d);
                awrmVar4.a = new LinkedHashMap(adqhVar.g);
                awrmVar.a = new LinkedHashMap(adqhVar.f);
                while (r12.hasNext()) {
                    str = (String) entry.getKey();
                    adoxVar = (adox) entry.getValue();
                    if (!((Map) awrmVar3.a).containsKey(str)) {
                        adqhVar.d(viewModelInstance, str, adoxVar);
                    }
                }
                while (r12.hasNext()) {
                    adqhVar.d(viewModelInstance, (String) entry2.getKey(), (adox) entry2.getValue());
                }
                if (viewModelInstance != null) {
                    Iterator it2 = ((Map) awrmVar4.a).entrySet().iterator();
                    adqhVar3 = adqhVar;
                    r9 = it2;
                } else {
                    adqhVar2 = adqhVar;
                }
                viewModelInstance2 = viewModelInstance;
                riveFile2 = riveFile;
                if (viewModelInstance2 != null && riveFile2 != null) {
                    for (Map.Entry entry3 : ((Map) awrmVar.a).entrySet()) {
                        adqd adqdVar = (adqd) entry3.getKey();
                        adqhVar2.c(viewModelInstance2, riveFile2, adqdVar.a, adqdVar.b, adqdVar.c, (adox) entry3.getValue());
                    }
                }
                return awmy.a;
            }
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj2 = adqeVar.a;
        awrm awrmVar5 = adqeVar.h;
        riveFile = adqeVar.g;
        ViewModelInstance viewModelInstance3 = adqeVar.f;
        adqhVar3 = adqeVar.e;
        atqp.j(obj);
        awrmVar = awrmVar5;
        viewModelInstance = viewModelInstance3;
        r9 = obj2;
        while (r9.hasNext()) {
            Map.Entry entry4 = (Map.Entry) r9.next();
            String str2 = (String) entry4.getKey();
            int iIntValue = ((Number) entry4.getValue()).intValue();
            adqeVar.e = adqhVar3;
            adqeVar.f = viewModelInstance;
            adqeVar.g = riveFile;
            adqeVar.h = awrmVar;
            adqeVar.a = r9;
            adqeVar.d = 1;
            if (b(adqhVar3, viewModelInstance, str2, iIntValue, adqeVar) == awoxVar) {
                return awoxVar;
            }
        }
        adqhVar2 = adqhVar3;
        viewModelInstance2 = viewModelInstance;
        riveFile2 = riveFile;
        if (viewModelInstance2 != null) {
            while (r9.hasNext()) {
                adqd adqdVar2 = (adqd) entry3.getKey();
                adqhVar2.c(viewModelInstance2, riveFile2, adqdVar2.a, adqdVar2.b, adqdVar2.c, (adox) entry3.getValue());
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object b(adqh adqhVar, ViewModelInstance viewModelInstance, String str, int i, awoq awoqVar) throws Throwable {
        adqg adqgVar;
        if (awoqVar instanceof adqg) {
            adqgVar = (adqg) awoqVar;
            int i2 = adqgVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adqgVar.d = i2 - Integer.MIN_VALUE;
            } else {
                adqgVar = new adqg(adqhVar, awoqVar);
            }
        } else {
            adqgVar = new adqg(adqhVar, awoqVar);
        }
        Object listSize = adqgVar.b;
        awox awoxVar = awox.a;
        int i3 = adqgVar.d;
        try {
            if (i3 == 0) {
                atqp.j(listSize);
                if (adqhVar.h != viewModelInstance) {
                    return awmy.a;
                }
                adqgVar.e = adqhVar;
                adqgVar.f = viewModelInstance;
                adqgVar.g = str;
                adqgVar.a = i;
                adqgVar.d = 1;
                listSize = viewModelInstance.getListSize(str, adqgVar);
                if (listSize == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = adqgVar.a;
                str = adqgVar.g;
                viewModelInstance = adqgVar.f;
                adqhVar = adqgVar.e;
                atqp.j(listSize);
            }
            int iIntValue = ((Number) listSize).intValue();
            if (adqhVar.h != viewModelInstance) {
                return awmy.a;
            }
            if (iIntValue > i) {
                int i4 = iIntValue - 1;
                if (i <= i4) {
                    while (adqhVar.h == viewModelInstance) {
                        viewModelInstance.removeFromListAtIndex(str, i4);
                        if (i4 != i) {
                            i4--;
                        }
                    }
                    return awmy.a;
                }
                Function0 function0 = adqhVar.a;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            return awmy.a;
        } catch (Exception e) {
            ((agrc) ((agrc) b.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RivePropertyCache", "trimListToJni", 201, "RivePropertyCache.kt")).A("Failed to trim list on JNI VM: listPath=%s, targetSize=%d", str, i);
        }
    }

    public final synchronized void c(ViewModelInstance viewModelInstance, RiveFile riveFile, String str, int i, String str2, adox adoxVar) {
        adoxVar.getClass();
        try {
            ViewModelInstance viewModelInstanceFromFile = ViewModelInstance.Companion.fromFile(riveFile, new ViewModelInstanceSource.ReferenceListItem(viewModelInstance, str, i));
            try {
                d(viewModelInstanceFromFile, str2, adoxVar);
                JniZero.j(viewModelInstanceFromFile, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    JniZero.j(viewModelInstanceFromFile, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            ((agrc) ((agrc) b.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RivePropertyCache", "applyListItemPropertyToJni", 307, "RivePropertyCache.kt")).F("Failed to apply list item property to JNI VM: listPath=%s, index=%d, propertyPath=%s, field=%s", str, Integer.valueOf(i), str2, adoxVar);
        }
    }

    public final synchronized void d(ViewModelInstance viewModelInstance, String str, adox adoxVar) {
        str.getClass();
        adoxVar.getClass();
        if (viewModelInstance != null && this.h != null) {
            RiveFile riveFile = this.i;
            if (riveFile == null || !awrc.y(str, '/')) {
                try {
                    try {
                        try {
                            int iAe = acfz.ae(adoxVar);
                            if (iAe == 0) {
                                viewModelInstance.setBoolean(str, ((ados) adoxVar).a);
                            } else if (iAe == 1) {
                                viewModelInstance.setNumber(str, ((adov) adoxVar).a);
                            } else if (iAe == 2) {
                                viewModelInstance.setString(str, ((adow) adoxVar).a);
                            } else if (iAe == 3) {
                                viewModelInstance.setImage(str, ((adou) adoxVar).a);
                            } else {
                                if (iAe != 4) {
                                    throw new awmj();
                                }
                                viewModelInstance.setColor(str, ((adot) adoxVar).a);
                            }
                            Function0 function0 = this.a;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } catch (ViewModelException e) {
                            ((agrc) ((agrc) b.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RivePropertyCache", "applyPropertyToJni", 348, "RivePropertyCache.kt")).B("Failed to apply property to JNI VM: path=%s, field=%s", str, adoxVar);
                        }
                    } catch (IllegalArgumentException e2) {
                        ((agrc) ((agrc) b.c()).j(e2).k("com/google/android/libraries/youtube/rendering/rive/RivePropertyCache", "applyPropertyToJni", 353, "RivePropertyCache.kt")).B("Failed to apply property to JNI VM: path=%s, field=%s", str, adoxVar);
                    }
                } catch (IllegalStateException e3) {
                    ((agrc) ((agrc) b.c()).j(e3).k("com/google/android/libraries/youtube/rendering/rive/RivePropertyCache", "applyPropertyToJni", 358, "RivePropertyCache.kt")).B("Failed to apply property to JNI VM: path=%s, field=%s", str, adoxVar);
                }
            } else if (awrc.y(str, '/')) {
                int iA = awrc.A(str, '/', 0, 6);
                String strSubstring = str.substring(0, iA);
                strSubstring.getClass();
                String strSubstring2 = str.substring(iA + 1);
                strSubstring2.getClass();
                try {
                    ViewModelInstance viewModelInstanceFromFile = ViewModelInstance.Companion.fromFile(riveFile, new ViewModelInstanceSource.Reference(viewModelInstance, strSubstring));
                    try {
                        int iAe2 = acfz.ae(adoxVar);
                        if (iAe2 == 0) {
                            viewModelInstanceFromFile.setBoolean(strSubstring2, ((ados) adoxVar).a);
                        } else if (iAe2 == 1) {
                            viewModelInstanceFromFile.setNumber(strSubstring2, ((adov) adoxVar).a);
                        } else if (iAe2 == 2) {
                            viewModelInstanceFromFile.setString(strSubstring2, ((adow) adoxVar).a);
                        } else if (iAe2 == 3) {
                            viewModelInstanceFromFile.setImage(strSubstring2, ((adou) adoxVar).a);
                        } else {
                            if (iAe2 != 4) {
                                throw new awmj();
                            }
                            viewModelInstanceFromFile.setColor(strSubstring2, ((adot) adoxVar).a);
                        }
                        JniZero.j(viewModelInstanceFromFile, null);
                        Function0 function1 = this.a;
                        if (function1 != null) {
                            function1.invoke();
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            JniZero.j(viewModelInstanceFromFile, th);
                            throw th2;
                        }
                    }
                } catch (Exception e4) {
                    ((agrc) ((agrc) b.c()).j(e4).k("com/google/android/libraries/youtube/rendering/rive/RivePropertyCache", "applyNestedPropertyToJni", 390, "RivePropertyCache.kt")).F("Failed to apply nested property to child VM: path=%s, childPath=%s, propertyName=%s, field=%s", str, strSubstring, strSubstring2, adoxVar);
                }
            }
        }
    }

    public final synchronized void e() {
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h = null;
        this.i = null;
    }

    public final synchronized void f() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof adou) {
                it.remove();
            }
        }
        Iterator it2 = this.e.values().iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof adou) {
                it2.remove();
            }
        }
        Iterator it3 = this.f.values().iterator();
        while (it3.hasNext()) {
            if (it3.next() instanceof adou) {
                it3.remove();
            }
        }
    }

    public final synchronized void g(Map map) {
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.clear();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            adox adoxVar = (adox) entry.getValue();
            linkedHashMap.put(str, adoxVar);
            if (!this.d.containsKey(str)) {
                d(this.h, str, adoxVar);
            }
        }
    }

    public final synchronized void h(String str, adox adoxVar) {
        if (!awrc.c(adoxVar, (adox) this.d.put(str, adoxVar))) {
            d(this.h, str, adoxVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public final synchronized void i(String str, int i, String str2, adox adoxVar) {
        adqh adqhVar;
        try {
            try {
                if (awrc.c(adoxVar, (adox) this.f.put(new adqd(str, i, str2), adoxVar))) {
                    adqhVar = this;
                } else {
                    ViewModelInstance viewModelInstance = this.h;
                    RiveFile riveFile = this.i;
                    if (viewModelInstance == null || riveFile == null) {
                        adqhVar = this;
                    } else {
                        adqhVar = this;
                        adqhVar.c(viewModelInstance, riveFile, str, i, str2, adoxVar);
                    }
                }
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    public final synchronized void j(String str, int i) {
        ViewModelInstance viewModelInstance;
        adqh adqhVar;
        try {
            try {
                Integer num = (Integer) this.g.put(str, Integer.valueOf(i));
                if ((num == null || num.intValue() != i) && (viewModelInstance = this.h) != null) {
                    adqhVar = this;
                    awro.t(this.c, null, 0, new adqf(adqhVar, viewModelInstance, str, i, (awoq) null, 0), 3);
                } else {
                    adqhVar = this;
                }
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
        throw th;
    }

    public final synchronized boolean k() {
        return (this.d.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.g.isEmpty()) ? false : true;
    }

    public final synchronized boolean l(ViewModelInstance viewModelInstance) {
        return this.h == viewModelInstance;
    }
}
