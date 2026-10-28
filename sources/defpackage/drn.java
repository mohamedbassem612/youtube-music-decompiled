package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class drn extends dsa {
    private static final String[] w = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property x = new drf(PointF.class);
    private static final Property y = new drg(PointF.class);
    private static final Property z = new drh(PointF.class);
    private static final Property A = new dri(PointF.class);
    private static final Property B = new drj(PointF.class);

    private static final void f(dsk dskVar) {
        View view = dskVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        Map map = dskVar.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", dskVar.b.getParent());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:15:0x0066 A[PHI: r13
      0x0066: PHI (r13v3 int) = (r13v1 int), (r13v0 int) binds: [B:13:0x005f, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dsa
    public final Animator a(ViewGroup viewGroup, dsk dskVar, dsk dskVar2) {
        int i;
        ObjectAnimator objectAnimatorOfObject;
        Animator animator;
        if (dskVar != null && dskVar2 != null) {
            Map map = dskVar.a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            Map map2 = dskVar2.a;
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                View view = dskVar2.b;
                Rect rect = (Rect) map.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                int i2 = rect.left;
                int i3 = rect2.left;
                int i4 = rect.top;
                int i5 = rect2.top;
                int i6 = rect.right;
                int i7 = rect2.right;
                int i8 = rect.bottom;
                int i9 = rect2.bottom;
                int i10 = i6 - i2;
                int i11 = i8 - i4;
                int i12 = i7 - i3;
                int i13 = i9 - i5;
                Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                if (i10 == 0) {
                    if (i12 != 0) {
                        i = 0;
                    } else if (i13 == 0) {
                        i13 = 0;
                        i = 0;
                    } else {
                        if (i2 == i3 || i4 != i5) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (i6 == i7 || i8 != i9) {
                            i++;
                        }
                    }
                } else if (i11 == 0) {
                    i11 = 0;
                    if (i12 != 0) {
                        i = 0;
                    } else if (i13 == 0) {
                        i13 = 0;
                        i = 0;
                    } else {
                        if (i2 == i3) {
                            i = 1;
                        } else {
                            i = 1;
                        }
                        if (i6 == i7) {
                            i++;
                        } else {
                            i++;
                        }
                    }
                } else {
                    if (i2 == i3) {
                        i = 1;
                    } else {
                        i = 1;
                    }
                    if (i6 == i7) {
                        i++;
                    } else {
                        i++;
                    }
                }
                if (rect3 == null ? rect4 != null : !rect3.equals(rect4)) {
                    i++;
                }
                int i14 = i;
                if (i14 > 0) {
                    dso.b(view, i2, i4, i6, i8);
                    if (i14 == 2) {
                        float f = i5;
                        float f2 = i3;
                        float f3 = i4;
                        float f4 = i2;
                        if (i10 == i12 && i11 == i13) {
                            objectAnimatorOfObject = ObjectAnimator.ofObject(view, (Property<View, V>) B, (TypeConverter) null, wg.c(f4, f3, f2, f));
                        } else {
                            float f5 = i7;
                            drm drmVar = new drm(view);
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(drmVar, (Property<drm, V>) x, (TypeConverter) null, wg.c(f4, f3, f2, f));
                            ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(drmVar, (Property<drm, V>) y, (TypeConverter) null, wg.c(i6, i8, f5, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
                            animatorSet.addListener(new drk(drmVar));
                            animator = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            return animator;
                        }
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        dsl.a(viewGroup4, true);
                        j().D(new drl(viewGroup4));
                        return animator;
                    }
                    if (i2 == i3 && i4 == i5) {
                        objectAnimatorOfObject = ObjectAnimator.ofObject(view, (Property<View, V>) z, (TypeConverter) null, wg.c(i6, i8, i7, i9));
                    } else {
                        objectAnimatorOfObject = ObjectAnimator.ofObject(view, (Property<View, V>) A, (TypeConverter) null, wg.c(i2, i4, i3, i5));
                    }
                    animator = objectAnimatorOfObject;
                    if (view.getParent() instanceof ViewGroup) {
                        return animator;
                    }
                    ViewGroup viewGroup5 = (ViewGroup) view.getParent();
                    dsl.a(viewGroup5, true);
                    j().D(new drl(viewGroup5));
                    return animator;
                }
            }
        }
        return null;
    }

    @Override // defpackage.dsa
    public final void b(dsk dskVar) {
        f(dskVar);
    }

    @Override // defpackage.dsa
    public final void c(dsk dskVar) {
        f(dskVar);
    }

    @Override // defpackage.dsa
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dsa
    public final String[] e() {
        return w;
    }
}
