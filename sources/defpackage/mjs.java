package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.android.libraries.elements.interfaces.DirectUpdateProcessor;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjs {
    public final boolean a;
    public DirectUpdateProcessor b;
    public mjr c;
    public DirectUpdatePropertiesOuterClass$DirectUpdateProperties d;
    public final Map e;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = 0.0f;
    public boolean l = false;
    private final DisplayMetrics m;
    private final ByteStore n;
    private final DirectUpdateDataRelay o;
    private Handler p;

    public mjs(DisplayMetrics displayMetrics, ByteStore byteStore, DirectUpdateDataRelay directUpdateDataRelay, DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties, Map map, boolean z) {
        this.m = displayMetrics;
        this.n = byteStore;
        this.o = directUpdateDataRelay;
        this.d = directUpdatePropertiesOuterClass$DirectUpdateProperties;
        this.e = map;
        this.a = z;
    }

    private final void d(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        Handler handler = this.p;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.p = handler;
        }
        handler.post(runnable);
    }

    private final void e(hee heeVar, Object obj) {
        if (heeVar != null) {
            d(new lph(heeVar, obj, 8, (byte[]) null));
        }
    }

    public final void a() {
        d(new mbo(this, 2));
    }

    public final void b(Map map) {
        asmn asmnVar = asmn.DYNAMIC_PROP_TYPE_ALPHA;
        Float f = (Float) map.get(asmnVar);
        if (f != null) {
            this.f = f.floatValue();
            e((hee) this.e.get(asmnVar), f);
        }
        asmn asmnVar2 = asmn.DYNAMIC_PROP_TYPE_SCALE_X;
        Float f2 = (Float) map.get(asmnVar2);
        if (f2 != null) {
            this.g = f2.floatValue();
            e((hee) this.e.get(asmnVar2), f2);
        }
        asmn asmnVar3 = asmn.DYNAMIC_PROP_TYPE_SCALE_Y;
        Float f3 = (Float) map.get(asmnVar3);
        if (f3 != null) {
            this.h = f3.floatValue();
            e((hee) this.e.get(asmnVar3), f3);
        }
        asmn asmnVar4 = asmn.DYNAMIC_PROP_TYPE_ROTATION;
        Float f4 = (Float) map.get(asmnVar4);
        if (f4 != null) {
            this.i = f4.floatValue();
            e((hee) this.e.get(asmnVar4), f4);
        }
        asmn asmnVar5 = asmn.DYNAMIC_PROP_TYPE_TRANSLATION_X;
        Float f5 = (Float) map.get(asmnVar5);
        if (f5 != null) {
            this.j = f5.floatValue();
            e((hee) this.e.get(asmnVar5), f5);
        }
        asmn asmnVar6 = asmn.DYNAMIC_PROP_TYPE_TRANSLATION_Y;
        Float f6 = (Float) map.get(asmnVar6);
        if (f6 != null) {
            this.k = f6.floatValue();
            e((hee) this.e.get(asmnVar6), f6);
        }
    }

    public final void c() {
        asmn asmnVar = asmn.DYNAMIC_PROP_TYPE_ALPHA;
        hee heeVar = new hee(Float.valueOf(this.f));
        Map map = this.e;
        map.put(asmnVar, heeVar);
        map.put(asmn.DYNAMIC_PROP_TYPE_SCALE_X, new hee(Float.valueOf(this.g)));
        map.put(asmn.DYNAMIC_PROP_TYPE_SCALE_Y, new hee(Float.valueOf(this.h)));
        map.put(asmn.DYNAMIC_PROP_TYPE_ROTATION, new hee(Float.valueOf(this.i)));
        map.put(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_X, new hee(Float.valueOf(this.j)));
        map.put(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_Y, new hee(Float.valueOf(this.k)));
        mjr mjrVar = new mjr(map, this.m);
        this.c = mjrVar;
        DirectUpdateProcessor directUpdateProcessorCreate = DirectUpdateProcessor.create(mjrVar, this.n, this.o, null);
        this.b = directUpdateProcessorCreate;
        if (directUpdateProcessorCreate == null) {
            throw new nud("Error creating DirectUpdateProcessor");
        }
        this.l = false;
    }
}
