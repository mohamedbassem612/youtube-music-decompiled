package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvw extends kqs {
    public final Context a;

    public kvw(Context context, Looper looper, kna knaVar, knb knbVar, kqd kqdVar) {
        super(context, looper, 29, kqdVar, knaVar, knbVar);
        this.a = context;
        ltg.a = context.getContentResolver();
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return iInterfaceQueryLocalInterface instanceof kvy ? (kvy) iInterfaceQueryLocalInterface : new kvy(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return kvh.b;
    }
}
