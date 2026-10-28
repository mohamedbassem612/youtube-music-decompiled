package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xrj {
    private final xwv a;
    private agew b;
    private agew d;
    private final xmr f;
    private final Object c = new Object();
    private final Object e = new Object();

    public xrj(xwv xwvVar, xmr xmrVar) {
        this.a = xwvVar;
        this.f = xmrVar;
    }

    public final xrg a(String str) {
        ahno.F(!TextUtils.isEmpty(str));
        zj zjVar = new zj((byte[]) null, (short[]) null);
        synchronized (this.c) {
            agew agewVar = this.b;
            if (agewVar == null || !xsa.b((String) agewVar.a, str)) {
                zjVar.c = this.a.e();
            } else {
                xyv xyvVarE = ((xrg) this.b.b).a;
                if (xyvVarE == null) {
                    boolean z = this.f.l;
                    xyvVarE = this.a.e();
                }
                zjVar.c = xyvVarE;
                zjVar.l(((xrg) this.b.b).b);
                zjVar.a = ((xrg) this.b.b).c;
            }
            this.b = null;
        }
        return zjVar.k();
    }

    public final xri b(String str) {
        xri xriVarA;
        ahno.F(!TextUtils.isEmpty(str));
        synchronized (this.e) {
            agew agewVar = this.d;
            xriVarA = (agewVar == null || !xsa.b((String) agewVar.a, str)) ? xri.a().a() : (xri) this.d.b;
            this.d = null;
        }
        return xriVarA;
    }

    final void c(String str, xrg xrgVar) {
        synchronized (this.c) {
            this.b = new agew(str, xrgVar);
        }
    }

    final void d(String str, xri xriVar) {
        ahno.F(!TextUtils.isEmpty(str));
        synchronized (this.e) {
            this.d = xriVar == null ? null : new agew(str, xriVar);
        }
    }

    final boolean e(String str) {
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.e) {
                agew agewVar = this.d;
                if (agewVar != null && xsa.b((String) agewVar.a, str)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
