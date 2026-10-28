package defpackage;

import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bbl {
    public bbl() {
    }

    static int a(int i) {
        int iStatusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static float c(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int iMin = Math.min((int) (200.0f * f), 199);
        float f2 = f - (iMin * 0.005f);
        float f3 = fArr[iMin];
        return f3 + ((f2 / 0.005f) * (fArr[iMin + 1] - f3));
    }

    public static bpp d(awmi awmiVar) {
        return (bpp) awmiVar.a();
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "NOT_REQUIRED";
        }
        if (i == 2) {
            return "CONNECTED";
        }
        if (i == 3) {
            return "UNMETERED";
        }
        if (i != 4) {
            return i != 5 ? "TEMPORARILY_UNMETERED" : "METERED";
        }
        return "NOT_ROAMING";
    }

    public static dzk f(azx azxVar, String str, Executor executor, Function0 function0) {
        executor.getClass();
        return new dzl(ape.f(new dzm(executor, function0, new bop(dzk.b), 0)));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:22:0x005f->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bef] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007f -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0082 -> B:22:0x005f). Please report as a decompilation issue!!! */
    public final Object b(List list, bef befVar, awoq awoqVar) throws Throwable {
        bdy bdyVar;
        ?? r6;
        awrm awrmVar;
        ?? it;
        Throwable th;
        awqg awqgVar;
        if (awoqVar instanceof bdy) {
            bdyVar = (bdy) awoqVar;
            int i = bdyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bdyVar.d = i - Integer.MIN_VALUE;
            } else {
                bdyVar = new bdy(this, awoqVar);
            }
        } else {
            bdyVar = new bdy(this, awoqVar);
        }
        Object obj = bdyVar.c;
        awox awoxVar = awox.a;
        int i2 = bdyVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                Object obj2 = bdyVar.a;
                atqp.j(obj);
                r6 = obj2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = bdyVar.b;
                awrmVar = bdyVar.e;
                try {
                    atqp.j(obj);
                    it = it;
                } catch (Throwable th2) {
                    Object obj3 = awrmVar.a;
                    if (obj3 == null) {
                        awrmVar.a = th2;
                        it = it;
                    } else {
                        avkz.d((Throwable) obj3, th2);
                        it = it;
                    }
                }
            }
            while (it.hasNext()) {
                awqgVar = (awqg) it.next();
                bdyVar.a = null;
                bdyVar.e = awrmVar;
                bdyVar.b = it;
                bdyVar.d = 2;
                if (awqgVar.invoke(bdyVar) == awoxVar) {
                    return awoxVar;
                }
            }
            th = (Throwable) awrmVar.a;
            if (th == null) {
                return awmy.a;
            }
            throw th;
        }
        atqp.j(obj);
        ArrayList arrayList = new ArrayList();
        bdz bdzVar = new bdz(list, arrayList, null);
        bdyVar.a = arrayList;
        bdyVar.d = 1;
        if (befVar.a(bdzVar, bdyVar) == awoxVar) {
            return awoxVar;
        }
        r6 = arrayList;
        awrmVar = new awrm();
        it = r6.iterator();
        while (it.hasNext()) {
            awqgVar = (awqg) it.next();
            bdyVar.a = null;
            bdyVar.e = awrmVar;
            bdyVar.b = it;
            bdyVar.d = 2;
            if (awqgVar.invoke(bdyVar) == awoxVar) {
                return awoxVar;
            }
        }
        th = (Throwable) awrmVar.a;
        if (th == null) {
            return awmy.a;
        }
        throw th;
    }

    public bbl(byte[] bArr) {
    }
}
