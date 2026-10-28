package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eav extends awpk implements awqk {
    /* synthetic */ boolean a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eav(Context context, awoq awoqVar) {
        super(2, awoqVar);
        this.b = context;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        eav eavVar = new eav(this.b, awoqVar);
        eavVar.a = ((Boolean) obj).booleanValue();
        return eavVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((eav) create(bool, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.a;
        atqp.j(obj);
        String str = efr.a;
        Context context = this.b;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        efr.a(packageManager, new ComponentName(context, (Class<?>) RescheduleReceiver.class), z, efp.a);
        return awmy.a;
    }
}
