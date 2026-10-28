package defpackage;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class dsx extends dsa {
    private static final String[] x = {"android:visibility:visibility", "android:visibility:parent"};
    public int w = 3;

    public static final void O(dsk dskVar) {
        Integer numValueOf = Integer.valueOf(dskVar.b.getVisibility());
        Map map = dskVar.a;
        map.put("android:visibility:visibility", numValueOf);
        map.put("android:visibility:parent", dskVar.b.getParent());
        int[] iArr = new int[2];
        dskVar.b.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r0.e == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r9 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r0.c == 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.dsw P(defpackage.dsk r8, defpackage.dsk r9) {
        /*
            dsw r0 = new dsw
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.Map r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r4
            r0.e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.Map r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r4
            r0.f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L75
            if (r9 == 0) goto L7e
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L70
            android.view.ViewGroup r8 = r0.e
            android.view.ViewGroup r9 = r0.f
            if (r8 == r9) goto L87
            android.view.ViewGroup r8 = r0.f
            if (r8 == 0) goto L84
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L87
            goto L79
        L70:
            if (r8 == 0) goto L84
            if (r9 != 0) goto L87
            goto L79
        L75:
            int r8 = r0.d
            if (r8 != 0) goto L7e
        L79:
            r0.b = r2
        L7b:
            r0.a = r2
            goto L87
        L7e:
            if (r9 != 0) goto L87
            int r8 = r0.c
            if (r8 != 0) goto L87
        L84:
            r0.b = r1
            goto L7b
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsx.P(dsk, dsk):dsw");
    }

    @Override // defpackage.dsa
    public final boolean B(dsk dskVar, dsk dskVar2) {
        if (dskVar == null) {
            if (dskVar2 == null) {
                return false;
            }
        } else if (dskVar2 != null) {
            if (dskVar2.a.containsKey("android:visibility:visibility") != dskVar.a.containsKey("android:visibility:visibility")) {
                return false;
            }
        }
        dsw dswVarP = P(dskVar, dskVar2);
        if (dswVarP.a) {
            return dswVarP.c == 0 || dswVarP.d == 0;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ec  */
    @Override // defpackage.dsa
    public final Animator a(ViewGroup viewGroup, dsk dskVar, dsk dskVar2) {
        boolean z;
        int i;
        char c;
        int i2;
        int i3;
        ViewGroup viewGroup2;
        Bitmap bitmapCreateBitmap;
        dsk dskVar3 = dskVar;
        dsw dswVarP = P(dskVar, dskVar2);
        if (dswVarP.a && (dswVarP.e != null || dswVarP.f != null)) {
            int i4 = 1;
            if (!dswVarP.b) {
                int i5 = dswVarP.d;
                if ((this.w & 2) == 2 && dskVar3 != null) {
                    View view = dskVar3.b;
                    View view2 = dskVar2 != null ? dskVar2.b : null;
                    View view3 = (View) view.getTag(R.id.save_overlay_view);
                    if (view3 != null) {
                        i = i5;
                        c = 1;
                        i2 = 0;
                        view2 = null;
                    } else {
                        if (view2 == null) {
                            z = true;
                            view2 = null;
                            view3 = null;
                        } else if (view2.getParent() == null) {
                            z = false;
                            view3 = view2;
                            view2 = null;
                        } else {
                            if (i5 == 4 || view == view2) {
                                z = false;
                            } else {
                                z = true;
                                view2 = null;
                            }
                            view3 = null;
                        }
                        if (!z) {
                            i = i5;
                            c = 1;
                            i2 = 0;
                            i4 = 0;
                        } else if (view.getParent() == null) {
                            i = i5;
                            view3 = view;
                            c = 1;
                            i4 = 0;
                            i2 = 0;
                        } else if (view.getParent() instanceof View) {
                            View view4 = (View) view.getParent();
                            if (P(l(view4, true), k(view4, true)).a) {
                                i = i5;
                                c = 1;
                                i2 = 0;
                                view2 = view2;
                                int id = view4.getId();
                                if (view4.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            } else {
                                Matrix matrix = new Matrix();
                                matrix.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                dsp dspVar = dso.a;
                                dspVar.e(view, matrix);
                                dspVar.f(viewGroup, matrix);
                                RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
                                matrix.mapRect(rectF);
                                int iRound = Math.round(rectF.left);
                                int iRound2 = Math.round(rectF.top);
                                int iRound3 = Math.round(rectF.right);
                                c = 1;
                                int iRound4 = Math.round(rectF.bottom);
                                i2 = 0;
                                ImageView imageView = new ImageView(view.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                boolean zIsAttachedToWindow = view.isAttachedToWindow();
                                boolean zIsAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                if (zIsAttachedToWindow) {
                                    i3 = 0;
                                    viewGroup2 = null;
                                } else {
                                    if (zIsAttachedToWindow2) {
                                        viewGroup2 = (ViewGroup) view.getParent();
                                        int iIndexOfChild = viewGroup2.indexOfChild(view);
                                        bac.h(viewGroup, view);
                                        i3 = iIndexOfChild;
                                    } else {
                                        i = i5;
                                        view2 = view2;
                                        bitmapCreateBitmap = null;
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                    imageView.layout(iRound, iRound2, iRound3, iRound4);
                                    view3 = imageView;
                                }
                                int iRound5 = Math.round(rectF.width());
                                i = i5;
                                int iRound6 = Math.round(rectF.height());
                                if (iRound5 <= 0 || iRound6 <= 0) {
                                    bitmapCreateBitmap = null;
                                } else {
                                    float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                    int iRound7 = Math.round(iRound5 * fMin);
                                    int iRound8 = Math.round(iRound6 * fMin);
                                    matrix.postTranslate(-rectF.left, -rectF.top);
                                    matrix.postScale(fMin, fMin);
                                    if (dsj.a) {
                                        Picture picture = new Picture();
                                        Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                        canvasBeginRecording.concat(matrix);
                                        view.draw(canvasBeginRecording);
                                        picture.endRecording();
                                        bitmapCreateBitmap = Bitmap.createBitmap(picture);
                                    } else {
                                        bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                                        canvas.concat(matrix);
                                        view.draw(canvas);
                                    }
                                }
                                if (!zIsAttachedToWindow) {
                                    viewGroup.getOverlay().remove(view);
                                    viewGroup2.addView(view, i3);
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view3 = imageView;
                            }
                            i4 = i2;
                            view2 = view2;
                        } else {
                            i = i5;
                            c = 1;
                            i2 = 0;
                            i4 = 0;
                        }
                    }
                    if (view3 != null) {
                        if (i4 == 0) {
                            int[] iArr = (int[]) dskVar3.a.get("android:visibility:screenLocation");
                            int i6 = iArr[i2];
                            int i7 = iArr[c];
                            int[] iArr2 = new int[2];
                            viewGroup.getLocationOnScreen(iArr2);
                            view3.offsetLeftAndRight((i6 - iArr2[i2]) - view3.getLeft());
                            view3.offsetTopAndBottom((i7 - iArr2[c]) - view3.getTop());
                            bac.h(viewGroup, view3);
                        }
                        Animator animatorG = g(view3, dskVar3, dskVar2);
                        if (i4 != 0) {
                            return animatorG;
                        }
                        if (animatorG == null) {
                            viewGroup.getOverlay().remove(view3);
                            return animatorG;
                        }
                        view.setTag(R.id.save_overlay_view, view3);
                        dsv dsvVar = new dsv(this, viewGroup, view3, view);
                        animatorG.addListener(dsvVar);
                        animatorG.addPauseListener(dsvVar);
                        j().D(dsvVar);
                        return animatorG;
                    }
                    if (view2 != null) {
                        int visibility = view2.getVisibility();
                        dso.d(view2, i2);
                        Animator animatorG2 = g(view2, dskVar3, dskVar2);
                        if (animatorG2 == null) {
                            dso.d(view2, visibility);
                            return animatorG2;
                        }
                        dsu dsuVar = new dsu(view2, i);
                        animatorG2.addListener(dsuVar);
                        j().D(dsuVar);
                        return animatorG2;
                    }
                }
            } else if ((this.w & 1) == 1 && dskVar2 != null) {
                if (dskVar3 == null) {
                    View view5 = (View) dskVar2.b.getParent();
                    if (!P(k(view5, false), l(view5, false)).a) {
                        dskVar3 = null;
                    }
                }
                return f(dskVar2.b, dskVar3);
            }
        }
        return null;
    }

    @Override // defpackage.dsa
    public final void b(dsk dskVar) {
        O(dskVar);
    }

    @Override // defpackage.dsa
    public void c(dsk dskVar) {
        throw null;
    }

    @Override // defpackage.dsa
    public final String[] e() {
        return x;
    }

    public Animator f(View view, dsk dskVar) {
        throw null;
    }

    public Animator g(View view, dsk dskVar, dsk dskVar2) {
        throw null;
    }
}
