package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ktz extends kqs {
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public ktz(Context context, Looper looper, kof kofVar, kpb kpbVar) {
        xws xwsVar = new xws(context);
        lod lodVar = lod.a;
        ?? r3 = xwsVar.a;
        khn khnVar = loc.a;
        super(context, looper, 25, new kqd(null, xwsVar.c, xwsVar.d, (String) xwsVar.e, (String) xwsVar.b, r3.containsKey(khnVar) ? (lod) xwsVar.a.get(khnVar) : lodVar), kofVar, kpbVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12800000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        return iInterfaceQueryLocalInterface instanceof ktk ? (ktk) iInterfaceQueryLocalInterface : new ktk(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.droidguard.service.START";
    }
}
