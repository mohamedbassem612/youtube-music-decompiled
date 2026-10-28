package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.car.app.model.Alert;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayg {
    private final Context a;
    private final ayh b;
    private VelocityTracker c;
    private float d;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private final int[] h = {Alert.DURATION_SHOW_INDEFINITELY, 0};

    public ayg(Context context, ayh ayhVar) {
        this.a = context;
        this.b = ayhVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0185  */
    public final void a(MotionEvent motionEvent, int i) {
        char c;
        int iB;
        int deviceId;
        int source;
        int identifier;
        final int i2;
        int iB2;
        boolean z;
        boolean z2;
        float axisVelocity;
        float fA;
        int i3;
        long j;
        boolean z3;
        int i4 = i;
        int source2 = motionEvent.getSource();
        int deviceId2 = motionEvent.getDeviceId();
        if (this.f == source2 && this.g == deviceId2 && this.e == i4) {
            z = false;
        } else {
            Context context = this.a;
            int[] iArr = this.h;
            final ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (Build.VERSION.SDK_INT >= 34) {
                iB = viewConfiguration.getScaledMinimumFlingVelocity(deviceId3, i4, source3);
            } else {
                if (azt.c(deviceId3, i4, source3)) {
                    Resources resources = context.getResources();
                    int identifier2 = (source3 == 4194304 && i4 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    viewConfiguration.getClass();
                    final int i5 = 0;
                    c = 0;
                    iB = azt.b(resources, identifier2, new axv() { // from class: bad
                        @Override // defpackage.axv
                        public final Object a() {
                            int i6 = i5;
                            ViewConfiguration viewConfiguration2 = viewConfiguration;
                            return i6 != 0 ? Integer.valueOf(viewConfiguration2.getScaledMaximumFlingVelocity()) : Integer.valueOf(viewConfiguration2.getScaledMinimumFlingVelocity());
                        }
                    }, Alert.DURATION_SHOW_INDEFINITELY);
                } else {
                    iB = Alert.DURATION_SHOW_INDEFINITELY;
                }
                iArr[c] = iB;
                deviceId = motionEvent.getDeviceId();
                source = motionEvent.getSource();
                if (Build.VERSION.SDK_INT >= 34) {
                    iB2 = viewConfiguration.getScaledMaximumFlingVelocity(deviceId, i4, source);
                } else {
                    if (azt.c(deviceId, i4, source)) {
                        Resources resources2 = context.getResources();
                        if (source == 4194304 || i4 != 26) {
                            i4 = i4;
                            identifier = -1;
                        } else {
                            identifier = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                            i4 = 26;
                        }
                        viewConfiguration.getClass();
                        i2 = 1;
                        iB2 = azt.b(resources2, identifier, new axv() { // from class: bad
                            @Override // defpackage.axv
                            public final Object a() {
                                int i6 = i2;
                                ViewConfiguration viewConfiguration2 = viewConfiguration;
                                return i6 != 0 ? Integer.valueOf(viewConfiguration2.getScaledMaximumFlingVelocity()) : Integer.valueOf(viewConfiguration2.getScaledMinimumFlingVelocity());
                            }
                        }, Integer.MIN_VALUE);
                    } else {
                        iB2 = Integer.MIN_VALUE;
                    }
                    iArr[i2] = iB2;
                    this.f = source2;
                    this.g = deviceId2;
                    this.e = i4;
                    i4 = i4;
                    z = true;
                }
                i2 = 1;
                iArr[i2] = iB2;
                this.f = source2;
                this.g = deviceId2;
                this.e = i4;
                i4 = i4;
                z = true;
            }
            c = 0;
            iArr[c] = iB;
            deviceId = motionEvent.getDeviceId();
            source = motionEvent.getSource();
            if (Build.VERSION.SDK_INT >= 34) {
                iB2 = viewConfiguration.getScaledMaximumFlingVelocity(deviceId, i4, source);
            } else {
                if (azt.c(deviceId, i4, source)) {
                    iB2 = Integer.MIN_VALUE;
                } else {
                    Resources resources3 = context.getResources();
                    if (source == 4194304) {
                        i4 = i4;
                        identifier = -1;
                    } else {
                        i4 = i4;
                        identifier = -1;
                    }
                    viewConfiguration.getClass();
                    i2 = 1;
                    iB2 = azt.b(resources3, identifier, new axv() { // from class: bad
                        @Override // defpackage.axv
                        public final Object a() {
                            int i6 = i2;
                            ViewConfiguration viewConfiguration2 = viewConfiguration;
                            return i6 != 0 ? Integer.valueOf(viewConfiguration2.getScaledMaximumFlingVelocity()) : Integer.valueOf(viewConfiguration2.getScaledMinimumFlingVelocity());
                        }
                    }, Integer.MIN_VALUE);
                }
                iArr[i2] = iB2;
                this.f = source2;
                this.g = deviceId2;
                this.e = i4;
                i4 = i4;
                z = true;
            }
            i2 = 1;
            iArr[i2] = iB2;
            this.f = source2;
            this.g = deviceId2;
            this.e = i4;
            i4 = i4;
            z = true;
        }
        int[] iArr2 = this.h;
        int i6 = iArr2[0];
        VelocityTracker velocityTrackerObtain = this.c;
        if (i6 == Integer.MAX_VALUE) {
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.c = velocityTrackerObtain;
        }
        Map map = azi.a;
        velocityTrackerObtain.addMovement(motionEvent);
        int i7 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = azi.a;
            if (!map2.containsKey(velocityTrackerObtain)) {
                map2.put(velocityTrackerObtain, new azj());
            }
            azj azjVar = (azj) map2.get(velocityTrackerObtain);
            long eventTime = motionEvent.getEventTime();
            int i8 = azjVar.d;
            if (i8 != 0 && eventTime - azjVar.b[azjVar.e] > 40) {
                azjVar.d = 0;
                azjVar.c = 0.0f;
                i8 = 0;
            }
            int i9 = (azjVar.e + 1) % 20;
            azjVar.e = i9;
            if (i8 != 20) {
                azjVar.d = i8 + 1;
            }
            azjVar.a[i9] = motionEvent.getAxisValue(26);
            azjVar.b[azjVar.e] = eventTime;
        }
        velocityTrackerObtain.computeCurrentVelocity(1000, Float.MAX_VALUE);
        azj azjVarA = azi.a(velocityTrackerObtain);
        if (azjVarA != null) {
            int i10 = azjVarA.d;
            if (i10 >= 2) {
                int i11 = azjVarA.e;
                long[] jArr = azjVarA.b;
                long j2 = jArr[i11];
                int i12 = (i11 + 20) - (i10 - 1);
                while (true) {
                    i3 = i12 % 20;
                    j = jArr[i3];
                    if (j2 - j <= 100) {
                        break;
                    }
                    i12 = i3 + 1;
                    azjVarA.d--;
                }
                int i13 = azjVarA.d;
                if (i13 < 2) {
                    z2 = z;
                    fA = 0.0f;
                } else if (i13 == 2) {
                    int i14 = (i3 + 1) % 20;
                    long j3 = jArr[i14];
                    if (j == j3) {
                        z2 = z;
                        fA = 0.0f;
                    } else {
                        fA = azjVarA.a[i14] / (j3 - j);
                        z2 = z;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < azjVarA.d - 1) {
                        int i17 = i15 + i3;
                        int i18 = i17 % 20;
                        int i19 = (i17 + 1) % i7;
                        long j4 = jArr[i18];
                        if (jArr[i19] != j4) {
                            i16++;
                            float fA2 = azj.a(fAbs);
                            z3 = z;
                            float f = azjVarA.a[i19] / (jArr[i19] - j4);
                            fAbs += (f - fA2) * Math.abs(f);
                            if (i16 == 1) {
                                fAbs *= 0.5f;
                            }
                        } else {
                            z3 = z;
                        }
                        i15++;
                        z = z3;
                        i7 = 20;
                    }
                    z2 = z;
                    fA = azj.a(fAbs);
                }
            } else {
                z2 = z;
                fA = 0.0f;
            }
            float f2 = fA * 1000.0f;
            azjVarA.c = f2;
            if (f2 < -3.4028235E38f) {
                azjVarA.c = -3.4028235E38f;
            } else if (azjVarA.c > Float.MAX_VALUE) {
                azjVarA.c = Float.MAX_VALUE;
            }
        } else {
            z2 = z;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            axisVelocity = velocityTrackerObtain.getAxisVelocity(i4);
        } else {
            azj azjVarA2 = azi.a(velocityTrackerObtain);
            axisVelocity = (azjVarA2 == null || i4 != 26) ? 0.0f : azjVarA2.c;
        }
        ayh ayhVar = this.b;
        float fA3 = axisVelocity * ayhVar.a();
        float fSignum = Math.signum(fA3);
        if (z2 || (fSignum != Math.signum(this.d) && fSignum != 0.0f)) {
            ayhVar.b();
        }
        if (Math.abs(fA3) >= iArr2[0]) {
            int i20 = iArr2[1];
            float fMax = Math.max(-i20, Math.min(fA3, i20));
            this.d = true == ayhVar.c(fMax) ? fMax : 0.0f;
        }
    }
}
