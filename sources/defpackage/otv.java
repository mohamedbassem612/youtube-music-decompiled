package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class otv extends feg implements feu {
    public volatile otf a;
    private ImageView.ScaleType b;
    private Drawable d;
    private final otw e;
    private final otu f;
    private final ElementsServices g;
    private final mew h;
    private final mew i;
    private final mew j;
    private final mew k;
    private final int l;
    private final atiq m;
    private final atiq n;
    private final atiq o;

    public otv(Size size, otu otuVar, atiq atiqVar, otw otwVar, atiq atiqVar2, atiq atiqVar3, mew mewVar, mew mewVar2, int i, mew mewVar3, mew mewVar4, ElementsServices elementsServices) {
        super(r(size.getWidth()), r(size.getHeight()));
        this.b = ImageView.ScaleType.FIT_XY;
        this.f = otuVar;
        this.m = atiqVar;
        this.e = otwVar;
        this.n = atiqVar2;
        this.o = atiqVar3;
        this.h = mewVar;
        this.i = mewVar2;
        this.l = i;
        this.j = mewVar3;
        this.k = mewVar4;
        this.g = elementsServices;
        if (otwVar != null) {
            otuVar.hashCode();
            otwVar.c();
        }
    }

    private static int r(int i) {
        aga agaVar = ElementsServices.a;
        if (Memory.peekByte(FlagServices.b().c + 63) == 0 || i <= 0) {
            return Integer.MIN_VALUE;
        }
        return i;
    }

    private final ImageView.ScaleType s() {
        atiq atiqVar = this.m;
        return atiqVar != null ? oty.b(atiqVar.aX()) : ImageView.ScaleType.FIT_XY;
    }

    @Override // defpackage.feg, defpackage.fem
    public final void a(Drawable drawable) {
        if (drawable != null) {
            otu otuVar = this.f;
            if (otuVar.o.get()) {
                return;
            }
            ImageView.ScaleType scaleTypeS = s();
            atiq atiqVar = this.o;
            if (atiqVar != null) {
                drawable = nuq.a(drawable, atiqVar, this.g);
                scaleTypeS = nuq.b(drawable, atiqVar);
            }
            this.b = scaleTypeS;
            n(drawable);
            otw otwVar = this.e;
            if (otwVar != null) {
                otuVar.hashCode();
                otwVar.a();
            }
            mew mewVar = this.i;
            if (mewVar != null) {
                this.g.l().d(mewVar, ors.b().a());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    @Override // defpackage.fem
    public final /* bridge */ /* synthetic */ void b(Object obj, fev fevVar) {
        Drawable drawableA = (Drawable) obj;
        otu otuVar = this.f;
        if (otuVar.o.get()) {
            return;
        }
        atiq atiqVar = this.m;
        this.b = atiqVar == null ? ImageView.ScaleType.FIT_XY : nuq.b(drawableA, atiqVar);
        if (atiqVar.aU()) {
            drawableA = nuq.a(drawableA, atiqVar, this.g);
        } else {
            long j = atiqVar.c + 8;
            if ((Memory.peekByte(j) & 1) != 0 || (Memory.peekByte(j) & 4) != 0) {
                drawableA = nuq.a(drawableA, atiqVar, this.g);
            } else if (atiqVar.aS() > 0) {
                ativ ativVarAY = atiqVar.aY(0);
                if (ativVarAY.aS() && (Memory.peekByte(ativVarAY.aU().c + 8) & 4) != 0) {
                    drawableA = nuq.a(drawableA, atiqVar, this.g);
                }
            }
        }
        if (fevVar == null || !fevVar.a(drawableA, this)) {
            otuVar.k(drawableA, this.b);
        }
        Bitmap bitmap = null;
        if (drawableA instanceof Animatable) {
            if (qpj.g()) {
                p(drawableA);
            } else {
                qpj.e(new msh(this, drawableA, 17, null));
            }
        }
        otw otwVar = this.e;
        if (otwVar != null) {
            otuVar.hashCode();
            otwVar.d();
            otuVar.hashCode();
            if (drawableA instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawableA).getBitmap();
            } else if (drawableA instanceof otm) {
                bitmap = ((otm) drawableA).r;
            }
            if (bitmap != null) {
                new Size(bitmap.getWidth(), bitmap.getHeight());
            }
            otwVar.e();
        }
        mew mewVar = this.h;
        if (mewVar != null) {
            this.g.l().d(mewVar, ors.b().a());
        }
    }

    @Override // defpackage.feg, defpackage.fem
    public final void e(Drawable drawable) {
        if (drawable == null || this.f.o.get()) {
            return;
        }
        ImageView.ScaleType scaleTypeS = s();
        atiq atiqVar = this.n;
        if (atiqVar != null) {
            drawable = nuq.a(drawable, atiqVar, this.g);
            scaleTypeS = nuq.b(drawable, atiqVar);
        }
        this.b = scaleTypeS;
        n(drawable);
    }

    @Override // defpackage.fem
    public final void gG(Drawable drawable) {
        otu otuVar = this.f;
        if (otuVar.o.get()) {
            aga agaVar = ElementsServices.a;
            if (Memory.peekByte(FlagServices.b().c + 96) != 0) {
                this.d = null;
                return;
            }
            return;
        }
        if (drawable == null) {
            aga agaVar2 = ElementsServices.a;
            if (Memory.peekByte(FlagServices.b().c + 96) != 0) {
                n(null);
                otw otwVar = this.e;
                if (otwVar != null) {
                    otuVar.hashCode();
                    otwVar.b();
                    return;
                }
                return;
            }
            return;
        }
        ImageView.ScaleType scaleTypeS = s();
        atiq atiqVar = this.n;
        if (atiqVar != null) {
            drawable = nuq.a(drawable, atiqVar, this.g);
            scaleTypeS = nuq.b(drawable, atiqVar);
        }
        this.b = scaleTypeS;
        n(drawable);
        otw otwVar2 = this.e;
        if (otwVar2 != null) {
            otuVar.hashCode();
            otwVar2.b();
        }
    }

    public final void i() {
        aga agaVar = ElementsServices.a;
        if (Memory.peekByte(FlagServices.b().c + 96) != 0) {
            this.d = null;
        }
        if (this.a != null) {
            this.a.b();
            this.a.a();
            this.a = null;
        }
    }

    @Override // defpackage.feu
    public final Drawable j() {
        return this.d;
    }

    @Override // defpackage.feu
    public final void n(Drawable drawable) {
        this.d = drawable;
        this.f.k(drawable, this.b);
    }

    @Override // defpackage.feu
    public final View o() {
        return null;
    }

    public final void p(Drawable drawable) {
        if (this.a == null) {
            this.a = new otf(this.j, this.k, this.g.l());
        }
        otf otfVar = this.a;
        otfVar.a();
        if (drawable instanceof FrameSequenceDrawable) {
            otfVar.a = new otp((FrameSequenceDrawable) drawable);
        } else if (drawable instanceof fce) {
            otfVar.a = new otr((fce) drawable);
        } else {
            otfVar.a = null;
        }
        ote oteVar = otfVar.a;
        if (oteVar != null) {
            oteVar.a(new ooz(otfVar, 6));
        }
        q(this.l);
    }

    public final void q(int i) {
        if (this.a != null) {
            int i2 = i - 1;
            otf otfVar = this.a;
            if (i2 == 2) {
                otfVar.b();
                return;
            }
            ote oteVar = otfVar.a;
            if (oteVar != null) {
                oteVar.b();
                mew mewVar = otfVar.c;
                if (mewVar != null) {
                    otfVar.b.d(mewVar, ors.b().a());
                }
            }
        }
    }
}
