package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dop implements boe {
    private final dow a;

    public dop(dow dowVar) {
        this.a = dowVar;
    }

    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        if (boaVar != boa.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        bogVar.getLifecycle().c(this);
        dow dowVar = this.a;
        Bundle bundleA = dowVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA != null) {
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
            if (stringArrayList == null) {
                throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            for (String str : stringArrayList) {
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, dop.class.getClassLoader()).asSubclass(dor.class);
                    clsAsSubclass.getClass();
                    try {
                        Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        try {
                            Object objNewInstance = declaredConstructor.newInstance(null);
                            objNewInstance.getClass();
                            ((dor) objNewInstance).a(dowVar);
                        } catch (Exception e) {
                            throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(str)), e);
                        }
                    } catch (NoSuchMethodException e2) {
                        throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                    }
                } catch (ClassNotFoundException e3) {
                    throw new RuntimeException(a.bT(str, "Class ", " wasn't found"), e3);
                }
            }
        }
    }
}
