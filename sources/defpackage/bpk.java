package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpk extends bpm {
    public static bpk a;
    public static final bps b = new bpc(3);
    private final Application e;

    public bpk(Application application) {
        this.e = application;
    }

    private static final bpi d(Class cls, Application application) {
        if (!bnq.class.isAssignableFrom(cls)) {
            return amw.e(cls);
        }
        try {
            bpi bpiVar = (bpi) cls.getConstructor(Application.class).newInstance(application);
            bpiVar.getClass();
            return bpiVar;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        } catch (InvocationTargetException e4) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
        }
    }

    @Override // defpackage.bpm, defpackage.bpl
    public final bpi a(Class cls) {
        Application application = this.e;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.bpm, defpackage.bpl
    public final bpi b(Class cls, bpt bptVar) {
        if (this.e != null) {
            return a(cls);
        }
        Application application = (Application) bptVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (bnq.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return amw.e(cls);
    }
}
