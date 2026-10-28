package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cul extends GLSurfaceView {
    public final CopyOnWriteArrayList a;
    public final Handler b;
    public final cuj c;
    public SurfaceTexture d;
    public Surface e;
    private final SensorManager f;
    private final Sensor g;
    private final cug h;
    private final cum i;
    private final boolean j;
    private boolean k;
    private boolean l;

    public cul(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.b = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.g = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        cuj cujVar = new cuj();
        this.c = cujVar;
        cuk cukVar = new cuk(this, cujVar);
        cum cumVar = new cum(context, cukVar);
        this.i = cumVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.h = new cug(windowManager.getDefaultDisplay(), cumVar, cukVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(cukVar);
        setOnTouchListener(cumVar);
    }

    public static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private final void b() {
        boolean z = this.j && this.k;
        Sensor sensor = this.g;
        if (sensor == null || z == this.l) {
            return;
        }
        SensorManager sensorManager = this.f;
        if (z) {
            sensorManager.registerListener(this.h, sensor, 0);
        } else {
            sensorManager.unregisterListener(this.h);
        }
        this.l = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.post(new cqc(this, 9));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.k = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.k = true;
        b();
    }
}
