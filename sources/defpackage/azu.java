package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azu {
    public static void a(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    public static void b(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    public static boolean c(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, null, i);
    }

    static int d(int i) {
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i == 2) {
            return 1;
        }
        if (i != 4) {
            i2 = 8;
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i != 256) {
                if (i == 512) {
                    return 9;
                }
                throw new IllegalArgumentException(a.bR(i, "type needs to be >= FIRST and <= LAST, type="));
            }
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r5v0, types: [awqg] */
    public static final Object e(File file, awqg awqgVar, awoq awoqVar) throws Throwable {
        bfz bfzVar;
        if (awoqVar instanceof bfz) {
            bfzVar = (bfz) awoqVar;
            int i = bfzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfzVar.c = i - Integer.MIN_VALUE;
            } else {
                bfzVar = new bfz(awoqVar);
            }
        } else {
            bfzVar = new bfz(awoqVar);
        }
        Object objInvoke = bfzVar.b;
        awox awoxVar = awox.a;
        int i2 = bfzVar.c;
        try {
            if (i2 == 0) {
                atqp.j(objInvoke);
                bfzVar.a = file;
                bfzVar.c = 1;
                objInvoke = awqgVar.invoke(bfzVar);
                file = file;
                if (objInvoke == awoxVar) {
                    objInvoke = awoxVar;
                    file = file;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = bfzVar.a;
                atqp.j(objInvoke);
                file = obj;
            }
            return objInvoke;
        } catch (IOException e) {
            if (e instanceof bdu) {
                Objects.toString(file);
                throw new bdu("Corruption in file ".concat(String.valueOf((Object) file)), e);
            }
            file.getClass();
            File file2 = (File) file;
            if (!file2.exists()) {
                throw acq.b(file2, e);
            }
            if (file2.isFile()) {
                if (file2.canRead()) {
                    if (file2.canWrite()) {
                        throw acq.b(file2, e);
                    }
                    throw acq.b(file2, e);
                }
                if (file2.canWrite()) {
                    throw acq.b(file2, e);
                }
                throw acq.b(file2, e);
            }
            if (file2.canRead()) {
                if (file2.canWrite()) {
                    throw acq.b(file2, e);
                }
                throw acq.b(file2, e);
            }
            if (file2.canWrite()) {
                throw acq.b(file2, e);
            }
            throw acq.b(file2, e);
        }
    }

    public static final ayq f(bec becVar, awou awouVar) {
        becVar.getClass();
        awouVar.getClass();
        bfp bfpVar = becVar instanceof bfp ? (bfp) becVar : null;
        if (bfpVar != null) {
            return new ayq(bfpVar, awouVar);
        }
        throw new IllegalStateException("Unexpected DataStore object that does not implement CurrentDataProviderStore");
    }

    public static final ayq g(bec becVar, Executor executor) {
        becVar.getClass();
        executor.getClass();
        return f(becVar, awuw.f(executor));
    }

    public static final void h(dph dphVar, Object[] objArr) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    dphVar.d(i);
                } else if (obj instanceof byte[]) {
                    dphVar.a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    dphVar.b(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    dphVar.b(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    dphVar.c(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    dphVar.c(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    dphVar.c(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    dphVar.c(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    dphVar.e(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    dphVar.c(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                }
            }
        }
    }

    public static final void i(dpt dptVar, String str) {
        dpb dpbVarA = dptVar.a(str);
        try {
            dpbVarA.l();
            dpbVarA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    dpbVarA.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    public static final xio j(Context context, String str, dpe dpeVar, boolean z, boolean z2) {
        if (z && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new xio(context, str, dpeVar, z, z2);
    }
}
