package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpe implements bpl {
    public final dow a;
    public final bpp b;
    public final Bundle c;
    private final Application d;
    private final bpl e;

    public bpe(Application application, dow dowVar, Bundle bundle) {
        bpk bpkVar;
        dowVar.getClass();
        if (!(dowVar instanceof bpp)) {
            throw new IllegalArgumentException("SavedStateRegistryOwner must implement ViewModelStoreOwner to support SavedStateHandles");
        }
        this.a = dowVar;
        this.b = (bpp) dowVar;
        this.c = bundle;
        this.d = application;
        if (application != null) {
            if (bpk.a == null) {
                bpk.a = new bpk(application);
            }
            bpkVar = bpk.a;
            bpkVar.getClass();
        } else {
            bpkVar = new bpk(null);
        }
        this.e = bpkVar;
    }

    @Override // defpackage.bpl
    public final bpi a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.bpl
    public final bpi b(Class cls, bpt bptVar) {
        Object objA = bptVar.a(bpn.a);
        if (objA == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        String str = (String) objA;
        if (bptVar.a(bpd.a) == null || bptVar.a(bpd.b) == null) {
            return d(str, cls);
        }
        Application application = (Application) bptVar.a(bpk.b);
        boolean zIsAssignableFrom = bnq.class.isAssignableFrom(cls);
        Constructor constructorB = (!zIsAssignableFrom || application == null) ? bpf.b(cls, bpf.b) : bpf.b(cls, bpf.a);
        if (constructorB == null) {
            return this.e.b(cls, bptVar);
        }
        boy boyVarA = bpd.a(bptVar);
        return (!zIsAssignableFrom || application == null) ? bpf.a(cls, constructorB, boyVarA) : bpf.a(cls, constructorB, application, boyVarA);
    }

    @Override // defpackage.bpl
    public final bpi c(awsd awsdVar, bpt bptVar) {
        return b(((awqv) awsdVar).b, bptVar);
    }

    public final bpi d(String str, Class cls) {
        Application application = this.d;
        boolean zIsAssignableFrom = bnq.class.isAssignableFrom(cls);
        boolean z = application != null;
        Constructor constructorB = (zIsAssignableFrom && z) ? bpf.b(cls, bpf.a) : bpf.b(cls, bpf.b);
        if (constructorB == null) {
            if (z) {
                return this.e.a(cls);
            }
            if (bpm.c == null) {
                bpm.c = new bpm();
            }
            bpm.c.getClass();
            return amw.e(cls);
        }
        dow dowVar = this.a;
        bpp bppVar = this.b;
        bou.b(dowVar, bppVar);
        alh.c(dowVar);
        bpt bptVarF = bnz.f(bppVar);
        apm apmVar = new apm(this, str, 3, null);
        bptVarF.getClass();
        bpv bpvVar = new bpv(bptVarF);
        apmVar.invoke(bpvVar);
        boy boyVarA = bpd.a(bpvVar);
        return (zIsAssignableFrom && z) ? bpf.a(cls, constructorB, application, boyVarA) : bpf.a(cls, constructorB, boyVarA);
    }
}
