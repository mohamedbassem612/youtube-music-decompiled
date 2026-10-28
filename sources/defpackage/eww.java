package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eww implements ewn {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final ewx b;
    private final Set c;
    private final long d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;

    public eww(long j) {
        exc excVar = new exc();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.e = j;
        this.b = excVar;
        this.c = setUnmodifiableSet;
    }

    private static Bitmap g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0080 A[Catch: all -> 0x00d7, EDGE_INSN: B:37:0x0080->B:39:0x008f BREAK  A[LOOP:0: B:25:0x0050->B:38:0x008c], TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:8:0x000d, B:10:0x0029, B:24:0x004f, B:26:0x0052, B:28:0x0067, B:30:0x006f, B:35:0x007a, B:37:0x0080, B:38:0x008c, B:39:0x008f, B:41:0x009c, B:42:0x00c0, B:11:0x002c, B:19:0x003f, B:20:0x0044, B:21:0x0047, B:22:0x004a, B:23:0x004d, B:45:0x00c7, B:46:0x00d4), top: B:51:0x0001 }] */
    private final synchronized Bitmap h(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        if (config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException(enb.b(config, "Cannot create a mutable Bitmap with config: ", ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"));
        }
        ewx ewxVar = this.b;
        if (config == null) {
            config = a;
        }
        int iB = i * i2 * ffs.b(config);
        exb exbVar = ((exc) ewxVar).f;
        exa exaVarD = exbVar.d(iB, config);
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = exc.b;
        } else {
            int i3 = ewz.a[config.ordinal()];
            if (i3 == 1) {
                configArr = exc.a;
            } else if (i3 == 2) {
                configArr = exc.c;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : exc.e;
            } else {
                configArr = exc.d;
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) ((exc) ewxVar).b(config2).ceilingKey(Integer.valueOf(iB));
            if (num != null && num.intValue() <= (iB << 3)) {
                if (num.intValue() == iB) {
                    if (config2 != null) {
                        if (!config2.equals(config)) {
                            exbVar.c(exaVarD);
                            exaVarD = exbVar.d(num.intValue(), config2);
                            break;
                        }
                        break;
                    }
                    if (config == null) {
                        break;
                    }
                    exbVar.c(exaVarD);
                    exaVarD = exbVar.d(num.intValue(), config2);
                    break;
                }
                exbVar.c(exaVarD);
                exaVarD = exbVar.d(num.intValue(), config2);
                break;
            }
        }
        bitmap = (Bitmap) ((exc) ewxVar).g.a(exaVarD);
        if (bitmap != null) {
            ((exc) ewxVar).c(Integer.valueOf(exaVarD.a), bitmap);
            bitmap.reconfigure(i, i2, config);
            this.g++;
            this.f -= (long) ffs.a(bitmap);
            bitmap.setHasAlpha(true);
            bitmap.setPremultiplied(true);
        } else {
            this.h++;
        }
        return bitmap;
    }

    private final void i() {
        j(this.e);
    }

    private final synchronized void j(long j) {
        while (this.f > j) {
            ewx ewxVar = this.b;
            Bitmap bitmap = (Bitmap) ((exc) ewxVar).g.b();
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    ewxVar.toString();
                }
                this.f = 0L;
                return;
            }
            ((exc) ewxVar).c(Integer.valueOf(ffs.a(bitmap)), bitmap);
            this.f -= (long) ffs.a(bitmap);
            this.j++;
            bitmap.recycle();
        }
    }

    @Override // defpackage.ewn
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapH = h(i, i2, config);
        if (bitmapH == null) {
            return g(i, i2, config);
        }
        bitmapH.eraseColor(0);
        return bitmapH;
    }

    @Override // defpackage.ewn
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapH = h(i, i2, config);
        return bitmapH == null ? g(i, i2, config) : bitmapH;
    }

    @Override // defpackage.ewn
    public final void c() {
        j(0L);
    }

    @Override // defpackage.ewn
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                ewx ewxVar = this.b;
                if (ffs.a(bitmap) <= this.e && this.c.contains(bitmap.getConfig())) {
                    int iA = ffs.a(bitmap);
                    exa exaVarD = ((exc) ewxVar).f.d(ffs.a(bitmap), bitmap.getConfig());
                    ((exc) ewxVar).g.c(exaVarD, bitmap);
                    NavigableMap navigableMapB = ((exc) ewxVar).b(bitmap.getConfig());
                    Integer num = (Integer) navigableMapB.get(Integer.valueOf(exaVarD.a));
                    navigableMapB.put(Integer.valueOf(exaVarD.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                    this.i++;
                    this.f += (long) iA;
                    i();
                    return;
                }
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ewn
    public final synchronized void e(float f) {
        this.e = Math.round(this.d * f);
        i();
    }

    @Override // defpackage.ewn
    public final void f(int i) {
        if (i >= 40 || i >= 20) {
            j(0L);
        } else if (i == 15) {
            j(this.e / 2);
        }
    }
}
