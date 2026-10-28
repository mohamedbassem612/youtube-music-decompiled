package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmy {
    public static final /* synthetic */ int a = 0;
    private static final bmx b = bmx.a;

    public static final void a(cc ccVar, String str) {
        ccVar.getClass();
        bmv bmvVar = new bmv(ccVar, str);
        d(bmvVar);
        bmx bmxVarB = b(ccVar);
        if (bmxVarB.b.contains(bmw.c) && e(bmxVarB, ccVar.getClass(), bmvVar.getClass())) {
            c(bmxVarB, bmvVar);
        }
    }

    public static final bmx b(cc ccVar) {
        while (ccVar != null) {
            if (ccVar.isAdded()) {
                ccVar.getParentFragmentManager();
            }
            ccVar = ccVar.getParentFragment();
        }
        return b;
    }

    public static final void c(bmx bmxVar, bni bniVar) {
        cc ccVar = bniVar.a;
        String name = ccVar.getClass().getName();
        Set set = bmxVar.b;
        set.contains(bmw.a);
        if (set.contains(bmw.b)) {
            blq blqVar = new blq((Object) name, (Object) bniVar, 2, (byte[]) null);
            if (!ccVar.isAdded()) {
                blqVar.run();
                return;
            }
            Handler handler = ccVar.getParentFragmentManager().p.d;
            if (awrc.c(handler.getLooper(), Looper.myLooper())) {
                blqVar.run();
            } else {
                handler.post(blqVar);
            }
        }
    }

    public static final void d(bni bniVar) {
        if (dd.aa(3)) {
            bniVar.a.getClass().getName();
        }
    }

    public static final boolean e(bmx bmxVar, Class cls, Class cls2) {
        Set set = (Set) bmxVar.c.get(cls.getName());
        if (set != null) {
            return (awrc.c(cls2.getSuperclass(), bni.class) || !atqq.ay(set, cls2.getSuperclass())) && !set.contains(cls2);
        }
        return true;
    }
}
