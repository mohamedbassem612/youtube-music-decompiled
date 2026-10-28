package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeud {
    private final aha a = new aha(0);
    private final aha b = new aha(0);

    public static aeud b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static aeud c(Context context, int i) {
        aeud aeudVarH = null;
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                aeudVarH = h(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            } else if (animatorLoadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(animatorLoadAnimator);
                aeudVarH = h(arrayList);
            }
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(i))), e);
        }
        return aeudVarH;
    }

    private static aeud h(List list) {
        aeud aeudVar = new aeud();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            aeudVar.e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            aeue aeueVar = new aeue(objectAnimator.getStartDelay(), objectAnimator.getDuration(), objectAnimator.getInterpolator());
            aeueVar.a = objectAnimator.getRepeatCount();
            aeueVar.b = objectAnimator.getRepeatMode();
            aeudVar.a.put(propertyName, aeueVar);
        }
        return aeudVar;
    }

    public final ObjectAnimator a(String str, Object obj, Property property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, g(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        d(str).b(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final aeue d(String str) {
        aha ahaVar = this.a;
        if (ahaVar.get(str) != null) {
            return (aeue) ahaVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final void e(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aeud) {
            return this.a.equals(((aeud) obj).a);
        }
        return false;
    }

    public final boolean f(String str) {
        return this.b.get(str) != null;
    }

    public final PropertyValuesHolder[] g(String str) {
        if (!f(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
