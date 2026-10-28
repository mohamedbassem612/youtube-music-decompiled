package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import java.util.IdentityHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afjg implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ afjg(afji afjiVar, Intent intent, int i, int i2) {
        this.$cid = i2;
        this.b = afjiVar;
        this.c = intent;
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$cid;
        Object obj = this.b;
        if (i != 0) {
            String str = ((amzq) obj).b;
            str.getClass();
            ((hef) this.c).d(this.a, str);
            return awmy.a;
        }
        afju afjuVarM = ((afji) obj).a().M(obj.getClass());
        Object obj2 = afjuVarM.b;
        int i2 = this.a;
        Object obj3 = this.c;
        synchronized (obj2) {
            try {
                if (obj3 != null) {
                    afjuVarM.g = (Service) obj;
                    afjuVarM.h = i2;
                    afjuVarM.f = afjt.c;
                    IdentityHashMap identityHashMap = afjuVarM.c;
                    if (identityHashMap.isEmpty()) {
                        afjuVarM.a((Service) obj, (Notification) ((Intent) obj3).getParcelableExtra("fallback_notification"));
                        afjuVarM.b();
                    } else {
                        afjr afjrVar = afjuVarM.i;
                        ahno.P(!identityHashMap.isEmpty(), "Can't select a best notification if thare are none");
                        afjr afjrVar2 = null;
                        for (afjr afjrVar3 : identityHashMap.values()) {
                            if (afjrVar2 != null) {
                                int i3 = afjrVar3.b;
                                if (afjrVar == afjrVar3) {
                                    int i4 = afjrVar.b;
                                }
                            }
                            afjrVar2 = afjrVar3;
                        }
                        afjuVarM.i = afjrVar2;
                        Notification notification = afjuVarM.i.a;
                        afjuVarM.a((Service) obj, null);
                    }
                } else if (afjuVarM.f == afjt.a) {
                    ((Service) obj).stopSelf(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return awmy.a;
    }

    public /* synthetic */ afjg(hef hefVar, int i, amzq amzqVar, int i2) {
        this.$cid = i2;
        this.c = hefVar;
        this.a = i;
        this.b = amzqVar;
    }
}
