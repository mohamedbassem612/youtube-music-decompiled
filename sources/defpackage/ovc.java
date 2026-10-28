package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ovc extends Drawable {
    public final ove a;
    public ovh b;
    public boolean c = false;
    private final ViewGroup d;
    private final RippleDrawable e;
    private float f;
    private float g;
    private final Runnable h;

    public ovc(ViewGroup viewGroup, RippleDrawable rippleDrawable) {
        ove oveVar;
        this.d = viewGroup;
        this.e = rippleDrawable;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ove) {
                oveVar = (ove) childAt;
                this.a = oveVar;
                this.h = new ooz(this, 12);
            }
        }
        oveVar = new ove(viewGroup.getContext());
        viewGroup.addView(oveVar);
        this.a = oveVar;
        this.h = new ooz(this, 12);
    }

    private final void a() {
        this.d.removeCallbacks(this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ovh ovhVar = this.b;
        if (ovhVar != null) {
            Rect bounds = getBounds();
            canvas.save();
            canvas.translate(bounds.left, bounds.top);
            ovhVar.b = true;
            ovhVar.draw(canvas);
            ovhVar.b = false;
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        ovh ovhVar = this.b;
        if (ovhVar != null) {
            ovhVar.layout(0, 0, rect.width(), rect.height());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.f = f;
        this.g = f2;
        if (this.b != null) {
            this.e.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        boolean z;
        boolean state = super.setState(iArr);
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (iArr[i] == 16842919) {
                z = true;
                break;
            }
            i++;
        }
        if (this.c == z) {
            return state;
        }
        this.c = z;
        if (z) {
            a();
            ovh ovhVar = this.b;
            if (ovhVar == null) {
                ove oveVar = this.a;
                Map map = oveVar.c;
                ovh ovhVar2 = (ovh) map.get(this);
                if (ovhVar2 == null) {
                    List list = oveVar.b;
                    ovhVar2 = !list.isEmpty() ? (ovh) list.remove(0) : null;
                    if (ovhVar2 == null) {
                        int i2 = oveVar.e;
                        List list2 = oveVar.a;
                        if (i2 > list2.size() - 1) {
                            ovhVar2 = new ovh(oveVar.getContext());
                            oveVar.addView(ovhVar2);
                            list2.add(ovhVar2);
                        } else {
                            ovhVar2 = (ovh) list2.get(oveVar.e);
                            Map map2 = oveVar.d;
                            WeakReference weakReference = (WeakReference) map2.get(ovhVar2);
                            Object obj = weakReference != null ? weakReference.get() : null;
                            if (obj != null) {
                                map.remove(obj);
                                ovhVar2.a();
                            }
                            map2.remove(ovhVar2);
                        }
                        int i3 = oveVar.e;
                        if (i3 < 4) {
                            oveVar.e = i3 + 1;
                        } else {
                            oveVar.e = 0;
                        }
                    }
                    map.put(this, ovhVar2);
                    oveVar.d.put(ovhVar2, new WeakReference(this));
                }
                this.b = ovhVar2;
                Rect bounds = getBounds();
                RippleDrawable rippleDrawable = this.e;
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                float f = this.f;
                float f2 = this.g;
                ooz oozVar = new ooz(this, 13);
                ovhVar2.a = rippleDrawable;
                ovhVar2.c = oozVar;
                ovhVar2.setBackground(rippleDrawable);
                ovhVar2.layout(0, 0, iWidth, iHeight);
                rippleDrawable.setHotspot(f, f2);
                rippleDrawable.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            } else {
                RippleDrawable rippleDrawable2 = ovhVar.a;
                if (rippleDrawable2 != null) {
                    rippleDrawable2.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
            }
        } else {
            ovh ovhVar3 = this.b;
            if (ovhVar3 != null) {
                RippleDrawable rippleDrawable3 = ovhVar3.a;
                if (rippleDrawable3 != null) {
                    rippleDrawable3.setState(new int[0]);
                }
                ViewGroup viewGroup = this.d;
                Runnable runnable = this.h;
                viewGroup.removeCallbacks(runnable);
                viewGroup.postDelayed(runnable, 500L);
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            a();
            if (this.b != null) {
                this.a.a(this);
                this.b = null;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        ovh ovhVar = this.b;
        if (ovhVar != null) {
            ovhVar.layout(0, 0, i3 - i, i4 - i2);
        }
    }
}
