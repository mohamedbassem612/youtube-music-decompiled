package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fmf implements fmh {
    private final /* synthetic */ int $cid;

    public fmf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.fmh
    public final float a(Object obj) {
        int iHeight;
        float fA;
        int i;
        switch (this.$cid) {
            case 0:
                if (obj instanceof View) {
                    iHeight = ((View) obj).getHeight();
                } else {
                    if (!(obj instanceof Drawable)) {
                        throw new UnsupportedOperationException("Getting height from unsupported mount content: ".concat(obj.toString()));
                    }
                    iHeight = ((Drawable) obj).getBounds().height();
                }
                return iHeight;
            case 1:
                if (obj instanceof View) {
                    return ((View) obj).getAlpha();
                }
                throw new UnsupportedOperationException("Tried to get alpha of unsupported mount content: ".concat(obj.toString()));
            case 2:
                return fmg.b(obj, this).getRotation();
            case 3:
                View viewB = fmg.b(obj, this);
                float scaleX = viewB.getScaleX();
                if (scaleX == viewB.getScaleY()) {
                    return scaleX;
                }
                throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
            case 4:
                if (obj instanceof View) {
                    return ((View) obj).getTranslationX();
                }
                throw new UnsupportedOperationException("Getting X from unsupported mount content: ".concat(obj.toString()));
            case 5:
                if (obj instanceof View) {
                    return ((View) obj).getTranslationY();
                }
                throw new UnsupportedOperationException("Getting Y from unsupported mount content: ".concat(obj.toString()));
            case 6:
                if (obj instanceof View) {
                    iHeight = ((View) obj).getWidth();
                } else {
                    if (!(obj instanceof Drawable)) {
                        throw new UnsupportedOperationException("Getting width from unsupported mount content: ".concat(obj.toString()));
                    }
                    iHeight = ((Drawable) obj).getBounds().width();
                }
                return iHeight;
            case 7:
                if ((obj instanceof fvf) && (obj instanceof fvs)) {
                    return ((fvf) obj).getX();
                }
                if (obj instanceof View) {
                    return fmg.a((View) obj, true);
                }
                if (!(obj instanceof Drawable)) {
                    throw new UnsupportedOperationException("Getting X from unsupported mount content: ".concat(obj.toString()));
                }
                Drawable drawable = (Drawable) obj;
                fA = fmg.a(fmg.c(drawable), true);
                i = drawable.getBounds().left;
                return fA + i;
            default:
                if ((obj instanceof fvf) && (obj instanceof fvs)) {
                    return ((fvf) obj).getY();
                }
                if (obj instanceof View) {
                    return fmg.a((View) obj, false);
                }
                if (!(obj instanceof Drawable)) {
                    throw new UnsupportedOperationException("Getting Y from unsupported mount content: ".concat(obj.toString()));
                }
                Drawable drawable2 = (Drawable) obj;
                fA = fmg.a(fmg.c(drawable2), false);
                i = drawable2.getBounds().top;
                return fA + i;
        }
    }

    @Override // defpackage.fmh
    public final String b() {
        switch (this.$cid) {
            case 0:
                return "height";
            case 1:
                return "alpha";
            case 2:
                return "rotation";
            case 3:
                return "scale";
            case 4:
                return "translation_x";
            case 5:
                return "translation_y";
            case 6:
                return "width";
            case 7:
                return "x";
            default:
                return "y";
        }
    }

    @Override // defpackage.fmh
    public final void c(Object obj) {
        switch (this.$cid) {
            case 0:
            case 6:
                break;
            case 1:
                d(obj, 1.0f);
                break;
            case 2:
                fmg.b(obj, this).setRotation(0.0f);
                break;
            case 3:
                View viewB = fmg.b(obj, this);
                viewB.setScaleX(1.0f);
                viewB.setScaleY(1.0f);
                break;
            case 4:
                if (obj instanceof View) {
                    ((View) obj).setTranslationX(0.0f);
                }
                break;
            case 5:
                if (obj instanceof View) {
                    ((View) obj).setTranslationY(0.0f);
                }
                break;
            case 7:
                if (obj instanceof View) {
                    ((View) obj).setTranslationX(0.0f);
                }
                break;
            default:
                if (obj instanceof View) {
                    ((View) obj).setTranslationY(0.0f);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fmh
    public final void d(Object obj, float f) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                if (!(obj instanceof fvf)) {
                    if (obj instanceof View) {
                        View view = (View) obj;
                        int top = view.getTop();
                        gzj.aE(view.getLeft(), top, view.getRight(), (int) (top + f), view, false);
                        return;
                    } else {
                        if (!(obj instanceof Drawable)) {
                            throw new UnsupportedOperationException("Setting height on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
                        }
                        Drawable drawable = (Drawable) obj;
                        gzj.aG(drawable, drawable.getBounds().width(), (int) f);
                        return;
                    }
                }
                fvf fvfVar = (fvf) obj;
                if (fvfVar instanceof fwa) {
                    ((fwa) fvfVar).I((int) f);
                } else {
                    int top2 = fvfVar.getTop();
                    gzj.aE(fvfVar.getLeft(), top2, fvfVar.getRight(), (int) (top2 + f), fvfVar, false);
                }
                List listD = fmg.d(fvfVar);
                if (listD != null) {
                    int i2 = (int) f;
                    int width = fvfVar.getWidth();
                    while (i < listD.size()) {
                        gzj.aG((Drawable) listD.get(i), width, i2);
                        i++;
                    }
                    return;
                }
                return;
            case 1:
                if (!(obj instanceof View)) {
                    throw new UnsupportedOperationException("Setting alpha on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
                }
                ((View) obj).setAlpha(f);
                return;
            case 2:
                fmg.b(obj, this).setRotation(f);
                return;
            case 3:
                View viewB = fmg.b(obj, this);
                viewB.setScaleX(f);
                viewB.setScaleY(f);
                return;
            case 4:
                if (!(obj instanceof View)) {
                    throw new UnsupportedOperationException("Setting X on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
                }
                ((View) obj).setTranslationX(f);
                return;
            case 5:
                if (!(obj instanceof View)) {
                    throw new UnsupportedOperationException("Setting Y on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
                }
                ((View) obj).setTranslationY(f);
                return;
            case 6:
                if (!(obj instanceof fvf)) {
                    if (obj instanceof View) {
                        View view2 = (View) obj;
                        int left = view2.getLeft();
                        gzj.aE(left, view2.getTop(), (int) (left + f), view2.getBottom(), view2, false);
                        return;
                    }
                    if (!(obj instanceof Drawable)) {
                        throw new UnsupportedOperationException("Setting width on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
                    }
                    Drawable drawable2 = (Drawable) obj;
                    gzj.aG(drawable2, (int) f, drawable2.getBounds().height());
                    return;
                }
                fvf fvfVar2 = (fvf) obj;
                if (fvfVar2 instanceof fwa) {
                    ((fwa) fvfVar2).J((int) f);
                } else {
                    int left2 = fvfVar2.getLeft();
                    gzj.aE(left2, fvfVar2.getTop(), (int) (left2 + f), fvfVar2.getBottom(), fvfVar2, false);
                }
                List listD2 = fmg.d(fvfVar2);
                if (listD2 != null) {
                    int i3 = (int) f;
                    int height = fvfVar2.getHeight();
                    while (i < listD2.size()) {
                        gzj.aG((Drawable) listD2.get(i), i3, height);
                        i++;
                    }
                    return;
                }
                return;
            case 7:
                if ((obj instanceof fvf) && (obj instanceof fvs)) {
                    ((View) obj).setX(f);
                    return;
                }
                if (obj instanceof View) {
                    View view3 = (View) obj;
                    view3.setX(f - fmg.a((View) view3.getParent(), true));
                    return;
                } else {
                    if (!(obj instanceof Drawable)) {
                        throw new UnsupportedOperationException("Setting X on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
                    }
                    Drawable drawable3 = (Drawable) obj;
                    gzj.aH(drawable3, (int) (f - fmg.a(fmg.c(drawable3), true)), drawable3.getBounds().top);
                    return;
                }
            default:
                if ((obj instanceof fvf) && (obj instanceof fvs)) {
                    ((View) obj).setY(f);
                    return;
                }
                if (obj instanceof View) {
                    View view4 = (View) obj;
                    view4.setY(f - fmg.a((View) view4.getParent(), false));
                    return;
                } else {
                    if (!(obj instanceof Drawable)) {
                        throw new UnsupportedOperationException("Setting Y on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
                    }
                    Drawable drawable4 = (Drawable) obj;
                    gzj.aH(drawable4, drawable4.getBounds().left, (int) (f - fmg.a(fmg.c(drawable4), false)));
                    return;
                }
        }
    }

    @Override // defpackage.fmh
    public final float e(fjh fjhVar) {
        int iHeight;
        switch (this.$cid) {
            case 0:
                iHeight = fjhVar.b.height();
                return iHeight;
            case 1:
                fkl fklVar = fjhVar.d;
                if (fklVar == null || !fklVar.I()) {
                    return 1.0f;
                }
                return fklVar.n;
            case 2:
                fkl fklVar2 = fjhVar.d;
                if (fklVar2 != null && fklVar2.K()) {
                    return fklVar2.o;
                }
                break;
            case 3:
                fkl fklVar3 = fjhVar.d;
                if (fklVar3 == null || (fklVar3.J & 524288) == 0) {
                    return 1.0f;
                }
                return fklVar3.b();
            case 4:
                fkl fklVar4 = fjhVar.d;
                if (fklVar4 != null) {
                    return fklVar4.p;
                }
                break;
            case 5:
                fkl fklVar5 = fjhVar.d;
                if (fklVar5 != null) {
                    return fklVar5.q;
                }
                break;
            case 6:
                iHeight = fjhVar.b.width();
                return iHeight;
            case 7:
                iHeight = fjhVar.b.left;
                return iHeight;
            default:
                iHeight = fjhVar.b.top;
                return iHeight;
        }
        return 0.0f;
    }
}
