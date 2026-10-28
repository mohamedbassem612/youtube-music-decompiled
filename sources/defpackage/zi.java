package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zi {
    public zi(ard ardVar) {
        new WeakReference(ardVar);
        aqu.o(ardVar.J);
        aqu.o(ardVar.K);
        aqu.o(ardVar.L);
        aqu.o(ardVar.M);
        aqu.o(ardVar.N);
    }

    public static final int a(avc avcVar) {
        if (avcVar == null) {
            return 0;
        }
        String str = avcVar.d;
        return str != null ? str.hashCode() : Objects.hash(avcVar.a, avcVar.c, Boolean.valueOf(avcVar.e), Boolean.valueOf(avcVar.f));
    }

    public static final boolean b(avc avcVar, avc avcVar2) {
        if (avcVar == null) {
            if (avcVar2 == null) {
                return true;
            }
        } else if (avcVar2 != null) {
            String str = avcVar.d;
            String str2 = avcVar2.d;
            if (str != null || str2 != null) {
                return awrc.c(str, str2);
            }
            if (awrc.c(Objects.toString(avcVar.a), Objects.toString(avcVar2.a)) && awrc.c(avcVar.c, avcVar2.c) && avcVar.e == avcVar2.e && avcVar.f == avcVar2.f) {
                return true;
            }
        }
        return false;
    }

    public static arw c(ard ardVar, int i, ArrayList arrayList, arw arwVar) {
        int i2;
        int i3 = i == 0 ? ardVar.ao : ardVar.ap;
        if (i3 == -1 || (arwVar != null && i3 == arwVar.c)) {
            if (i3 == -1) {
            }
            return arwVar;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arw arwVar2 = (arw) arrayList.get(i4);
            if (arwVar2.c == i3) {
                if (arwVar != null) {
                    arwVar.c(i, arwVar2);
                    arrayList.remove(arwVar);
                }
                arwVar = arwVar2;
                break;
            }
        }
        if (arwVar == null) {
            if (ardVar instanceof arh) {
                arh arhVar = (arh) ardVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= arhVar.as) {
                        i2 = -1;
                        break;
                    }
                    ard ardVar2 = arhVar.ar[i5];
                    if (i != 0) {
                        i2 = ardVar2.ap;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = ardVar2.ao;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        arw arwVar3 = (arw) arrayList.get(i6);
                        if (arwVar3.c == i2) {
                            arwVar = arwVar3;
                            break;
                        }
                    }
                }
            }
            if (arwVar == null) {
                arwVar = new arw(i);
            }
            arrayList.add(arwVar);
        }
        if (arwVar.d(ardVar)) {
            if (ardVar instanceof arg) {
                arg argVar = (arg) ardVar;
                argVar.d.c(argVar.ar == 0 ? 1 : 0, arrayList, arwVar);
            }
            if (i == 0) {
                ardVar.ao = arwVar.c;
                ardVar.J.c(0, arrayList, arwVar);
                ardVar.L.c(0, arrayList, arwVar);
            } else {
                ardVar.ap = arwVar.c;
                ardVar.K.c(1, arrayList, arwVar);
                ardVar.N.c(1, arrayList, arwVar);
                ardVar.M.c(1, arrayList, arwVar);
            }
            ardVar.Q.c(i, arrayList, arwVar);
        }
        return arwVar;
    }

    public static arw d(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arw arwVar = (arw) arrayList.get(i2);
            if (i == arwVar.c) {
                return arwVar;
            }
        }
        return null;
    }

    public static boolean e(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static synchronized double f(Context context) {
        return ((Double) l(new eoq(context, 3), Double.valueOf(2.0d))).doubleValue();
    }

    public static synchronized long g(Context context) {
        return ((Long) l(new eoq(context, 2), 3L)).longValue();
    }

    public static synchronized long h(Context context) {
        return ((Long) l(new eoq(context, 1), 100L)).longValue();
    }

    public static synchronized long i(Context context) {
        return ((Long) l(new eoq(context, 0), 60000L)).longValue();
    }

    public static final eoh j(int i, int i2, String str) {
        eoh eohVar = new eoh();
        eohVar.a = i;
        eohVar.b = i2;
        eohVar.c = str;
        return eohVar;
    }

    public static final isw k(String str, String str2, boolean z) {
        boolean z2 = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            z2 = false;
        }
        if (!z && !z2) {
            throw new IllegalArgumentException("Old purchase information(token/id) or original external transaction id must be provided.");
        }
        isw iswVar = new isw();
        iswVar.b = str;
        iswVar.a = str2;
        return iswVar;
    }

    private static Object l(eor eorVar, Object obj) {
        try {
            return eorVar.a();
        } catch (Exception e) {
            eov.e("RuntimeFlags", "Fail to get the runtime flags: ".concat(e.toString()));
            return obj;
        }
    }
}
