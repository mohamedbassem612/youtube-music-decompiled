package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afkh {
    private static final AtomicInteger c = new AtomicInteger(123051698);
    public final afv a = new afv();
    public final afv b = new afv();
    private final String d;

    public afkh(String str) {
        this.d = str;
    }

    public final int a(Object obj) {
        qpj.c();
        Integer num = (Integer) this.b.get(obj.getClass());
        ahno.R(num != null, "The callback %s has not been registered", obj.getClass());
        ahno.R(b(num.intValue()) == obj, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", obj.getClass());
        return num.intValue();
    }

    public final Object b(int i) {
        qpj.c();
        Object obj = this.a.get(Integer.valueOf(i));
        if (obj == null) {
            for (Map.Entry entry : this.b.entrySet()) {
                if (((Integer) entry.getValue()).intValue() == i) {
                    throw new NullPointerException("Callback not re-registered for: ".concat(String.valueOf(((Class) entry.getKey()).getName())));
                }
            }
        }
        obj.getClass();
        return obj;
    }

    public final void c(Object obj) {
        qpj.c();
        afv afvVar = this.b;
        Class<?> cls = obj.getClass();
        if (afvVar.containsKey(cls)) {
            Integer num = (Integer) afvVar.get(cls);
            num.intValue();
            ahno.R(this.a.put(num, obj) == null, "Attempted to register the callback class %s twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices. This check can also trigger if new callback classes are registered after process death and recreation from save instance state. This most often happens when experiment flags change. See b/224812898.", cls);
        } else {
            Integer numValueOf = Integer.valueOf(c.getAndIncrement());
            afvVar.put(cls, numValueOf);
            this.a.put(numValueOf, obj);
        }
    }

    public final void d(Bundle bundle) {
        qpj.c();
        if (bundle != null) {
            String str = this.d;
            String strConcat = "CallbackIdMap.classes".concat(str);
            ahno.P(bundle.containsKey(strConcat), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            String[] stringArray = bundle.getStringArray(strConcat);
            int[] intArray = bundle.getIntArray("CallbackIdMap.class_ids".concat(str));
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    Integer num = (Integer) this.b.put(Class.forName(stringArray[i]), Integer.valueOf(intArray[i]));
                    if (num != null) {
                        int iIntValue = num.intValue();
                        int i2 = intArray[i];
                        ahno.V(iIntValue == i2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i], Integer.valueOf(i2), num);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final void e(Bundle bundle) {
        qpj.c();
        String str = this.d;
        String strConcat = "CallbackIdMap.classes".concat(str);
        ahno.R(!bundle.containsKey(strConcat), "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", strConcat);
        afv afvVar = this.b;
        int i = afvVar.d;
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (Map.Entry entry : afvVar.entrySet()) {
            strArr[i2] = ((Class) entry.getKey()).getName();
            iArr[i2] = ((Integer) entry.getValue()).intValue();
            i2++;
        }
        bundle.putStringArray(strConcat, strArr);
        bundle.putIntArray("CallbackIdMap.class_ids".concat(str), iArr);
    }
}
