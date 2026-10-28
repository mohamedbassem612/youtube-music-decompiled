package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.libraries.elements.interfaces.DirectUpdateExecutor;
import io.grpc.Status;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjr extends DirectUpdateExecutor {
    public static final /* synthetic */ int a = 0;
    private Handler b;
    private final Map c;
    private final DisplayMetrics d;

    public mjr(Map map, DisplayMetrics displayMetrics) {
        this.c = map;
        this.d = displayMetrics;
    }

    private final void a(hee heeVar, Object obj) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            heeVar.a(obj);
            return;
        }
        Handler handler = this.b;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.b = handler;
        }
        handler.post(new lfa(heeVar, obj, 15, (byte[]) null));
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeAnimatedVectorTypeAnimationProgress(float f) {
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesBackgroundColor(long j) {
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesOpacity(float f) {
        hee heeVar = (hee) this.c.get(asmn.DYNAMIC_PROP_TYPE_ALPHA);
        if (heeVar != null) {
            a(heeVar, Float.valueOf(f));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesRotation(float f) {
        hee heeVar = (hee) this.c.get(asmn.DYNAMIC_PROP_TYPE_ROTATION);
        if (heeVar != null) {
            a(heeVar, Float.valueOf(f));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesScale(float f) {
        Map map = this.c;
        hee heeVar = (hee) map.get(asmn.DYNAMIC_PROP_TYPE_SCALE_X);
        if (heeVar != null) {
            a(heeVar, Float.valueOf(f));
        }
        hee heeVar2 = (hee) map.get(asmn.DYNAMIC_PROP_TYPE_SCALE_Y);
        if (heeVar2 != null) {
            a(heeVar2, Float.valueOf(f));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesScaleX(float f) {
        hee heeVar = (hee) this.c.get(asmn.DYNAMIC_PROP_TYPE_SCALE_X);
        if (heeVar != null) {
            a(heeVar, Float.valueOf(f));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesScaleY(float f) {
        hee heeVar = (hee) this.c.get(asmn.DYNAMIC_PROP_TYPE_SCALE_Y);
        if (heeVar != null) {
            a(heeVar, Float.valueOf(f));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesTranslation(float f, float f2) {
        Map map = this.c;
        hee heeVar = (hee) map.get(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_X);
        if (heeVar != null) {
            a(heeVar, Float.valueOf(TypedValue.applyDimension(1, f, this.d)));
        }
        hee heeVar2 = (hee) map.get(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_Y);
        if (heeVar2 != null) {
            a(heeVar2, Float.valueOf(TypedValue.applyDimension(1, f2, this.d)));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesTranslationX(float f) {
        hee heeVar = (hee) this.c.get(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_X);
        if (heeVar != null) {
            a(heeVar, Float.valueOf(TypedValue.applyDimension(1, f, this.d)));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesTranslationY(float f) {
        hee heeVar = (hee) this.c.get(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_Y);
        if (heeVar != null) {
            a(heeVar, Float.valueOf(TypedValue.applyDimension(1, f, this.d)));
        }
        return Status.OK;
    }
}
