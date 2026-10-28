package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzb extends kqs {
    private final aha a;
    private final aha b;
    private final aha c;

    public kzb(Context context, Looper looper, kqd kqdVar, kof kofVar, kpb kpbVar) {
        super(context, looper, 23, kqdVar, kofVar, kpbVar);
        this.a = new aha(0);
        this.b = new aha(0);
        this.c = new aha(0);
        new aha(0);
    }

    @Override // defpackage.kpz
    public final void Q() {
        System.currentTimeMillis();
        aha ahaVar = this.a;
        synchronized (ahaVar) {
            ahaVar.clear();
        }
        aha ahaVar2 = this.b;
        synchronized (ahaVar2) {
            ahaVar2.clear();
        }
        aha ahaVar3 = this.c;
        synchronized (ahaVar3) {
            ahaVar3.clear();
        }
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 11717000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof kyy ? (kyy) iInterfaceQueryLocalInterface : new kyy(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return kyu.q;
    }

    public final boolean k(klq klqVar) {
        klq klqVar2;
        klq[] klqVarArrY = y();
        if (klqVarArrY == null) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= klqVarArrY.length) {
                klqVar2 = null;
                break;
            }
            klqVar2 = klqVarArrY[i];
            if (klqVar.a.equals(klqVar2.a)) {
                break;
            }
            i++;
        }
        return klqVar2 != null && klqVar2.a() >= klqVar.a();
    }
}
