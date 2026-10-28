package defpackage;

import android.os.Bundle;
import android.view.View;
import java.security.GeneralSecurityException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahhp {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public ahhp(adof adofVar, Object obj) {
        this.b = obj;
        this.a = adofVar;
    }

    public final Object a(ahfx ahfxVar) throws GeneralSecurityException {
        ahfv ahfvVar = ahfxVar.a;
        Class<?> cls = ahfvVar.getClass();
        Class cls2 = (Class) ((ahtv) this.b).b;
        awgg awggVar = (awgg) ((ahhq) this.a).a.get(new ahhw(cls, cls2));
        if (awggVar != null) {
            return awggVar.b(ahfvVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor registered for key class " + ahfvVar.getClass().getName() + " and primitive " + cls2.getName());
    }

    public final void b(String str, String str2, boolean z) {
        ((acfg) this.a).B.s(str, str2, z, (String) this.b);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final View c() {
        zoz zozVar;
        zpt zptVar = (zpt) this.b;
        int iE = zptVar.e();
        Object obj = this.a;
        if (iE != 2) {
            zpb zpbVar = (zpb) obj;
            if (zpbVar.h && zpbVar.i()) {
                zozVar = ((zpb) obj).d;
                if (zozVar.getParent() != null) {
                    return (View) zozVar.getParent().getParent();
                }
            }
        } else {
            zozVar = ((zpb) obj).d;
            if (zozVar.getParent() != null) {
                return (View) zozVar.getParent().getParent();
            }
        }
        if (zptVar.e() != 3) {
            return null;
        }
        return (View) ((zpb) obj).d.getParent();
    }

    public final void d(String str) {
        agkj agkjVar = xom.a;
        ((Bundle) this.a).putString("mdx_cast_log_crash_id", str);
        ((CountDownLatch) this.b).countDown();
    }

    public final void e() {
        vsk vskVar = (vsk) this.a;
        dd supportFragmentManager = vskVar.b.getSupportFragmentManager();
        if (vskVar.a(supportFragmentManager)) {
            Object obj = this.b;
            av avVar = new av(supportFragmentManager);
            avVar.l((cc) obj);
            avVar.e();
        }
    }

    public /* synthetic */ ahhp(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
