package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aie {
    public static final void a(String str) {
        throw new IllegalArgumentException("no pending nested snapshots");
    }

    public static final Object b(awqg awqgVar, awoq awoqVar) {
        ahy ahyVar = (ahy) awoqVar.getContext().get(ahy.a);
        if (ahyVar != null) {
            return ahyVar.a(awqgVar, awoqVar);
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final ais c(axat axatVar, ahk ahkVar) {
        aia aiaVar;
        awov awovVar = awov.a;
        aii aiiVar = aii.c;
        Object objC = ahkVar.c();
        Object obj = ahj.a;
        if (objC == obj) {
            aid aidVar = new aid(axatVar.c(), aiiVar);
            ahkVar.D();
            objC = aidVar;
        }
        aia aiaVar2 = (aia) objC;
        boolean zV = ahkVar.v() | ahkVar.v();
        Object objC2 = ahkVar.c();
        if (zV || objC2 == obj) {
            aiaVar = aiaVar2;
            beh behVar = new beh(awovVar, axatVar, aiaVar, (awoq) null, 1);
            ahkVar.D();
            objC2 = behVar;
        } else {
            aiaVar = aiaVar2;
        }
        ahs.f(ahkVar);
        return aiaVar;
    }

    public static final ais d(Object obj, awqk awqkVar, ahk ahkVar) {
        Object objC = ahkVar.c();
        Object obj2 = ahj.a;
        if (objC == obj2) {
            aid aidVar = new aid(obj, aii.c);
            ahkVar.D();
            objC = aidVar;
        }
        aia aiaVar = (aia) objC;
        boolean zV = ahkVar.v();
        Object objC2 = ahkVar.c();
        if (zV || objC2 == obj2) {
            objC2 = new dyz(awqkVar, aiaVar, (awoq) null, 1);
            ahkVar.D();
        }
        awou awouVarD = ahkVar.d();
        boolean zT = ahkVar.t();
        Object objC3 = ahkVar.c();
        if (zT || objC3 == obj2) {
            objC3 = new ahv(awouVarD);
            ahkVar.D();
        }
        return aiaVar;
    }

    public static int e(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static void f(Object obj) {
        obj.getClass();
    }

    public static final axg g(boolean z, axh axhVar) {
        if (axhVar == axg.a) {
            return z ? axg.c : axg.b;
        }
        return new axg(z, axhVar);
    }

    public static final Bundle h(awml... awmlVarArr) {
        awmlVarArr.getClass();
        Bundle bundle = new Bundle(awmlVarArr.length);
        for (awml awmlVar : awmlVarArr) {
            String str = (String) awmlVar.a;
            Object obj = awmlVar.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static Object i(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return bundle.getParcelable(str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList j(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? bundle.getParcelableArrayList(str, cls) : bundle.getParcelableArrayList(str);
    }

    public static Parcelable[] k(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) bundle.getParcelableArray(str, cls) : bundle.getParcelableArray(str);
    }
}
