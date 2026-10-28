package defpackage;

import android.util.Size;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl;
import com.google.android.libraries.youtube.rendering.image.glide.GlideImageLoggerImpl;
import com.google.protobuf.ExtensionRegistryLite;
import internal.org.jni_zero.CommonApis;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adiq implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ adiq(ElementsRuntimeImpl elementsRuntimeImpl, long j, mew mewVar, mew mewVar2, NodeTreeProcessor nodeTreeProcessor, int i, int i2) {
        this.$cid = i2;
        this.e = elementsRuntimeImpl;
        this.b = j;
        this.d = mewVar;
        this.f = mewVar2;
        this.c = nodeTreeProcessor;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r15v6, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, nci] */
    @Override // java.lang.Runnable
    public final void run() {
        agfr agfuVar;
        if (this.$cid != 0) {
            Object obj = this.e;
            ElementsRuntimeImpl elementsRuntimeImpl = (ElementsRuntimeImpl) obj;
            View view = (View) elementsRuntimeImpl.d.a(this.b);
            Object obj2 = this.f;
            Object obj3 = this.d;
            if (view != null) {
                agfuVar = (obj3 == null || !ElementsRuntimeImpl.i((mew) obj2)) ? new agfu(view) : aguu.al(new ovf(obj, (Object) view, obj3, 2, (byte[]) null));
            } else {
                agfuVar = null;
            }
            agfr agfrVar = agfuVar;
            int i = this.a;
            ?? r15 = this.c;
            ElementsServices elementsServices = elementsRuntimeImpl.c;
            elementsServices.l().d((mew) obj2, orp.e(agfrVar, (mew) obj3, i, r15.a(i), elementsServices, r15.l(), r15.i()));
            return;
        }
        GlideImageLoggerImpl glideImageLoggerImpl = (GlideImageLoggerImpl) this.c;
        Map map = glideImageLoggerImpl.c;
        int i2 = this.a;
        adix adixVar = (adix) map.get(Integer.valueOf(i2));
        if (adixVar != null) {
            ?? r3 = this.f;
            Object obj4 = this.e;
            Object obj5 = this.d;
            long j = this.b;
            adixVar.o = j;
            adixVar.m = j;
            adixVar.i = true;
            Size size = (Size) obj5;
            adixVar.b = size.getWidth();
            adixVar.c = size.getHeight();
            adixVar.f = (String) obj4;
            if (r3.l()) {
                try {
                    alji aljiVar = (alji) aihn.parseFrom(alji.a, r3.j(), ExtensionRegistryLite.getGeneratedRegistry());
                    if ((aljiVar.b & 1) != 0) {
                        int iE = CommonApis.e(aljiVar.c);
                        adixVar.q = iE != 0 ? iE : 1;
                    }
                } catch (Exception e) {
                    ((agrc) ((agrc) ((agrc) GlideImageLoggerImpl.a.b()).j(e)).k("com/google/android/libraries/youtube/rendering/image/glide/GlideImageLoggerImpl", "onImageSuccess", (char) 268, "GlideImageLoggerImpl.java")).t("Failed to parse ImageClassificationHint");
                }
            }
            glideImageLoggerImpl.h(i2);
        }
    }

    public /* synthetic */ adiq(GlideImageLoggerImpl glideImageLoggerImpl, int i, long j, Size size, String str, nci nciVar, int i2) {
        this.$cid = i2;
        this.c = glideImageLoggerImpl;
        this.a = i;
        this.b = j;
        this.d = size;
        this.e = str;
        this.f = nciVar;
    }
}
