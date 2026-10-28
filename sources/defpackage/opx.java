package defpackage;

import android.widget.ImageView;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class opx implements eho {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ opx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.graphics.drawable.Drawable$Callback, java.lang.Object] */
    @Override // defpackage.eho
    public final void a(Object obj) {
        PaintUnitOwner paintUnitOwner;
        int i = this.$cid;
        if (i == 0) {
            opy opyVar = (opy) this.a;
            oui ouiVar = opyVar.a;
            Throwable th = (Throwable) obj;
            if (ouiVar != null) {
                ouiVar.c(aslh.LOG_TYPE_PROPERTY_RESOLUTION_ERROR, "Unable to parse Lottie animation from url.", th);
            }
            aswo aswoVar = opyVar.d;
            if (aswoVar != null && (aswoVar.l != null || (Memory.peekByte(aswoVar.c + 9) & 16) != 0)) {
                atoc atocVarL = opy.l(opyVar.c);
                orq orqVarL = opyVar.b.l();
                if (aswoVar.l == null && (Memory.peekByte(aswoVar.c + 9) & 16) != 0) {
                    aswoVar.l = new mew(aswoVar.cp(true != aswq.a ? 52 : 80, atcm.a));
                }
                orqVarL.d(aswoVar.l == null ? atcl.a : aswoVar.l, opy.k(atocVarL));
            }
            opyVar.e = null;
            return;
        }
        if (i != 1) {
            ehm ehmVar = new ehm();
            ?? r8 = this.a;
            ehmVar.setCallback(r8);
            ehmVar.B((egy) obj);
            ehmVar.w(-1);
            ImageView imageView = (ImageView) r8;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(ehmVar);
            ehmVar.start();
            return;
        }
        Object obj2 = this.a;
        egy egyVar = (egy) obj;
        opy opyVar2 = (opy) obj2;
        ehm ehmVar2 = opyVar2.c;
        if (ehmVar2 != null && ehmVar2.B(egyVar) && (paintUnitOwner = ((ouj) obj2).q) != null) {
            opyVar2.h();
            paintUnitOwner.G();
        }
        aswo aswoVar2 = opyVar2.d;
        if (aswoVar2 != null && (aswoVar2.k != null || (Memory.peekByte(aswoVar2.c + 9) & 8) != 0)) {
            atoc atocVarL2 = opy.l(opyVar2.c);
            orq orqVarL2 = opyVar2.b.l();
            if (aswoVar2.k == null && (Memory.peekByte(aswoVar2.c + 9) & 8) != 0) {
                aswoVar2.k = new mew(aswoVar2.cp(true != aswq.a ? 48 : 72, atcm.a));
            }
            orqVarL2.d(aswoVar2.k == null ? atcl.a : aswoVar2.k, opy.k(atocVarL2));
        }
        opyVar2.e = null;
    }
}
