package defpackage;

import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hcy implements SensorEventListener {
    private static final long d;
    public final vyo a;
    public final avmb b;
    public avmn c;
    private final SensorManager e;
    private final SharedPreferences f;
    private final hcp g;
    private double h;
    private long i;
    private final jnj j;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d = 250000000L;
    }

    public hcy(cf cfVar, SharedPreferences sharedPreferences, vyo vyoVar, jnj jnjVar, hcp hcpVar, avmb avmbVar) {
        this.e = (SensorManager) cfVar.getApplicationContext().getSystemService("sensor");
        this.f = sharedPreferences;
        this.j = jnjVar;
        this.a = vyoVar;
        this.g = hcpVar;
        this.b = avmbVar;
    }

    public final void a() {
        avmn avmnVar = this.c;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.c);
        }
        this.c = null;
    }

    public final void b(boolean z) {
        SensorManager sensorManager = this.e;
        if (z) {
            if (sensorManager != null) {
                sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 2);
            }
        } else {
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
            this.i = 0L;
        }
    }

    public final boolean c() {
        return this.j.u() && this.f.getBoolean(gzj.SHAKE_TO_SEND_FEEDBACK, false);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        int i = 1;
        float f2 = sensorEvent.values[1];
        int i2 = 2;
        float f3 = sensorEvent.values[2];
        double dSqrt = (Math.sqrt((f * f) + (f2 * f2) + (f3 * f3)) * 0.9d) + (this.h * 0.09999999999999998d);
        this.h = dSqrt;
        if (dSqrt <= 14.0d) {
            this.i = 0L;
            return;
        }
        if (this.i <= 0) {
            this.i = sensorEvent.timestamp;
            return;
        }
        if (sensorEvent.timestamp - this.i > d) {
            b(false);
            hcp hcpVar = this.g;
            vxz vxzVar = hcpVar.f;
            boolean zL = vxzVar.l(83, 45440305L, false);
            boolean zL2 = vxzVar.l(145, 45836148L, false);
            cf cfVar = hcpVar.b;
            ListenableFuture listenableFutureX = twm.x(cfVar, zL, zL2);
            hdn hdnVar = new hdn(i);
            Executor executor = hcpVar.e;
            ListenableFuture listenableFutureAm = ahno.am(listenableFutureX, Exception.class, hdnVar, executor);
            ListenableFuture listenableFutureAm2 = ahno.am(hcpVar.g.i(), Exception.class, new cbs(20), executor);
            taf.k(cfVar, ahno.ax(listenableFutureAm, listenableFutureAm2).l(new gmf(hcpVar, listenableFutureAm, listenableFutureAm2, i2), executor), new gnx(7), new gnx(8));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
