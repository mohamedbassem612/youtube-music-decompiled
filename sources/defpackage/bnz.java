package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bnz {
    public bnz(byte[] bArr) {
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
    }

    public static boa a(bob bobVar) {
        bobVar.getClass();
        int iOrdinal = bobVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            return boa.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return boa.ON_STOP;
        }
        if (iOrdinal == 4) {
            return boa.ON_PAUSE;
        }
        throw new awmj();
    }

    public static boa b(bob bobVar) {
        bobVar.getClass();
        int iOrdinal = bobVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return boa.ON_CREATE;
            }
            if (iOrdinal == 2) {
                return boa.ON_START;
            }
            if (iOrdinal == 3) {
                return boa.ON_RESUME;
            }
            if (iOrdinal != 4) {
                throw new awmj();
            }
        }
        return null;
    }

    public static boa c(bob bobVar) {
        int iOrdinal = bobVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            return boa.ON_CREATE;
        }
        if (iOrdinal == 3) {
            return boa.ON_START;
        }
        if (iOrdinal == 4) {
            return boa.ON_RESUME;
        }
        throw new awmj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Activity activity, boa boaVar) {
        boaVar.getClass();
        if (activity instanceof boi) {
            ((boi) activity).a().e(boaVar);
        } else if (activity instanceof bog) {
            boc lifecycle = ((bog) activity).getLifecycle();
            if (lifecycle instanceof boh) {
                ((boh) lifecycle).e(boaVar);
            }
        }
    }

    public static void e(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new bov());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new bow(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static bpt f(bpp bppVar) {
        return bppVar instanceof bny ? ((bny) bppVar).getDefaultViewModelCreationExtras() : bpr.a;
    }

    public static bpi g(bpl bplVar, awsd awsdVar, bpt bptVar) {
        return bplVar.b(((awqv) awsdVar).b, bptVar);
    }

    public static bpi h() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static dzt i(Context context) {
        context.getClass();
        return ebm.j(context);
    }

    public bnz(byte[] bArr, byte[] bArr2) {
    }
}
