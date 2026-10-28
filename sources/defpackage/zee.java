package defpackage;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zee {
    protected final zjr a;
    protected final ywn b;

    public zee(zjr zjrVar, ywn ywnVar) {
        zkf.a(ywnVar != null);
        this.a = zjrVar;
        this.b = ywnVar;
    }

    public static final boolean f(yha yhaVar, zed zedVar, String str, wiu wiuVar, long j) {
        if (!TextUtils.isEmpty(str) && !wiuVar.ab()) {
            String strC = zedVar.c();
            akwm akwmVar = wiuVar.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            int i = akwmVar.y;
            if (i == 0) {
                i = 10;
            }
            if (yhaVar.e(str, strC, j, i, 0, 1)) {
                return true;
            }
        }
        return false;
    }

    public abstract void a(List list, long j, long j2, zed[] zedVarArr, zec zecVar);

    public abstract void b(wiu wiuVar);

    public void c(float f) {
    }

    public void d(yog yogVar) {
    }

    public void e(zkj zkjVar) {
    }
}
