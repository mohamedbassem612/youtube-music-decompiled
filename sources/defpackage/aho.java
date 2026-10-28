package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aho implements Function0 {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aho(int i) {
        this.$cid = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        WindowLayoutComponent windowLayoutComponentL;
        Object dxlVar;
        try {
            switch (this.$cid) {
                case 0:
                    ahl.a("Unexpected call to default provider");
                    throw new awmh();
                case 1:
                    return Integer.valueOf(awrw.a.c() + 65536);
                case 2:
                    ahl.a("Unexpected call to default provider");
                    throw new awmh();
                case 3:
                    int i = ajt.a;
                    return null;
                case 4:
                case 5:
                    return awmy.a;
                case 6:
                    int i2 = dnl.h;
                    return Boolean.TRUE;
                case 7:
                    String[] strArr = dpl.a;
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    dxlVar = declaredMethod;
                    break;
                case 8:
                    String[] strArr2 = dpl.a;
                    Method methodI = azv.i();
                    if (methodI == null || (returnType = methodI.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                case 9:
                    int i3 = dwt.b;
                    ClassLoader classLoader = dwu.class.getClassLoader();
                    ayq ayqVar = classLoader != null ? new ayq(classLoader, new dwg(classLoader)) : null;
                    if (ayqVar == null || (windowLayoutComponentL = ayqVar.l()) == null) {
                        return null;
                    }
                    dwg dwgVar = new dwg(classLoader);
                    int i4 = dwh.a;
                    int iA = dwh.a();
                    if (iA >= 9 || iA >= 6 || iA >= 2) {
                        dxlVar = new dxn(windowLayoutComponentL, dwgVar);
                    } else if (iA != 1) {
                        dxlVar = new dxl();
                    } else {
                        dxlVar = new dxm(windowLayoutComponentL, dwgVar);
                    }
                    break;
                case 10:
                    avlb avlbVar = avpy.a;
                    avnn avnnVar = atqp.p;
                    return avlbVar;
                default:
                    dxlVar = new yno((byte[]) null);
                    break;
            }
            return dxlVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
