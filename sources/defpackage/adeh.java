package defpackage;

import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adeh {
    public static final TouchFeedbackDrawable a(ovd ovdVar, ElementsServices elementsServices) {
        aedg aedgVarA = aedg.a(elementsServices.c());
        if (ovdVar.g) {
            aedgVarA.a = ovdVar.f;
        }
        if (ovdVar.i) {
            aedgVarA.c(ovdVar.h);
        }
        return aedgVarA.b();
    }
}
